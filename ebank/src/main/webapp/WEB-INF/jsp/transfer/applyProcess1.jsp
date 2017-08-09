<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/static/common/img/ebank_icons_57x57.png"
	type="image/x-icon">
<title>EBank</title>
<link
	href="${pageContext.request.contextPath}/static/common/fonts/font_1.css"
	rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/css/bootstrap.min.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/css/theme.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/css/revslider.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/css/custom.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/plugins/guide/bs-is-fun.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/font-awesome/css/font-awesome.css"
	type="text/css" media="all" />
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="box">
            <div class="box-header">
              <h3 class="box-title" style="margin-top:30px;margin-left:30px; margin-right:30px">我申请的卡片</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body no-padding" style="margin-left:30px; margin-right:30px">
              <table class="table table-condensed">
                <tbody id="applyTable">
                <tr>
                  <th>申请卡片名称</th>
                  <th>卡片类型</th>
                  <th>受理日期</th>
                  <th>卡片状态</th>
                </tr>
              </tbody></table>
            </div>
            <!-- /.box-body -->
          </div>
       <div id="myModalNext" style="margin-top:100px; margin-bottom:30px">
		<div class="side">
			<ul class="nav nav-pills nav-justified step step-round">
				<li class="active"><a>申请成功</a></li>
				<li><a>审核成功</a></li>
				<li><a>邮寄中</a></li>
				<li><a>用户接收完成</a></li>
			</ul>
		</div>
	</div>
	<p id="desc" style="text-align:center;margin-left:60px;margin-bottom:70px"></p>
	<jsp:include page="../common/footer.jsp"></jsp:include>


	<script
		src="${pageContext.request.contextPath}/static/plugins/guide/jquery-1.11.0.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/common/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/plugins/guide/brush.js"></script>
	<script>
	 $.ajax({
	        type :'POST',
	        url : '${pageContext.request.contextPath}/creditcard/queryProcess',
	        dataType : "json",
	        success : function(data){
	        	console.log(data);
	        	if(data.code=="0000"){
	             var object=data.data;
	             var status;
	             switch(object.check_status){
	             case 1:
	            	 status="申请成功";
	            	 break;
	             case 2:
	            	 status="审核成功";
	            	 break;
	             case 3:
	            	 status="邮寄中";
	            	 break;
	             case 4:
	            	 status="用户接收成功";
	            	 break;
	             }
	        	 for(var i=1;i<object.check_status;i++){
	        		 $("#myModalNext .step li.active").next().addClass("active");
	        	 }
	        	 var content="<tr><td>"+object.card_type+"</td>"+
	        	                 "<td>主卡</td>"+
	        	                 "<td>"+object.apply_time+"</td>"+
	        	                 "<td>"+status+"</td></tr>";
	        	 $(content).appendTo("#applyTable");
	        	 $("#desc").text(data.desc);
	        	}else{
	        		
	        	}
	        },
	    });
		$(function() {
			$("#prev").click(function() {
	                           console.log($("#myModalNext .step .active").length );
								if ($("#myModalNext .step .active").length >1) {
								$("#myModalNext .carousel").carousel('prev');
									$($($("#myModalNext .step li.active"))[$("#myModalNext .step li.active").length - 1]).removeClass("active");
								}
							})
			$("#next").click(function() {
				console.log($("#myModalNext .step .active").length );
				             if ($("#myModalNext .step .active").length <=2) {
				            	     $("#prev").show();
				                     $("#myModalNext .carousel").carousel('next');
				                     $("#myModalNext .step li.active").next().addClass("active");
				                }
				             console.log($("#myModalNext .step .active").length );
				             if($("#myModalNext .step .active").length ===2){
				            	 $("#next").text("确定");
				             }
				             if($("#myModalNext .step .active").length ===3){
				            	 $(".modal-footer").hide();
				            	 /* $("#next").text("确定"); */
				             }
			})

		})
	</script>
</body>
</html>