<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/zTree_v3/css/demo.css" type="text/css">
 <link rel="stylesheet" href="../static/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/zTree_v3/css/metroStyle/metroStyle.css" type="text/css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/zTree_v3/js/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/zTree_v3/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/zTree_v3/js/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/zTree_v3/js/jquery.ztree.exedit.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery.json-2.4.js"></script>
    <style type="text/css">
     .test1 ul{
       margin: 0 auto;
        }
     #submit{
     width:100px;margin:15px auto;display:block;
     }   
     </style>
    <script type="text/javascript">
    
    var id="${param.id}";
    console.log("id:"+id);
        var setting = {
            /* view: {
                addHoverDom: addHoverDom,
                removeHoverDom: removeHoverDom,
                selectedMulti: false
            }, */
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            /* edit: {
                enable: true
            } */
        };

        var tree;
        $(document).ready(function(){
        	var menuData;
        	$.ajax({
        		url:'../role/findMenuByRoleId',
        		async : false,
        		data:{roleId:id},
        		type : 'get',
        		dataType : 'json',
        		success : function(data) {
        			//后台数据
        			menuData=data.data;
        		}
        	});
        	//ztree初始化
           tree= $.fn.zTree.init($("#treeDemo"), setting, menuData[0].children);
        });
        
        
        /**
         * 去除数组里面的空格
         * @param arr
         * @returns
         */
        function clearNullArr(arr){ 
        	for(var i=0,len=arr.length;i<len;i++){ 
        	if(!arr[i]||arr[i]==''||arr[i] === undefined){ 
        	arr.splice(i,1); 
        	len--; 
        	i--; 
        	} 
        	} 
        	return arr; 
        	}
        
       function getNodes(){
    	   var nodes = tree.getCheckedNodes();
    	   console.log(nodes);
    	   var menuIds=new Array();
    	   $.each(nodes,function(i,o){
    		   menuIds.unshift(o.id);
    	   })
    	   var params='menuIds='+$.toJSON(clearNullArr(menuIds));
    	   $.ajax({
       		url:'../role/configMenu',
       		async : false,
       		data:$.param({roleId:id})+'&'+params,
       		type : 'get',
       		dataType : 'json',
       		success : function(data) {
       			if(data.code=="0000"){
    				parent.layer.msg('设置菜单成功',{icon:1});
    				var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
    				parent.layer.close(index);
    			}else{
    			layer.msg('设置菜单失败',{icon:2});
    			}
       		}
       	});
       }
   </script>
</head>
<body>
    <div class="test1" >
        <ul id="treeDemo" class="ztree" width="100%"></ul>
    </div>
     <div class="layui-form-item">
    <divclass="layui-input-block">
      <button class="layui-btn layui-btn-primary layui-btn-small" id="submit" onclick="getNodes()">立即提交</button>
    </div>
  </div>
</body>
</html>