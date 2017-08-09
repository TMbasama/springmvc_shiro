package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>用户登录</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/css/amazeui.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/css/amazeui.datatables.min.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/css/app.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/js/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/layui/css/layui.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/js/theme.js\"></script>\r\n");
      out.write("\t<div class=\"am-g tpl-g\">\r\n");
      out.write("\t\t<!-- 风格切换 -->\r\n");
      out.write("\t\t<!-- <div class=\"tpl-skiner\">\r\n");
      out.write("\t\t\t<div class=\"tpl-skiner-toggle am-icon-cog\"></div>\r\n");
      out.write("\t\t\t<div class=\"tpl-skiner-content\">\r\n");
      out.write("                <div class=\"tpl-skiner-content-title\">\r\n");
      out.write("                    选择主题\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"tpl-skiner-content-bar\">\r\n");
      out.write("                    <span class=\"skiner-color skiner-white\" data-color=\"theme-white\"></span>\r\n");
      out.write("                    <span class=\"skiner-color skiner-black\" data-color=\"theme-black\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t<div class=\"tpl-login\">\r\n");
      out.write("\t\t\t<div class=\"tpl-login-content\">\r\n");
      out.write("\t\t\t\t<div class=\"tpl-login-logo\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    <form id=\"form\" class=\"am-form tpl-form-line-form\">\r\n");
      out.write("\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"tpl-form-input layui-input\" id=\"username\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"请输入账号\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"am-form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" class=\"tpl-form-input layui-input\" id=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"请输入密码\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"am-form-group tpl-login-remember-me\">\r\n");
      out.write("\t\t\t\t\t\t<input id=\"remember-me\" type=\"checkbox\"> <label\r\n");
      out.write("\t\t\t\t\t\t\tfor=\"remember-me\"> 记住密码 </label>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button  id=\"submit\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"am-btn am-btn-primary  am-btn-block tpl-btn-bg-color-success\" >提交</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/js/amazeui.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/login/assets/js/app.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/layui/layui.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tlayui\r\n");
      out.write("\t\t\t\t.use(\r\n");
      out.write("\t\t\t\t\t\t[ 'form' ],\r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tvar $ = layui.jquery, layerTips = parent.layer === undefined ? layui.layer\r\n");
      out.write("\t\t\t\t\t\t\t\t\t: parent.layer, //获取父窗口的layer对象\r\n");
      out.write("\t\t\t\t\t\t\tlayer = layui.layer, //获取当前窗口的layer对象\r\n");
      out.write("\t\t\t\t\t\t\tform = layui.form();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t/* \tform.on('submit(demo1)', function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\talert(data.field);\r\n");
      out.write("\t\t\t\t\t\t\t\tconsole.log(data.field);\r\n");
      out.write("\t\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t\turl : '/bms/user/login',\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : data.field,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t             if(data.code===\"0000\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t             \tlayer.msg(data.desc,{icon:1});\r\n");
      out.write("\t\t\t\t\t\t\t\t             }else{\r\n");
      out.write("\t\t\t\t\t\t\t\t             \tlayer.msg(data.desc,{icon:2});\r\n");
      out.write("\t\t\t\t\t\t\t\t             }\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t\t\t}); */\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t $(\"#submit\").on('click', function() {\r\n");
      out.write("\t\t\t\t\t\t\t var username=$(\"#username\").val();\r\n");
      out.write("\t\t\t\t\t\t\t var password=$(\"#password\").val();\r\n");
      out.write("\t\t\t\t\t\t\t console.log(username);\r\n");
      out.write("\t\t\t\t\t\t\t console.log(password);\r\n");
      out.write("\t\t\t\t\t\t\t $.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\turl : '/bms/user/login',\r\n");
      out.write("\t\t\t\t\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\t\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tusername : username,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tpassword : password\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\t\t\t             if(data.code===\"0000\"){\r\n");
      out.write("\t\t\t\t\t\t\t             \tlayer.msg(data.desc,{icon:1});\r\n");
      out.write("\t\t\t\t\t\t\t             \tlocation.href = data.data;\r\n");
      out.write("\t\t\t\t\t\t\t             }else{\r\n");
      out.write("\t\t\t\t\t\t\t             \tlayer.msg(data.desc,{icon:2});\r\n");
      out.write("\t\t\t\t\t\t\t             }\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}); \r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
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
