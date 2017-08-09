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
<link href="http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,100,400italic,700,500,900" rel="stylesheet" type="text/css">
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
<!-- DataTables -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/datatables/dataTables.bootstrap.css">	
 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/font-awesome/css/font-awesome.css"
	type="text/css" media="all" />
 <link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/common/ebank/ebank.css"
	type="text/css" media="all" />
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../common/header.jsp"></jsp:include>
 <div class="breadcrumbs">
    	<div class="container">
        	<a href="${pageContext.request.contextPath}">首页</a><span>/</span><a href="javascript:void(0);">信用卡</a><span>/</span>在线挂失
            <!-- <h1 class="title-page">基金列表</h1> -->
        </div>
    </div>
              <table id="financeProd" class="table table-bordered table-striped">
              </table>

<jsp:include page="../common/footer.jsp"></jsp:include>
<script src="${pageContext.request.contextPath}/static/plugins/guide/jquery-1.11.0.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/static/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- page script -->
<script>
var dataTable;
  $(function () {
    /* $("#example1").DataTable({
    	
    }); */
    dataTable=$('#financeProd').DataTable({
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
		"sAjaxSource" : "${pageContext.request.contextPath}/creditcard/queryCreditcard",
		/* "fnServerParams" : function(aoData) {
			for (var i = 0; i < searchData.length; i++) {
				aoData.push(searchData[i]);
			}
		}, */
		"sServerMethod" : "POST",
		"data" : null,
		 "aaSorting": [[3, "desc"]],
		//列的定义
		"aoColumns" : [ {
			"data" : "creditcard_num",
			"sTitle" : "信用卡账号"
		}, {
			"data" : "apply_name",
			"sTitle" : "持卡人名"
		}, {
			"data" : "card_type",
			"sTitle" : "类型"
		}, {
			"data" : "apply_time",
			"sTitle" : "申请时间"
		} ,{
			"data" : "check_status",
			"sTitle" : "状态"
		},{
			"bSortable": false,
			"sTitle" : "操作",
			// 定义操作列
			"targets" : 5,//操作按钮目标列
			"render" : function(data,type,row) {
			//var params =JSON.stringify(row).name;
			//console.log(row);
				var param=row.id;
				var html = '<a href="javascript:void(0);" onclick="reportLoss()" class="btn btn-primary btn-sm"><i class=""></i>挂失</a>';
				return html;
			}
			} 
		],
	//visible-设置列不可见		
	 "columnDefs": [
			         {
			           "render": function ( data, type, row ) {
			        	   if(data==0){
			        		   return "已挂失";
			        	   }else{
			        		   return "正常";
			        	   }
			             },
			                    "targets": [4]
			                },
			            ],
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
  
  function reportLoss(){
		/* layer.config({
			  anim: 3, //默认动画风格
			  skin: 'layui-layer-molv' //默认皮肤
			}); */
		layer.confirm('确认要挂失吗？',
		{title:'警告',icon:0,btn:['确定','取消']},
		function(){
			console.log('确定');
			$.ajax({
				  url:'applyLoss',
				  type:'POST',
				  dataType:'json',
				  async : false,
				  success:function(data){
					  console.log(data);
					  if(data.code=='0000'){
						  dataTable.ajax.reload();
						  layer.msg('挂失成功',{icon:1});
					  }else{
						  layer.msg('挂失失败',{icon:2});
					  }
				  }
				  
			  });
		}
		)
	}
</script>
</body>
</html>