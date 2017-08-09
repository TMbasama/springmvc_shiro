layui.define(['layer','element'], function(exports) {
    var layer      = layui.layer;
    var element    = layui.element();
    var $          = layui.jquery;

    var nav        = null;
    var tab        = null;
    var tabcontent = null;
    var tabtitle   = null;
    var navfilter  = null;
    var tabfilter  = null;

    /**
     * 添加导航
     */
    function addNav(data) {
    	console.log(data);
    	var content='<span class="layui-nav-bar" style="height: 0px; top: 0px; opacity: 0;"></span><li class="layui-nav-item layui-this"><a href="javascript:;" data-url="../html/index.html" data-id="1">主页</a></li>';
    	//遍历第一级菜单
    		$.each(data,function(i1,o1){
    			var id1=o1.id;
    			var name1=o1.text;
    			var children1=o1.children;
    			var url1=o1.url;
    			if (children1==null) {
    				content+='<li class="layui-nav-item">'+
    				'<a href="javascript:;" data-url="'+url1+'" data-id="'+id1+'">'+name1+'</a>';
    			}else{
    				content+='<li class="layui-nav-item">'+
    			    '<a href="javascript:;">'+name1+'<span class="layui-nav-more"></span></a>'+
    			    '<ul class="layui-nav-child">';
    				//遍历第二级菜单
    				$.each(o1.children,function(i2,o2){
    					var id2=o2.id;
    					var name2=o2.text;
    					var children2=o2.children;
    					var url2=o2.url;
    					content+='<li class="layui-nav-item">'+
    					'<a href="javascript:;" data-url="'+url2+'" data-id="'+id2+'">'+name2+'</a>';
    					content+="</li>";
    				})
    				content+="</ul>";
    			}
    		content+="</li>";
    		});
    		nav.append(content);
    		element.init('nav('+navfilter+')');
    		//document.getElementById("navul").innerHTML=content;
    }

    /**
     * 将侧边栏与顶部切换卡进行绑定
     */
    function bind(height) {
    	console.log("height:"+height);
        var height = height || 60 + 41 + 44; //头部高度 顶部切换卡标题高度 底部高度
    	console.log("height:"+height);
        /**
         * iframe自适应
         */
        
        $(window).resize(function() {
            //设置顶部切换卡容器度
            tabcontent.height($(this).height() - height);
            //设置顶部切换卡容器内每个iframe高度
            tabcontent.find('iframe').each(function () {
                $(this).height(tabcontent.height());
            });
        }).resize();

        console.log(element);
        /**
         * 监听侧边栏导航点击事件
         */
        element.on('nav('+navfilter+')', function(elem) {
            var a        = elem.children('a');
            var title    = a.text();
            var src      = elem.children('a').attr('data-url');
            var id       = elem.children('a').attr('data-id');
            var iframe   = tabcontent.find('iframe[data-id='+id+']').eq(0);
            var tabindex = tabtitle.children('li').length;
            console.log(title);
            console.log("tabindex:"+tabindex);
            if(src != undefined && src != null && id != undefined && id != null) {
                if(iframe.length) { //存在 iframe
                    //获取iframe身上的tab index
                    tabindex = iframe.attr('data-tabindex');
                }else{ //不存在 iframe
                    //显示加载层
                    var tmpIndex = layer.load();
                    //设置1秒后再次关闭loading
                    setTimeout(function() {
                        layer.close(tmpIndex);
                    }, 1000);
                    //拼接iframe
                    var iframe = '<iframe onload="layui.layer.close('+tmpIndex+')"';
                    iframe += ' src="'+src+'" data-id="'+id+'" data-tabindex="'+tabindex+'"';
                    iframe += ' style="width: 100%; height: '+tabcontent.height()+'px; border: 0px;"';
                    iframe += '></iframe>';
                    //顶部切换卡新增一个卡片
                    element.tabAdd(tabfilter, {title: title, content: iframe,id:id });
                }

                //切换到指定索引的卡片
                console.log("tabfilter:"+tabfilter);
                element.tabChange(tabfilter, id);

                //隐藏第一个切换卡的删除按钮
                if(tabindex == 0) tabtitle.find('li').eq(0).find('i').hide();
            }
        });
    }

    /**
     * 根据索引点击导航栏的某个li
     */
    function clickLI(index) {
    	console.log("index:"+index);
        nav.find('li').eq(index || 0).click();
    }

    /**
     * 导出接口
     */
    exports('bms', function(navLayFilter, tabLayFilter) {
        navfilter  = navLayFilter;
        tabfilter  = tabLayFilter;

        nav        = $('.layui-nav[lay-filter='+navfilter+']').eq(0);
        tab        = $('.layui-tab[lay-filter='+tabfilter+']').eq(0);
        tabcontent = tab.children('.layui-tab-content').eq(0);
        tabtitle   = tab.children('.layui-tab-title').eq(0);
       // console.log(nav);
        //console.log(tab);
        //console.log(tabcontent);
       console.log("tabtitle:"+tabtitle);
        var error = '';
        if(nav.length == 0) {
            error += '没有找到导航栏<br>';
        }

        if(tab.length == 0) {
            error += '没有找到切换卡<br>';
        }

        if(error) {
            layer.msg('bms模块初始化失败！<br>' + error);
            return false;
        }

        return {addNav: addNav, bind: bind, clickLI: clickLI};
    });
});