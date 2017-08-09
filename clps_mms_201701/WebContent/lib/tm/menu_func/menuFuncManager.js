var initArr=null;
var nodeId=null;
var itemSetting = {
		"id" : "setting",
		"text" : "设置功能",
		"click" : confingMenuFunc,
		"icon" : "config"
	};
$(document).ready(function() {
	getMenuFunc();
	//树
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
		items : [{
			text : '设置功能',
			click : confingMenuFunc,
			icon : 'config'
		}

		]
	};*/
	initCheckBoxTable('#funcGrid', columns, 'func_getFuncLst', null,f_isChecked);
	$("#layout").ligerLayout({
		leftWidth : 200
	});
})

function confingMenuFunc() {
	var checkedRows = g.getCheckedRows();
	console.log(checkedRows);
	var arr=new Array();
	$.each(checkedRows,function(index,object) {
		arr.unshift(object.id);
	});
	console.log(arr);
	if(initArr.sort().toString()==arr.sort().toString()){
		$.ligerDialog.warn('没有进行修改,请勾选行!');
	}else {
		var params='funcIds='+$.toJSON(arr);
		console.log(params);
	     $.ajax({
			url:'menuFunc_insertMenuFunc',
			async : false,
			type : 'post',
			data:$.param({menuId:nodeId})+'&'+params,
			dataType : 'json',
			success : function(data) {
				console.log(data);
				if (data.success == 'true') {
					g.deleteSelectedRow();
					$.ligerDialog.success('设置成功!');
					var params={page:1,pagesize:15,sortName: 'createDate',sortOrder: 'desc'};
					g.loadServerData(params,null);
				} else {
					$.ligerDialog.success('设置失败!');
				}
			}
			
		});
	}

}

