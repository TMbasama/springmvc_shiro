<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../lib/ligerUI/skins/Aqua/css/ligerui-all.css"
	rel="stylesheet" type="text/css" />
<link href="../lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet"
	type="text/css" />
<script src="../lib/jquery/jquery-1.9.0.min.js" type="text/javascript"></script>
<script src="../lib/ligerUI/js/core/base.js" type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerForm.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerDateEditor.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerComboBox.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerCheckBox.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerButton.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerDialog.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerRadio.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerSpinner.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerTextBox.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerTip.js"
	type="text/javascript"></script>
<script src="../lib/ligerUI/js/plugins/ligerTree.js"
	type="text/javascript"></script>
<script src="../lib/jquery-validation/jquery.validate.min.js"
	type="text/javascript"></script>
<script src="../lib/jquery-validation/jquery.metadata.js"
	type="text/javascript"></script>
<script src="../lib/jquery-validation/messages_cn.js"
	type="text/javascript"></script>
<script type="text/javascript" src="../lib/jquery.cookie.js"></script>
<script type="text/javascript" src="js/rl_exp.js"></script>

<script type="text/javascript">
	$(function() {
		$.metadata.setType("attr", "validate");
		/* var str="${sessionScope.dept}"; */

		var combo1 = $("#m_parentid").ligerComboBox({
			width : 180,
			selectBoxWidth : 200,
			selectBoxHeight : 200,
			textField : 'id',
			valueFieldId : 'm_parentid',
			treeLeafOnly : false,
			tree : {
				url : "tree_getTreeJson",
				checkbox : false,
				ajaxType : 'POST',
			}
		});

		var menuId = $.cookie('menu');
		console.log(menuId);
		var flag = true;
		var sss;
		if (flag) {
			$.ajax({
				url : 'menu_findById',
				type : 'POST',
				async : false,
				data : {
					m_id : menuId
				},
				dataType : 'json',
				success : function(data) {
					/*    console.log(data);	 */
					sss = data.datas.menu;
					console.log(sss);
					$('#m_name').val(sss.m_name);
					$('#m_parentid').val(sss.m_parentid);
					$('#m_image').val(sss.m_image);
					$('#m_url').val(sss.m_url);
					$('#m_description').val(sss.m_description);
					flag = false;
				}
			});
		}
		;
		//设置input,textarea默认值
		$.fn.setFormValue = function(data) {
			var defauleValue = data;
			$(this).val(defauleValue).css("color", "#999");
			return this.each(function() {
				$(this).focus(function() {
					if ($(this).val() == defauleValue) {
						$(this).val("").css("color", "#000");//输入值的颜色
					}
				}).blur(function() {
					if ($(this).val() == "") {
						$(this).val(defauleValue).css("color", "#999");//默认值的颜色
					}
				});
			});
		}
		$("form").ligerForm();
		var v = $("#form1").validate(
				{
					//调试状态，不会提交数据的
					//debug : true,
					errorPlacement : function(lable, element) {

						if (element.hasClass("l-textarea")) {
							element.addClass("l-textarea-invalid");
						} else if (element.hasClass("l-text-field")) {
							element.parent().addClass("l-text-invalid");
						}

						var nextCell = element.parents("td:first").next("td");
						nextCell.find("div.l-exclamation").remove();
						$(
								'<div class="l-exclamation" title="'
										+ lable.html() + '"></div>').appendTo(
								nextCell).ligerTip();
					},
					success : function(lable) {
						var element = $("#" + lable.attr("for"));
						var nextCell = element.parents("td:first").next("td");
						if (element.hasClass("l-textarea")) {
							element.removeClass("l-textarea-invalid");
						} else if (element.hasClass("l-text-field")) {
							element.parent().removeClass("l-text-invalid");
						}
						nextCell.find("div.l-exclamation").remove();
					},

					submitHandler : function(form) {
						//alert("Submitted!");
						$.ajax({
							type : "POST",
							dataType : 'json',
							url : 'menu_updateMenu',
							data : $.param({
								m_id : menuId
							}) + '&' + $('#form1').serialize(),
							//beforeSubmit: showRequest,
							/* success: function(msg){
								
							} */
							success : function(data) {
								if (data.success == 'true') {
									//lert("Submitted!");
									var dialog = frameElement.dialog;
									dialog.close();

								} else {

								}
							}
						});
					}
				});
	});
</script>
<style type="text/css">
body {
	font-size: 12px;
}

.l-table-edit {
	
}

.l-table-edit-td {
	padding: 4px;
}

.l-button-submit {
	width: 80px;
	margin-left: 100px;
	position: relative;
	text-align: center;
	padding-bottom: 2px;
}

.l-button-test {
	width: 80px;
	margin-left: 100px;
	position: relative;
	text-align: center;
	padding-bottom: 2px;
}

.l-verify-tip {
	left: 230px;
	top: 120px;
}
</style>

</head>
<body style="padding: 10px">
	<form name="form1" method="post" id="form1">
		<table cellpadding="0" cellspacing="0" class="l-table-edit"
			align="center">
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单名称:</td>
				<td align="left" class="l-table-edit-td" style="width: 160px">
					<input id="m_name" name="m_name" type="text" ltype="text" disabled />
				</td>
				<td align="left"></td>
				<td><em id="message"></em></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;父菜单名称:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_parentid" name="m_parentid" ltype="text"
					validate="{required:true}" placeholder="请选择父菜单名称" />
				</td>
				<td align="left"></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单地址:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_url" name="m_url" ltype="text"
					validate="{required:true}" placeholder="请输入菜单地址 eg:jsp/xxxx.jsp" />
				</td>
				<td align="left"></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td">菜单描述:</td>
				<td align="left" class="l-table-edit-td" colspan="2"><textarea
						cols="100" rows="4" class="l-textarea" id="m_description"
						name="m_description" style="width: 400px"
						validate="{required:true}" placeholder="请输入 菜单描述"></textarea></td>
				<td align="left"></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单图标:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<div id="comment" class="comment-main">
						<input type="text" id="m_image" name="m_image"><br /> <a
							href="javascript:void(0);" id="rl_exp_btn">选择</a>
					</div>
					<div class="rl_exp" id="rl_bq" style="display: none;">
						<ul class="rl_exp_tab clearfix">
							<li><a href="javascript:void(0);" class="selected">菜单图标</a></li>
						</ul>
						<ul class="rl_exp_main clearfix rl_selected"></ul>
						<a href="javascript:void(0);" class="close">×</a>
					</div>
				</td>
				<td align="left"></td>
			</tr>
			
		</table>
		<br /> <input id="reset" type="reset" value="重置"
			class="l-button l-button-test" /> <input type="submit" value="提交"
			id="Button1" class="l-button l-button-submit" />
	</form>
</body>
</html>