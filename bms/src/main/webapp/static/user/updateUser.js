var id="${param.id}";
$.ajax({
		url:'../user/findById',
		async : false,
		type : 'get',
		data:{id:id},
		dataType : 'json',
		success : function(data) {
			console.log(data);
		}
	});