<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/common.css" media="all" />
<link rel="stylesheet" href="../static/layui/css/global.css" media="all">
<link rel="stylesheet" href="../static/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="../static/layui/css/table.css" />
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<style type="text/css">
/* .image{
width:80px;
height:50px;
dispaly:block margin:0 auto
} */
</style>
</head>
<body>
<div class="admin-main">
           
			<!--头部搜索-->
                <section class="panel panel-padding">
                        <div class="layui-form search">
                            <!-- <div class="layui-inline">
                                <select name="city" lay-verify="required">
                                    <option value="0">请选择地区</option>
                                    <option value="010">北京</option>
                                    <option value="021">上海</option>
                                    <option value="0571">杭州</option>
                                </select>
                            </div> -->
                           <!--  <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input class="layui-input start-date" name="start_date" placeholder="注册时间">
                                </div>
                                <div class="layui-input-inline">
                                    <input class="layui-input end-date" name="end_date" placeholder="注册时间">
                                </div>
                            </div> -->
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input class="layui-input" onkeyup="value=value.replace(/[^\d]/g,'')" id="cardNum" name="cardNum" placeholder="会员卡号">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input class="layui-input" onkeyup="value=value.replace(/[^\d]/g,'')" id="phone" name="phone" placeholder="手机号码">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <button  lay-submit class="layui-btn" id="search">查找</button>
                            </div>
                        </div>
                </section>

				<div class="layui-field-box layui-form">
					<table class="layui-table admin-table">
						<thead>
							<tr>
								<!-- <th style="width: 30px;"><input type="checkbox" lay-filter="allselector" lay-skin="primary"></th> -->
								<th>姓名</th>
								<th>性别</th>
								<th>生日</th>
								<th>手机号码</th>
								<th>会员卡号</th>
								<th>会员等级</th>
								<th>所属店铺</th>
							</tr>
						</thead>
						<tbody id="content">
						</tbody>
					</table>
				</div>
			<div>
				<div id="paged" class="page search">
				</div>
			</div>
		</div>
		<script type="text/html" id="tpl">
			{{# layui.each(d.data, function(index, item){ }}
			<tr>
				<td>{{ item.name }}</td>
				<td>{{ item.gender }}</td>
				<td>{{ item.birthday }}</td>
				<td>{{ item.phone }}</td>
				<td>{{ item.cardNum }}</td>
				<td>{{ item.level }}</td>
				<td>{{ item.shopName }}</td>
			</tr>
			{{# }); }}
		</script>
		<script type="text/javascript" src="../static/layui/layui.js"></script>
		<script>
			layui.config({
				//base: 'plugins/layui/modules/'
				base: 'js/'
			});

			var initForm=layui.use(['paging', 'form'], function() {
				var $ = layui.jquery,
					paging = layui.paging(),
					layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
					layer = layui.layer, //获取当前窗口的layer对象
					form = layui.form();

				var p=paging.init({
					url:"../member/view", //地址
					elem: '#content', //内容容器
					params: { //发送到服务端的参数
						sortName:'createDate',
						sortOrder:'desc'
					},
					type: 'GET',
					tempElem: '#tpl', //模块容器
					pageConfig: { //分页参数配置
						elem: '#paged', //分页容器
						pageSize: 5 //分页大小
					},
					success: function() { //渲染成功的回调
						//alert('渲染成功');
					},
					fail: function(msg) { //获取数据失败的回调
						console.log('获取数据失败:'+msg);
					},
					complate: function() { //完成的回调
						//alert('处理完成');


					},
				});
				$('#search').on('click', function() {
					var cardNum=$("#cardNum").val();
					var phone=$("#phone").val();
					p.get({
						url:"../member/view", //地址
						elem: '#content', //内容容器
						pageWhere1:cardNum,
						pageWhere2:phone,
						success: function() {
							layer.msg('查询成功',{icon:1});
				}
				});
				});

              
			});
		</script>
</body>
</html>