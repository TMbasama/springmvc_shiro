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
    <label class="layui-form-label">连锁店名</label>
    <div class="layui-input-inline">
      <input type="text" id="name" name="name" lay-verify="required"  placeholder="请输入连锁店名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">请选择类型</label>
    <div class="layui-input-inline">
     <select id="type" name="type" >
         <option value="">请选择类型</option>
          <option value="0">总店</option>
          <option value="1">分店</option>
          <option value="2">经销店</option>
      </select>
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">通信地址</label>
    <div class="layui-input-inline">
      <input type="text" id="address" name="address" lay-verify="required"  placeholder="请输入通信地址" autocomplete="off" class="layui-input">
    </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">手机号码</label>
    <div class="layui-input-inline">
      <input type="text" id="phone" name="phone" lay-verify="required" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
    </div>
  </div>
     <div class="layui-form-item">
    <label class="layui-form-label">管理人</label>
    <div class="layui-input-inline">
      <input type="text" id="manager" name="manager" lay-verify="required"  placeholder="请输入管理人名" autocomplete="off" class="layui-input">
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
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form()
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  
  //监听提交
  form.on('submit(demo1)', function(data){
   console.log(data.field);
    $.ajax({
		url:'../store/add',
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