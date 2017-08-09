<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="../lib/ligerUI/skins/Aqua/css/ligerui-all.css"
	rel="stylesheet" type="text/css" />
<link href="../lib/ligerUI/skins/ligerui-icons.css" rel="stylesheet"
	type="text/css" />
<!--  <link href="../lib/ligerUI/skins/Gray/css/all.css" rel="stylesheet"
	type="text/css" /> -->
<script src="../lib/jquery/jquery-1.9.0.min.js" type="text/javascript"></script>
<script src="../lib/ligerUI/js/ligerui.all.js"></script>
<link href="../lib/tm/plugins/tinyselect.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../lib/tm/plugins/tinyselect.js"></script>
<script type="text/javascript" src="../lib/tm/plugins/jquery.cookie.js"></script>
<script src="../lib/ligerUI/js/plugins/ligerListBox.js" type="text/javascript"></script>
<script type="text/javascript" src="../lib/tm/common/common.js"></script>
<script type="text/javascript" src="../lib/tm/userInfo/setUserRole.js"></script>
<style type="text/css">
body {
	font-size: 12px;
}
 .box {
            float: left;
            width:220px;
            margin-top: 20px;
            margin-left: 80px;
        }
.clear{
clear:both
}
.l-button-submit {
	width: 80px;
	margin-top: 20px;
	margin-left: 100px;
	position: relative;
	text-align: center;
	padding-bottom: 2px;
}

.l-button-close {
	width: 80px;
	margin-top: 20px;
	margin-left: 180px;
	position: relative;
	text-align: center;
	padding-bottom: 2px;
}

</style>
</head>
<body style="padding: 10px">
<div>
<div id="roleName"></div>
<div class="box">
    <div id="listbox1"></div>
</div>
<div class="box">
    <div id="menuFuncTree">
    </div>
</div>
	<div id="userRoleGrid"></div>
</div>
<div>
<input type="button" class="l-button l-button-close " value="关闭" onclick="saveTree()" />
<input type="button" class="l-button l-button-submit" value="保存" onclick="saveUserRole()" />
</div>
	<div style="display: none">
		<!--  数据统计代码 -->
	</div>


</body>
</html>