package org.apache.jsp.WEB_002dINF.jsp.creditcard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class applyProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/ebank_icons_57x57.png\"\r\n");
      out.write("\ttype=\"image/x-icon\">\r\n");
      out.write("<title>EBank</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/fonts/font_1.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/bootstrap.min.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/theme.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/revslider.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/custom.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/guide/bs-is-fun.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/font-awesome/css/font-awesome.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("            <div class=\"box-header\">\r\n");
      out.write("              <h3 class=\"box-title\" style=\"margin-top:30px;margin-left:30px; margin-right:30px\">我申请的卡片</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-header -->\r\n");
      out.write("            <div class=\"box-body no-padding\" style=\"margin-left:30px; margin-right:30px\">\r\n");
      out.write("              <table class=\"table table-condensed\">\r\n");
      out.write("                <tbody id=\"applyTable\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>申请卡片名称</th>\r\n");
      out.write("                  <th>卡片类型</th>\r\n");
      out.write("                  <th>受理日期</th>\r\n");
      out.write("                  <th>卡片状态</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </tbody></table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.box-body -->\r\n");
      out.write("          </div>\r\n");
      out.write("       <div id=\"myModalNext\" style=\"margin-top:100px; margin-bottom:30px\">\r\n");
      out.write("\t\t<div class=\"side\">\r\n");
      out.write("\t\t\t<ul class=\"nav nav-pills nav-justified step step-round\">\r\n");
      out.write("\t\t\t\t<li class=\"active\"><a>申请成功</a></li>\r\n");
      out.write("\t\t\t\t<li><a>审核成功</a></li>\r\n");
      out.write("\t\t\t\t<li><a>邮寄中</a></li>\r\n");
      out.write("\t\t\t\t<li><a>用户接收完成</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p id=\"desc\" style=\"text-align:center;margin-left:60px;margin-bottom:70px\"></p>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/guide/jquery-1.11.0.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/guide/brush.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t $.ajax({\r\n");
      out.write("\t        type :'POST',\r\n");
      out.write("\t        url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/creditcard/queryProcess',\r\n");
      out.write("\t        dataType : \"json\",\r\n");
      out.write("\t        success : function(data){\r\n");
      out.write("\t        \tconsole.log(data);\r\n");
      out.write("\t        \tif(data.code==\"0000\"){\r\n");
      out.write("\t             var object=data.data;\r\n");
      out.write("\t             var status;\r\n");
      out.write("\t             switch(object.check_status){\r\n");
      out.write("\t             case 1:\r\n");
      out.write("\t            \t status=\"申请成功\";\r\n");
      out.write("\t            \t break;\r\n");
      out.write("\t             case 2:\r\n");
      out.write("\t            \t status=\"审核成功\";\r\n");
      out.write("\t            \t break;\r\n");
      out.write("\t             case 3:\r\n");
      out.write("\t            \t status=\"邮寄中\";\r\n");
      out.write("\t            \t break;\r\n");
      out.write("\t             case 4:\r\n");
      out.write("\t            \t status=\"用户接收成功\";\r\n");
      out.write("\t            \t break;\r\n");
      out.write("\t             }\r\n");
      out.write("\t        \t for(var i=1;i<object.check_status;i++){\r\n");
      out.write("\t        \t\t $(\"#myModalNext .step li.active\").next().addClass(\"active\");\r\n");
      out.write("\t        \t }\r\n");
      out.write("\t        \t var content=\"<tr><td>\"+object.card_type+\"</td>\"+\r\n");
      out.write("\t        \t                 \"<td>主卡</td>\"+\r\n");
      out.write("\t        \t                 \"<td>\"+object.apply_time+\"</td>\"+\r\n");
      out.write("\t        \t                 \"<td>\"+status+\"</td></tr>\";\r\n");
      out.write("\t        \t $(content).appendTo(\"#applyTable\");\r\n");
      out.write("\t        \t $(\"#desc\").text(data.desc);\r\n");
      out.write("\t        \t}else{\r\n");
      out.write("\t        \t\t\r\n");
      out.write("\t        \t}\r\n");
      out.write("\t        },\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\"#prev\").click(function() {\r\n");
      out.write("\t                           console.log($(\"#myModalNext .step .active\").length );\r\n");
      out.write("\t\t\t\t\t\t\t\tif ($(\"#myModalNext .step .active\").length >1) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#myModalNext .carousel\").carousel('prev');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$($($(\"#myModalNext .step li.active\"))[$(\"#myModalNext .step li.active\").length - 1]).removeClass(\"active\");\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t$(\"#next\").click(function() {\r\n");
      out.write("\t\t\t\tconsole.log($(\"#myModalNext .step .active\").length );\r\n");
      out.write("\t\t\t\t             if ($(\"#myModalNext .step .active\").length <=2) {\r\n");
      out.write("\t\t\t\t            \t     $(\"#prev\").show();\r\n");
      out.write("\t\t\t\t                     $(\"#myModalNext .carousel\").carousel('next');\r\n");
      out.write("\t\t\t\t                     $(\"#myModalNext .step li.active\").next().addClass(\"active\");\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t             console.log($(\"#myModalNext .step .active\").length );\r\n");
      out.write("\t\t\t\t             if($(\"#myModalNext .step .active\").length ===2){\r\n");
      out.write("\t\t\t\t            \t $(\"#next\").text(\"确定\");\r\n");
      out.write("\t\t\t\t             }\r\n");
      out.write("\t\t\t\t             if($(\"#myModalNext .step .active\").length ===3){\r\n");
      out.write("\t\t\t\t            \t $(\".modal-footer\").hide();\r\n");
      out.write("\t\t\t\t            \t /* $(\"#next\").text(\"确定\"); */\r\n");
      out.write("\t\t\t\t             }\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
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
