package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"main_header type1\">\r\n");
      out.write("        <div class=\"tagline\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"fright\">\r\n");
      out.write("                \t<div class=\"tagline_items\">\r\n");
      out.write("                    \t<div class=\"language_select\">\r\n");
      out.write("                            <div class=\"selectBox\">\r\n");
      out.write("                                <span class=\"selected\"></span>\r\n");
      out.write("                                <span class=\"selectArrow\"></span>\r\n");
      out.write("                                <div class=\"selectOptions\" >\r\n");
      out.write("                                    <span class=\"selectOption\" data-value=\"english\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/uk_flag.png\" alt=\"\" />English</span>\r\n");
      out.write("                                    <span class=\"selectOption\" data-value=\"germany\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/imgs/germany_flag.png\" alt=\"\" />Germany</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"log_in_out\"><a href=\"javascript:void(0);\" data-toggle=\"modal\" data-target=\".login_popup\"><i class=\"icon-sign-in\"></i>登录</a></div>\r\n");
      out.write("                        <div class=\"modal fade login_popup\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\r\n");
      out.write("                            <div class=\"modal-dialog\">\r\n");
      out.write("                                <div class=\"modal-content\">\r\n");
      out.write("                                    <h3>请登录</h3>\r\n");
      out.write("                                    <form action=\"javascript:void(0);\" method=\"post\">\r\n");
      out.write("                                        <input type=\"text\" placeholder=\"Username*\" value=\"\" name=\"name\">\r\n");
      out.write("                                        <input type=\"password\" placeholder=\"Password*\" value=\"\" name=\"password\">\r\n");
      out.write("                                        <input type=\"submit\" value=\"登录\"> \r\n");
      out.write("                                        <div class=\"remember_me\"><label><input name=\"remember\" type=\"checkbox\" value=\"remember\">Remember Me</label></div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                    <div class=\"forgot_password\"><a href=\"javascript:void(0);\">Forgot Your Password?</a></div>\r\n");
      out.write("                                    <button type=\"button\" class=\"close_popup\" data-dismiss=\"modal\"><i class=\"icon-times\"></i></button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"cart_btn\">\r\n");
      out.write("                        \t<a href=\"shop_cart.html\" class=\"view_cart_btn\"><i class=\"icon-shopping-cart\"></i> 购物车</a>\r\n");
      out.write("                            <!-- Cart submenu -->\r\n");
      out.write("                            <div class=\"cart_submenu\">\r\n");
      out.write("                            \t<div class=\"cart_wrap\">\r\n");
      out.write("                                \t<a href=\"javascript:void(0);\" class=\"remove_products\"><i class=\"icon-times-circle\"></i></a>\r\n");
      out.write("                                \t<ul class=\"product_posts\">                                    \r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/shop/1.jpg\" alt=\"\" />\r\n");
      out.write("                                            <a href=\"shop_product.html\" class=\"title\">Nemo Enim Ipsam</a>\r\n");
      out.write("                                            <div class=\"price\">1<span>x</span>$500.00</div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <div class=\"subtotal\">Subtotal: <span>$500.00</span></div>\r\n");
      out.write("                                    <a href=\"shop_cart.html\" class=\" shortcode_button btn_small btn_type5 mr15\">View cart</a>\r\n");
      out.write("                                    <a href=\"javascript:void(0);\" class=\" shortcode_button btn_small btn_type1 mr0\">Checkout</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- //Cart submenu -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"top_search\" id=\"top_search\">\r\n");
      out.write("                        <form action=\"#\" method=\"get\" name=\"search_form\">\r\n");
      out.write("                            <input type=\"text\" class=\"ct-search-input\" value=\"\" name=\"s\" placeholder=\"Search...\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Search\" class=\"s_submit\">\r\n");
      out.write("                            <span class=\"top-icon-search\">\r\n");
      out.write("                            \t<i class=\"icon-search\"></i>\r\n");
      out.write("                            </span>                                \r\n");
      out.write("                        </form>                            \r\n");
      out.write("                    </div>                   \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"fleft\">\r\n");
      out.write("                    <div class=\"phone\"><i class=\"icon-phone\"></i> +86 400 888 88 88</div>\r\n");
      out.write("                    <div class=\"email\"><a href=\"mailto:#\"><i class=\"icon-envelope\"></i> admin@sevenbank.com</a></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"header_parent_wrap\">\r\n");
      out.write("            <header>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                \t<a class=\"top_menu_toggler\" href=\"javascript:void(0)\"></a>\r\n");
      out.write("                \t<!-- 左侧首页 -->\r\n");
      out.write("                \t<div class=\"logo_sect\">\r\n");
      out.write("                        <a href=\"index.html\" class=\"logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/logo.png\" class=\"logo_def\" alt=\"\" /><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/retina/logo.png\" class=\"logo_retina\" alt=\"\" /></a>                \r\n");
      out.write("                    </div> \r\n");
      out.write("                    <nav>\r\n");
      out.write("                    <!-- 顶端菜单 -->\r\n");
      out.write("                        <ul class=\"menu\">\r\n");
      out.write("                            <li class=\"current-menu-parent menu-item-has-children\"><a class=\"cnfont\" href=\"#\">首页</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li class=\"current-menu-item\"><a href=\"index.html\">Home 1</a></li>\r\n");
      out.write("                                        <li><a href=\"home_type2.html\">Home Type2</a></li>\r\n");
      out.write("                                        <li><a href=\"home_type3.html\">Home Type3</a></li> \r\n");
      out.write("                                        <li><a href=\"home_type4.html\">Home Type4</a></li>                     \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">信用卡</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li class=\"current-menu-item\"><a href=\"index.html\">信用卡</a></li>\r\n");
      out.write("                                        <li><a href=\"home_type2.html\">Home Type2</a></li>\r\n");
      out.write("                                        <li><a href=\"home_type3.html\">Home Type3</a></li> \r\n");
      out.write("                                        <li><a href=\"home_type4.html\">Home Type4</a></li>                     \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">投资理财</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li class=\"menu-item-has-children\"><a href=\"#\">About</a>\r\n");
      out.write("                                            <div class=\"sub-nav\">\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"about.html\">About 1</a></li>\r\n");
      out.write("                                                    <li><a href=\"about2.html\">About 2</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li><a href=\"service.html\">Service</a></li>\r\n");
      out.write("                                        <li><a href=\"team.html\">Team</a></li>\r\n");
      out.write("                                        <li><a href=\"careers.html\">Careers</a></li>\r\n");
      out.write("                                        <li><a href=\"gallery.html\">Gallery</a></li>\r\n");
      out.write("                                        <li><a href=\"showreel.html\">Showreel</a></li>\r\n");
      out.write("                                        <li><a href=\"404.html\">404 Error</a></li>\r\n");
      out.write("                                        <li><a href=\"faq.html\">FAQ</a></li>\r\n");
      out.write("                                        <li><a href=\"sitemap.html\">Sitemap</a></li>\r\n");
      out.write("                                        <li><a href=\"coming_soon.html\">Coming Soon</a></li>                                                                      \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">存贷及银行卡</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"typography.html\">Typography</a></li>  \r\n");
      out.write("                                        <li><a href=\"shortcodes.html\">Shortcodes</a></li>\r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">电子银行</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"portfolio_1col.html\">1 Column</a></li>\r\n");
      out.write("                                        <li><a href=\"portfolio_2col.html\">2 Columns</a></li>\r\n");
      out.write("                                        <li><a href=\"portfolio_3col.html\">3 Columns</a></li>\r\n");
      out.write("                                        <li><a href=\"portfolio_3col_masonry.html\">3 Columns Masonry</a></li>\r\n");
      out.write("                                        <li><a href=\"portfolio_wide.html\">Wide</a></li>\r\n");
      out.write("                                        <li class=\"menu-item-has-children\"><a href=\"#\">Single Post</a>\r\n");
      out.write("                                            <div class=\"sub-nav\">\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_fullwidth.html\">Fullwidth Image</a></li>\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_right_sidebar.html\">With Right Sidebar</a></li>\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_left_sidebar.html\">With Left Sidebar</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>                              \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">享悦生活</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"blog_fullwidth.html\">Fullwidth Blog</a></li>\r\n");
      out.write("                                        <li><a href=\"blog_right_sidebar.html\">With Right Sidebar</a></li>\r\n");
      out.write("                                        <li><a href=\"blog_left_sidebar.html\">With Left Sidebar</a></li>\r\n");
      out.write("                                        <li class=\"menu-item-has-children\"><a href=\"#\">Single Post</a>\r\n");
      out.write("                                            <div class=\"sub-nav\">\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"post_fullwidth.html\">Fullwidth Image</a></li>\r\n");
      out.write("                                                    <li><a href=\"post_right_sidebar.html\">With Right Sidebar</a></li>\r\n");
      out.write("                                                    <li><a href=\"post_left_sidebar.html\">With Left Sidebar</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li>                             \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>                        \r\n");
      out.write("                            </li>\r\n");
      out.write("                           <!--  <li class=\"menu-item-has-children\"><a href=\"#\">Shop</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"shop.html\">All Products</a></li>\r\n");
      out.write("                                        <li><a href=\"shop_product.html\">Single Product</a></li>\r\n");
      out.write("                                        <li><a href=\"shop_cart.html\">Cart</a></li>                                                                    \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a href=\"#\">Contact</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"contact_fullwidth.html\">Fullwidth</a></li>\r\n");
      out.write("                                        <li><a href=\"contact_sidebar.html\">With Sidebar</a></li>                                                 \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li> -->\r\n");
      out.write("                        </ul>                                  \r\n");
      out.write("                    </nav>                   \r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
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
