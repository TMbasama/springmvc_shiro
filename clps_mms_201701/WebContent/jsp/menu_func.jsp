<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
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
<script type="text/javascript" src="../lib/tm/common/jquery.json-2.4.js"></script>
<script type="text/javascript" src="../lib/tm/common/common.js"></script>
<script type="text/javascript" src="../lib/tm/common/permission.js"></script>
<script type="text/javascript" src="../lib/tm/menu_func/menuFuncManager.js"></script>
<script type="text/javascript">
 roleId ='${sessionScope.userRoleId}';
console.log(roleId);
</script>
<style type="text/css">
body {
	padding: 5px;
	margin: 0;
	padding-bottom: 15px;
}

#top {
	width: 100%;
	padding-bottom: 10px;
}

.select {
	margin: 10dp;
	width: 60px;
}

#search {
	margin: 0px;
	padding: 0px;
}
</style>
</head>
<body style="padding: 2px">
	<!-- <div id="top">
		<a>用户名称:</a> <input type="text" id="pageWhere1"> <a>性别:</a>
		<select id="pageWhere2" class="select">
			<option value="-1">---</option>
		</select> <a>电子邮箱:</a> <select id="pageWhere3" class="select">
			<option value="-1">---</option>
		</select> <a>联系电话:</a> <select id="pageWhere4" class="select">
			<option value="-1">---</option>
		</select> <input type="button" value="查询" id="search" onclick="search()" />
	</div> -->
	<div id="toptoolbar"></div>
	<div id="layout">
		<div position="left">
			<ul id="tree">
			</ul>
		</div>
	<div position="center">
	<div id="funcGrid"></div>
	</div>

	<div style="display: none;"></div>
</body>
</html>