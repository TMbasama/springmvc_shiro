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
<!--Validator  -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrapValidator.css" />	
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
<!-- select -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/plugins/select2/select2.css" type="text/css" media="all" />
<style type="text/css">
.bottomdiv {
	left: 0;
	position: fixed;
	bottom: 0;
	width: 100%;
	z-index: 100;
}
.ebank-check{
font-size:60px;
color:#00a65a;
margin-top:10px;
margin-right:20px;

}
</style>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>

	<div id="myModalNext">
		<div class="side">
			<ul class="nav nav-pills nav-justified step step-arrow">
				<li class="active"><a>第一步：填写账户信息</a></li>
				<li><a>第二步：确认账户信息</a></li>
				<li><a>第三步：开通网上银行成功</a></li>
			</ul>
		</div>
		<div class="container-fluid">
			<div class="carousel slide" data-ride="carousel"
				data-interval="false" data-wrap="true">

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<!-- <div class="item active">
						<form id="defaultForm1" method="post" class="form-horizontal">
							<div class="form-group">
								<label class="col-lg-4 control-label">客户姓名：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="name"
										placeholder="客户姓名" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-4 control-label">建行账户：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="acoount_id"
										placeholder="建行账户" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">附加码：</label>
								<div class="col-lg-5">
								</div>
							</div>

						</form>
					</div> -->
					<!-- end item  -->

<!-- 					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">
							如果您的账户取款密码是简单密码，请先前往网点柜台修改 
         					<div class="form-group">
								<label class="col-lg-4 control-label">账户取款密码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="password"
										 />
								</div>
							</div>
							我行已于22:37 向您的手机150****0861发送短信验证码，请及时输入；如未收到验证码，请点击重新获取；如手机号码不正确或为空，请到网点柜台修改、补设或咨询95533 
							<div class="form-group">
								<label class="col-lg-4 control-label">短信验证码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="cap"
										 />
								</div>
							</div>

						</form>
					</div> -->

                    <div class="item active">
						<form id="defaultForm1" method="post" class="form-horizontal">

							<div class="form-group">
								<label class="col-lg-4 control-label">储蓄账户：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="acct_id" name="acct_id" />
								</div>
							</div>

							<!--如果您的账户取款密码是简单密码，请先前往网点柜台修改  -->
         					<div class="form-group">
								<label class="col-lg-4 control-label">账户取款密码：</label>
								<div class="col-lg-5">
									<input type="password" class="form-control" name="acct_pwd"/>
								</div>
							</div>
							<!--我行已于22:37 向您的手机150****0861发送短信验证码，请及时输入；如未收到验证码，请点击重新获取；如手机号码不正确或为空，请到网点柜台修改、补设或咨询95533  -->
							<!-- <div class="form-group">
								<label class="col-lg-4 control-label">短信验证码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="cap"
										 />
								</div>
							</div> -->

						</form>
					</div>
					
					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">

							<div class="form-group">
								<label class="col-lg-4 control-label">储蓄账户：</label>
								<div class="col-lg-5">
									<p class="text-center" id="acct_id_1" name="acct_id_1" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">币种：</label>
								<div class="col-lg-5">
									<p class="text-center" id="currency" name="currency" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">持卡人名：</label>
								<div class="col-lg-5">
									<p class="text-center" id="ower_name" name="ower_name" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">预留号码：</label>
								<div class="col-lg-5">
									<p class="text-center" id="phone" name="phone" ></p>
								</div>
							</div>
         			
						</form>

					</div>

					<!-- end item -->
					<div class="item" style="height:400px">
					    <div class="container">
						<h2 style="text-align:center"><i class="fa fa-check-circle ebank-check" ></i>恭喜您，开通网上银行成功！</h2>
						<p style="text-align:center;margin-left:60px;">可以享受账户查询、投资理财、信用卡、生活缴费等服务</p>
						<!-- <div style="margin: auto;">
						<button type="button" class="btn btn-success btn-lg" style="text-align: center;">进入首页</button>
						</div> -->
						<div class="btn-group btn-group-justified" role="group" style="margin-top:100px">
                               <div class="btn-group" role="group">
                               </div>
                               <div class="btn-group" role="group">
                               <button type="button" class="btn btn-success btn-sm" onclick="location.href='/ebank/user/profile'">进入个人中心</button>
                               </div>
                               <div class="btn-group" role="group">
                               </div>
                        </div>
                        </div>
					</div>
					<!-- end item -->
				</div>
			</div>
		</div>
		<div  class="modal-footer">
			<button id="prev" type="button" class="btn btn-default MN-pre">上一步</button>
			<button id="next" type="button" class="btn btn-primary MN-next">下一步</button>
		</div>

	</div>
	<jsp:include page="../common/footer.jsp"></jsp:include>

    
