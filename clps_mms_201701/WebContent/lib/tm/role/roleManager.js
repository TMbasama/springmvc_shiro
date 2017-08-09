var itemAdd = {
	"id" : "add",
	"text" : "新增角色",
	"click" : addRole,
	"icon" : "add"
};
var itemUpdate = {
	"id" : "update",
	"text" : "修改角色",
	"click" : updateRole,
	"icon" : "modify"
};
var itemDelete = {
	"id" : "delete",
	"text" : "删除角色",
	"click" : deleteRole,
	"icon" : "delete"
};
var itemSetting = {
	"id" : "setting",
	"text" : "设置权限",
	"click" : confingPerm,
	"icon" : "config"
};
$(document).ready(function() {
	
	var menuId=$.cookie('menuId');
	console.log('menuId:'+menuId);
	getMenuFunc();
	var columns = [ {
		display : '角色',
		name : 'name',
		align : 'left',
	}, {
		display : '创建时间',
		name : 'createDate',
	}, {
		display : '创建人名',
		name : 'createName'
	}, {
		display : '角色描述',
		name : 'description',
	} ];
	/*var toolbar = {
		items : [ {
			text : '新增角色',
			click : addRole,
			icon : 'add'
		}, {
			line : true
		}, {
			text : '修改角色',
			click : updateRole,
			icon : 'modify'
		}, {
			line : true
		}, {
			text : '删除角色',
			click : deleteRole,
			img : '../lib/ligerUI/skins/icons/delete.gif'
		},
		{
			line : true
		},{
			text : '设置权限',
			click : confingPerm,
			icon : 'config'
		}

		]
	};*/
	initTable('#roleGrid', columns, 'role_getRoleLst', null);
})
$(document).ready(function() {
	$("#pageWhere2").tinyselect({
		dataUrl : "../lib/tm/select/contactNum.json",
		dataParser : dataParserA
	});
	$("#pageWhere3").tinyselect({
		dataUrl : "../lib/tm/select/email.json",
		dataParser : dataParserA
	});
	$("#pageWhere4").tinyselect({
		dataUrl : "../lib/tm/select/principal.json",
		dataParser : dataParserA
	});
});
function dataParserA(data, selected) {
	retval = [ {
		val : "-1",
		text : "---"
	} ];

	data.forEach(function(v) {
		/*
		 * if (selected == "-1" && v.val == 3) v.selected = true;
		 */
		retval.push(v);
	});

	return retval;
}
function addRole() {
	$.ligerDialog.open({
		height : 500,
		width : 700,
		title : '新增角色',
		url : 'addRole.jsp',
		showMax : false,
		showToggle : true,
		showMin : false,
		isResize : true,
		slide : false,
		onClosed : function() {
			$.ligerDialog.success('新增角色成功');
			g.loadData();
		}
	});
}

function updateRole() {
	var row = g.getSelectedRow();
	console.log('role:'+row);
	if (row != null) {
		$.cookie('id', row.id);
		$.ligerDialog.open({
			height : 500,
			width : 700,
			title : '修改角色',
			url : 'updateRole.jsp',
			showMax : false,
			showToggle : true,
			showMin : false,
			isResize : true,
			slide : false,
			onClosed : function() {
				$.ligerDialog.success('修改角色成功');
				g.loadData();
			}
		});
	} else {
		$.ligerDialog.warn('请选择你要修改的行');
	}
}
function deleteRole() {
	var row = g.getSelectedRow();
	if (row != null) {
		$.ajax({
			url : 'role_delete',
			async : false,
			type : 'post',
			data : {
				id : row.id
			},
			dataType : 'json',
			success : function(data) {
				console.log(data);
				if (data.success == 'true') {
					g.deleteSelectedRow();
					$.ligerDialog.success('删除成功!');
					g.loadData();
				} else {
					$.ligerDialog.success('删除失败!');
				}
			}
		});
	} else {
		$.ligerDialog.warn('请选择你要删除的行');
	}
}
function confingPerm(){
	var row = g.getSelectedRow();
	console.log('role:'+row);
	if (row != null) {
		$.cookie('id', row.id);
		$.ligerDialog.open({
			height : 500,
			width : 700,
			title : '设置权限',
			url : 'configRole.jsp',
			showMax : false,
			showToggle : true,
			showMin : false,
			isResize : true,
			slide : false,
			onClosed : function() {
				$.ligerDialog.success('设置权限成功');
				g.loadData();
			}
		});
	} else {
		$.ligerDialog.warn('请选择你要设置权限的行');
	}
}