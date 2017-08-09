<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                        <div class="log_in_out"><a href="javascript:void(0);" data-toggle="modal" data-target=".login_popup"><i class="icon-sign-in"></i>登录</a></div>
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
                        </div>
                        <div class="cart_btn">
                        	<a href="shop_cart.html" class="view_cart_btn"><i class="icon-shopping-cart"></i> 购物车</a>
                            <!-- Cart submenu -->
                            <div class="cart_submenu">
                            	<div class="cart_wrap">
                                	<a href="javascript:void(0);" class="remove_products"><i class="icon-times-circle"></i></a>
                                	<ul class="product_posts">                                    
                                        <li>
                                            <img src="${pageContext.request.contextPath}/static/common/img/shop/1.jpg" alt="" />
                                            <a href="shop_product.html" class="title">Nemo Enim Ipsam</a>
                                            <div class="price">1<span>x</span>$500.00</div>
                                        </li>
                                    </ul>
                                    <div class="subtotal">Subtotal: <span>$500.00</span></div>
                                    <a href="shop_cart.html" class=" shortcode_button btn_small btn_type5 mr15">View cart</a>
                                    <a href="javascript:void(0);" class=" shortcode_button btn_small btn_type1 mr0">Checkout</a>
                                </div>
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
                    <div class="email"><a href="mailto:#"><i class="icon-envelope"></i> admin@sevenbank.com</a></div>
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
                            <li class="current-menu-parent menu-item-has-children"><a class="cnfont" href="#">首页</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li class="current-menu-item"><a href="index.html">Home 1</a></li>
                                        <li><a href="home_type2.html">Home Type2</a></li>
                                        <li><a href="home_type3.html">Home Type3</a></li> 
                                        <li><a href="home_type4.html">Home Type4</a></li>                     
                                    </ul> 
                                </div>	
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">信用卡</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="creditcard/applyCard">申请信用卡</a></li>
                                        <li><a href="home_type2.html">Home Type2</a></li>
                                        <li><a href="home_type3.html">Home Type3</a></li> 
                                        <li><a href="home_type4.html">Home Type4</a></li>                     
                                    </ul> 
                                </div>	
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">投资理财</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li class="menu-item-has-children"><a href="#">About</a>
                                            <div class="sub-nav">
                                                <ul class="sub-menu">
                                                    <li><a href="about.html">About 1</a></li>
                                                    <li><a href="about2.html">About 2</a></li>
                                                </ul>
                                            </div>
                                        </li>
                                        <li><a href="service.html">Service</a></li>
                                        <li><a href="team.html">Team</a></li>
                                        <li><a href="careers.html">Careers</a></li>
                                        <li><a href="gallery.html">Gallery</a></li>
                                        <li><a href="showreel.html">Showreel</a></li>
                                        <li><a href="404.html">404 Error</a></li>
                                        <li><a href="faq.html">FAQ</a></li>
                                        <li><a href="sitemap.html">Sitemap</a></li>
                                        <li><a href="coming_soon.html">Coming Soon</a></li>                                                                      
                                    </ul> 
                                </div>
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">存贷及银行卡</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="typography.html">Typography</a></li>  
                                        <li><a href="shortcodes.html">Shortcodes</a></li>
                                    </ul> 
                                </div>
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">电子银行</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="portfolio_1col.html">1 Column</a></li>
                                        <li><a href="portfolio_2col.html">2 Columns</a></li>
                                        <li><a href="portfolio_3col.html">3 Columns</a></li>
                                        <li><a href="portfolio_3col_masonry.html">3 Columns Masonry</a></li>
                                        <li><a href="portfolio_wide.html">Wide</a></li>
                                        <li class="menu-item-has-children"><a href="#">Single Post</a>
                                            <div class="sub-nav">
                                                <ul class="sub-menu">
                                                    <li><a href="portfolio_post_fullwidth.html">Fullwidth Image</a></li>
                                                    <li><a href="portfolio_post_right_sidebar.html">With Right Sidebar</a></li>
                                                    <li><a href="portfolio_post_left_sidebar.html">With Left Sidebar</a></li>
                                                </ul>
                                            </div>
                                        </li>                              
                                    </ul> 
                                </div>
                            </li>
                            <li class="menu-item-has-children"><a class="cnfont" href="#">享悦生活</a>
                                <div class="sub-nav">
                                    <ul class="sub-menu">
                                        <li><a href="blog_fullwidth.html">Fullwidth Blog</a></li>
                                        <li><a href="blog_right_sidebar.html">With Right Sidebar</a></li>
                                        <li><a href="blog_left_sidebar.html">With Left Sidebar</a></li>
                                        <li class="menu-item-has-children"><a href="#">Single Post</a>
                                            <div class="sub-nav">
                                                <ul class="sub-menu">
                                                    <li><a href="post_fullwidth.html">Fullwidth Image</a></li>
                                                    <li><a href="post_right_sidebar.html">With Right Sidebar</a></li>
                                                    <li><a href="post_left_sidebar.html">With Left Sidebar</a></li>
                                                </ul>
                                            </div>
                                        </li>                             
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