<!-- jQuery 2.2.3 -->
<script src="${pageContext.request.contextPath}/static/plugins/jQuery/jquery-2.2.3.min.js"></script>		
<script src="${pageContext.request.contextPath}/static/common/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/common/layer/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/guide/brush.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/select2/select2.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrapValidator.js"></script>	
	<script>
	
		$(function() {
			$("#city").select2();
			
			 $('#defaultForm1').bootstrapValidator({
				excluded : [':disabled'],//[':disabled', ':hidden', ':not(:visible)']
		        message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
		        fields: {
		               acct_id: {
		                validators: {
		                    notEmpty: {
		                        message: '账号不能为空'
		                    },
		                    remote: {
		                        url: '${pageContext.request.contextPath}/account/validAcctId',
		                        message: '账号不存在',
		                        delay :  2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大
		                    } 
		                }
		            },
		            acct_pwd: {
		                validators: {
		                    notEmpty: {
		                        message: '密码不能为空' 
		                    }
		                }
		            }
		          
		        },
		         submitHandler: function(validator, form, submitButton) {
		            // Use Ajax to submit form data
		            console.log('submitHandlering');
		            validator.defaultSubmit(); 
		        }
		    });
			 
			
			$("#prev").hide();
			$("#prev").click(function() {
	                           console.log($("#myModalNext .step .active").length );
								if ($("#myModalNext .step .active").length >1) {
								$("#myModalNext .carousel").carousel('prev');
									$($($("#myModalNext .step li.active"))[$("#myModalNext .step li.active").length - 1]).removeClass("active");
									 $("#next").text("下一步");
								}
							})
			$("#next").click(function() {
            	 var length=$("#myModalNext .step .active").length;
            	 switch (length){
            	 case 1:
            		 console.log($("#myModalNext .step .active").length );
        				var bootstrapValidator = $("#defaultForm1").data('bootstrapValidator');
                     	bootstrapValidator.validate();
                     	console.log(bootstrapValidator.isValid());
                     	//var param={$("#defaultForm1").serialize(),$("#defaultForm2").serialize()};
                    	 //console.log(param);
                    	 if(bootstrapValidator.isValid()){
        				                   $.ajax({
        				         	        type :'POST',
        				         	        url : '${pageContext.request.contextPath}/account/verifyPwd',
        				         	        data : $("#defaultForm1").serialize(),
        				         	        dataType : "json",
        				         	        success : function(data){
        				         	        	if(data.code=="0000"){
        				         	        		var object=data.data;
        				         	        		$("#prev").show();
        				         	        	   $("#myModalNext .carousel").carousel('next');
        	      				                   $("#myModalNext .step li.active").next().addClass("active");
        	      				                   $("#next").text("确定");
        	      				                   $("#acct_id_1").text(object.acct_id);
        	      				                   $("#currency").text(object.acct_currency);
        	      				                   $("#ower_name").text(object.ower_name);
        	      				                   $("#phone").text(object.ower_phone);
        				         	        	}else{
        				         	        		layer.msg("储蓄卡密码错误",{icon: 5},function(){});
        				         	        		
        				         	        	}
        				         	        },
        				         	    });
        				                    
                    	 }
            		 break;
            	 case 2:
            		console.log($("#myModalNext .step .active").length );
      				
                  		$.ajax({
			         	        type :'POST',
			         	        url : '${pageContext.request.contextPath}/internetbank/applyOnlineBank',
			         	        data : $("#defaultForm1").serialize(),
			         	        dataType : "json",
			         	        success : function(data){
			         	        	if(data.code=="0000"){
			         	        	   $("#myModalNext .carousel").carousel('next');
     				                   $("#myModalNext .step li.active").next().addClass("active");
     				                   $(".modal-footer").hide();
			         	        	}else{
			         	        		layer.msg("开通网上银行失败",{icon: 5},function(){});
			         	        		
			         	        	}
			         	        },
			         	    });
      				                    
            		 break;
            	 }
			})

		})
	</script>
</body>
</html>