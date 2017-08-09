var userId=$.cookie('userId');
var treeManager=null;
var menuFuncIdsArr=null;
var roleName=null;
var list=null;
var roleId=null;
var listbox1;
var listbox2;
var listbox3;
var l1Data;
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
				   roleName=data.datas.datas.name;
				   roleId=data.datas.datas.id;
				   var content="<a>当前用户的角色为:"+roleName+"</a>";
				   console.log('roleId:'+roleId);
				   document.getElementById("roleName").innerHTML=content;
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
	                width:200,
	                height:150,
	                data:list,
	                columns: dataGridColumns,
	                onSelected: function (id)
	                {
	                	 listbox2.clear();
		                 listbox2.clearContent();
		                 listbox3.clear();
		                 listbox3.clearContent();
	                	loadL1Data(id);
	                }


	            }); 
			listbox2= $("#listbox2").ligerListBox({
				 isShowCheckBox: false, 
				 isMultiSelect: false,
				 width:200,
				 height:150,
				 onSelected: function (id)
				 {
					 listbox3.clear();
	                 listbox3.clearContent();
					 loadL3Data(l1Data.l3[id]);
				 }
			 
			 
			 }); 
			listbox3= $("#listbox3").ligerListBox({
				 isShowCheckBox: false, 
				 isMultiSelect: false,
				 width:200,
				 height:150
			 
			 
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
			l1Data=data;
			console.log('l2:'+data.l2);
			loadL2Data(data.l2);
		}
	});
}
function loadL2Data(data){
	listbox2.setData(data);
}
function loadL3Data(data){
	console.log(data);
	listbox3.setData(data);
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
			   console.log(data);
			}
			})
	}
}
