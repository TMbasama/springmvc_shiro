<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script type="text/javascript">
var id="${param.id}";
console.log(id);
$.ajax({
	url:'../product/findById',
	type:'get',
	dataType:'json',
	data:{id:id},
	success:function(data){
		$("#detail").attr("src",data.data.reImage);
	}
	
})
</script>
</head>
<body>
<img id="detail" src="" />
</body>
</html>