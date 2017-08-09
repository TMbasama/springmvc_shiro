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
<link rel="stylesheet" href="../static/layui/css/global.css" media="all">
<link rel="stylesheet" href="../static/plugins/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="../static/layui/css/table.css" />
 <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
 <style type="text/css">
 .bottom{
 float:right
 }
 #close{
 margin-right:50px;
 }
 </style>
</head>
<body>
<div class="admin-main">
<div id="roleName"></div>
           
				<div class="layui-field-box layui-form">
					<table class="layui-table admin-table">
						<thead>
							<tr>
								<th style="width: 30px;"></th>
								<th>角色名称</th>
								<th>角色描述</th>
								<th>创建人名</th>
								<th>创建时间</th>
							</tr>
						</thead>
						<tbody id="content">
						</tbody>
					</table>
				</div>
			<div>
				<div id="paged" class="page">
				</div>
			</div>
  <div class="bottom">
    <div class="layui-input-block">
      <button id="submit" class="layui-btn" lay-submit lay-filter="demo1">立即提交</button>
      <button id="close" type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
		</div>
		<!--模板-->
		<script type="text/html" id="tpl">
			{{# layui.each(d.data, function(index, item){ }}
			<tr>
		<td><input type="checkbox" data-id="{{ item.id }}"  name="cbox" lay-skin="primary" onclick="chooseOne(this);" data-opt="scb" ></td>
				<td>{{ item.name }}</td>
				<td>{{ item.description }}</td>
				<td>{{ item.createName }}</td>
				<td>{{ item.createDate }}</td>
			</tr>
			{{# }); }}
		</script>
		<script type="text/javascript" src="../static/layui/layui.js"></script>
		<script>
		var id="${param.id}";
		//查询当前用户角色
		$.ajax({
			url:'../user/findRoleByUserId',
			type:'POST',
			async: false,
			data:{userId:id},
			dataType:'json',
			success:function(data){
			   if (data.code!="0000") {
				   var content="<a>当前用户没有设置角色,请设置</a>";
				   document.getElementById("roleName").innerHTML=content;
			 }else{
				   roleName=data.data.name;
			   var content="<a>当前用户的角色为:"+roleName+"</a>";
			   document.getElementById("roleName").innerHTML=content;
			 }
			}
		});
		
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
					url:"../role/view", //地址
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
						/* form.on('checkbox(allselector)', function(data) {
							var elem = data.elem;

							$('#content').children('tr').each(function() {
								var $that = $(this);
								//全选或反选
								$that.children('td').eq(0).children('input[type=checkbox]')[0].checked = elem.checked;
								form.render('checkbox');
							});
						}); */
                        //将checkbox设置为单选
						$('#content').children('tr').each(function() {
							var $that = $(this);
							$that.children('td:first-child').on('click', function() {
								var $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;
								 if($cbx){
								    //layer.msg($(this).data('id'));
								    $(':checkbox[type="checkbox"]').removeAttr('checked');
								    $that.children('td').eq(0).children('input[type=checkbox]').prop('checked','checked');
								    form.render('checkbox');
					                }
								
							});
								

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
				 //chooseOne()函式，參數為觸發該函式的元素本身   
			   /*   function chooseOne(cb){   
			         //先取得同name的chekcBox的集合物件   
			         var obj = document.getElementsByName("cbox");   
			         for (i=0; i<obj.length; i++){   
			             //判斷obj集合中的i元素是否為cb，若否則表示未被點選   
			             if (obj[i]!=cb) obj[i].checked = false;   
			             //若是 但原先未被勾選 則變成勾選；反之 則變為未勾選   
			             //else  obj[i].checked = cb.checked;   
			             //若要至少勾選一個的話，則把上面那行else拿掉，換用下面那行   
			             else obj[i].checked = true;   
			         }   
			     }  */  
              
			     $('#submit').on('click', function() {
			    	 $('#content').children('tr').each(function() {
							var $that = $(this);
							var $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;
							if($cbx) {
								var roleId = $that.children('td').eq(0).children('input[type=checkbox]').data('id');
								 $.ajax({
										url:'../user/configRole',
										async : false,
										type : 'post',
										data:{user_id:id,role_id:roleId},
										dataType : 'json',
										success : function(data) {
											if(data.code=="0000"){
												parent.layer.msg('设置角色成功',{icon:1});
												var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
												parent.layer.close(index);
											}else{
											layer.msg('设置角色失败',{icon:2});
											}
										}
									});
							}
			     });
			     }); 	 
			     
				$('#add').on('click', function() {
						//iframe窗
						 var index = layer.open({
							title : '添加',
							type: 2,
							//area: ['1300px', '650px'],
							fix: true, //不固定
							content: 'addUser.jsp'
						});	
						layer.full(index);
				});

			});
		</script>
		<script type="text/javascript" href="../static/user/userManager.js"></script>
</body>
</html>