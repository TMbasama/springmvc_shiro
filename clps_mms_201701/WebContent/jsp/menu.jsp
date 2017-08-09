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
<script type="text/javascript" src="../lib/jquery.cookie.js"></script>
<script type="text/javascript" src="../lib/tm/common/common.js"></script>
<script type="text/javascript" src="../lib/tm/common/permission.js"></script>
<script type="text/javascript">
 roleId ='${sessionScope.userRoleId}';
console.log(roleId);
</script>
<style type="text/css">
</style>

<script type="text/javascript">
var menuId=$.cookie('menuId');
console.log('menuId:'+menuId);
	/*  树形结构 */
	var manager = null;
	$(function() {
		$("#tree").ligerTree({
			url : "tree_getTreeJson",
			checkbox : false,
			slide : false,
			nodeWidth : 120,
			attribute : [ 'nodename', 'url' ],
			onSelect : function(node) {
				nodeId=node.data.id;
				console.log("tabid:"+nodeId);
				var data={menuId:nodeId};
				checkedData(data,'menuFunc_queryByMenuId');
				console.log(checkData);
				initArr=new Array();
				$.each(checkData,function(index,object) {
					initArr.unshift(object.func_id);
				});
				console.log(initArr);
				var params={page:1,pagesize:15,sortName: 'createDate',sortOrder: 'desc'};
				g.loadServerData(params,null);
			}
		});

	});
	
	function reload() {
		var node = manager.getSelected();
		var parentnode = manager.getParent(node);
		alert(parentnode);

		manager.clear();
		manager.loadData(null, 'tree.json');

	}

	function addTreeItem() {
		var node = manager.getSelected();
		var nodes = [];
		nodes.push({
			text : $("#txtNode").val()
		});
		if (node)
			manager.append(node.target, nodes);
		else
			manager.append(null, nodes);
	}
	
	function addTreeItem2() {
		var node = manager.getSelected();
		var nodes = [];
		nodes.push({
			text : $("#txtNode").val(),
			children : [ {
				text : '111',
				children : [ {
					text : '222'
				} ]
			} ]
		});
		if (node)
			manager.append(node.target, nodes);
		else
			manager.append(null, nodes);
	}
	function removeTreeItem() {
		var node = manager.getSelected();
		if (node)
			manager.remove(node.target);
		else
			alert('请先选择节点');
	}
	function updateTreeItem() {
		var node = manager.getSelected();
		if (node)
			manager.update(node.target, {
				text : $("#txtNode").val()
			});
	}
	function clearTreeItem() {
		manager.clear();
	}
	function deleteRow() {
		g.deleteSelectedRow();
	}
	function add_open() {
		var addDialog = $.ligerDialog.open({
			height : 500,
			width : 700,
			title : '新增菜单',
			url : 'addMenu.jsp',
			showMax : false,
			onClosed : function() {
				$.ligerDialog.success('新增菜单成功');
				g.loadData();
			},
			showToggle : true,
			showMin : false,
			/* buttons : [ {
				text : '确定',
				onclick : function(item, dialog) {
					alert(item.text);
				},
				cls : 'l-dialog-btn-highlight'
			}, {
				text : '取消',
				onclick : function(item, dialog) {
					dialog.close();
				}
			} ], */
			isResize : true,
			slide : false,

		});
	}
	
	function f_open() {
		var row = g.getSelectedRow();
		console.log(row);
		if (row != null) {
			$.cookie('menu', row.m_id);
			$.ligerDialog.open({
				url : 'updateMenu.jsp',
				data : {
					menu : row
				},
				onClosed : function() {
					$.ligerDialog.success('修改菜单成功');
					g.loadData();
				},
				height : 500,
				width : 750,
				title : '修改菜单',
				isResize : true
			});
		} else {
			var m = $.ligerDialog.tip({
				title : '提示信息',
				content : '请选择你想要更新的行！'
			});
			setTimeout(function() {
				m.hide();
			}, 2000)
		}
	}
	//弹出提示信息
	var tip;
	var num = 0;
	function f_tip() {
		var row = g.getSelectedRow();
		if (row != null) {
			$.ajax({
				url : 'menu_deleteMenu',
				async : false,
				type : 'post',
	 			data : {
					m_id : row.m_id
				},
				dataType : 'json',
				success : function(data) {
					if (data.success == 'true') {
						g.deleteSelectedRow();
						var m = $.ligerDialog.tip({
							title : '提示信息',
							content : '记录已经删除！' + num++
						});
						setTimeout(function() {
							m.hide();
							//window.location.reload();//删除后，自动刷新页面
							g.loadData();
						}, 1000)
					} else {
						var m = $.ligerDialog.tip({
							title : '提示信息',
							content : '删除失败！'
						});
						setTimeout(function() {
							m.hide();
						}, 2000)
					}
				}
			});
		} else {
			var m = $.ligerDialog.tip({
				title : '提示信息',
				content : '请选择你想要删除的行！'
			});
			setTimeout(function() {
				m.hide();
			}, 2000)
		}
	}
	function f_tip2() {
		if (!tip) {
			tip = $.ligerDialog.tip({
				title : '提示信息',
				content : '记录已经删除！'
			});
		} else {
			var visabled = tip.get('visible');
			if (!visabled)
				tip.show();
			tip.set('content', '内容改变' + num++);
		}
	}
	var itemAdd = {
			"id" : "add",
			"text" : "新增菜单",
			"click" : add_open,
			"icon" : "add"
		};
		var itemUpdate = {
			"id" : "update",
			"text" : "修改菜单",
			"click" : f_open,
			"icon" : "modify"
		};
		var itemDelete = {
			"id" : "delete",
			"text" : "删除菜单",
			"click" : f_tip,
			"icon" : "delete"
		};
		var itemSetting = {
			"id" : "setting",
			"text" : "设置菜单",
			"click" : setting,
			"icon" : "config"
		};
	/* 布局  */
	$(function() {

		$("#layout1").ligerLayout({
			/* onLeftToggle: function (isColl)
			{
			    //alert(isColl ? "收缩" : "显示");
			},
			onRightToggle: function (isColl)
			{
			  //  alert(isColl ? "收缩" : "显示");
			}, */
			leftWidth : 200

		});
			getMenuFunc(1);
	});
	function setting() {
		deleteRow();
		$.ligerDialog.open({
			url : '../html/icon.htm',
			height : 500,
			width : 750,
			title : '设置菜单',
			buttons : [ {
				text : '确定',
				onclick : function(item, dialog) {
					alert(item.text);
				},
				cls : 'l-dialog-btn-highlight'
			}, {
				text : '取消',
				onclick : function(item, dialog) {
					dialog.close();
				}
			} ],
			isResize : true
		});
	}
	/* 表格 */
	function itemclick(item) {
		alert(item.text);
	}
	$(function() {
		window['g'] = $("#maingrid4").ligerGrid({
			height : '100%',
			columns : [ {
				display : '菜单名称',
				name : 'm_name',
				align : 'left',
				width : 100,
				minWidth : 60
			}, {
				display : '菜单描述',
				name : 'm_description',
				minWidth : 120
			} ],
			dataType : "json",
			usePager : true,
			url : 'menu_getMenuInfo',
			pageSizeOptions : [ 15, 30, 45, 60, 75 ],
			//page:'page',
			//dateFormat: 'yyyy-MM-dd hh:mm:ss',
			pageSize : '15',
			rownumbers : true,
			sortName : 'm_createDate',
			sortOrder : 'desc',
			width : '100%',
			height : '100%',
			checkbox : false,
			onSuccess:function(data,grid){
				console.log(data);
			}
			/* toolbar : {
				items : [ {
					text : '新增菜单',
					click :add_open,
					icon : 'add'
				}, {
					line : true
				}, {
					text : '修改菜单',
					click : f_open,
					icon : 'modify'
				}, {
					line : true
				}, {
					text : '删除菜单',
					click : f_tip,
					img : '../lib/ligerUI/skins/icons/delete.gif'
				}, {
					text : '设置菜单',
					click : function f_open2() {
						deleteRow();
						$.ligerDialog.open({
							url : '../html/icon.htm',
							height : 500,
							width : 750,
							title : '设置菜单',
							buttons : [ {
								text : '确定',
								onclick : function(item, dialog) {
									alert(item.text);
								},
								cls : 'l-dialog-btn-highlight'
							}, {
								text : '取消',
								onclick : function(item, dialog) {
									dialog.close();
								}
							} ],
							isResize : true
						});
					},
					icon : 'config'
				}, ]
			} */
		});

		$("#pageloading").hide();
	});

	function deleteRow() {
		g.deleteSelectedRow();
	}
