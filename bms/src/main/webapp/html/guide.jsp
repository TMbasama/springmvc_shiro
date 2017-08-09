<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/html/bootstrap.min.css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/html/bs-is-fun.css" media="all" />
<title>Insert title here</title>
</head>
<body>
<ul class="nav nav-pills nav-justified step step-arrow">
							<li class="active"><a>step1</a>
							</li>
							<li><a>step2</a>
							</li>
							<li><a>step3</a>
							</li>
						</ul>
						<ul class="nav nav-pills nav-justified step step-square">
							<li class="active"><a>step1</a>
							</li>
							<li><a>step2</a>
							</li>
							<li><a>step3</a>
							</li>
						</ul>
						<ul class="nav nav-pills nav-justified step step-round">
							<li class="active"><a>step1</a>
							</li>
							<li><a>step2</a>
							</li>
							<li><a>step3</a>
							</li>
						</ul>
						<ul class="nav nav-pills nav-justified step step-progress">
							<li class="active"><a>step1<span class="caret"></span></a>
							</li>
							<li><a>step2<span class="caret"></span></a>
							</li>
							<li><a>step3<span class="caret"></span></a>
							</li>
							<li><a>step4<span class="caret"></span></a>
							</li>
							<li><a>step5<span class="caret"></span></a>
							</li>
							<li><a>step6<span class="caret"></span></a>
							</li>
						</ul>
					</div>
					<div class="modal-body">
						<div class="container-fluid">
							<div class="carousel slide" data-ride="carousel" data-interval="false" data-wrap="false">

								<!-- Wrapper for slides -->
								<div class="carousel-inner" role="listbox">
									<div class="item active">
										<p>步骤一</p>
									</div>
									<div class="item">
										<p>步骤二</p>
									</div>
									<div class="item">
										<p>步骤三</p>
									</div>
								</div>
							</div>
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default MN-pre">prev</button>
						<button type="button" class="btn btn-primary MN-next">next</button>
					</div>
		<script src="./jquery-1.11.0.js.下载"></script>
		<script src="./bootstrap.min.js.下载"></script>
		<script type="text/javascript" src="./brush.js.下载"></script>
		<script>
			$(function() {
				SyntaxHighlighter.config.clipboardSwf = 'js/clipboard.swf';
				SyntaxHighlighter.all();
				//myModalNext 
				$("#myModalNext .modal-footer button").each(function() {
					$(this).click(function() {
						if ($(this).hasClass("MN-next")) {
							$("#myModalNext .carousel").carousel('next');
							$("#myModalNext .step li.active").next().addClass("active");
						} else {
							$("#myModalNext .carousel").carousel('prev');
							if ($("#myModalNext .step li").length > 1) {
								$($($("#myModalNext .step li.active"))[$("#myModalNext .step li.active").length - 1]).removeClass("active")
							}
						}
					})
				})
			})
		</script
</body>
</html>