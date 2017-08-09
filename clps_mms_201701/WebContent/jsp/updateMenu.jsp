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
<script type="text/javascript" src="../lib/tm/jquery.cookie.js"></script>
<script type="text/javascript" src="../lib/tm/myGrid.js"></script>

<script type="text/javascript">
	$(function() {
		$.metadata.setType("attr", "validate");
		/* var str="${sessionScope.dept}"; */

		var combo1 = $("#m_superid").ligerComboBox({
			width : 180,
			selectBoxWidth : 200,
			selectBoxHeight : 200,
			textField : 'id',
			valueFieldId : 'm_superid',
			treeLeafOnly : false,
			tree : {
				url : '../lib/tree.json',
				checkbox : false,
				ajaxType : 'get',
			}
		});
		var combo2 = $("#m_address").ligerComboBox({
			width : 180,
			data : [ {
				text : 'http://clps.menu1',
				id : '1'
			}, {
				text : 'http://clps.menu2',
				id : '2'
			}, {
				text : 'http://clps.menu3',
				id : '44'
			} ],
			valueFieldId : 'm_address'
		});
		var combo3 = $("#m_image").ligerComboBox({
			width : 180,
			data : [ {
				text : '@sdgsdg',
				id : '1'
			}, {
				text : '@zzcsb',
				id : '2'
			}, {
				text : '@ytyghk',
				id : '44'
			} ],
			valueFieldId : 'm_image'
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
					$('#m_superid').val(sss.m_superid);
					$('#m_image').val(sss.m_image);
					$('#m_address').val(sss.m_address);
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
						alert("Submitted!");
						$.ajax({
							type : "POST",
							dataType : 'json',
							url : 'menu_deleteMenu',
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
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;子菜单名称:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_superid" name="m_superid" ltype="text"
					validate="{required:true}" placeholder="请选择子菜单名称" />
				</td>
				<td align="left"><span class="l-star">*</span></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单图标:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_image" name="m_image" ltype="text"
					validate="{required:true}" placeholder="请选择菜单地址" />
				</td>
				<td align="left"><span class="l-star">*</span></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单地址:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_address" name="m_address" ltype="text"
					validate="{required:true}" placeholder="请选择菜单图标" />
				</td>
				<td align="left"><span class="l-star">*</span></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td">菜单描述:</td>
				<td align="left" class="l-table-edit-td" colspan="2"><textarea
						cols="100" rows="4" class="l-textarea" id="m_description"
						name="m_description" style="width: 400px"
						validate="{required:true}" placeholder="请输入部门描述"></textarea></td>
				<td align="left"></td>
			</tr>
		</table>
		<br /> <input id="reset" type="reset" value="重置"
			class="l-button l-button-test" /> <input type="submit" value="提交"
			id="Button1" class="l-button l-button-submit" />
	</form>
	<div style="display: none">
		<!--  数据统计代码 -->
	</div>


</body>
</html>