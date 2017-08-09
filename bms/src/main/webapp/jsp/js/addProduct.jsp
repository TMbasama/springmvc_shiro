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
    <label class="layui-form-label">产品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="name" lay-verify="required"  placeholder="请输入用户名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item" id="file">
  <label class="layui-form-label">请选择图片</label>
  <div class="layui-input-inline">
       <input type="file"  name="file" class="layui-upload-file" onchange="setName(this)" />
  </div>     
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">产品价格</label>
    <div class="layui-input-inline">
      <input type="text" name="price" lay-verify="required" placeholder="￥" autocomplete="off" class="layui-input">
    </div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">产品编号</label>
    <div class="layui-input-inline">
      <input type="text" name="uniqueNum" lay-verify="required" placeholder="请输入产品编号" autocomplete="off" class="layui-input">
    </div>
  </div>
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
function setName(file){
	console.log(file.value);
	}
layui.use('upload', function(){
  layui.upload({
    url: '../product/upload' //上传接口
    ,success: function(data){ //上传成功后的回调
      console.log(data);
    if(data.code=="0000"){
    	console.log()
    	$("#file").append("<i class='layui-icon' style='font-size: 25px; color: #F7B824;''>&#xe60c;</i><a style=' color:#F7B824;'>上传"+data.data+"成功!</a>");
    }
    }
  });
  
  /* layui.upload({
    url: '/test/upload.json'
    ,elem: '#test' //指定原始元素，默认直接查找class="layui-upload-file"
    ,method: 'get' //上传接口的http类型
    ,success: function(res){
      LAY_demo_upload.src = res.url;
    }
  }); */
});
</script>
<script>
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
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
   console.log(data.field);
    $.ajax({
		url:'../product/add',
		async : false,
		type : 'post',
		data:data.field,
		dataType : 'json',
		success : function(data) {
			if(data.code=="0000"){
			layer.msg('新增成功',{icon:1});
			window.parent.location.reload();
			}else{
			layer.msg('新增失败',{icon:1});
			}
		}
	});
    return true;
  });
  
  
});
</script>
</body>
</html>