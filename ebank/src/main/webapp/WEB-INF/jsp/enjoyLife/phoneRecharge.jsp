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
<script>
$(document).ready(function(e) {
    $(".fwmc_xxk li").click(function(){
		//var fw_price = $(this).children("i").text();
		//var fw_numb = $(".srkk").val();
		//var fw_tal = fw_price*fw_numb;
		//$(".zwfb_zje span").text(fw_tal);
		$(this).addClass("on").siblings().removeClass("on");
		tola();
		});
	//加
	$(".jia").click(function(){
		var fw_numb = $(".srkk").val();	
		fw_numb++;
		$(".srkk").val(fw_numb);		
		/*$(".fwmc_xxk li").each(function() {
            if($(this).hasClass("on")){
				var dqzt_price = $(this).children("i").text();
				//alert(dqzt_price);
				var zgsj_jia = dqzt_price*fw_numb;
				$(".zwfb_zje span").text(zgsj_jia);
				}
        }); */
		tola();
		})
		
	//减
	$(".jian").click(function(){
		var fw_numb = $(".srkk").val();	
		if(fw_numb <= 1){
			alert("数量不足了，请住手！")
			}else{
		fw_numb--;
		$(".srkk").val(fw_numb);		
			}
		/*$(".fwmc_xxk li").each(function() {
            if($(this).hasClass("on")){
				var dqzt_price = $(this).children("i").text();
				//alert(dqzt_price);
				var zgsj_jia = dqzt_price*fw_numb;
				$(".zwfb_zje span").text(zgsj_jia);
				}
        }); */
		tola();
		})	
	 
	
});

function tola(){
		var $li = $(".fwmc_xxk").children("li.on");
		var money = $li.children("i").text();
		var count = $(".srkk").val();
		$(".zwfb_zje span").text(money*count);
}

