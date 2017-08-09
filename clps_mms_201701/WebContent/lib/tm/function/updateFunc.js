var id=$.cookie('id');
console.log('id:'+id);
var func=null;
//console.log(username);
$(document).ready(
		function(){
			$.ajax({
				url:'func_findById',
				type:'POST',
				async: false,
				data:{id:id},
				dataType:'json',
				success:function(data){
					func=data.datas.func;
				   console.log(func);
				   $('#name').val(func.name);
				   $('#description').val(func.description);
				}
			});
			tableValidate('func_update',id);
		});