</script>
<style type="text/css">
body {
	padding: 10px;
	margin: 0;
}

#layout1 {
	width: 100%;
	margin: 40px;
	height: 400px;
	margin: 0;
	padding: 0;
}

#accordion1 {
	height: 270px;
}

h4 {
	margin: 20px;
}
</style>
</head>
<body style="padding: 2px; overflow: hidden">
	<div class="l-loading" style="display: block" id="pageloading"></div>

	<!-- <input type="text" class="l-text" value="节点名" id="txtNode"
		style="display: block; float: left; margin-right: 10px;" />

	<a class="l-button" onclick="reload()"
		style="float: left; margin-right: 10px;">重新加载</a>

	<a class="l-button" onclick="addTreeItem()"
		style="float: left; margin-right: 10px;">增加节点</a>
	<a class="l-button" onclick="updateTreeItem()"
		style="float: left; margin-right: 10px;">更新节点</a>
	<a class="l-button" onclick="removeTreeItem()"
		style="float: left; margin-right: 10px;">删除节点</a>
	<a class="l-button" onclick="clearTreeItem()"
		style="float: left; margin-right: 10px;">清空节点</a>

	<a class="l-button" onclick="addTreeItem2()"
		style="width: 150px; float: left; margin-right: 10px;">增加节点(带子节点)</a>
	<br />
	<br /> -->
	<div id="toptoolbar"></div>
	<div id="layout1">
		<div position="left">
			<ul id="tree">
			</ul>
		</div>
		<div position="center" title="菜单信息">
			<a class="l-button"
				style="width: 120px; float: left; margin-left: 10px; display: none;"
				onclick="deleteRow()">删除选择的行</a>


			<div class="l-clear"></div>

			<div id="maingrid4"></div>
		</div>
		<!-- <div position="right"></div> -->
		<!-- <div position="top"></div> -->
	</div>

	<div style="display: none;"></div>
</body>
</html>