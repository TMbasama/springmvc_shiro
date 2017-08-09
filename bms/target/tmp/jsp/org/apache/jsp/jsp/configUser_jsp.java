package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class configUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/global.css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/table.css\" />\r\n");
      out.write(" <script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write(" .bottom{\r\n");
      out.write(" float:right\r\n");
      out.write(" }\r\n");
      out.write(" #close{\r\n");
      out.write(" margin-right:50px;\r\n");
      out.write(" }\r\n");
      out.write(" </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"admin-main\">\r\n");
      out.write("<div id=\"roleName\"></div>\r\n");
      out.write("           \r\n");
      out.write("\t\t\t\t<div class=\"layui-field-box layui-form\">\r\n");
      out.write("\t\t\t\t\t<table class=\"layui-table admin-table\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th style=\"width: 30px;\"></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>角色名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>角色描述</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建人名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"paged\" class=\"page\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("  <div class=\"bottom\">\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <button id=\"submit\" class=\"layui-btn\" lay-submit lay-filter=\"demo1\">立即提交</button>\r\n");
      out.write("      <button id=\"close\" type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--模板-->\r\n");
      out.write("\t\t<script type=\"text/html\" id=\"tpl\">\r\n");
      out.write("\t\t\t{{# layui.each(d.data, function(index, item){ }}\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t<td><input type=\"checkbox\" data-id=\"{{ item.id }}\"  name=\"cbox\" lay-skin=\"primary\" onclick=\"chooseOne(this);\" data-opt=\"scb\" ></td>\r\n");
      out.write("\t\t\t\t<td>{{ item.name }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.description }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.createName }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.createDate }}</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t{{# }); }}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../static/layui/layui.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\tvar id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\t//查询当前用户角色\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:'../user/findRoleByUserId',\r\n");
      out.write("\t\t\ttype:'POST',\r\n");
      out.write("\t\t\tasync: false,\r\n");
      out.write("\t\t\tdata:{userId:id},\r\n");
      out.write("\t\t\tdataType:'json',\r\n");
      out.write("\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t   if (data.code!=\"0000\") {\r\n");
      out.write("\t\t\t\t   var content=\"<a>当前用户没有设置角色,请设置</a>\";\r\n");
      out.write("\t\t\t\t   document.getElementById(\"roleName\").innerHTML=content;\r\n");
      out.write("\t\t\t }else{\r\n");
      out.write("\t\t\t\t   roleName=data.data.name;\r\n");
      out.write("\t\t\t   var content=\"<a>当前用户的角色为:\"+roleName+\"</a>\";\r\n");
      out.write("\t\t\t   document.getElementById(\"roleName\").innerHTML=content;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tlayui.config({\r\n");
      out.write("\t\t\t\t//base: 'plugins/layui/modules/'\r\n");
      out.write("\t\t\t\tbase: 'js/'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar initForm=layui.use(['paging', 'form'], function() {\r\n");
      out.write("\t\t\t\tvar $ = layui.jquery,\r\n");
      out.write("\t\t\t\t\tpaging = layui.paging(),\r\n");
      out.write("\t\t\t\t\tlayerTips = parent.layer === undefined ? layui.layer : parent.layer, //获取父窗口的layer对象\r\n");
      out.write("\t\t\t\t\tlayer = layui.layer, //获取当前窗口的layer对象\r\n");
      out.write("\t\t\t\t\tform = layui.form();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar p=paging.init({\r\n");
      out.write("\t\t\t\t\turl:\"../role/view\", //地址\r\n");
      out.write("\t\t\t\t\telem: '#content', //内容容器\r\n");
      out.write("\t\t\t\t\tparams: { //发送到服务端的参数\r\n");
      out.write("\t\t\t\t\t\tsortName:'createDate',\r\n");
      out.write("\t\t\t\t\t\tsortOrder:'desc'\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\ttype: 'GET',\r\n");
      out.write("\t\t\t\t\ttempElem: '#tpl', //模块容器\r\n");
      out.write("\t\t\t\t\tpageConfig: { //分页参数配置\r\n");
      out.write("\t\t\t\t\t\telem: '#paged', //分页容器\r\n");
      out.write("\t\t\t\t\t\tpageSize: 5 //分页大小\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess: function() { //渲染成功的回调\r\n");
      out.write("\t\t\t\t\t\t//alert('渲染成功');\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfail: function(msg) { //获取数据失败的回调\r\n");
      out.write("\t\t\t\t\t\tconsole.log('获取数据失败:'+msg);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tcomplate: function() { //完成的回调\r\n");
      out.write("\t\t\t\t\t\t//alert('处理完成');\r\n");
      out.write("\t\t\t\t\t\t//重新渲染复选框\r\n");
      out.write("\t\t\t\t\t\tform.render('checkbox');\r\n");
      out.write("\t\t\t\t\t\t/* form.on('checkbox(allselector)', function(data) {\r\n");
      out.write("\t\t\t\t\t\t\tvar elem = data.elem;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$('#content').children('tr').each(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar $that = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t\t//全选或反选\r\n");
      out.write("\t\t\t\t\t\t\t\t$that.children('td').eq(0).children('input[type=checkbox]')[0].checked = elem.checked;\r\n");
      out.write("\t\t\t\t\t\t\t\tform.render('checkbox');\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}); */\r\n");
      out.write("                        //将checkbox设置为单选\r\n");
      out.write("\t\t\t\t\t\t$('#content').children('tr').each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar $that = $(this);\r\n");
      out.write("\t\t\t\t\t\t\t$that.children('td:first-child').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;\r\n");
      out.write("\t\t\t\t\t\t\t\t if($cbx){\r\n");
      out.write("\t\t\t\t\t\t\t\t    //layer.msg($(this).data('id'));\r\n");
      out.write("\t\t\t\t\t\t\t\t    $(':checkbox[type=\"checkbox\"]').removeAttr('checked');\r\n");
      out.write("\t\t\t\t\t\t\t\t    $that.children('td').eq(0).children('input[type=checkbox]').prop('checked','checked');\r\n");
      out.write("\t\t\t\t\t\t\t\t    form.render('checkbox');\r\n");
      out.write("\t\t\t\t\t                }\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//获取所有选择的列\r\n");
      out.write("\t\t\t\t$('#getSelected').on('click', function() {\r\n");
      out.write("\t\t\t\t\tvar names = '';\r\n");
      out.write("\t\t\t\t\t$('#content').children('tr').each(function() {\r\n");
      out.write("\t\t\t\t\t\tvar $that = $(this);\r\n");
      out.write("\t\t\t\t\t\t//var $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;\r\n");
      out.write("\t\t\t\t\t\tif($cbx) {\r\n");
      out.write("\t\t\t\t\t\t\tvar n = $that.children('td:last-child').children('a[data-opt=edit]').data('name');\r\n");
      out.write("\t\t\t\t\t\t\tnames += n + ',';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tlayer.msg('你选择的名称有：' + names);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t //chooseOne()函式，參數為觸發該函式的元素本身   \r\n");
      out.write("\t\t\t   /*   function chooseOne(cb){   \r\n");
      out.write("\t\t\t         //先取得同name的chekcBox的集合物件   \r\n");
      out.write("\t\t\t         var obj = document.getElementsByName(\"cbox\");   \r\n");
      out.write("\t\t\t         for (i=0; i<obj.length; i++){   \r\n");
      out.write("\t\t\t             //判斷obj集合中的i元素是否為cb，若否則表示未被點選   \r\n");
      out.write("\t\t\t             if (obj[i]!=cb) obj[i].checked = false;   \r\n");
      out.write("\t\t\t             //若是 但原先未被勾選 則變成勾選；反之 則變為未勾選   \r\n");
      out.write("\t\t\t             //else  obj[i].checked = cb.checked;   \r\n");
      out.write("\t\t\t             //若要至少勾選一個的話，則把上面那行else拿掉，換用下面那行   \r\n");
      out.write("\t\t\t             else obj[i].checked = true;   \r\n");
      out.write("\t\t\t         }   \r\n");
      out.write("\t\t\t     }  */  \r\n");
      out.write("              \r\n");
      out.write("\t\t\t     $('#submit').on('click', function() {\r\n");
      out.write("\t\t\t    \t $('#content').children('tr').each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar $that = $(this);\r\n");
      out.write("\t\t\t\t\t\t\tvar $cbx = $that.children('td').eq(0).children('input[type=checkbox]')[0].checked;\r\n");
      out.write("\t\t\t\t\t\t\tif($cbx) {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar roleId = $that.children('td').eq(0).children('input[type=checkbox]').data('id');\r\n");
      out.write("\t\t\t\t\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl:'../user/configRole',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tasync : false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata:{user_id:id,role_id:roleId},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(data.code==\"0000\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tparent.layer.msg('设置角色成功',{icon:1});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tparent.layer.close(index);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tlayer.msg('设置角色失败',{icon:2});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t     });\r\n");
      out.write("\t\t\t     }); \t \r\n");
      out.write("\t\t\t     \r\n");
      out.write("\t\t\t\t$('#add').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t//iframe窗\r\n");
      out.write("\t\t\t\t\t\t var index = layer.open({\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '添加',\r\n");
      out.write("\t\t\t\t\t\t\ttype: 2,\r\n");
      out.write("\t\t\t\t\t\t\t//area: ['1300px', '650px'],\r\n");
      out.write("\t\t\t\t\t\t\tfix: true, //不固定\r\n");
      out.write("\t\t\t\t\t\t\tcontent: 'addUser.jsp'\r\n");
      out.write("\t\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t\tlayer.full(index);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" href=\"../static/user/userManager.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
