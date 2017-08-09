$(document).ready(function() {
	var columns = [ {
		display : '类型',
		name : 'type',
		align : 'left',
		type:'int',
		render: function (item)
        {
              if (parseInt(item.type) == 1) return '新增';
              else if (parseInt(item.type) == 2) return '更新';
              else if (parseInt(item.type) == 3) return '删除';
        }

	}, {
		display : '内容',
		name : 'content',
		width:'50%'
	}, {
		display : '操作菜单',
		name : 'operateMenu'
	}, {
		display : '被操作人名',
		name : 'operateName',
	},{
		display : '操作人名',
		name : 'createName',
	},{
		display : '操作时间',
		name : 'createDate',
		width:'15%'
	} ];
	initTable2('#logGrid', columns, 'log_getLogLst', null);
});
$(document).ready(function() {
	$("#pageWhere2").tinyselect({
		dataUrl : "../lib/tm/select/contactNum.json",
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
function search(){
	 var content=$("#pageWhere1").val();
	var type=$("#pageWhere2").val();
	var operateName=$("#pageWhere3").val();
	var operateMenu=$("#pageWhere4").val();
	if(type==-1){
		type=null;
	}
	if(operateMenu==-1){
		operateMenu=null;
	}
	var data={pageWhere1:content,pageWhere2:type,pageWhere3:operateName,pageWhere4:operateMenu,
			page:1,pagesize:15};
	console.log(data);
	g.loadServerData(data,null);
	
}