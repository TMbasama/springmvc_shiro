<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/login/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/login/assets/css/amazeui.datatables.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/login/assets/css/app.css">
<script
	src="${pageContext.request.contextPath}/static/login/assets/js/jquery.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/layui/css/layui.css" />
</head>
<body>
	<script
		src="${pageContext.request.contextPath}/static/login/assets/js/theme.js"></script>
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
			<div class="tpl-login-content">
				<div class="tpl-login-logo"></div>

				    <form id="form" class="am-form tpl-form-line-form">
					<div class="am-form-group">
						<input type="text" class="tpl-form-input layui-input" id="username"
							placeholder="请输入账号">

					</div>

					<div class="am-form-group">
						<input type="password" class="tpl-form-input layui-input" id="password"
							placeholder="请输入密码">

					</div>
					<div class="am-form-group tpl-login-remember-me">
						<input id="remember-me" type="checkbox"> <label
							for="remember-me"> 记住密码 </label>

					</div>

						<button  id="submit" type="button"
							class="am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success" >提交</button>

					</div>
				</form>
			</div>
		</div>
	<script
		src="${pageContext.request.contextPath}/static/login/assets/js/amazeui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/login/assets/js/app.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/layui/layui.js"></script>
	<script type="text/javascript">
		layui
				.use(
						[ 'form' ],
						function() {
							var $ = layui.jquery, layerTips = parent.layer === undefined ? layui.layer
									: parent.layer, //获取父窗口的layer对象
							layer = layui.layer, //获取当前窗口的layer对象
							form = layui.form();

						/* 	form.on('submit(demo1)', function(data) {
								alert(data.field);
								console.log(data.field);
								$.ajax({
									url : '/bms/user/login',
									type : 'post',
									async:false,
									data : data.field,
									dataType : 'json',
									success : function(data) {
								             if(data.code==="0000"){
								             	layer.msg(data.desc,{icon:1});
								             }else{
								             	layer.msg(data.desc,{icon:2});
								             }
									}
								});
								return true;
							}); */

							 $("#submit").on('click', function() {
							 var username=$("#username").val();
							 var password=$("#password").val();
							 console.log(username);
							 console.log(password);
							 $.ajax({
								url : '/bms/user/login',
								type : 'post',
								async:false,
								data : {
									username : username,
									password : password
								},
								dataType : 'json',
								success : function(data) {
							             if(data.code==="0000"){
							             	layer.msg(data.desc,{icon:1});
							             	location.href = data.data;
							             }else{
							             	layer.msg(data.desc,{icon:2});
							             }
								}
							}); 
							});
						});
	</script>
</body>
</html>