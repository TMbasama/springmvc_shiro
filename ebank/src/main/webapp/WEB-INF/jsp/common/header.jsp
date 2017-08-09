<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>	    
<div class="main_header type1">
        <div class="tagline">
            <div class="container">
                <div class="fright">
                	<div class="tagline_items">
                    	<div class="language_select">
                            <div class="selectBox">
                                <span class="selected"></span>
                                <span class="selectArrow"></span>
                                <div class="selectOptions" >
                                    <span class="selectOption" data-value="english"><img src="${pageContext.request.contextPath}/static/common/img/imgs/uk_flag.png" alt="" />English</span>
                                    <span class="selectOption" data-value="germany"><img src="${pageContext.request.contextPath}/static/common/img/imgs/germany_flag.png" alt="" />Germany</span>
                                </div>
                            </div>
                        </div>
                        <!-- <div class="log_in_out"><a href="javascript:void(0);" data-toggle="modal" data-target=".login_popup"><i class="icon-sign-in"></i>登录</a></div>
                        <div class="modal fade login_popup" tabindex="-1" role="dialog" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <h3>请登录</h3>
                                    <form action="javascript:void(0);" method="post">
                                        <input type="text" placeholder="Username*" value="" name="name">
                                        <input type="password" placeholder="Password*" value="" name="password">
                                        <input type="submit" value="登录"> 
                                        <div class="remember_me"><label><input name="remember" type="checkbox" value="remember">Remember Me</label></div>
                                    </form>
                                    <div class="forgot_password"><a href="javascript:void(0);">Forgot Your Password?</a></div>
                                    <button type="button" class="close_popup" data-dismiss="modal"><i class="icon-times"></i></button>
                                </div>
                            </div>
                        </div> -->
                        <div class="cart_btn">
                        	<a href="#" class="view_cart_btn"><i class="icon-user" style="margin-right:5px;"></i><shiro:principal/></a>
                            <!-- Cart submenu -->
                            <div class="cart_submenu">
                                	<%-- <a href="javascript:void(0);" class="remove_products"><i class="icon-times-circle"></i></a>
                                	<ul class="product_posts">                                    
                                        <li>
                                            <img src="${pageContext.request.contextPath}/static/common/img/shop/1.jpg" alt="" />
                                            <a href="shop_product.html" class="title">Nemo Enim Ipsam</a>
                                            <div class="price">1<span>x</span>$500.00</div>
                                        </li>
                                    </ul> --%>
                                    <!-- <div class="subtotal">Subtotal: <span>$500.00</span></div> -->
                                    <div class="text-center"  style="margin-top:5px;margin-bottom:5px;"><a href="${pageContext.request.contextPath}/user/profile"><i class="icon-home" style="margin-right:5px;"></i>个人中心</a></div>
                                   <div class="text-center" style="margin-bottom:5px;"> <a href="${pageContext.request.contextPath}/logout"><i class="icon-sign-out" style="margin-top:10px;margin-right:5px;"></i>退出登录</a></div>
                            </div>
                            <!-- //Cart submenu -->
                        </div>
                    </div>
                    <div class="top_search" id="top_search">
                        <form action="#" method="get" name="search_form">
                            <input type="text" class="ct-search-input" value="" name="s" placeholder="Search...">
                            <input type="submit" value="Search" class="s_submit">
                            <span class="top-icon-search">
                            	<i class="icon-search"></i>
                            </span>                                
                        </form>                            
                    </div>                   
                </div>
                <div class="fleft">
                    <div class="phone"><i class="icon-phone"></i> +86 400 888 88 88</div>
                    <div class="email"><a href="mailto:admin@ebank.com"><i class="icon-envelope"></i> admin@ebank.com</a></div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
        <div class="header_parent_wrap">
            <header>
                <div class="container">
                	<a class="top_menu_toggler" href="javascript:void(0)"></a>
                	<!-- 左侧首页 -->
                	<div class="logo_sect">
                        <a href="index.html" class="logo"><img src="${pageContext.request.contextPath}/static/common/img/logo.png" class="logo_def" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/logo.png" class="logo_retina" alt="" /></a>                
                    </div> 
                    <nav>
                    <!-- 顶端菜单 -->
                        <ul class="menu">
                            <li class="current-menu-parent menu-item-has-children"><a class="cnfont" href="${pageContext.request.contextPath}">首页</a>
                               <!--  <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li class="current-menu-item"><a href="index.html">Home 1</a></li>
                                    </ul> 
                                </div> -->	
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">转账汇款</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="${pageContext.request.contextPath}/transfer/apply">申请转账</a></li>
                                        <li><a href="${pageContext.request.contextPath}/transfer/applyProcess">转账进度查询</a></li>
                                    </ul> 
                                </div>	
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">信用卡</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="${pageContext.request.contextPath}/creditcard/applyCard">申请信用卡</a></li>
                                        <li><a href="${pageContext.request.contextPath}/creditcard/applyProcess">办卡进度查询</a></li>
                                       <!--  <li><a href="home_type3.html">账单查询</a></li>  -->
                                        <li><a href="${pageContext.request.contextPath}/creditcard/reportLoss">在线挂失</a></li>                     
                                    </ul> 
                                </div>	
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">投资理财</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <!-- <li class="menu-item-has-children"><a href="#">About</a>
                                            <div class="sub-nav">
                                                <ul class="sub-menu">
                                                    <li><a href="about.html">About 1</a></li>
                                                    <li><a href="about2.html">About 2</a></li>
                                                </ul>
                                            </div>
                                        </li> -->
                                        <li><a href="${pageContext.request.contextPath}/fund/product">基金交易</a></li>
                                        <li><a href="${pageContext.request.contextPath}/fund/myfund">我的基金</a></li>
                                        <li><a href="${pageContext.request.contextPath}/finance/product">理财产品</a></li>
                                        <li><a href="${pageContext.request.contextPath}/myfinance">持有产品查询</a></li>
                                        <!-- <li><a href="showreel.html">个人外汇买卖</a></li>
                                        <li><a href="404.html">外汇行情</a></li> -->
                                    </ul> 
                                </div>
                            </li>
                            <!-- <li class="menu-item-has-children"><a class="cnfont" href="#">存贷及银行卡</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="typography.html">预约开户</a></li>  
                                        <li><a href="typography.html">办卡进度查询</a></li>  
                                        <li><a href="shortcodes.html">申请贷款</a></li>
                                        <li><a href="shortcodes.html">贷款进度查询</a></li>
                                        <li><a href="shortcodes.html">贷款归还</a></li>
                                    </ul> 
                                </div>
                            </li> -->
                            <li class="menu-item-has-children"><a class="cnfont" href="#">电子银行</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                      <%--   <li><a href="${pageContext.request.contextPath}/user/register">注册</a></li>
                                        <li><a href="${pageContext.request.contextPath}/user/profile">个人中心</a></li> --%>
                                        <li><a href="${pageContext.request.contextPath}/internetbank/onlinebank">开通网上银行</a></li>
                                        <li><a href="${pageContext.request.contextPath}/internetbank/mobilebank">开通手机银行</a></li>
                                        <li><a href="${pageContext.request.contextPath}/internetbank/accountPay">开通账户支付</a></li>
                                       <!--  <li class="menu-item-has-children"><a href="#">Single Post</a>
                                            <div class="sub-nav">
                                                <ul class="sub-menu">
                                                    <li><a href="portfolio_post_fullwidth.html">Fullwidth Image</a></li>
                                                    <li><a href="portfolio_post_right_sidebar.html">With Right Sidebar</a></li>
                                                    <li><a href="portfolio_post_left_sidebar.html">With Left Sidebar</a></li>
                                                </ul>
                                            </div>
                                        </li> -->                              
                                    </ul> 
                                </div>
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">享悦生活</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="${pageContext.request.contextPath}/enjoyLife/waterRecharge">水费</a></li>
                                        <li><a href="${pageContext.request.contextPath}/enjoyLife/electricityRecharge">电费</a></li>
                                        <li><a href="${pageContext.request.contextPath}/enjoyLife/gasRecharge">燃气费</a></li>
                                        <li><a href="${pageContext.request.contextPath}/enjoyLife/phoneRecharge">手机话费</a></li>
                                    </ul> 
                                </div>                        
                            </li>
                           <!--  <li class="menu-item-has-children"><a href="#">Shop</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="shop.html">All Products</a></li>
                                        <li><a href="shop_product.html">Single Product</a></li>
                                        <li><a href="shop_cart.html">Cart</a></li>                                                                    
                                    </ul> 
                                </div>
                            </li>
                            <li class="menu-item-has-children"><a href="#">Contact</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="contact_fullwidth.html">Fullwidth</a></li>
                                        <li><a href="contact_sidebar.html">With Sidebar</a></li>                                                 
                                    </ul> 
                                </div>
                            </li> -->
                        </ul>                                  
                    </nav>                   
                    <div class="clear"></div>
                </div>
            </header>
        </div>
    </div>