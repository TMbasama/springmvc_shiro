<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all" />
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
</head>
<body>
<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">菜单名称</label>
    <div class="layui-input-inline">
      <input type="text" id="name" name="name" lay-verify="required"  placeholder="请输入菜单名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">菜单url</label>
    <div class="layui-input-inline">
      <input type="text" id="url" name="url" lay-verify="required"  placeholder="请输入菜单url" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">选择父节点</label>
    <div class="layui-input-inline">
     <select id="parentId" name="parentId" >
         <option value="">请选择父节点</option>
          <option value="1">根节点</option>
          <option value="2">系统管理</option>
          <option value="5">会员管理</option>
          <option value="7">产品管理</option>
          <option value="13">连锁店管理</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">菜单描述</label>
    <div class="layui-input-block">
      <textarea placeholder="请输入菜单描述" id="description" name="description" class="layui-textarea"></textarea>
    </div>
  </div>
    <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
  </form>
 <script src="../static/layui/layui.js" charset="utf-8">
</script>
<script>
var id="${param.id}";
$.ajax({
		url:'../menu/findById',
		async : false,
		type : 'get',
		data:{id:id},
		dataType : 'json',
		success : function(data) {
			var menu=data.data;
			console.log(data.data);
			$("#name").val(menu.name);
			$("#url").val(menu.url);
			$("#parentId").val(menu.parentId);
			$("#description").val(menu.description);
		}
	});

layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form()
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  
  //监听提交
  form.on('submit(demo1)', function(data){
   console.log(data.field);
   data.field['id']=id;
    $.ajax({
		url:'../menu/update',
		async : false,
		type : 'post',
		data:data.field,
		dataType : 'json',
		success : function(data) {
			if(data.code=="0000"){
				parent.layer.msg('新增成功',{icon:1});
				var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
				parent.layer.close(index);
			}else{
			layer.msg('新增失败',{icon:2});
			}
		}
	});
    return true;
  });
  
  
});
</script>
</body>
</html>