</script>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	
	
	<div class="w_1200 fw_box">
	<div class="left_nav">
    <ul class="bzzx_nav_list">
      <li> <a href="${pageContext.request.contextPath}/enjoyLife/waterRecharge" class="icon_1"><i class="fa fa-tint" style="margin-right:32px; color:#209FC4"></i>水费</a> </li>
      <li> <a href="${pageContext.request.contextPath}/enjoyLife/electricityRecharge" class="icon_2"><i class="fa fa-flash" style="margin-right:32px;color:#FFB80D;"></i>电费</a> </li>
      <li> <a href="${pageContext.request.contextPath}/enjoyLife/gasRecharge" class="icon_3"><i class="fa fa-fire" style="margin-right:25px;color:#FF7A18;"></i>燃气费</a> </li>
      <li class="on"><a href="${pageContext.request.contextPath}/enjoyLife/phoneRecharge" class="icon_4"><i class="fa fa-mobile-phone" style="margin-right:25px;color:#209FC4;"></i>手机话费</a> </li>
      <li> <a href="#" class="icon_5"><i class="fa fa-fax " style="margin-right:20px;color:#FFA54E;"></i>固话话费</a></li>
      <li> <a href="#" class="icon_6"><i class="fa fa-rss-square " style="margin-right:20px;color:#2DC0C5;"></i>宽带光纤</a> </li>
      <li> <a href="#" class="icon_7"><i class="fa fa-tv" style="margin-right:20px;color:#2DC0C5;"></i>有线电视</a> </li>
    </ul>
  </div>
  <div class="fw_conent"> 
    <!--内容开始------------------------------>
    <div class="bzzx_bt"> <strong><i class="fa fa-mobile-phone" style="margin-right:10px; color:#209FC4"></i>手机话费</strong></div>
    
    <div id="myModalNext">
		 <div class="side">
			<ul class="nav nav-pills nav-justified step step-round">
				<li class="active"><a>第一步：填写缴费信息</a></li>
				<li><a>第二步：确认缴费信息</a></li>
				<li><a>第三步：缴费成功</a></li>
				<li><a>第三步：缴费成功</a></li>
			</ul>
		</div>
		<div class="container-fluid">
			<div class="carousel slide" data-ride="carousel"
				data-interval="false" data-wrap="true">

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">

                    <div class="item active">
						
						<table width="100%" border="0" cellspacing="0" cellpadding="0" class="zwfb_shop_table">
      <tbody>
      <tr>
        <td align="right">手机号码：</td>
        <td><div class="zwfb_zje">
        <div id="phonediv" class="form-group">
        <div class="col-lg-5">
			<input type="text" class="form-control" id="phone_1" value="${user.phone }"/>
		</div>
		</div>
        </div></td>
      </tr>
       <tr>
        <td height="20"></td>
        <td></td>
      </tr>
      <tr valign="top">
        <td align="right" width="70">充值面值：</td>
        <td><ul class="fwmc_xxk">
            <li class="">
              <p>售价:9.98元</p>
              <i>10</i>元</li>
            <li class="">
              <p>售价:19.96元</p>
              <i>20</i>元</li>
            <li class="">
              <p>售价:29.94元</p>
              <i>30</i>元</li>
            <li class="on">
              <p>售价:49.90元</p>
              <i>50</i>元</li>
            <li class="">
              <p>售价:99.80元</p>
              <i>100</i>元</li>
            <li class="">
              <p>售价:199.60元</p>
              <i>200</i>元</li>
          </ul></td>
      </tr>
      <!-- <tr>
        <td align="right">话费数量：</td>
        <td><div class=" zwsl_num">50个<span>职位数量职位书名</span></div> </td>
      </tr> -->
      <tr>
        <td height="20"></td>
        <td></td>
      </tr>
      <tr>
        <td align="right">购买数量：</td>
        <td><ul class="nmb_jj">
            <li class="jian">-</li>
            <li>
              <input name="" type="text" value="1" class="srkk">
            </li>
            <li class="jia">+</li>  
          </ul></td>
      </tr>
      <tr>
        <td height="20"></td>
        <td></td>
      </tr>
      <tr>
        <td align="right">价格：</td>
        <td><div class="zwfb_zje"><span>50</span> <i>元</i></div></td>
      </tr>
      <tr>
        <td height="20"></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td><a id="purchase" class="ty_but ml20">购 买</a></td>
      </tr>
    </tbody></table>
						
					</div>
					<div class="item">
						<form id="defaultForm1" method="post" class="form-horizontal">
							<div class="form-group">
								<label class="col-lg-4 control-label">储蓄账户：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="acct_id_1" name="acct_id" />
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
								<label class="col-lg-4 control-label">手机号码：</label>
								<div class="col-lg-5">
									<p class="text-center" id="phone" name="phone"></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">充值金额：</label>
								<div class="col-lg-5">
									<p class="text-center" id="pay_amount" name="pay_amount" ></p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">储蓄账户：</label>
								<div class="col-lg-5">
									<p class="text-center" id="acct_id" name="acct_id" ></p>
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
						<h2 style="margin-left:25%;"><i class="fa fa-check-circle ebank-check" ></i>恭喜您，缴纳手机话费成功！</h2>
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
	$(".modal-footer").hide();
	$("#myModalNext .side").hide();
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
		                        message: '水费账号不能为空' 
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
			 
			$("#purchase").click(function(){
				var phone=$("#phone_1").val();
				console.log(phone);
				if(phone==""){
					//$("#phonediv").append('<div class="ebank-form-mid ebank-word-aux" style="color:#EA2000;">请输入手机号码</div>');
					layer.msg("请输入手机号码",{icon:5});
					return ;
				}
				$(".modal-footer").show();
	        	$("#myModalNext .carousel").carousel('next');
	        	$("#myModalNext .step li.active").next().addClass("active");
			})
			 
			$("#prev").click(function() {
				if ($("#myModalNext .step .active").length >1) {
					$("#myModalNext .carousel").carousel('prev');
						$($($("#myModalNext .step li.active"))[$("#myModalNext .step li.active").length - 1]).removeClass("active");
					}
				if($("#myModalNext .step .active").length ==1){
					$(".modal-footer").hide();
				}
							})
			$("#next").click(function() {
            	 var length=$("#myModalNext .step .active").length;
            	 console.log("length:"+length);
            	 switch (length){
            	 case 2:
            		 console.log($("#myModalNext .step .active").length );
        				var bootstrapValidator = $("#defaultForm1").data('bootstrapValidator');
                     	bootstrapValidator.validate();
                     	console.log(bootstrapValidator.isValid());
                     	//var param={$("#defaultForm1").serialize(),$("#defaultForm2").serialize()};
                    	 //console.log(param);
        				 console.log("22222");
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
        	      				                   $("#phone").text($("#phone_1").val());
        	      				                   $("#pay_amount").text($(".zwfb_zje span").text());
        	      				                   $("#acct_id").text(object.acct_id);
        	      				                   $("#avail_amount").text(object.acct_balance);
        				         	        	}else{
        				         	        		layer.msg("储蓄卡密码错误",{icon: 5},function(){});
        				         	        		
        				         	        	}
        				         	        },
        				         	    });
        				                    
                    	 }
            		 break;
            	 case 3:
            		console.log($("#myModalNext .item .active").length );
      				    console.log($("#defaultForm2").serialize());
      				    var phone=$("#phone").text();
      				    var pay_amount=$("#pay_amount").text();
      				    var acct_id=$("#acct_id").text();
                  		$.ajax({
                  			
			         	        type :'POST',
			         	        url : '${pageContext.request.contextPath}/enjoyLife/payPhone',
			         	        data : {phone:phone,pay_amount:pay_amount,acct_id:acct_id},
			         	        dataType : "json",
			         	        success : function(data){
			         	        	if(data.code=="0000"){
			         	        	   $("#myModalNext .carousel").carousel('next');
     				                   $("#myModalNext .step li.active").next().addClass("active");
     				                   $(".modal-footer").hide();
			         	        	}else{
			         	        		layer.msg("缴纳手机话费失败",{icon: 5},function(){});
			         	        		
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