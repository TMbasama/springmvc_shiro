<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>忘记密码</title>
<link rel="shortcut icon" href="images/favicon.ico" />
<link type="text/css" href="../css/css.css" rel="stylesheet" />
 <link href="../lib/ligerUI/skins/Aqua/css/ligerui-all.css" rel="stylesheet" type="text/css" />  
<script type="text/javascript" src="../js/jquery-1.8.3-min.js"></script>
<script type="text/javascript" src="../lib/ligerUI/js/core/base.js"></script>
<script type="text/javascript"
	src="../lib/ligerUI/js/plugins/ligerDrag.js"></script>
<script type="text/javascript"
	src="../lib/ligerUI/js/plugins/ligerDialog.js"></script>
<script type="text/javascript">
	$(function() {
	});
	function f_alert(type) {
		$.ligerDialog.alert('发送成功，请去邮箱验证激活', '提示', type);
		
	}
	
	function f_alert2(type) {
		switch (type) {
		case "confirm":
			$.ligerDialog.confirm('是否发送邮件', function(yes) {
				if(yes){
					document.getElementById("form1").submit();
					alert('发送成功,请去邮箱验证激活');
				}
			});
			break;
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
				<div class="liulist"></div>
				<div class="liulist"></div>
				<div class="liutextbox">
					<div class="liutext for-cur">
						<em>1</em><br /> <strong>填写账户名</strong>
					</div>
					<div class="liutext for-cur">
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
			<!--for-liucheng/-->
			<form action="email_url" method="post" class="forget-pwd" id="form1">

				<dl class="sel-yzyx">
					<dt>已验证邮箱：</dt>
					<dd>
						<input id="jmailAccepterAddress" name="jmailAccepterAddress"
							type="text" value="${sessionScope.email}" readonly />
					</dd>
					<div class="clears"></div>
				</dl>

				<dl>
					<dt>用户名：</dt>
					<dd>
						<input type="text" value="${sessionScope.name}" readonly />
					</dd>
					<div class="clears"></div>
				</dl>

				<div class="subtijiao">
					<input type="button" value="提交" onclick="f_alert2('confirm')" title="type:success"  />
					<input type="reset" value="重置">
				</div>
			</form>
			<!--forget-pwd/-->
		</div>
		<!--web-width/-->
	</div>
	<!--content/-->

</body>
</html>