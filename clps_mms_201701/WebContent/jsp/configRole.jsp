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
<script type="text/javascript" src="../lib/tm/common/arrayOperation.js"></script>
<script type="text/javascript" src="../lib/tm/role/configRole.js"></script>
<style type="text/css">
body {
	padding: 5px;
	margin: 0;
	padding-bottom: 15px;
}

#menuFuncTree{
margin:0 auto;
}
#save{
    width: 80px;
    margin-top:30px;
	margin-right: 200px;
    float:right ;
	text-align: center;
	padding-bottom: 2px;
}
</style>
</head>
<body style="padding: 2px">
		<div id="menuFuncTree">
			<!-- <ul class="l-tree">
				<li><span>节点1</span>
					<ul>
						<li><span>节点1.1</span>
							<ul>
								<li><span>节点1.1.2</span></li>
								<li><span>节点1.1.2</span></li>
							</ul></li>
						<li><span>节点1.2</span></li>
					</ul></li>
				<li><span>节点2</span></li>
				<li isexpand="false"><span>节点3</span>
					<ul>
						<li><span>节点3.1</span></li>
						<li><span>节点3.2</span></li>
					</ul></li>
			</ul> -->
		</div>
<div id="save">
<input type="button" class="l-button l-button-submit" value="保存" onclick="saveTree()" />
</div>
	<div style="display: none;"></div>
</body>
</html>