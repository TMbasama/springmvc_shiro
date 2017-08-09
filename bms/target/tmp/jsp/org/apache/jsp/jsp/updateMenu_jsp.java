package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"layui-form\" action=\"\">\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">菜单名称</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" id=\"name\" name=\"name\" lay-verify=\"required\"  placeholder=\"请输入菜单名称\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">菜单url</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" id=\"url\" name=\"url\" lay-verify=\"required\"  placeholder=\"请输入菜单url\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">选择父节点</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("     <select id=\"parentId\" name=\"parentId\" >\r\n");
      out.write("         <option value=\"\">请选择父节点</option>\r\n");
      out.write("          <option value=\"1\">根节点</option>\r\n");
      out.write("          <option value=\"2\">系统管理</option>\r\n");
      out.write("          <option value=\"5\">会员管理</option>\r\n");
      out.write("          <option value=\"7\">产品管理</option>\r\n");
      out.write("          <option value=\"13\">连锁店管理</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item layui-form-text\">\r\n");
      out.write("    <label class=\"layui-form-label\">菜单描述</label>\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <textarea placeholder=\"请输入菜单描述\" id=\"description\" name=\"description\" class=\"layui-textarea\"></textarea>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <button class=\"layui-btn\" lay-submit lay-filter=\"demo1\">立即提交</button>\r\n");
      out.write("      <button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </form>\r\n");
      out.write(" <script src=\"../static/layui/layui.js\" charset=\"utf-8\">\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("var id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("$.ajax({\r\n");
      out.write("\t\turl:'../menu/findById',\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\ttype : 'get',\r\n");
      out.write("\t\tdata:{id:id},\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tvar menu=data.data;\r\n");
      out.write("\t\t\tconsole.log(data.data);\r\n");
      out.write("\t\t\t$(\"#name\").val(menu.name);\r\n");
      out.write("\t\t\t$(\"#url\").val(menu.url);\r\n");
      out.write("\t\t\t$(\"#parentId\").val(menu.parentId);\r\n");
      out.write("\t\t\t$(\"#description\").val(menu.description);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("layui.use(['form', 'layedit', 'laydate'], function(){\r\n");
      out.write("  var form = layui.form()\r\n");
      out.write("  ,layer = layui.layer\r\n");
      out.write("  ,layedit = layui.layedit\r\n");
      out.write("  ,laydate = layui.laydate;\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  //监听提交\r\n");
      out.write("  form.on('submit(demo1)', function(data){\r\n");
      out.write("   console.log(data.field);\r\n");
      out.write("   data.field['id']=id;\r\n");
      out.write("    $.ajax({\r\n");
      out.write("\t\turl:'../menu/update',\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\ttype : 'post',\r\n");
      out.write("\t\tdata:data.field,\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tif(data.code==\"0000\"){\r\n");
      out.write("\t\t\t\tparent.layer.msg('新增成功',{icon:1});\r\n");
      out.write("\t\t\t\tvar index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引\r\n");
      out.write("\t\t\t\tparent.layer.close(index);\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\tlayer.msg('新增失败',{icon:2});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("    return true;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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
