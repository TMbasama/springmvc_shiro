<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../static/layui/css/layui.css" media="all" />
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- <script type="text/javascript">
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
</script> -->
</head>
<body>
<form class="layui-form">
  <div class="layui-form-item">
    <label class="layui-form-label">会员名称</label>
    <div class="layui-input-inline">
      <input type="text" id="name" name="name" lay-verify="required" placeholder="请输入会员名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">性别</label>
    <div class="layui-input-inline">
      <select id="gender" name="gender" lay-filter="aihao">
        <option value=""></option>
        <option value="男">男</option>
        <option value="女">女</option>
      </select>
    </div>
  </div>
<div class="layui-form-item">
      <label class="layui-form-label">出生日期</label>
      <div class="layui-input-inline">
        <input type="text" name="birthday" id="birthday" lay-verify="date" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input" onclick="layui.laydate({elem: this})">
      </div>
  </div>  
  <div class="layui-form-item">
      <label class="layui-form-label">手机号码</label>
      <div class="layui-input-inline">
        <input type="tel" id="phone" name="phone" lay-verify="phone" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
      <label class="layui-form-label">会员卡号</label>
      <div class="layui-input-inline">
        <input type="text" id="cardNum" name="cardNum" lay-verify="" placeholder="请输入会员卡号" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
      <label class="layui-form-label">会员等级</label>
       <div class="layui-input-inline">
      <select id="level" name="level">
        <option value="普通会员">普通会员</option>
        <option value="银卡">银卡</option>
        <option value="金卡">金卡</option>
      </select>
      </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">所属店铺</label>
    <div class="layui-input-inline">
      <select id="shop" name="shop">
        <!-- <option value="总店">总店</option>
        <option value="上海分店">上海分店</option>
        <option value="南昌分店">南昌分店</option>
        <option value="长沙分店">长沙分店</option>
        <option value="海口分店">海口分店</option> -->
      </select>
    </div>
  </div>
  <!-- <div class="layui-form-item">
    <label class="layui-form-label">身份证号码</label>
    <div class="layui-input-block">
      <input type="text" name="identity" lay-verify="" placeholder="请输入正确的身份证号" autocomplete="off" class="layui-input">
    </div>
  </div> -->
  
  <!-- <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">范围</label>
      <div class="layui-input-inline" style="width: 100px;">
        <input type="text" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">
      </div>
      <div class="layui-form-mid">-</div>
      <div class="layui-input-inline" style="width: 100px;">
        <input type="text" name="price_max" placeholder="￥" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div> -->
  
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
var id="${param.id}";
$.ajax({
		url:'../member/findById',
		type : 'get',
		data:{id:id},
		dataType : 'json',
		success : function(data) {
			var m=data.data;
			console.log(data.data);
			$("#name").val(m.name);
			$("#gender").val(m.gender);
			$("#birthday").val(m.birthday);
			$("#phone").val(m.phone);
			$("#cardNum").val(m.cardNum);
			$("#level").val(m.level);
			$("#shop").val(m.shop);
		}
	});
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form()
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //创建一个编辑器
  var editIndex = layedit.build('LAY_demo_editor');
 
  //自定义验证规则
  form.verify({
    title: function(value){
      if(value.length < 5){
        return '标题至少得5个字符啊';
      }
    }
    ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    ,content: function(value){
      layedit.sync(editIndex);
    }
  });
  
  
  //监听提交
  form.on('submit(demo1)', function(data){
  /*  layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    }) */
    console.log(data.field);
    data.field['id']=id;
    $.ajax({
		url:'../member/update',
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