var itemAdd = {
	"id" : "add",
	"text" : "新增功能",
	"click" : addFunc,
	"icon" : "add"
};
var itemUpdate = {
	"id" : "update",
	"text" : "修改功能",
	"click" : updateFunc,
	"icon" : "modify"
};
var itemDelete = {
	"id" : "delete",
	"text" : "删除功能",
	"click" : deleteFunc,
	"icon" : "delete"
};
$(document).ready(function() {
	var menuId=$.cookie('menuId');
	console.log('menuId:'+menuId);
	getMenuFunc();
	var columns = [ {
		display : '功能名称',
		name : 'name',
	}, {
		display : '创建时间',
		name : 'createDate'
	}, {
		display : '创建人名',
		name : 'createName'
	} ];
	/*var toolbar = {
		items : [ {
			text : '新增功能',
			click : addFunc,
			icon : 'add'
		}, {
			line : true
		}, {
			text : '修改功能',
			click : updateFunc,
			icon : 'modify'
		}, {
			line : true
		}, {
			text : '删除功能',
			click : deleteFunc,
			img : '../lib/ligerUI/skins/icons/delete.gif'
		}

		]
	};*/
	initTable('#funcGrid', columns, 'func_getFuncLst', null);
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
function addFunc() {
	$.ligerDialog.open({
		height : 500,
		width : 700,
		title : '新增功能',
		url : 'addFunc.jsp',
		showMax : false,
		showToggle : true,
		showMin : false,
		isResize : true,
		slide : false,
		onClosed : function() {
			$.ligerDialog.success('新增功能成功');
			g.loadData();
		}
	});
}

function updateFunc() {
	var row = g.getSelectedRow();
	console.log('row:' + row);
	if (row != null) {
		$.cookie('id', row.id);
		$.ligerDialog.open({
			height : 500,
			width : 700,
			title : '修改功能',
			url : 'updateFunc.jsp',
			showMax : false,
			showToggle : true,
			showMin : false,
			isResize : true,
			slide : false,
			onClosed : function() {
				$.ligerDialog.success('修改功能成功');
				g.loadData();
			}
		});
	} else {
		$.ligerDialog.warn('请选择你要修改的行');
	}
}
function deleteFunc() {
	var row = g.getSelectedRow();
	if (row != null) {
		$.ajax({
			url : 'func_delete',
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
