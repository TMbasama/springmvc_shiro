package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>bms首页</title>\r\n");
      out.write("</head>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"../static/layui/css/layui.css\"  media=\"all\">\r\n");
      out.write("  <script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 布局容器 -->\r\n");
      out.write("    <div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("        <!-- 头部 -->\r\n");
      out.write("        <div class=\"layui-header\">\r\n");
      out.write("            <div class=\"layui-main\">\r\n");
      out.write("                <!-- logo -->\r\n");
      out.write("                <a href=\"/\" style=\"color: #c2c2c2; font-size: 18px; line-height: 60px;\">童装连锁管理系统</a>\r\n");
      out.write("                <!-- 水平导航 -->\r\n");
      out.write("                <ul class=\"layui-nav\" style=\"position: absolute; top: 0; right: 0; background: none;\">\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a href=\"javascript:;\">\r\n");
      out.write("                            进入前台\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a id=\"username\" href=\"javascript:;\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <dl class=\"layui-nav-child\">\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <a href=\"javascript:;\">\r\n");
      out.write("                                    个人信息\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <a href=\"javascript:;\">\r\n");
      out.write("                                    修改密码\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                            <dd>\r\n");
      out.write("                                <a href=\"/bms/user/logout\">\r\n");
      out.write("                                    退出登录\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </dd>\r\n");
      out.write("                        </dl>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 侧边栏 -->\r\n");
      out.write("        <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("            <div class=\"layui-side-scroll\">\r\n");
      out.write("                <ul id=\"navul\" class=\"layui-nav layui-nav-tree\" lay-filter=\"left-nav\" style=\"border-radius: 0;\">\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 主体 -->\r\n");
      out.write("        <div class=\"layui-body\">\r\n");
      out.write("            <!-- 顶部切换卡 -->\r\n");
      out.write("            <div class=\"layui-tab layui-tab-brief\" lay-filter=\"top-tab\" lay-allowClose=\"true\" style=\"margin: 0;\">\r\n");
      out.write("                <ul class=\"layui-tab-title\"></ul>\r\n");
      out.write("                <div class=\"layui-tab-content\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 底部 -->\r\n");
      out.write("        <div class=\"layui-footer\" style=\"text-align: center; line-height: 44px;\">\r\n");
      out.write("            Copyright © 2017 <a href=\"http://www.kiscms.com\" target=\"_blank\">fanny</a> Powered by Fanny\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../static/layui/layui.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var userId ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("    var username ='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("    \tvar menuData;\r\n");
      out.write("    \tconsole.log(\"username:\"+username);\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("    \t$(\"#username\").text(username);\r\n");
      out.write("    \t$.ajax({\r\n");
      out.write("    \t    url:'/bms/menu/findByUserId',\r\n");
      out.write("    \t\t//url:'/bms/menu/view',\r\n");
      out.write("    \t\tasync : false,\r\n");
      out.write("    \t\tdata:{userId:userId},\r\n");
      out.write("    \t\ttype : 'post',\r\n");
      out.write("    \t\tdataType : 'json',\r\n");
      out.write("    \t\tsuccess : function(data) {\r\n");
      out.write("    \t\t\tmenuData=data.data;\r\n");
      out.write("    \t\t\t//console.log(menuData[0].children);\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t});\r\n");
      out.write("    \t});\r\n");
      out.write("    /**\r\n");
      out.write("     * 对layui进行全局配置\r\n");
      out.write("     */\r\n");
      out.write("    layui.config({\r\n");
      out.write("        base: 'js/'\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    /**\r\n");
      out.write("     * 初始化整个cms骨架\r\n");
      out.write("     */\r\n");
      out.write("    layui.use(['bms'], function() {\r\n");
      out.write("        var bms = layui.bms('left-nav', 'top-tab');\r\n");
      out.write("        bms.addNav(menuData[0].children);\r\n");
      out.write("        bms.bind(60 + 41 + 20 + 44); //头部高度 + 顶部切换卡标题高度 + 顶部切换卡内容padding + 底部高度\r\n");
      out.write("\r\n");
      out.write("        bms.clickLI(0);\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
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
