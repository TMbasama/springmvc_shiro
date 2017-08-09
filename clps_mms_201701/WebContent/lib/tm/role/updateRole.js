var id=$.cookie('id');
console.log('id:'+id);
var role=null;
//console.log(username);
$(document).ready(
		function(){
			$.ajax({
				url:'role_findById',
				type:'POST',
				async: false,
				data:{id:id},
				dataType:'json',
				success:function(data){
				role=data.datas.role;
				   console.log(role);
				   $('#name').val(role.name);
				   $('#deptId').val(role.deptId);
				   $('#description').val(role.description);
				}
			});
			tableValidate('role_update',id);
		});
