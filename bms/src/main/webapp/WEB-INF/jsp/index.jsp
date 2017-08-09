<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bms首页</title>
</head>
  <link rel="stylesheet" href="../static/layui/css/layui.css"  media="all">
  <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<body>
    <!-- 布局容器 -->
    <div class="layui-layout layui-layout-admin">
        <!-- 头部 -->
        <div class="layui-header">
            <div class="layui-main">
                <!-- logo -->
                <a href="/" style="color: #c2c2c2; font-size: 18px; line-height: 60px;">bms后台模板</a>
                <!-- 水平导航 -->
                <ul class="layui-nav" style="position: absolute; top: 0; right: 0; background: none;">
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                            进入前台
                        </a>
                    </li>
                    <li class="layui-nav-item">
                        <a href="javascript:;">
                           Fanny
                        </a>
                        <dl class="layui-nav-child">
                            <dd>
                                <a href="javascript:;">
                                    个人信息
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;">
                                    修改密码
                                </a>
                            </dd>
                            <dd>
                                <a href="javascript:;">
                                    退出登录
                                </a>
                            </dd>
                        </dl>
                    </li>
                </ul>
            </div>
        </div>

        <!-- 侧边栏 -->
        <div class="layui-side layui-bg-black">
            <div class="layui-side-scroll">
                <ul id="navul" class="layui-nav layui-nav-tree" lay-filter="left-nav" style="border-radius: 0;">
                </ul>
            </div>
        </div>

        <!-- 主体 -->
        <div class="layui-body">
            <!-- 顶部切换卡 -->
            <div class="layui-tab layui-tab-brief" lay-filter="top-tab" lay-allowClose="true" style="margin: 0;">
                <ul class="layui-tab-title"></ul>
                <div class="layui-tab-content"></div>
            </div>
        </div>

        <!-- 底部 -->
        <div class="layui-footer" style="text-align: center; line-height: 44px;">
            Copyright © 2017 <a href="http://www.kiscms.com" target="_blank">fanny</a> Powered by Fanny
        </div>
    </div>

    <script type="text/javascript" src="../static/layui/layui.js"></script>
    <script type="text/javascript">
    	var menuData;
    $(document).ready(function() {
    	$.ajax({
    	    //url:'/bms/menu/findByUserId',
    		url:'/bms/menu/view',
    		async : false,
    		data:{userId:4},
    		type : 'post',
    		dataType : 'json',
    		success : function(data) {
    			menuData=data.data;
    			//console.log(menuData[0].children);
    		}
    	});
    	});
    /**
     * 对layui进行全局配置
     */
    layui.config({
        base: 'js/'
    });

    /**
     * 初始化整个cms骨架
     */
    layui.use(['bms'], function() {
        var bms = layui.bms('left-nav', 'top-tab');
        bms.addNav(menuData[0].children);
        bms.bind(60 + 41 + 20 + 44); //头部高度 + 顶部切换卡标题高度 + 顶部切换卡内容padding + 底部高度

        bms.clickLI(0);
    });
    </script>
</body>
</html>