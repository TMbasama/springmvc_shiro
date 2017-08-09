<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="Author" contect="http://www.webqin.net">
<title>忘记密码</title>
<link rel="shortcut icon" href="images/favicon.ico" />
<link type="text/css" href="../css/css.css" rel="stylesheet" />
<link href="../../lib/ligerUI/skins/Aqua/css/ligerui-all.css"
	rel="stylesheet" type="text/css" />
<link href="../../lib/ligerUI/skins/Gray2014/css/all.css"
	rel="stylesheet" />
<script src="../../lib/jquery/jquery-1.9.0.min.js"
	type="text/javascript"></script>
<script src="../../lib/ligerUI/js/ligerui.all.js"></script>
<script src="../../lib/jquery-validation/jquery.validate.min.js"></script>
<script src="../../lib/jquery-validation/jquery.metadata.js"></script>
<script src="../../lib/jquery-validation/messages_cn.js"></script>

<script type="text/javascript">
	function $(id) {
		return document.getElementById(id);
	}
	
	function isalphanumber(str) 
	{ 
	var result=str.match(/^[a-zA-Z0-9]+$/); 
	if(result==null) return false; 
	return true; 
	}

	function check() {
		var pwd1 = $("password").value;
		var pwd2 = $("repeatpassword").value;

		$("pwd1info").innerHTML = "";
		$("pwd2info").innerHTML = "";

		if (pwd1 == "") {
			$("pwd1info").innerHTML = "新密码不能为空";
			$("password").focus();
			return false;
		}

		if (pwd1.length < 6) {
			$("pwd1info").innerHTML = "密码长度必须大于或者等于6";
			$("password").focus();
			return false;
		}
		
		var flag=isalphanumber(pwd1);
		if (flag==false) {
			$("pwd1info").innerHTML = "密码只能由字母数字组成";
			$("password").focus();
			return false;
		}
		
		if (pwd2 == "") {
			$("pwd2info").innerHTML = "确认密码不能为空";
			$("repeatpassword").focus();
			return false;
		}

		if (pwd2.length < 6) {
			$("pwd2info").innerHTML = "密码长度必须大于或者等于6";
			$("repeatpassword").focus();
			return false;
		}
		
		var flag=isalphanumber(pwd2);
		if (flag==false) {
			$("pwd2info").innerHTML = "密码只能由字母数字组成";
			$("repeatpassword").focus();
			return false;
		}


		if (pwd1 != pwd2) {
			$("pwd2info").innerHTML = "两次密码输入不同,请重新输入";
			$("repeatpassword").focus();
			return false;
		}

	}
</script>

</head>

<body>

	<div class="content">
		<div class="web-width">
			<div class="for-liucheng">
				<div class="liulist for-cur"></div>
				<div class="liulist for-cur"></div>
				<div class="liulist for-cur"></div>
				<div class="liulist"></div>
				<div class="liutextbox">
					<div class="liutext for-cur">
						<em>1</em><br /> <strong>填写账户名</strong>
					</div>
					<div class="liutext for-cur">
						<em>2</em><br /> <strong>验证身份</strong>
					</div>
					<div class="liutext for-cur">
						<em>3</em><br /> <strong>设置新密码</strong>
					</div>
					<div class="liutext">
						<em>4</em><br /> <strong>完成</strong>
					</div>
				</div>
			</div>
			<!--for-liucheng/-->
			<form name="form1" action="find_uppwd" method="post"
				class="forget-pwd" onsubmit="return check()">


				<dl>
					<dt>新密码：</dt>
					<dd>
						<input id="password" name="password" type="password" /><span
							id="pwd1info" style="color: red;"></span>
					</dd>
					<div class="clears"></div>
				</dl>
				<dl>
					<dt>确认密码：</dt>
					<dd>
						<input type="password" name="repeatpassword" id="repeatpassword" /><span
							id="pwd2info" style="color: red;"></span>
					</dd>
					<div class="clears"></div>
				</dl>
				<dl>
					<dt>验证码：</dt>
					<dd>
						<input id="rangecode" name="rangecode" type="text" /><span
							id="rangecode" style="color: red;"></span>
					</dd>
					<div class="clears"></div>
				</dl>
				<div class="subtijiao">
					<input type="submit" value="提交" /> <input type="reset" value="重置">
				</div>

			</form>
			<!--forget-pwd/-->
		</div>
		<!--web-width/-->
	</div>
	<!--content/-->

</body>
</html>
