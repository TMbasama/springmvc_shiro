$(document).ready(function() {
	var menuData;
	$.ajax({
		url:'/bms/menu/view',
		async : false,
		type : 'post',
		dataType : 'json',
		success : function(data) {
			menuData=data.data;
			console.log(menuData[0].children);
		}
	});
	var content='<span class="layui-nav-bar" style="height: 0px; top: 0px; opacity: 0;"></span><li class="layui-nav-item layui-this"><a href="javascript:;" data-url="../html/index.jsp" data-id="1">主页</a></li>';
	//遍历第一级菜单
		$.each(menuData[0].children,function(i1,o1){
			var name1=o1.text;
			var children1=o1.children;
			if (children1==null) {
				content+='<li class="layui-nav-item">'+
				'<a href="javascript:;" data-url="#" data-id="1">'+name1+'</a>';
			}else{
				content+='<li class="layui-nav-item layui-nav-itemed">'+
			    '<a href="javascript:;">'+name1+'<span class="layui-nav-more"></span></a>'+
			    '<ul class="layui-nav-child">';
				//遍历第二级菜单
				$.each(o1.children,function(i2,o2){
					var name2=o2.text;
					var children2=o2.children;
					content+='<li class="layui-nav-item">'+
					'<a href="javascript:;" data-url="https://www.baidu.com/" data-id="1">'+name2+'</a>';
					content+="</li>";
				})
				content+="</ul>";
			}
		content+="</li>";
		});
		document.getElementById("navul").innerHTML=content;
	});
