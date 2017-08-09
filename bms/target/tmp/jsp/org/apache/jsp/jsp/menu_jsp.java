package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/common.css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/global.css\" media=\"all\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/table.css\" />\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* .image{\r\n");
      out.write("width:80px;\r\n");
      out.write("height:50px;\r\n");
      out.write("dispaly:block margin:0 auto\r\n");
      out.write("} */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"admin-main\">\r\n");
      out.write("             <div id=\"top\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" class=\"layui-btn layui-btn-small\" id=\"add\">\r\n");
      out.write("\t\t\t\t\t<i class=\"layui-icon\">&#xe608;</i> 添加信息\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("           <!--头部搜索-->\r\n");
      out.write("                <section class=\"panel panel-padding\">\r\n");
      out.write("                        <div class=\"layui-form search\">\r\n");
      out.write("                            <div class=\"layui-inline\">\r\n");
      out.write("                                <div class=\"layui-input-inline\">\r\n");
      out.write("                                    <input class=\"layui-input\" id=\"name\" name=\"name\" placeholder=\"菜单名称\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"layui-inline\">\r\n");
      out.write("                                <div class=\"layui-input-inline\">\r\n");
      out.write("                                    <input class=\"layui-input\" id=\"createName\" name=\"createName\" placeholder=\"创建人名\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"layui-inline\">\r\n");
      out.write("                                <button  lay-submit class=\"layui-btn\" id=\"search\">查找</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </section>\r\n");
      out.write("\t\t\t\t<div class=\"layui-field-box layui-form\">\r\n");
      out.write("\t\t\t\t\t<table class=\"layui-table admin-table\">\r\n");
      out.write("\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <th style=\"width: 30px;\"><input type=\"checkbox\" lay-filter=\"allselector\" lay-skin=\"primary\"></th> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>菜单名称</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>菜单地址</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>菜单描述</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建人名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>创建时间</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t<tbody id=\"content\">\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"paged\" class=\"page search\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--模板-->\r\n");
      out.write("\t\t<!-- <td><input type=\"checkbox\" lay-skin=\"primary\"></td> -->\r\n");
      out.write("\t\t<script type=\"text/html\" id=\"tpl\">\r\n");
      out.write("\t\t\t{{# layui.each(d.data, function(index, item){ }}\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>{{ item.name }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.url }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.description }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.createName }}</td>\r\n");
      out.write("\t\t\t\t<td>{{ item.createDate }}</td>\r\n");
      out.write("                <td>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" data-id=\"{{ item.id }}\" data-name=\"{{ item.name }}\" data-opt=\"edit\" class=\"layui-btn layui-btn-mini\">编辑</a>\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:;\" data-id=\"{{ item.id }}\" data-opt=\"del\" class=\"layui-btn layui-btn-danger layui-btn-mini\">删除</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t{{# }); }}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../static/layui/layui.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
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
      out.write("\t\t\t\t\turl:\"../menu/list\", //地址\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$('#content').children('tr').each(function() {\r\n");
      out.write("\t\t\t\t\t\t\tvar $that = $(this);\r\n");
      out.write("\t\t\t\t\t\t//绑定所有编辑按钮事件\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t$that.children('td:last-child').children('a[data-opt=edit]').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar id=$(this).data('id');\r\n");
      out.write("\t\t\t\t\t\t\t\t//layer.msg($(this).data('id'));\r\n");
      out.write("\t\t\t\t\t\t\t\t var index = layer.open({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '修改',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype: 2,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//area: ['1300px', '650px'],\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfix: true, //不固定\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcontent: 'updateMenu.jsp?id='+id,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tend:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tp.get();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlayer.full(index);\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t//绑定所有删除按钮事件\t\r\n");
      out.write("\t\t\t\t\t\t\t$that.children('td:last-child').children('a[data-opt=del]').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t\t\tvar id=$(this).data('id');\r\n");
      out.write("\t\t\t\t\t\t\t\tlayer.confirm('确认要删除吗？',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{title:'警告',icon:0,btn:['确定','取消']},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\turl:'../menu/delete',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata:{id:id},\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tif (data.code==\"0000\") {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//window.location.reload();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tp.get({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tsuccess: function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tlayer.msg('删除成功',{icon:1});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t)\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("\t\t\t\t$('#add').on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t//iframe窗\r\n");
      out.write("\t\t\t\t\t\t var index = layer.open({\r\n");
      out.write("\t\t\t\t\t\t\ttitle : '添加',\r\n");
      out.write("\t\t\t\t\t\t\ttype: 2,\r\n");
      out.write("\t\t\t\t\t\t\t//area: ['1300px', '650px'],\r\n");
      out.write("\t\t\t\t\t\t     fix: true, //不固定\r\n");
      out.write("\t\t\t\t\t\t\t//maxmin: true,\r\n");
      out.write("\t\t\t\t\t\t\tcontent: 'addMenu.jsp',\r\n");
      out.write("\t\t\t\t\t\t\tend:function(){\r\n");
      out.write("\t\t\t\t\t\t\t\tp.get();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\t\r\n");
      out.write("\t\t\t\t\t\tlayer.full(index);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$('#search').on('click', function() {\r\n");
      out.write("\t\t\t\t\tvar name=$(\"#name\").val();\r\n");
      out.write("\t\t\t\t\tvar createName=$(\"#createName\").val();\r\n");
      out.write("\t\t\t\t\tp.get({\r\n");
      out.write("\t\t\t\t\t\turl:\"../product/view\", //地址\r\n");
      out.write("\t\t\t\t\t\telem: '#content', //内容容器\r\n");
      out.write("\t\t\t\t\t\tpageWhere1:name,\r\n");
      out.write("\t\t\t\t\t\tpageWhere2:createName,\r\n");
      out.write("\t\t\t\t\t\tsuccess: function() {\r\n");
      out.write("\t\t\t\t\t\t\tlayer.msg('查询成功',{icon:1});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
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
