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
<script type="text/javascript" src="../lib/tm/jquery.cookie.js"></script>
<script src="../lib/jquery-validation/jquery.validate.min.js"
	type="text/javascript"></script>
<script src="../lib/jquery-validation/jquery.metadata.js"
	type="text/javascript"></script>
<script src="../lib/jquery-validation/messages_cn.js"
	type="text/javascript"></script>


<script type="text/javascript">
	$(function() {
		$.metadata.setType("attr", "validate");
		jQuery.validator.addMethod("ajaxCheck", function(value, element) {
			var ok;
			/*  var ok = this.optional(element) || (/^([a-zA-Z0-9_]+)$/.test(value));
			 if (ok)  //通过了上面的2个验证后启动ajax验证，注意一定要为同步的 */
			var nameId = {
				m_name : $("#m_name").val()
			};
			$.ajax({
				//?name=$("#name").val()
				//?name='+ document.getElementById('name').value
				url : 'menu_findByName',
				async : false, /////////关键，设置为同步
				type : 'POST',
				data : nameId,
				dataType : 'json',
				success : function(data) {
					console.log(data);
					if (data.success == 'true') {
						console.log(data.success);
						ok = false;
					} else {
						//console.log(data.success);
						ok = true;
					}
				}
			});
			return ok;
		}, "菜单名已存在!");

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
		
		var v = $("#menuform").validate(
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
						alert("11111");
						//alert("Submitted!");
						$.ajax({
							type : "POST",
							dataType : 'json',
							url : 'menu_addMenuInfo',
							data : $(form).serialize(),
							//beforeSubmit: showRequest,
							/* success: function(msg){
								
							} */
							success : function(data) {
								if (data.success == 'true') {
									//lert("Submitted!");
									// $.ligerDialog.success('新增部门成功');
									var dialog = frameElement.dialog;
									dialog.close();
								} else {
								}
							}
						});
					}
				});
		/* var dialog = frameElement.dialog;
		var dialogData = dialog.get('data');//获取data参数
		if(close==true){
			dialog.close();
		} */
		$("form").ligerForm();
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
	<form name="menuform" method="post" id="menuform">
		<table cellpadding="0" cellspacing="0" class="l-table-edit"
			align="center">
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单名称:</td>
				<td align="left" class="l-table-edit-td" style="width: 160px">
					<input id="m_name" name="m_name" type="text" ltype="text"
					validate="{required:true,minlength:3,maxlength:10,ajaxCheck:true}"
					placeholder="请输入长度大于3小于10" />
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
				<td align="left"></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单图标:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_image" name="m_image" ltype="text"
					validate="{required:true}" placeholder="请选择菜单地址" />
				</td>
				<td align="left"></td>
			</tr>
			<tr>
				<td align="right" class="l-table-edit-td"><span class="l-star">*</span>&nbsp;菜单地址:</td>
				<td align="left" class="l-table-edit-td" style="width: 180px">
					<input type="text" id="m_address" name="m_address" ltype="text"
					validate="{required:true}" placeholder="请选择菜单图标" />
				</td>
				<td align="left"></td>
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