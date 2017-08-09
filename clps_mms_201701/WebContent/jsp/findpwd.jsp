<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" href="../css/css.css" rel="stylesheet" />
<script type="text/javascript" src="../js/changeImage.js"></script>
<script type="text/javascript" src="../js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../js/login.js"></script>
</head>

<body>

	<div class="content">
		<div class="web-width">
			<div class="for-liucheng">
				<div class="liulist for-cur"></div>
				<div class="liulist"></div>
				<div class="liulist"></div>
				<div class="liulist"></div>
				<div class="liutextbox">
					<div class="liutext for-cur">
						<em>1</em><br /> <strong>填写账户名</strong>
					</div>
					<div class="liutext">
						<em>2</em><br /> <strong>验证身份</strong>
					</div>
					<div class="liutext">
						<em>3</em><br /> <strong>设置新密码</strong>
					</div>
					<div class="liutext">
						<em>4</em><br /> <strong>完成</strong>
					</div>
				</div>
			</div>
			<form action="findpwd_validateCode" method="post" class="forget-pwd">
				<dl>
					<dt>账户名：</dt>
					<dd>
						<input type="text" id="name" name="name"/>
					</dd>
					<div class="clears"></div>
				</dl>
				<dl>
					<dt>验证码：</dt>
					<dd>
						<input type="text" id="code" name="code"/>
						<div class="yanzma">
							<img id="imgObj" src="verifyCode.action" onclick="changeImg()"/>
						</div>
					</dd>
					<div class="clears"></div>
				</dl>
				<div class="subtijiao">
					<input type="submit" value="提交" />
					<input type="reset" value="重置">
				</div>
			</form>
			<!--forget-pwd/-->
		</div>
		<!--web-width/-->
	</div>
	<!--content/-->

	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">
		<p>适用浏览器：IE8、360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗.</p>
		<p>
			来源：<a href="http:///" target="_blank">建站基地源码</a>
		</p>
	</div>
</body>
</html>