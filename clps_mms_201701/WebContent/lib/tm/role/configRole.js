var treeManager;
var menuFuncIdsArr;
var id=$.cookie('id');
console.log('id:'+id);
$(document).ready(function(){
	$.ajax({
		url : 'roleMenuFunc_queryMenuFuncIdByRoleId',
		async : false,
		type : 'post',
		data:{roleId:id},
		dataType : 'json',
		success : function(data) {
			console.log(data.datas.queryMenuFuncIds);
			if (data.success == 'true') {
				menuFuncIdsArr=data.datas.queryMenuFuncIds;
			}else{
				
			}
		}
	});
	$.ajax({
		url : 'menuFunc_queryAll',
		async : false,
		type : 'post',
		dataType : 'json',
		success : function(data) {
			console.log(data);
			var content='<ul style="margin:auto;" class="l-tree">';
			for(var menuName in data){
				var tempIdsArr=new Array();
				$.each(data[menuName],function(index,object){
					 tempIdsArr.push(object.id);
				 })
				 console.log("tempIdsArr:"+tempIdsArr);
				 //取交集后的数组
				 var interArr=Array.intersect(tempIdsArr,menuFuncIdsArr);
				 console.log("bingji:"+interArr.length);
				 if(interArr.length==0){
					 //console.log("属性：" + menuName + ",值："+ data[menuName]);
					 content+='<li><span>'+menuName+'</span>';
					 content+='<ul>';
				 }else{
					 //console.log("属性：" + menuName + ",值："+ data[menuName]);
					 content+='<li ischecked="true"><span>'+menuName+'</span>';
					 content+='<ul>';
				 }
				 $.each(data[menuName],function(index,object){
					 //console.log(object);
					 if(menuFuncIdsArr.indexOf(object.id)==-1){
					 content+='<li id="'+object.id+'"><span>'+object.f_name+'</span></li>';
					 }else{
					 content+='<li ischecked="true" id="'+object.id+'"><span>'+object.f_name+'</span></li>';	 
					 }
				 })
				 content+='</ul>';
				 content+='</li>';
			}
			content+='</ul>';
			document.getElementById("menuFuncTree").innerHTML=content;
			/*$.each(data,function(index,object){
				console.log(object);
			})*/
		}
	});
	treeManager = $(".l-tree").ligerTree({
		checkbox : true,
		ajaxType : 'get'
	});
});


function saveTree(){
	var data=treeManager.getChecked();
	var menuFuncId=new Array();
	console.log(data);
	for (var i = 0; i < data.length; i++)
    {
		menuFuncId.unshift(data[i]['data']['id']);
    }
	var params='menuFuncIds='+$.toJSON(clearNullArr(menuFuncId));
	console.log(params);
	$.ajax({
		url:'roleMenuFunc_saveOrUpdate',
		//async : false,
		type : 'post',
		data:$.param({roleId:id})+'&'+params,
		dataType : 'json',
		success : function(data) {
			console.log(data);
			if (data.success == 'true') {
				var dialog = frameElement.dialog;
                dialog.close();
				$.ligerDialog.success('设置成功!');
			} else {
				$.ligerDialog.success('设置失败!');
			}
		}
		
	});
/*	$.each(data,function(index,object){
		console.log(object);
	})*/
}
		