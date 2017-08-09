<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/common/img/ebank_icons_57x57.png" type="image/x-icon">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/login/assets/css/amazeui.min.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/login/assets/css/app.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/login/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/login/css/demo.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/login/css/component.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/bootstrap.min.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/custom.css" type="text/css" media="all" />
<!--[if IE]>
	<script src="${pageContext.request.contextPath}/static/login/js/html5.js"></script>
<![endif]-->
<script
	src="${pageContext.request.contextPath}/static/login/assets/js/jquery.min.js"></script>
<script
		src="${pageContext.request.contextPath}/static/login/assets/js/theme.js"></script>
<title>登录</title>
<style>
.error{color:red;}
.logo-img {
    width: 159px;
    margin: 0 auto;
    margin-bottom:20px;
}

</style>
</head>
<body>
<!-- <div class="container demo-2">
	<div class="content">
		<div id="large-header" class="large-header">
			<canvas id="demo-canvas"></canvas>
			<h1 class="main-title">Spirit</span></h1>
		</div>
	</div>
</div>/container -->

 <%-- <div class="covervid-wrapper">
    <video class="covervid-video" autoplay loop>
    <source src="${pageContext.request.contextPath}/static/login/videos/video.webm" type="video/webm">
        <source src="${pageContext.request.contextPath}/static/login/videos/clouds.mp4" type="video/mp4">
    </video>
</div> --%>
<div class="am-g tpl-g">
   <!-- 风格切换 -->
		 <!-- <div class="tpl-skiner">
			<div class="tpl-skiner-toggle am-icon-cog"></div>
			<div class="tpl-skiner-content">
                <div class="tpl-skiner-content-title">
                    选择主题
                </div>
                <div class="tpl-skiner-content-bar">
                    <span class="skiner-color skiner-white" data-color="theme-white"></span>
                    <span class="skiner-color skiner-black" data-color="theme-black"></span>
                </div>
            </div>
		</div> -->
		<div class="tpl-login">
			<div class=" tpl-login-content">
                 <div class="logo-img">
                    <img src="${pageContext.request.contextPath}/static/login/assets/img/logoa.png" alt="" />
                  </div>
                 
				<!-- <div class="tpl-login-logo"></div> -->
				    <form id="form" class="am-form tpl-form-line-form" action="" method="post">
					<div class="am-form-group">
						<input type="text" class="tpl-form-input layui-input" name="username"
							value="<shiro:principal/>" placeholder="请输入账号">

					</div>

					<div class="am-form-group">
						<input type="password" class="tpl-form-input layui-input" name="password"
							placeholder="请输入密码">

					</div>
					<div class="am-form-group tpl-login-remember-me">
						<input name="rememberMe" value="true" type="checkbox"> <label
							for="remember-me"> 记住密码 </label>

					</div>

						 <button  id="submit" type="submit"
							class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success" >提交</button>
							<!-- <input type="submit" value="登录"> -->
							<h5 margin>还没有账号？<a class="#" href="${pageContext.request.contextPath}/register">立即注册</a></h5>
                  <div class="error">${error}</div>
					</div>
				</form>
			</div>
		</div>
		<script
		src="${pageContext.request.contextPath}/static/login/assets/js/amazeui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/login/assets/js/app.js"></script>
<%-- <script src="${pageContext.request.contextPath}/static/login/js/rAF.js"></script>
<script src="${pageContext.request.contextPath}/static/login/js/demo-2.js"></script --%>>

		
	<%-- <script src="${pageContext.request.contextPath}/static/login/covervid.js"></script>

		<!-- Call CoverVid -->

		<script type="text/javascript">

			$('.covervid-video').coverVid(1920, 1080);

		</script> --%>
</body>
</html>