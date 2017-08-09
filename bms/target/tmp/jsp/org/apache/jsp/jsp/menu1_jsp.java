package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/layui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/layer.css\">\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static/layui/layui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static/menu/menu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../static/layui/lay/modules/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("layui.use('element', function(){\r\n");
      out.write("\t  var element = layui.element(); //导航的hover效果、二级菜单等功能，需要依赖element模块\r\n");
      out.write("\t       console.log(element);\r\n");
      out.write("\t  //监听导航点击\r\n");
      out.write("\t   element.on('nav(demo)', function(elem){\r\n");
      out.write("\t\t   var a        = elem.children('a');\r\n");
      out.write("           var title    = a.text();\r\n");
      out.write("           var src      = elem.children('a').attr('data-url');\r\n");
      out.write("           var id       = elem.children('a').attr('data-id');\r\n");
      out.write("\t  //触发事件\r\n");
      out.write("\t  element.tabAdd('top-tab', {\r\n");
      out.write("\t\t  title: '选项卡的标题'\r\n");
      out.write("\t\t  ,content: '../html/index.jsp' //支持传入html\r\n");
      out.write("\t\t  ,id: '2'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t  element.tabChange('top-tab', '2');\r\n");
      out.write("\t  }); \r\n");
      out.write("\t  \r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 布局容器 -->\r\n");
      out.write("    <div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("        <!-- 头部 -->\r\n");
      out.write("        <div class=\"layui-header\">\r\n");
      out.write("            <div class=\"layui-main\">\r\n");
      out.write("                <!-- logo -->\r\n");
      out.write("                <a href=\"http://www.kiscms.com/\" style=\"color: #c2c2c2; font-size: 18px; line-height: 60px;\">bms后台模板</a>\r\n");
      out.write("                <!-- 水平导航 -->\r\n");
      out.write("                <ul class=\"layui-nav\" style=\"position: absolute; top: 0; right: 0; background: none;\">\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a href=\"javascript:;\">\r\n");
      out.write("                            进入前台\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"layui-nav-item\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            梦想星辰大海\r\n");
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
      out.write("                                <a href=\"javascript:;\">\r\n");
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
      out.write("                <!--开始  -->\r\n");
      out.write("                <ul id=\"navul\" class=\"layui-nav layui-nav-tree\" lay-filter=\"demo\" style=\"border-radius: 0;\">\r\n");
      out.write("                <span class=\"layui-nav-bar\" style=\"height: 0px; top: 0px; opacity: 0;\"></span><li class=\"layui-nav-item\"><a href=\"javascript:;\" data-url=\"../html/index.jsp\" data-id=\"1\">主页</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 主体 -->\r\n");
      out.write("           <div class=\"layui-body\">\r\n");
      out.write("            <!-- 顶部切换卡 -->\r\n");
      out.write("            <div class=\"layui-tab layui-tab-brief\" lay-filter=\"top-tab\" lay-allowclose=\"true\" style=\"margin: 0;\">\r\n");
      out.write("                <ul class=\"layui-tab-title\"><li class=\"layui-this\">主页<i class=\"layui-icon layui-unselect layui-tab-close\" style=\"display: none;\">ဆ</i></li></ul>\r\n");
      out.write("                <div class=\"layui-tab-content\" style=\"height: 473px;\"><div class=\"layui-tab-item layui-show\"><iframe onload=\"layui.layer.close(1)\" src=\"menu.jsp\" data-id=\"1\" data-tabindex=\"0\" style=\"width: 100%; height: 473px; border: 0px;\"></iframe></div></div>\r\n");
      out.write("                <ul class=\"layui-tab-title\"><li>主页<i class=\"layui-icon layui-unselect layui-tab-close\" style=\"display: none;\">ဆ</i></li></ul>\r\n");
      out.write("                <div class=\"layui-tab-content\" style=\"height: 473px;\"><div class=\"layui-tab-item layui-show\"><iframe onload=\"layui.layer.close(1)\" src=\"menu.jsp\" data-id=\"1\" data-tabindex=\"0\" style=\"width: 100%; height: 473px; border: 0px;\"></iframe></div></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 主体 -->\r\n");
      out.write("        <!-- <div class=\"layui-body\">\r\n");
      out.write("            顶部切换卡\r\n");
      out.write("            <div class=\"layui-tab layui-tab-brief\" lay-filter=\"top-tab\" lay-allowClose=\"true\" style=\"margin: 0;\">\r\n");
      out.write("                <ul class=\"layui-tab-title\"></ul>\r\n");
      out.write("                <div class=\"layui-tab-content\"></div>\r\n");
      out.write("            </div> -->\r\n");
      out.write("\r\n");
      out.write("        <!-- 底部 -->\r\n");
      out.write("        <div class=\"layui-footer\" style=\"text-align: center; line-height: 44px;\">\r\n");
      out.write("            Copyright © 2017 <a href=\"http://www.kiscms.com/\" target=\"_blank\">fanny</a> Powered by Fanny\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
