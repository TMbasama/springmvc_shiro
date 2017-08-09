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
				<li class="active"><a>第一步：选择卡片</a></li>
				<li><a>第二步：填写申请详细信息</a></li>
				<li><a>第三步：申请成功</a></li>
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
								<label class="col-lg-4 control-label">客户姓名：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="apply_name"
										placeholder="客户姓名" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-4 control-label">身份证号：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="apply_idcard"
										placeholder="身份证号" />
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-4 control-label">您所在省市：</label>
								<div class="col-lg-5">
									<select name="city" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option selected>北京</option>
										<option>上海</option>
										<option>南昌</option>
										<option>武汉</option>
										<option>长沙</option>
										<option>成都</option>
										<option>太原</option>
										<option>香港</option>
										<option>台湾</option>
									</select>

								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">您希望申请的卡种是：</label>
								<div class="col-lg-5">
									<select name="card_type" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option selected>卡一</option>
										<option>卡二</option>
										<option>卡三</option>
										<option>卡四</option>
										<option>卡五</option>
										<option>卡六</option>
										<option>卡七</option>
										<option>卡八</option>
									</select>
								</div>
							</div>
						</form>
					</div>
					<!-- end item  -->

					<div class="item">
						<form id="defaultForm2" method="post" class="form-horizontal">
							<div class="form-group">
								<label class="col-lg-4 control-label">身份证有效期：</label>
								<div class="col-lg-5">
									<select id="basic" class="selectpicker show-tick form-control">
										<option selected>长期有效</option>
										<option>非长期有效</option>
									</select>

								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">婚姻状况：</label>
								<div class="col-lg-5">
									<select id="basic" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option selected>未婚</option>
										<option>已婚</option>
										<option>已婚</option>
										<option>未说明婚姻状况</option>
									</select>

								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">学历：</label>
								<div class="col-lg-5">
									<select name="education" class="selectpicker show-tick form-control"
										data-live-search="true">
										<option>博士及以上</option>
										<option>硕士</option>
										<option selected>大学本科</option>
										<option>大专和专科学校</option>
										<option>高中</option>
										<option>初中及以下</option>
									</select>

								</div>
							</div>
							
							<div class="form-group">
								<label class="col-lg-4 control-label">详细住宅地址：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="address"
										 />
								</div>
							</div>
<!-- 							<div class="form-group">
								<label class="col-lg-4 control-label">住宅邮编：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="name"
										/>
								</div>
							</div>
 -->							<div class="form-group">
								<label class="col-lg-4 control-label">移动电话：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="phone"
										 />
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-4 control-label">电子邮箱：</label>
								<div class="col-lg-5">
									<input type="text" class="form-control" name="email"
										 />
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
		        	apply_name: {
		                validators: {
		                    notEmpty: {
		                        message: '客户姓名不能为空'
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
		               address: {
		                validators: {
		                    notEmpty: {
		                        message: '详细住宅地址不能为空'
		                    },
		                   /*  remote: {
		                       url: 'department_findByName',
		                        message: 'The username is not available'
		                    } */
		                }
		            },
		            phone: {
		                validators: {
		                    notEmpty: {
		                        message: '移动电话不能为空' 
		                    }
		                }
		            }, 
		            email: {
		                validators: {
		                    notEmpty: {
		                        message: '电子邮箱不能为空' 
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
				 /* var flag=0;
				console.log($("#myModalNext .step .active").length );
				var bootstrapValidator1 = $("#defaultForm1").data('bootstrapValidator');
				 var bootstrapValidator2 = $("#defaultForm2").data('bootstrapValidator');
             	bootstrapValidator1.validate();
             	if(flag==1){ 
                  	bootstrapValidator2.validate();
                	}
             	console.log("b2:"+bootstrapValidator2.isValid());
            	 if(bootstrapValidator2.isValid()){
            		 $("#prev").show();
                    $("#myModalNext .carousel").carousel('next');
                    $("#myModalNext .step li.active").next().addClass("active");
				     $(".modal-footer").hide();
				     return ;
            	 }
            	 console.log("b1:"+bootstrapValidator1.isValid());
            	 if(bootstrapValidator1.isValid()&&flag===0){
				      $("#prev").show();
				      $("#myModalNext .carousel").carousel('next');
				      $("#myModalNext .step li.active").next().addClass("active");
				      console.log($("#myModalNext .step .active").length );
				      $("#next").text("确定");
				      flag=1;
            	 }
            	 console.log("flag:"+flag); */
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
      				         	        url : '${pageContext.request.contextPath}/creditcard/submitApply',
      				         	        data : $("#defaultForm1").serialize()+'&'+$("#defaultForm2").serialize(),
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
      				                    
                  	 }
            		 break;
            	 }
			})

		})
	</script>
</body>
</html>