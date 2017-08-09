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
<script type="text/javascript">
$(document).ready(function(){
	 $.ajax({
			url:'../store/queryAll',
			type : 'post',
			dataType : 'json',
			success : function(data) {
				var opt='';
				$.each(data.data,function(index,object){
					console.log(object);
					opt+='<option value="'+object.id+'">'+object.name+'</option>';
					
				})
				    console.log(opt);
				   //$("#shop").append('<option value="/'+object.id+'/">'+object.name+'</option>');
					$("#shop").html(opt);
			}
		}); 	
}	
);		
</script>
</head>
<body>
<div class="admin-main">
             <div id="top">
				<a href="javascript:;" class="layui-btn layui-btn-small" id="add">
					<i class="layui-icon">&#xe608;</i> 添加信息
				</a>
				<!-- <a href="#" class="layui-btn layui-btn-small" id="import">
					<i class="layui-icon">&#xe608;</i> 导入信息
				</a>
				<a href="#" class="layui-btn layui-btn-small">
					<i class="fa fa-shopping-cart" aria-hidden="true"></i> 导出信息
				</a>
				<a href="#" class="layui-btn layui-btn-small" id="getSelected">
					<i class="fa fa-shopping-cart" aria-hidden="true"></i> 获取全选信息
				</a>
				<a href="javascript:;" class="layui-btn layui-btn-small" id="search">
					<i class="layui-icon">&#xe615;</i> 搜索
				</a> -->
			</div>	
			
			 <!--头部搜索-->
                <section class="panel panel-padding">
                        <div  class="layui-form search">
                        
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
                                    <input class="layui-input" id="name" name="name" placeholder="用户名称">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <div class="layui-input-inline">
                                    <input class="layui-input" id="phone" name="phone" placeholder="手机号码">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <select id="shop" name="shop" >
                                    <option value="">请选择类型</option>
                                    <option value="">请选择类型</option>
                                    <!-- <option value="总店">总店</option>
                                    <option value="分店">分店</option> -->
                                </select>
                            </div> 
                             <div class="layui-inline">
                                <div class="layui-input-inline">
                                <input type="text" name="createDate" id="createDate" placeholder="创建时间" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
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
								<th>手机号码</th>
								<th>所属店铺</th>
								<th>用户角色</th>
								<th>创建人名</th>
								<th>创建时间</th>
								<th>操作</th>
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
		<!--模板-->
		<!-- <td><input type="checkbox" lay-skin="primary"></td> -->
		<script type="text/html" id="tpl">
			{{# layui.each(d.data, function(index, item){ }}
			<tr>
				<td>{{ item.username }}</td>
				<td>{{ item.phone }}</td>
				<td>{{ item.shopName }}</td>
				<td>{{ item.roleName }}</td>
				<td>{{ item.createName }}</td>
				<td>{{ item.createDate }}</td>
                <td>
					<a href="/detail-1" target="_blank" class="layui-btn layui-btn-normal layui-btn-mini">预览</a>
					<a href="javascript:;" data-id="{{ item.id }}" data-name="{{ item.name }}" data-opt="edit" class="layui-btn layui-btn-mini">编辑</a>
					<a href="javascript:;" data-id="{{ item.id }}" data-opt="del" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
                    <a href="javascript:;" data-id="{{ item.id }}" data-name="{{ item.name }}" data-opt="settingUser" class="layui-btn layui-btn-warm layui-btn-mini">设置角色</a>
				</td>
			</tr>
			{{# }); }}
		</script>
		<script type="text/javascript" src="../static/layui/layui.js"></script>
		<script>
			layui.config({
				//base: 'plugins/layui/modules/'
				base: 'js/'
			});

			var initForm=layui.use(['paging', 'form','laydate'], function() {
				var $ = layui.jquery,
					paging = layui.paging(),
					layerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象
					layer = layui.layer, //获取当前窗口的layer对象
					form = layui.form(),
					laydate = layui.laydate;;

				var p=paging.init({
					url:"../user/view", //地址
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
						//重新渲染复选框
						form.render('checkbox');
						form.on('checkbox(allselector)', function(data) {
							var elem = data.elem;

							$('#content').children('tr').each(function() {
								var $that = $(this);
								//全选或反选
								$that.children('td').eq(0).children('input[type=checkbox]')[0].checked = elem.checked;
								form.render('checkbox');
							});
						});

						$('#content').children('tr').each(function() {
							var $that = $(this);
							
							//绑定所有设置菜单按钮事件						
							$that.children('td:last-child').children('a[data-opt=settingUser]').on('click', function() {
								var id=$(this).data('id');
								//layer.msg($(this).data('id'));
								 var index = layer.open({
										title : '修改',
										type: 2,
										//area: ['1300px', '650px'],
										fix: true, //不固定
										content: 'configUser.jsp?id='+id,
										end:function(){
											p.get();
										}		
									});	
									layer.full(index);
							});
							
						//绑定所有编辑按钮事件						
							$that.children('td:last-child').children('a[data-opt=edit]').on('click', function() {
								var id=$(this).data('id');
								//layer.msg($(this).data('id'));
								 var index = layer.open({
										title : '修改',
										type: 2,
										//area: ['1300px', '650px'],
										fix: false, //不固定
										content: 'updateUser.jsp?id='+id,
										end:function(){
											p.get();
										}
									});	
									layer.full(index);
							});
						//绑定所有删除按钮事件	
							$that.children('td:last-child').children('a[data-opt=del]').on('click', function() {
								var id=$(this).data('id');
								layer.confirm('确认要删除吗？',
										{title:'警告',icon:0,btn:['确定','取消']},
										function(){
								$.ajax({
									url:'../user/delete',
									async:false,
									type:'post',
									data:{id:id},
									dataType:'json',
									success:function(data){
										if (data.code=="0000") {
											console.log(data);
											//window.location.reload();
											p.get({
												success: function() {
													layer.msg('删除成功',{icon:1});
												}
											});
										}
									}
									
								})
							});
							}
							)
								

						});

					},
				});
				//获取所有选择的列
				$('#getSelected').on('click', function() {
					var names = '';
					$('#content').children('tr').each(function() {
						var $that = $(this);
						//var $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;
						if($cbx) {
							var n = $that.children('td:last-child').children('a[data-opt=edit]').data('name');
							names += n + ',';
						}
					});
					layer.msg('你选择的名称有：' + names);
				});

              
				$('#add').on('click', function() {
						//iframe窗
						 var index = layer.open({
							title : '添加',
							type: 2,
							//area: ['1300px', '650px'],
							fix: true, //不固定
							content: 'addUser.jsp',
							end:function(){
								p.get();
							}
						});	
						layer.full(index);
				});
				
				$('#search').on('click', function() {
					var name=$("#name").val();
					var shop=$("#shop").val();
					var phone=$("#phone").val();
					var createDate=$("#createDate").val();
					p.get({
						url:"../user/view", //地址
						elem: '#content', //内容容器
						pageWhere1:name,
						pageWhere2:shop,
						pageWhere3:phone,
						pageWhere4:createDate,
						success: function() {
							layer.msg('查询成功',{icon:1});
				}
				});
				});

			});
		</script>
		<script type="text/javascript" href="../static/user/userManager.js"></script>
</body>
</html>