package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"footer\">\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("        \t<div class=\"pre_footer\">\r\n");
      out.write("            \t<div class=\"row\">\r\n");
      out.write("            \t    <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_review\">\r\n");
      out.write("                        \t<h4 class=\"title\">关于我们</h4>\r\n");
      out.write("                            <div class=\"last_review\">\r\n");
      out.write("                            \t<p class=\"review_text\">我们追求卓越，然时间、经验、能力有限。EBank有很多不足的地方，希望大家包容、不吝赐教，给我们提意见、建议。感谢你们！</p>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_text\">\r\n");
      out.write("                        \t<h4 class=\"title\">软件协议</h4>\r\n");
      out.write("                            <p>Ebank使用 MIT 许可证发布，用户可以自由使用、复制、修改、合并、出版发行、散布、再授权及贩售 EBank 及其副本。</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                     <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_text\">\r\n");
      out.write("                        \t<h4 class=\"title\">技术支持</h4>\r\n");
      out.write("                            <p><span>安全组件：</span>Shiro</p>\r\n");
      out.write("                            <p><span>前台框架：</span>Bootstrap、jQuery、 Seajs、FontAwesome、etc.</p>\r\n");
      out.write("                            <p><span>后台框架：</span>SpringMVC+Mybatis</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \t<div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_text\">\r\n");
      out.write("                        \t<h4 class=\"title\">联系详情</h4>\r\n");
      out.write("                            <p><span>电话:</span> 15070080861</p>\r\n");
      out.write("                            <p><span>地址:</span> 上海市浦东新区</p>\r\n");
      out.write("                            <p><span>电子邮箱:</span> <a href=\"mailto:#\">tmbasama@163.com</a></p>\r\n");
      out.write("                            <div class=\"footer_socials\">\r\n");
      out.write("                            \t<ul>\r\n");
      out.write("                                \t<li><a href=\"javascript:void(0);\" class=\"soc_fb\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0);\" class=\"soc_tweet\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0);\" class=\"soc_google\"><i class=\"icon-google-plus\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0);\" class=\"soc_dribbble\"><i class=\"icon-dribbble\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"javascript:void(0);\" class=\"soc_pinterest\"><i class=\"icon-pinterest\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\t\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer_bottom\">\r\n");
      out.write("            \t<div class=\"copyright\">Copyright 2017. All Rights Reserved by tonytan</div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"fixed-menu\"></div>\r\n");
      out.write("    \r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/modules.js\"></script>\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/theme.js\"></script>\r\n");
      out.write("\t<!-- layer -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/layer/layer.js\"></script>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
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
