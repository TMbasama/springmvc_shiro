package org.apache.jsp.WEB_002dINF.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_shiro_principal_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_shiro_principal_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_shiro_principal_nobody.release();
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
      out.write("\t    \r\n");
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
      out.write("                        <!-- <div class=\"log_in_out\"><a href=\"javascript:void(0);\" data-toggle=\"modal\" data-target=\".login_popup\"><i class=\"icon-sign-in\"></i>登录</a></div>\r\n");
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
      out.write("                        </div> -->\r\n");
      out.write("                        <div class=\"cart_btn\">\r\n");
      out.write("                        \t<a href=\"#\" class=\"view_cart_btn\"><i class=\"icon-user\" style=\"margin-right:5px;\"></i>");
      if (_jspx_meth_shiro_principal_0(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("                            <!-- Cart submenu -->\r\n");
      out.write("                            <div class=\"cart_submenu\">\r\n");
      out.write("                                \t");
      out.write("\r\n");
      out.write("                                    <!-- <div class=\"subtotal\">Subtotal: <span>$500.00</span></div> -->\r\n");
      out.write("                                    <div class=\"text-center\"  style=\"margin-top:5px;margin-bottom:5px;\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/user/profile\"><i class=\"icon-home\" style=\"margin-right:5px;\"></i>个人中心</a></div>\r\n");
      out.write("                                   <div class=\"text-center\" style=\"margin-bottom:5px;\"> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\"><i class=\"icon-sign-out\" style=\"margin-top:10px;margin-right:5px;\"></i>退出登录</a></div>\r\n");
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
      out.write("                    <div class=\"email\"><a href=\"mailto:admin@ebank.com\"><i class=\"icon-envelope\"></i> admin@ebank.com</a></div>\r\n");
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
      out.write("                            <li class=\"current-menu-parent menu-item-has-children\"><a class=\"cnfont\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">首页</a>\r\n");
      out.write("                               <!--  <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li class=\"current-menu-item\"><a href=\"index.html\">Home 1</a></li>\r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div> -->\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">转账汇款</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/transfer/apply\">申请转账</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/transfer/applyProcess\">转账进度查询</a></li>\r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">信用卡</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/creditcard/applyCard\">申请信用卡</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/creditcard/applyProcess\">办卡进度查询</a></li>\r\n");
      out.write("                                       <!--  <li><a href=\"home_type3.html\">账单查询</a></li>  -->\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/creditcard/reportLoss\">在线挂失</a></li>                     \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\t\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">投资理财</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <!-- <li class=\"menu-item-has-children\"><a href=\"#\">About</a>\r\n");
      out.write("                                            <div class=\"sub-nav\">\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"about.html\">About 1</a></li>\r\n");
      out.write("                                                    <li><a href=\"about2.html\">About 2</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li> -->\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fund/product\">基金交易</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/fund/myfund\">我的基金</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/finance/product\">理财产品</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/myfinance\">持有产品查询</a></li>\r\n");
      out.write("                                        <!-- <li><a href=\"showreel.html\">个人外汇买卖</a></li>\r\n");
      out.write("                                        <li><a href=\"404.html\">外汇行情</a></li> -->\r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <!-- <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">存贷及银行卡</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"typography.html\">预约开户</a></li>  \r\n");
      out.write("                                        <li><a href=\"typography.html\">办卡进度查询</a></li>  \r\n");
      out.write("                                        <li><a href=\"shortcodes.html\">申请贷款</a></li>\r\n");
      out.write("                                        <li><a href=\"shortcodes.html\">贷款进度查询</a></li>\r\n");
      out.write("                                        <li><a href=\"shortcodes.html\">贷款归还</a></li>\r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li> -->\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">电子银行</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                      ");
      out.write("\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/internetbank/onlinebank\">开通网上银行</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/internetbank/mobilebank\">开通手机银行</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/internetbank/accountPay\">开通账户支付</a></li>\r\n");
      out.write("                                       <!--  <li class=\"menu-item-has-children\"><a href=\"#\">Single Post</a>\r\n");
      out.write("                                            <div class=\"sub-nav\">\r\n");
      out.write("                                                <ul class=\"sub-menu\">\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_fullwidth.html\">Fullwidth Image</a></li>\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_right_sidebar.html\">With Right Sidebar</a></li>\r\n");
      out.write("                                                    <li><a href=\"portfolio_post_left_sidebar.html\">With Left Sidebar</a></li>\r\n");
      out.write("                                                </ul>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </li> -->                              \r\n");
      out.write("                                    </ul> \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"menu-item-has-children\"><a class=\"cnfont\" href=\"#\">享悦生活</a>\r\n");
      out.write("                                <div class=\"sub-nav\">\r\n");
      out.write("                                    <ul class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/enjoyLife/waterRecharge\">水费</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/enjoyLife/electricityRecharge\">电费</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/enjoyLife/gasRecharge\">燃气费</a></li>\r\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/enjoyLife/phoneRecharge\">手机话费</a></li>\r\n");
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

  private boolean _jspx_meth_shiro_principal_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_principal_0 = (org.apache.shiro.web.tags.PrincipalTag) _jspx_tagPool_shiro_principal_nobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_principal_0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_principal_0.setParent(null);
    int _jspx_eval_shiro_principal_0 = _jspx_th_shiro_principal_0.doStartTag();
    if (_jspx_th_shiro_principal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_shiro_principal_nobody.reuse(_jspx_th_shiro_principal_0);
      return true;
    }
    _jspx_tagPool_shiro_principal_nobody.reuse(_jspx_th_shiro_principal_0);
    return false;
  }
}
