package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                \t<div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_text\">\r\n");
      out.write("                        \t<h4 class=\"title\">Contact Us</h4>\r\n");
      out.write("                        \t<p>Maecenas etos sit amet, consectetur adipiscing elit. Terminal volutpat rutrum metro amet sollicitudin interdum.</p>\r\n");
      out.write("                            <p><span>Phone:</span> +1 (800) 456 37 96</p>\r\n");
      out.write("                            <p><span>Office:</span> 5826 Baker Street, New York</p>\r\n");
      out.write("                            <p><span>Email:</span> <a href=\"mailto:#\">info@groutek.com</a></p>\r\n");
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
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_posts\">\r\n");
      out.write("                        \t<h4 class=\"title\">Recent Posts</h4>\r\n");
      out.write("                            <ul class=\"recent_posts\">                                    \r\n");
      out.write("                                <li class=\"with_img\">\r\n");
      out.write("                                    <div class=\"recent_posts_content\">\r\n");
      out.write("                                    \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/widget_post1.jpg\" alt=\"\" />\r\n");
      out.write("                                        <a href=\"javascript:void(0);\" class=\"title\">Business Cards Design Trends</a>\r\n");
      out.write("                                        <div class=\"recent_posts_info\">Dec 02, 2020  /  <a href=\"javascript:void(0);\">2 comments</a></div>\r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </li>                                \r\n");
      out.write("                                <li class=\"with_img\">\r\n");
      out.write("                                    <div class=\"recent_posts_content\">\r\n");
      out.write("                                    \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/widget_post2.jpg\" alt=\"\" />\r\n");
      out.write("                                        <a href=\"javascript:void(0);\" class=\"title\">This Maravelous App</a>\r\n");
      out.write("                                        <div class=\"recent_posts_info\">Nov 18, 2020  /  <a href=\"javascript:void(0);\">9 comments</a></div>\r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"with_img\">\r\n");
      out.write("                                    <div class=\"recent_posts_content\">\r\n");
      out.write("                                    \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/widget_post3.jpg\" alt=\"\" />\r\n");
      out.write("                                        <a href=\"javascript:void(0);\" class=\"title\">Brand Paper Niceties</a>\r\n");
      out.write("                                        <div class=\"recent_posts_info\">Nov 10, 2020  /  <a href=\"javascript:void(0);\">0 comments</a></div>\r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </li>                            \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_twitter\">\r\n");
      out.write("                        \t<h4 class=\"title\">Latest Twitts</h4>\r\n");
      out.write("                            <div class=\"tweet_module\"></div>                          \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                    \t<div class=\"sidepanel widget_review\">\r\n");
      out.write("                        \t<h4 class=\"title\">Last Review</h4>\r\n");
      out.write("                            <div class=\"last_review\">\r\n");
      out.write("                            \t<p class=\"review_text\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>\r\n");
      out.write("                                <div class=\"clear\"></div>\r\n");
      out.write("                                <div class=\"last_review_author\">\r\n");
      out.write("                                \t<h5>Richard Clark</h5>\r\n");
      out.write("                                    <h6>Creative Designer</h6>\r\n");
      out.write("                                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/review_author.jpg\" alt=\"\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"footer_bottom\">\r\n");
      out.write("            \t<div class=\"copyright\">Copyright 2020. All Rights Reserved by Groutek, Premium HTML Template.</div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>   \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"fixed-menu\"></div>\r\n");
      out.write("    \r\n");
      out.write("  <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/jquery.min.js\"></script>\t\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/modules.js\"></script>\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/theme.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/js/color_panel.js\"></script>\r\n");
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
