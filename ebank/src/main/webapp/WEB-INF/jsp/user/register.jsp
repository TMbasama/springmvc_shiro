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
				<li class="active"><a>第一步：填写个人基本信息</a></li>
				<li><a>第二步：设置用户密码</a></li>
				<li><a>第三步：注册成功</a></li>
			</ul>
		</div>
		<div class="container-fluid">
			<div class="carousel slide" data-ride="carousel"
				data-interval="false" data-wrap="true">
         
                 <div class="carousel-inner" role="listbox">
                   <div class="item active">
						<form id="defaultForm1" method="post" class="form-horizontal">
         					<div class="form-group">
								<label class="col-lg-4 control-label">客户姓名：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="name"/>
								</div>
							</div>
							
							<div class="form-group">
								<label class="col-lg-4 control-label">性别：</label>
								<div class="col-lg-5">
									<select name="gender" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option value="1" selected>男</option>
										<option value="0">女</option>
									</select>

								</div>
							</div>
							
							<div class="form-group">
								<label class="col-lg-4 control-label">身份证号：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="idcard"/>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">用户昵称：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="username"/>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">手机号码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="phone"/>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">邮箱地址：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="email"/>
								</div>
							</div>

						</form>
					</div>

					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">

							<div class="form-group">
								<label class="col-lg-4 control-label">请设置用户登录密码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="password" />
								</div>
							</div>

         					<div class="form-group">
								<label class="col-lg-4 control-label">再次输入用户登录密码：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="repassword"/>
								</div>
							</div>
						</form>

					</div>

					<!-- end item -->
					<div class="item" style="height:400px">
					    <div class="container">
						<h2 style="text-align:center"><i class="fa fa-check-circle ebank-check" ></i>恭喜您，申请信用卡成功！</h2>
						<p style="text-align:center;margin-left:60px;">我们会尽快审核，并将卡片邮寄到你的地址。</p>
						<!-- <div style="margin: auto;">
						<button type="button" class="btn btn-success btn-lg" style="text-align: center;">进入首页</button>
						</div> -->
						<div class="btn-group btn-group-justified" role="group" style="margin-top:100px">
                               <div class="btn-group" role="group">
                               </div>
                               <div class="btn-group" role="group">
                               <button type="button" class="btn btn-success btn-sm" onclick="location.href='/ebank'">进入主页</button>
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
//		        live: 'disabled',
		        message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
		        fields: {
		        	name: {
		                validators: {
		                    notEmpty: {
		                        message: '客户姓名不能为空'
		                    },
		                   /*  remote: {
		                       url: 'department_findByName',
		                        message: 'The username is not available'
		                    } */
		                }
		            },
		        	idcard: {
		                validators: {
		                    notEmpty: {
		                        message: '身份证不能为空'
		                    },
		                   /*  remote: {
		                       url: 'department_findByName',
		                        message: 'The username is not available'
		                    } */
		                }
		            },
		        	username: {
		                validators: {
		                    notEmpty: {
		                        message: '用户昵称不能为空'
		                    },
		                   /*  remote: {
		                       url: 'department_findByName',
		                        message: 'The username is not available'
		                    } */
		                }
		            }
		          
		        },
		         submitHandler: function(validator, form, submitButton) {
		            // Use Ajax to submit form data
		            console.log('submitHandlering');
		            validator.defaultSubmit(); 
		        }
		    });
			 $('#defaultForm2').bootstrapValidator({
				excluded : [':disabled'],//[':disabled', ':hidden', ':not(:visible)']
		        message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
		        fields: {
		               password: {
		                message:'密码无效',   
		                validators: {
		                    notEmpty: {
		                        message: '密码不能为空'
		                    },
		                    stringLength: {
		                         min: 6,
		                         max: 12,
		                         message: '密码长度必须在6到12之间'
		                     },
		                     regexp: {
		                         regexp: /^[a-zA-Z0-9_\.]+$/,
		                         message: '密码由数字字母下划线和.组成'
		                     }
		                }
		            },
		            repassword: {
		                validators: {
		                    notEmpty: {
		                        message: '密码不能为空' 
		                    },
		                    stringLength: {
		                         min: 6,
		                         max: 12,
		                         message: '密码长度必须在6到12之间'
		                     },
		                     identical: {//相同
		                         field: 'password',
		                         message: '两次密码不一致'
		                     },
		                     regexp: {
		                         regexp: /^[a-zA-Z0-9_\.]+$/,
		                         message: '密码由数字字母下划线和.组成'
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
                 	 console.log($("#defaultForm1").serialize());
                 	 if(bootstrapValidator.isValid()){
     				            	     $("#prev").show();
     				                     $("#myModalNext .carousel").carousel('next');
     				                     $("#myModalNext .step li.active").next().addClass("active");
     				            	     $("#next").text("确定");
                 	 }
            		 break;
            	 case 2:
            		 console.log($("#myModalNext .step .active").length );
       				var bootstrapValidator = $("#defaultForm2").data('bootstrapValidator');
                    	bootstrapValidator.validate();
                    	console.log(bootstrapValidator.isValid());
                    	//var param={$("#defaultForm1").serialize(),$("#defaultForm2").serialize()};
                   	 //console.log(param);
                   	 if(bootstrapValidator.isValid()){
       				                   $.ajax({
       				         	        type :'POST',
       				         	        url : '${pageContext.request.contextPath}/user/userRegister',
       				         	        data : $("#defaultForm1").serialize()+'&'+$("#defaultForm2").serialize(),
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
       				                    
                   	 }
            		 break;
            	 }
			})

		})
	</script>
</body>
</html>