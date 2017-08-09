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
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="css/rl_exp.css" />
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
<script type="text/javascript" src="js/addMenuInfo.js"></script>
<script type="text/javascript" src="js/rl_exp.js"></script>
<style type="text/css">
body {
	font-size: 12px;
}

.l-table-edit {
	margin-left: 150px;
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
	margin-left: 150px;
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
	<br />
	<br />
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
						validate="{required:true}" placeholder="请输入菜单描述"></textarea></td>
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