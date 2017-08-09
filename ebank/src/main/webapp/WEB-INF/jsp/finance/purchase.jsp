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
 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/ebank/ebank.css"
	type="text/css" media="all" />	
<!-- select -->
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/dist/css/bootstrap-select.css"
	type="text/css" media="all" />
	 --%>
<style type="text/css">
/* .ebank-check{
font-size:60px;
color:#00a65a;
margin-top:10px;
margin-right:20px;

}
.ebank-word-aux{font-size:12px;color:#999;padding:0 5px}
.ebank-form-mid{float:left;display:block;padding:8px 0;margin-right:10px} */
body { width: 100%; height:auto; }
</style>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div id="myModalNext">
		<div class="side">
			<ul class="nav nav-pills nav-justified step step-arrow">
				<li class="active"><a>第一步：填写购买信息</a></li>
				<li><a>第二步：确认购买信息</a></li>
				<li><a>第三步：购买成功</a></li>
			</ul>
		</div>
		<div style="margin-left:40% ;">
		<i class="fa fa-3x  fa-gift" style="color:#F15A24; margin-right:10px;"></i>
		<label>产品名称：</label>
		<a style="font-weight:bold; color:#337AB7">${financeProd.name }</a>
		<%-- <p class="ebank-prod-title">产品名称：</p><p class=" ebank-prod-title">${financeProd.name }</p> --%>
		</div>
		<div class="bg_title">
              <h3>填写购买信息</h3>
              </div>
		<div class="container-fluid">
			<div class="carousel slide" data-ride="carousel"
				data-interval="false" data-wrap="true">

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<form id="defaultForm1" method="post" class="form-horizontal">
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">币种</label>
								<div class="col-lg-5">
									<p class="text-center">${financeProd.currency }</p>
								</div>
							</div>
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">投资期限</label>
						 		<div class="col-lg-5">
									<p class="text-center">${financeProd.deadline }天</p>
								</div>	
							</div>	
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">产品类型</label>
						 		<div class="col-lg-5">
									<p class="text-center">其他类</p>
								</div>	
							</div>	
							<div class="form-group">
						 		<label class="col-lg-4 control-label">储蓄账户</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="acct_id" name="acct_id" />
								</div>
								<div class="ebank-form-mid ebank-word-aux">请使用产品发行区域内开户的储蓄账户</div>
							</div>
                           <div class="form-group">
						 		<label class="col-lg-4 control-label">账户密码</label>
								<div class="col-lg-5">
									<input type="password" class="form-control" id="acct_pwd" name="acct_pwd" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">分红方式</label>
								<div class="col-lg-5">
									<select id="city" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option selected>现金分红</option>
									</select>

								</div>
								<div class="ebank-form-mid ebank-word-aux">选择分红全部变为现金还是全部用于继续购买产品</div>
							</div>
							<div class="form-group">
						 		<label class="col-lg-4 control-label">购买金额</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" id="hold_amount" name="hold_amount" />
								</div>
								<div class="ebank-form-mid ebank-word-aux">起点金额${financeProd.start_amount }0,000.00，递增金额1,000.00</div>
							</div>
						</form>
					</div>
					<!-- end item  -->

					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">币种</label>
								<div class="col-lg-5">
									<p class="text-center">${financeProd.currency }</p>
								</div>
							</div>
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">投资期限</label>
						 		<div class="col-lg-5">
									<p class="text-center">${financeProd.deadline }天</p>
								</div>	
							</div>	
						    <div class="form-group">
						 		<label class="col-lg-4 control-label">产品类型</label>
						 		<div class="col-lg-5">
									<p class="text-center">其他类</p>
								</div>	
							</div>	
							<div class="form-group">
						 		<label class="col-lg-4 control-label">储蓄账户</label>
						 		<div class="col-lg-5">
								<p id="accountId_1" class="text-center"></p>
								</div>
							</div>
							<div class="form-group">
						 		<label class="col-lg-4 control-label">账户余额</label>
								<div class="col-lg-5">
									<p id="avail_amount" class="text-center"></p>
								</div>
							</div>
                            
							<div class="form-group">
								<label class="col-lg-4 control-label">分红方式</label>
								<div class="col-lg-5">
								<p class="text-center">现金分红</p>
								</div>
							</div>
							<div class="form-group">
						 		<label class="col-lg-4 control-label">购买金额</label>
						 		<div class="col-lg-5">
								<p id="count_1" class="text-center">其他类</p>
								</div>
							</div>
						</form>
					</div>



					<!-- end item -->
					<div class="item" style="height:400px">
					    <div class="container">
						<h2 style="text-align:center"><i class="fa fa-check-circle ebank-check" ></i>恭喜您，购买${financeProd.name }成功！</h2>
						<p style="text-align:center;margin-left:60px;">您可以到个人中心查看您购买的理财产品。</p>
						<!-- <div style="margin: auto;">
						<button type="button" class="btn btn-success btn-lg" style="text-align: center;">进入首页</button>
						</div> -->
						<div class="btn-group btn-group-justified" role="group" style="margin-top:100px">
                               <div class="btn-group" role="group">
                               </div>
                               <div class="btn-group" role="group">
                               <button type="button" class="btn btn-success btn-sm" onclick="location.href='/ebank'">个人中心</button>
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
	<script
		src="${pageContext.request.contextPath}/static/common/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/plugins/guide/brush.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/select2/select2.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrapValidator.js"></script>		
	<script>
	var prod_id="${financeProd.id }";
		$(function() {
			
			 $('#defaultForm1').bootstrapValidator({
					excluded : [':disabled'],//[':disabled', ':hidden', ':not(:visible)']
//			        live: 'disabled',
			        message: 'This value is not valid',
			        feedbackIcons: {
			            valid: 'glyphicon glyphicon-ok',
			            invalid: 'glyphicon glyphicon-remove',
			            validating: 'glyphicon glyphicon-refresh'
			        },
			        fields: {
			        	hold_amount: {
			                validators: {
			                    notEmpty: {
			                        message: '金额不能为空'
			                    },
			                   /*  remote: {
			                       url: 'department_findByName',
			                        message: 'The username is not available'
			                    } */
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
                 	 console.log($("#defaultForm1").serialize());
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
  				                   $("#accountId_1").text(object.acct_id);
  				                   $("#count_1").text($("#hold_amount").val());
  				                   $("#avail_amount").text(object.acct_balance);
		         	        	}else{
		         	        		layer.msg("储蓄卡密码错误",{icon: 5},function(){});
		         	        		
		         	        	}
		         	        },
		         	    });
   				            	       
                 	 }
            		 break;
            	 case 2:
      			     $.ajax({
      				 type :'POST',
      				 url : '${pageContext.request.contextPath}/finance/product/buyProd',
      				 data : $("#defaultForm1").serialize()+'&'+'prod_id='+prod_id,
      				 dataType : "json",
      				 success : function(data){
      				      if(data.code=="0000"){
      				        $("#myModalNext .carousel").carousel('next');
      	      	            $("#myModalNext .step li.active").next().addClass("active");
      	      		        $(".modal-footer").hide();
      				    }else{
      				       layer.msg("新增失败");
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