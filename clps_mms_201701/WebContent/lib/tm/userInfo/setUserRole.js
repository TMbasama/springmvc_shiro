var userId=$.cookie('userId');
var treeManager=null;
var menuFuncIdsArr=null;
var roleName=null;
var list=null;
var roleId=null;
var listbox1;
//console.log(username);
$(document).ready(
		function(){
			$.ajax({
				url:'userRole_findRoleByUserId',
				type:'POST',
				async: false,
				data:{user_id:userId},
				dataType:'json',
				success:function(data){
				   if (isEmptyObject(data.datas)) {
					   var content="<a>当前用户没有设置角色,请设置</a>";
					   document.getElementById("roleName").innerHTML=content;
				 }else{
					 roleName=data.datas.datas.name;
					   roleId=data.datas.datas.id;
				   var content="<a>当前用户的角色为:"+roleName+"</a>";
				   console.log('roleId:'+roleId);
				   document.getElementById("roleName").innerHTML=content;
				   loadL1Data(roleId);
				 }
				}
			});
			
		  $.ajax({
				url:'role_queryAll',
				type:'POST',
				async: false,
				dataType:'json',
				success:function(data){
					list=data.datas.list;
					//console.log(user);
				}
			});
			var dataGridColumns=[
					{header:'角色',name:'name'},
					{header:'创建人名',name:'createName'},
					{header:'角色描述',name:'description'}
			];
			listbox1= $("#listbox1").ligerListBox({
	                isShowCheckBox: true, 
	                isMultiSelect: false,
	                width:300,
	                height:200,
	                data:list,
	                columns: dataGridColumns,
	                onSelected: function (id)
	                {
	                	loadL1Data(id);
	                }


	            }); 

		});
function loadL1Data(id){
	$.ajax({
		url : 'roleMenuFunc_queryMenuFuncByRoleId',
		async : false,
		type : 'post',
		data:{roleId:id},
		dataType : 'json',
		success : function(data) {
			console.log(data);
			var content='<ul style="margin:auto;" class="l-tree">';
			for(var menuName in data){
					 content+='<li><span>'+menuName+'</span>';
					 content+='<ul>';
				 $.each(data[menuName],function(index,object){
					 //console.log(object);
					 content+='<li id="'+object.id+'"><span>'+object.funcName+'</span></li>';
				 })
				 content+='</ul>';
				 content+='</li>';
			}
			content+='</ul>';
			document.getElementById("menuFuncTree").innerHTML=content;
			treeManager = $(".l-tree").ligerTree({
				 checkbox: false
			});
		}
	});
}
function checkUserRole(){
	
}
function saveUserRole(){
	var checkedRows = listbox1.getSelectedItems();
	var checkedId=checkedRows[0].id;
	if (roleId==checkedId) {
		$.ligerDialog.warn('没有进行修改,请勾选其他行!');
		console.log('没有进行修改');
	}else{
		console.log('进行了修改');
		$.ajax({
			url:'userRole_saveOrUpdate',
			type:'POST',
			async: false,
			data:{user_id:userId,role_id:checkedId},
			dataType:'json',
			success:function(data){
				 if(data.success=='true') {  
                     var dialog = frameElement.dialog;
                     dialog.close();
                     	 
                 }else{

                 }
			}
			})
	}
}
