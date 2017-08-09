<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  	
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
	href="${pageContext.request.contextPath}/static/enjoyLife/phoneRecharge/theme.css"
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
 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/ebank/ebank.css"
	type="text/css" media="all" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/enjoyLife/phoneRecharge/base.css">		
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/enjoyLife/phoneRecharge/help.css">		
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/jquery.min.js"></script>	
<style type="text/css">
</style>

</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	
	
	<div class="w_1200 fw_box">
	<div class="left_nav">
    <ul class="bzzx_nav_list">
      <li> <a href="${pageContext.request.contextPath}/enjoyLife/waterRecharge" class="icon_1"><i class="fa fa-tint" style="margin-right:32px; color:#209FC4"></i>水费</a> </li>
      <li class="on"> <a href="${pageContext.request.contextPath}/enjoyLife/electricityRecharge" class="icon_2"><i class="fa fa-flash" style="margin-right:32px;color:#FFB80D;"></i>电费</a> </li>
      <li> <a href="${pageContext.request.contextPath}/enjoyLife/gasRecharge" class="icon_3"><i class="fa fa-fire" style="margin-right:25px;color:#FF7A18;"></i>燃气费</a> </li>
      <li><a href="${pageContext.request.contextPath}/enjoyLife/phoneRecharge" class="icon_4"><i class="fa fa-mobile-phone" style="margin-right:25px;color:#209FC4;"></i>手机话费</a> </li>
      <li> <a href="#" class="icon_5"><i class="fa fa-fax " style="margin-right:20px;color:#FFA54E;"></i>固话话费</a></li>
      <li> <a href="#" class="icon_6"><i class="fa fa-rss-square " style="margin-right:20px;color:#2DC0C5;"></i>宽带光纤</a> </li>
      <li> <a href="#" class="icon_7"><i class="fa fa-tv" style="margin-right:20px;color:#2DC0C5;"></i>有线电视</a> </li>
    </ul>
  </div>
  <div class="fw_conent"> 
    <!--内容开始------------------------------>
    <div class="bzzx_bt"> <strong><i class="fa fa-flash" style="margin-right:10px; color:#FFB80D"></i>电费</strong></div>
    
    <div id="myModalNext">
		<div class="side">
			<ul class="nav nav-pills nav-justified step step-round">
				<li class="active"><a>第一步：填写缴费信息</a></li>
				<li><a>第二步：确认缴费信息</a></li>
				<li><a>第三步：缴费成功</a></li>
			</ul>
		</div>
		<div class="container-fluid">
			<div class="carousel slide" data-ride="carousel"
				data-interval="false" data-wrap="true">

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">

                    <div class="item active">
						<form id="defaultForm1" method="post" class="form-horizontal">
                            <div class="form-group">
								<label class="col-lg-4 control-label">电费账号：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="elec_acct_id" name="elec_acct_id" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">缴纳金额：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="pay_amount" name="pay_amount" />
								</div>
							</div>
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
									<input type="text" class="form-control" name="cap"/>
								</div>
							</div> -->

						</form>
					</div>
					
					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">
                            <div class="form-group">
								<label class="col-lg-4 control-label">电费账号：</label>
								<div class="col-lg-5">
									<p class="text-center" id="elec_acct_id_1" name="elec_acct_id_1"></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">缴纳金额：</label>
								<div class="col-lg-5">
									<p class="text-center" id="pay_amount_1" name="pay_amount_1" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">储蓄账户：</label>
								<div class="col-lg-5">
									<p class="text-center" id="acct_id_1" name="acct_id_1" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">当前余额：</label>
								<div class="col-lg-5">
									<p class="text-center" id="avail_amount" name="avail_amount" ></p>
								</div>
							</div>
         			
						</form>

					</div>

					<!-- end item -->
					<div class="item">
					    <div class="container">
						<h2 style="margin-left:25%;"><i class="fa fa-check-circle ebank-check" ></i>恭喜您，缴纳电费成功！</h2>
						<p style="margin-left:25%;margin-top:30px;margin-bottom:30px;">无需开通网上银行即可支付，简便快捷</p>
						<div style="margin-top:10px;margin-left:23%;margin-right:52%;">
						<button type="button" class="btn btn-block btn-success btn-sm" onclick="location.href='/ebank/user/profile'" style="text-align: center;">个人中心</button>
						</div>
                               <!-- <button type="button" class="btn btn-success btn-sm" onclick="location.href='/ebank'">进入主页</button> -->
                        </div>
					</div>
					<!-- end item -->
				</div>
			</div>
		</div>
		<div  class="modal-footer" style="padding-bottom:0px;">
			<button id="prev" type="button" class="btn btn-default MN-pre">上一步</button>
			<button id="next" type="button" class="btn btn-primary MN-next">下一步</button>
		</div>

	</div>
    
     <div class="ebank_tip" style="margin-top:80px;"> 温馨提示：
      <p>1.您可以使用网上银行或账号支付付款</p>
      <p> 2.如您是网站注册会员登录后您可以在交易记录与电子对账单中查询到缴费交易明细，并可以使用项目定制等会员专属服务。</p>
    </div>
    
    <!--内容结束------------------------------> 
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
		        	water_acct_id: {
		                validators: {
		                    notEmpty: {
		                        message: '电费账号不能为空' 
		                    }
		                }
		            },
		            pay_amount: {
		                validators: {
		                    notEmpty: {
		                        message: '缴费金额不能为空' 
		                    }
		                }
		            },
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
        	      				                   $("#elec_acct_id_1").text($("#elec_acct_id").val());
        	      				                   $("#pay_amount_1").text($("#pay_amount").val());
        	      				                   $("#acct_id_1").text(object.acct_id);
        	      				                   $("#avail_amount").text(object.acct_balance);
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
			         	        url : '${pageContext.request.contextPath}/enjoyLife/payElec',
			         	        data : $("#defaultForm1").serialize(),
			         	        dataType : "json",
			         	        success : function(data){
			         	        	if(data.code=="0000"){
			         	        	   $("#myModalNext .carousel").carousel('next');
     				                   $("#myModalNext .step li.active").next().addClass("active");
     				                   $(".modal-footer").hide();
			         	        	}else{
			         	        		layer.msg("缴纳电费失败",{icon: 5},function(){});
			         	        		
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