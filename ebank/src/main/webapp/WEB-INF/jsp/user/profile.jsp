<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/font-awesome/css/font-awesome.css" type="text/css" media="all" />	
<!-- DataTables -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/plugins/datatables/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/font-awesome/css/font-awesome.css"
	type="text/css" media="all" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/ebank/ebank.css"
	type="text/css" media="all" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/user/tab/css/normalize.css" />
<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/user/tab/css/demo.css" /> --%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/user/tab/css/tabs.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/user/tab/css/tabstyles.css" />

<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/header.jsp"></jsp:include>
	<div class="breadcrumbs">
		<div class="container">
			<a href="${pageContext.request.contextPath}">首页</a><span>/</span><a
				href="javascript:void(0);">用户</a><span>/</span>个人中心
			<!-- <h1 class="title-page">基金列表</h1> -->
		</div>
	</div>
	<div class="row">
		<div class="col-sm-3">
			<div class="last_review_author" style="margin: 20px 50px;">
				<h5>${user.username }</h5>
				<h6>正式会员</h6>
				<!-- <img src="/ebank/static/common/img/imgs/review_author.jpg" alt=""> -->
			</div>
		</div>
		<div class="col-md-8" style="margin-top: 20px;">
			<!-- <section>
				<div class="tabs tabs-style-iconbox">
					<nav>
						<ul>
							<li class=""><a href="#section-iconbox-1" class="icon icon-home"><span>Home</span></a></li>
							<li class=""><a href="#section-iconbox-2" class="icon icon-gift"><span>Deals</span></a></li>
							<li class=""><a href="#section-iconbox-3" class="icon icon-upload"><span>Upload</span></a></li>
							<li class=""><a href="#section-iconbox-4" class="icon icon-coffee"><span>Work</span></a></li>
							<li class=""><a href="#section-iconbox-5" class="icon icon-config"><span>Settings</span></a></li>
						</ul>
					</nav>
					<div class="content-wrap">
						<section id="section-iconbox-1" class=""><p>1</p></section>
						<section id="section-iconbox-2" class=""><p>2</p></section>
						<section id="section-iconbox-3" class=""><p>3</p></section>
						<section id="section-iconbox-4" class=""><p>4</p></section>
						<section id="section-iconbox-5" class=""><p>5</p></section>
					</div>/content
				</div>/tabs
			</section> -->
			<section>
			<div class="tabs tabs-style-fillup">
				<nav>
				<ul>
					<li class=""><a href="#section-fillup-1" class="icon icon-box"><span>账户查询</span></a></li>
					<li class=""><a href="#section-fillup-2"
						class="icon icon-gift"><span>用户信息</span></a></li>
					<li class=""><a href="#section-fillup-3"
						class="icon icon-upload"><span>基金</span></a></li>
					<li class=""><a href="#section-fillup-4"
						class="icon icon-coffee"><span>理财产品</span></a></li>
					<li class=""><a href="#section-fillup-5"
						class="icon icon-config"><span>消费记录</span></a></li>
				</ul>
				</nav>
				<div class="content-wrap">
					<section id="section-fillup-1" class="">
					<table id="acctTable" class="table table-bordered table-striped">
					</table>
					</section>
					<section id="section-fillup-2" class="">
					<form id="defaultForm2" method="post" class="form-horizontal">
						<div class="form-group">
							<label class="col-lg-4 control-label">用户名：</label>
							<div class="col-lg-5">
								<p class="text-center" id="gas_acct_id_1" name="gas_acct_id_1">${user.name }</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-4 control-label">手机号码：</label>
							<div class="col-lg-5">
								<p class="text-center" id="pay_amount_1" name="pay_amount_1">${user.phone }</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-4 control-label">电子邮箱：</label>
							<div class="col-lg-5">
								<p class="text-center" id="acct_id_1" name="acct_id_1">${user.email }</p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-4 control-label">身份证号：</label>
							<div class="col-lg-5">
								<p class="text-center" id="avail_amount" name="avail_amount">${user.idcard }</p>
							</div>
						</div>

					</form>
					</section>
					<section id="section-fillup-3" class="">
					<table id="fundTable" class="table table-bordered table-striped" style="width:859px;">
					</table>
					</section>
					<section id="section-fillup-4" class="">
					<table id="financeTable" class="table table-bordered table-striped">
					</table>
					</section>
					<section id="section-fillup-5" class="">
					<table id="expeRecordTable"
						class="table table-bordered table-striped">
					</table>
					</section>
				</div>
				<!-- /content -->
			</div>
			<!-- /tabs --> </section>
		</div>
	</div>


	<!-- <table id="" class="table table-bordered table-striped">
              </table> -->

	<jsp:include page="../common/footer.jsp"></jsp:include>

	<script
		src="${pageContext.request.contextPath}/static/plugins/datatables/jquery.dataTables.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/plugins/datatables/dataTables.bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/static/user/tab/js/cbpFWTabs.js"></script>
	<script>
		(function() {

			[].slice.call(document.querySelectorAll('.tabs')).forEach(
					function(el) {
						new CBPFWTabs(el);
					});

		})();
	</script>

	<!-- page script -->
	<script>
		$(function() {
			//1
			var dataTable = $('#acctTable')
					.DataTable(
							{
								"bLengthChange" : false,
								"bPaginate" : true, //翻页功能
								"bFilter" : true,
								//保存状态到cookie *************** 很重要 ， 当搜索的时候页面一刷新会导致搜索的消失。使用这个属性就可避免了
								//"bStateSave" : true,
								//改变每页显示数据数量
								"bLengthChange" : false,
								"bSort" : false,
								"iDisplayLength" : 10,
								"sPaginationType" : "full_numbers",
								"bProcessing" : true,
								"bServerSide" : true,
								"searching" : false,
								"sAjaxSource" : "${pageContext.request.contextPath}/user/queryAccount",
								//如果加上下面这段内容，则使用post方式传递数据
								/* "fnServerData": function ( sSource, aoData, fnCallback ) {
								$.ajax( {
								"dataType": 'json',
								"type": "POST",
								"url": sSource,
								"data": aoData,
								"success": function(result){
									// DEBUG
									//console.log(result)
									if (result.aaData === null) {
									result.aaData = [];
									}
									// DEBUG
									console.log(result);
									fnCallback(result); // draw the table
									}
								} );
								}, */
								"sServerMethod" : "POST",
								"data" : null,
								//列的定义
								"aoColumns" : [ {
									"data" : "acct_id",
									"sTitle" : "账号"
								}, {
									"data" : "acct_nickname",
									"sTitle" : "别名"
								}, {
									"data" : "acct_currency",
									"sTitle" : "币种"
								}, {
									"data" : "acct_balance",
									"sTitle" : "账户余额"
								}, {
									"data" : "online_bank",
									"sTitle" : "网上银行"
								}, {
									"data" : "mobile_bank",
									"sTitle" : "手机银行"
								}, {
									"data" : "acct_payment",
									"sTitle" : "账户支付"
								},
								/* {
									"sTitle" : "操作",
									// 定义操作列
									"targets" : 12,//操作按钮目标列
									"render" : function(data, type, row) {
										//var params =JSON.stringify(row).name;
										//console.log(row);
										var param = row.id;
										var html = '<a href="${pageContext.request.contextPath}/fund/product/purchase?id='
												+ param
												+ '" class="btn btn-primary btn-sm"  >卖出</a>';
										return html;
									}
								} */],
								//visible-设置列不可见		
								"columnDefs" : [ {
									"render" : function(data, type, row) {
										if (data == 0) {
											return "未开通";
										} else if (data == 1) {
											return "已开通";
										}
									},
									"targets" : [ 4, 5, 6 ]
								} ],
								"language" : {
									"processing" : "处理中...",
									"lengthMenu" : "显示 _MENU_ 项结果",
									"zeroRecords" : "没有匹配结果",
									"info" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
									"infoEmpty" : "显示第 0 至 0 项结果，共 0 项",
									"infoFiltered" : "(由 _MAX_ 项结果过滤)",
									"infoPostFix" : "",
									"search" : "搜索:",
									"searchPlaceholder" : "搜索...",
									"url" : "",
									"emptyTable" : "表中数据为空",
									"loadingRecords" : "载入中...",
									"infoThousands" : ",",
									"paginate" : {
										"first" : "首页",
										"previous" : "上页",
										"next" : "下页",
										"last" : "末页"
									},
									"aria" : {
										paginate : {
											first : '首页',
											previous : '上页',
											next : '下页',
											last : '末页'
										},
										"sortAscending" : ": 以升序排列此列",
										"sortDescending" : ": 以降序排列此列"
									},
									"decimal" : "-",
									"thousands" : "."
								}
							});
		});

		//2
		//3
		var dataTable = $('#fundTable')
				.DataTable(
						{
							"bLengthChange" : false,
							"bPaginate" : true, //翻页功能
							"bFilter" : true,
							//保存状态到cookie *************** 很重要 ， 当搜索的时候页面一刷新会导致搜索的消失。使用这个属性就可避免了
							//"bStateSave" : true,
							//改变每页显示数据数量
							"bLengthChange" : false,
							"bSort" : false,
							"iDisplayLength" : 10,
							"sPaginationType" : "full_numbers",
							"bProcessing" : true,
							"bServerSide" : true,
							"searching" : false,
							"sAjaxSource" : "${pageContext.request.contextPath}/fund/myfundLst",
							//如果加上下面这段内容，则使用post方式传递数据
							/* "fnServerData": function ( sSource, aoData, fnCallback ) {
							$.ajax( {
							"dataType": 'json',
							"type": "POST",
							"url": sSource,
							"data": aoData,
							"success": function(result){
								// DEBUG
								//console.log(result)
								if (result.aaData === null) {
								result.aaData = [];
								}
								// DEBUG
								console.log(result);
								fnCallback(result); // draw the table
								}
							} );
							}, */
							"sServerMethod" : "POST",
							"data" : null,
							// "aaSorting": [[5, "desc"]],
							//列的定义
							"aoColumns" : [
									{
										"data" : "acct_id",
										"sTitle" : "账号"
									},
									{
										"data" : "name",
										"sTitle" : "基金名称"
									},
									{
										"data" : "hold_price",
										"sTitle" : "持有金额"
									},
									/* {
										"data" : "hold_amount",
										"sTitle" : "持有份额"
									}, */
									{
										"data" : "buy_worth",
										"sTitle" : "购买价格"
									},
									{
										"data" : "net_worth",
										"sTitle" : "当前价格"
									},
									{
										//"bSortable": false,
										"data" : "earn_price",
										"sTitle" : "当前盈利"
									},
									{
										"data" : "buy_time",
										"sTitle" : "购买时间"
									}

									/* ,
									{
										"sTitle" : "操作",
										// 定义操作列
										"targets" : 6,//操作按钮目标列
										"render" : function(data, type, row) {
											//var params =JSON.stringify(row).name;
											//console.log(row);
											var param = row.id;
											var html = '<a href="${pageContext.request.contextPath}/finance/product/purchase?id='
													+ param
													+ '" class="btn btn-primary btn-sm"  >卖出</a>';
											return html;
										}
									}  */],
							//visible-设置列不可见		
							"columnDefs" : [ {
								"render" : function(data, type, row) {
									return "¥" + data;
								},
								"targets" : [ 2, 3 ]
							}, {
								"bSortable" : false,
								"targets" : [ 0 ]
							}, ],
							"language" : {
								"processing" : "处理中...",
								"lengthMenu" : "显示 _MENU_ 项结果",
								"zeroRecords" : "没有匹配结果",
								"info" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
								"infoEmpty" : "显示第 0 至 0 项结果，共 0 项",
								"infoFiltered" : "(由 _MAX_ 项结果过滤)",
								"infoPostFix" : "",
								"search" : "搜索:",
								"searchPlaceholder" : "搜索...",
								"url" : "",
								"emptyTable" : "表中数据为空",
								"loadingRecords" : "载入中...",
								"infoThousands" : ",",
								"paginate" : {
									"first" : "首页",
									"previous" : "上页",
									"next" : "下页",
									"last" : "末页"
								},
								"aria" : {
									paginate : {
										first : '首页',
										previous : '上页',
										next : '下页',
										last : '末页'
									},
									"sortAscending" : ": 以升序排列此列",
									"sortDescending" : ": 以降序排列此列"
								},
								"decimal" : "-",
								"thousands" : "."
							}
						});
		//4
		var dataTable = $('#financeTable')
				.DataTable(
						{
							"bLengthChange" : false,
							"bPaginate" : true, //翻页功能
							"bFilter" : true,
							//保存状态到cookie *************** 很重要 ， 当搜索的时候页面一刷新会导致搜索的消失。使用这个属性就可避免了
							//"bStateSave" : true,
							//改变每页显示数据数量
							"bLengthChange" : false,
							"bSort" : false,
							"iDisplayLength" : 10,
							"sPaginationType" : "full_numbers",
							"bProcessing" : true,
							"bServerSide" : true,
							"searching" : false,
							"sAjaxSource" : "${pageContext.request.contextPath}/myfinanceLst",
							//如果加上下面这段内容，则使用post方式传递数据
							/* "fnServerData": function ( sSource, aoData, fnCallback ) {
							$.ajax( {
							"dataType": 'json',
							"type": "POST",
							"url": sSource,
							"data": aoData,
							"success": function(result){
								// DEBUG
								//console.log(result)
								if (result.aaData === null) {
								result.aaData = [];
								}
								// DEBUG
								console.log(result);
								fnCallback(result); // draw the table
								}
							} );
							}, */
							"sServerMethod" : "POST",
							"data" : null,
							"aaSorting" : [ [ 5, "desc" ] ],
							//列的定义
							"aoColumns" : [
									{
										"data" : "acct_id",
										"sTitle" : "账号"
									},
									{
										"data" : "name",
										"sTitle" : "产品名称"
									},
									{
										"data" : "hold_amount",
										"sTitle" : "持有份额"
									},
									{
										"data" : "avail_amount",
										"sTitle" : "可用份额"
									},
									{
										"data" : "net_worth",
										"sTitle" : "净值"
									},
									{
										//"bSortable": false,
										"data" : "worth_time",
										"sTitle" : "净值日期"
									},
									{
										"data" : "end_time",
										"sTitle" : "到期日"
									}

									/* ,
									{
										"sTitle" : "操作",
										// 定义操作列
										"targets" : 6,//操作按钮目标列
										"render" : function(data, type, row) {
											//var params =JSON.stringify(row).name;
											//console.log(row);
											var param = row.id;
											var html = '<a href="${pageContext.request.contextPath}/finance/product/purchase?id='
													+ param
													+ '" class="btn btn-primary btn-sm"  >卖出</a>';
											return html;
										}
									} */ ],
							//visible-设置列不可见		
							"columnDefs" : [ {
								"render" : function(data, type, row) {
									return "¥" + data;
								},
								"targets" : [ 2, 3, 4 ]
							}, {
								"bSortable" : false,
								"targets" : [ 0 ]
							}, ],
							"language" : {
								"processing" : "处理中...",
								"lengthMenu" : "显示 _MENU_ 项结果",
								"zeroRecords" : "没有匹配结果",
								"info" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
								"infoEmpty" : "显示第 0 至 0 项结果，共 0 项",
								"infoFiltered" : "(由 _MAX_ 项结果过滤)",
								"infoPostFix" : "",
								"search" : "搜索:",
								"searchPlaceholder" : "搜索...",
								"url" : "",
								"emptyTable" : "表中数据为空",
								"loadingRecords" : "载入中...",
								"infoThousands" : ",",
								"paginate" : {
									"first" : "首页",
									"previous" : "上页",
									"next" : "下页",
									"last" : "末页"
								},
								"aria" : {
									paginate : {
										first : '首页',
										previous : '上页',
										next : '下页',
										last : '末页'
									},
									"sortAscending" : ": 以升序排列此列",
									"sortDescending" : ": 以降序排列此列"
								},
								"decimal" : "-",
								"thousands" : "."
							}
						});
		//5
		var dataTable = $('#expeRecordTable').DataTable({
			"bLengthChange" : false,
			"bPaginate" : true, //翻页功能
			"bFilter" : true,
			//保存状态到cookie *************** 很重要 ， 当搜索的时候页面一刷新会导致搜索的消失。使用这个属性就可避免了
			//"bStateSave" : true,
			//改变每页显示数据数量
			"bLengthChange" : false,
			"bSort" : true,
			"iDisplayLength" : 10,
			"sPaginationType" : "full_numbers",
			"bProcessing" : true,
			"bServerSide" : true,
			"searching" : false,
			"sAjaxSource" : "${pageContext.request.contextPath}/user/myExpeRecord",
			//如果加上下面这段内容，则使用post方式传递数据
			/* "fnServerData": function ( sSource, aoData, fnCallback ) {
			$.ajax( {
			"dataType": 'json',
			"type": "POST",
			"url": sSource,
			"data": aoData,
			"success": function(result){
				// DEBUG
				//console.log(result)
				if (result.aaData === null) {
				result.aaData = [];
				}
				// DEBUG
				console.log(result);
				fnCallback(result); // draw the table
				}
			} );
			}, */
			"sServerMethod" : "POST",
			"data" : null,
			"aaSorting" : [ [ 2, "desc" ] ],
			//列的定义

			"aoColumns" : [ {
				"data" : "acct_id",
				"sTitle" : "账号"
			}, {
				"data" : "create_short_time",
				"sTitle" : "记账日"
			}, {
				"data" : "create_time",
				"sTitle" : "交易时间"
			}, {
				"data" : "pay_amount",
				"sTitle" : "支出"
			}, {
				"data" : "income_amount",
				"sTitle" : "收入"
			}, {
				"data" : "avail_balance",
				"sTitle" : "账户余额"
			}, {
				"data" : "other_acct_id",
				"sTitle" : "对方账号"
			}, {
				"data" : "other_name",
				"sTitle" : "对方户名"
			} ],
			"language" : {
				"processing" : "处理中...",
				"lengthMenu" : "显示 _MENU_ 项结果",
				"zeroRecords" : "没有匹配结果",
				"info" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
				"infoEmpty" : "显示第 0 至 0 项结果，共 0 项",
				"infoFiltered" : "(由 _MAX_ 项结果过滤)",
				"infoPostFix" : "",
				"search" : "搜索:",
				"searchPlaceholder" : "搜索...",
				"url" : "",
				"emptyTable" : "表中数据为空",
				"loadingRecords" : "载入中...",
				"infoThousands" : ",",
				"paginate" : {
					"first" : "首页",
					"previous" : "上页",
					"next" : "下页",
					"last" : "末页"
				},
				"aria" : {
					paginate : {
						first : '首页',
						previous : '上页',
						next : '下页',
						last : '末页'
					},
					"sortAscending" : ": 以升序排列此列",
					"sortDescending" : ": 以降序排列此列"
				},
				"decimal" : "-",
				"thousands" : "."
			}
		});
	</script>
</body>
</html>