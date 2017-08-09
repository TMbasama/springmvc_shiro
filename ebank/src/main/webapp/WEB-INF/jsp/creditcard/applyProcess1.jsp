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
<!-- Bootstrap 3.3.6 -->
  <%-- <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css"> --%>
  <!-- Font Awesome -->
<!--   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  Ionicons
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css"> -->
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/dist/css/AdminLTE.min.css">
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<!-- <div id="myModalNext">
		<div class="side">
			<ul class="nav nav-pills nav-justified step step-round">
				<li class="active"><a>第一步：选择卡片</a></li>
				<li><a>第二步：填写申请详细信息</a></li>
				<li><a>第二步：填写申请详细信息</a></li>
				<li><a>第三步：申请成功</a></li>
			</ul>
		</div>

	</div> -->
<div class="row">
        <div class="col-md-12">
          <!-- The time line -->
          <ul class="timeline">
            <!-- timeline time label -->
            <li class="time-label">
                  <span class="bg-red">
                    2017/4/27
                  </span>
            </li>
            <!-- /.timeline-label -->
            <!-- timeline item -->
            <li>
              <i class="fa fa-envelope bg-blue"></i>

              <div class="timeline-item">
                <span class="time"><i class="fa fa-clock-o"></i> 12:05</span>

                <h3 class="timeline-header">用户申请信用卡</h3>

                <div class="timeline-body">
                            尊敬的用户，恭喜你申请我行信用卡成功，我们会在48小时内进行审核请耐心等待。用户申请信用卡成功...
                </div>
                <!-- <div class="timeline-footer">
                  <a class="btn btn-primary btn-xs">Read more</a>
                  <a class="btn btn-danger btn-xs">Delete</a>
                </div> -->
              </div>
            </li>
            <!-- END timeline item -->
            <!-- timeline item -->
            <li>
              <i class="fa fa-user bg-aqua"></i>

              <div class="timeline-item">
                <span class="time"><i class="fa fa-clock-o"></i> 5 mins ago</span>

                <h3 class="timeline-header no-border">审核结果</h3>
                <div class="timeline-body">
                            管理员审核成功...
                </div>
              </div>
            </li>
            <!-- END timeline item -->
            <!-- timeline item -->
            <li>
              <i class="fa fa-comments bg-yellow"></i>

              <div class="timeline-item">
                <span class="time"><i class="fa fa-clock-o"></i> 27 mins ago</span>

                <h3 class="timeline-header">邮寄信息</h3>

                <div class="timeline-body">
                            已成功邮寄
                </div>
                <div class="timeline-footer">
                  <a class="btn btn-warning btn-flat btn-xs">参看快递信息</a>
                </div>
              </div>
            </li>
            <!-- END timeline item -->
            <!-- timeline time label -->
           <!--  <li class="time-label">
                  <span class="bg-green">
                    3 Jan. 2014
                  </span>
            </li> -->
            <!-- /.timeline-label -->
            <!-- timeline item -->
            <!-- <li>
              <i class="fa fa-camera bg-purple"></i>

              <div class="timeline-item">
                <span class="time"><i class="fa fa-clock-o"></i> 2 days ago</span>

                <h3 class="timeline-header"><a href="#">卡片到达</a> uploaded new photos</h3>

                <div class="timeline-body">
                            用户接收成功...
                </div>
              </div>
            </li> -->
            <!-- END timeline item -->
          </ul>
        </div>
        <!-- /.col -->
      </div>
<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>