<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/static/common/img/ebank_icons_57x57.png" type="image/x-icon">
<link rel="apple-touch-icon" href="${pageContext.request.contextPath}/static/common/img/apple_icons_57x57.png">
<link rel="apple-touch-icon" sizes="72x72" href="${pageContext.request.contextPath}/static/common/img/apple_icons_72x72.png">
<link rel="apple-touch-icon" sizes="114x114" href="${pageContext.request.contextPath}/static/common/img/apple_icons_114x114.png">
<title>EBank</title>
<link href="${pageContext.request.contextPath}/static/common/fonts/font_1.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/bootstrap.min.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/theme.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/revslider.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/css/custom.css" type="text/css" media="all" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/common/font-awesome/css/font-awesome.css" type="text/css" media="all" />
<%-- <!-- jQuery 2.2.3 -->
<script src="${pageContext.request.contextPath}/static/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/static/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/static/dist/js/demo.js"></script> --%>
<style type="text/css">
.cnfont{
font-family:"Microsoft YaHei",微软雅黑,"MicrosoftJhengHei",华文细黑,STHeiti,MingLiu
}
</style>
</head>
<body>
<!-- 导航栏 -->
<jsp:include page="common/header.jsp"></jsp:include>
    
    <div class="wrapper">
    	<div class="container">
        	<div class="content_block row no-sidebar">
            	<div class="fl-container">
                	<div class="posts-block">
                        <div class="contentarea">  
                        	<!-- Slider -->                                        
                            <div class="fw_block bg_start wall_wrap">
                            	<div class="row">
                                    <div class="col-sm-12 first-module module_slider module_cont pb0">
                                    	<div class="slider_container">
                                            <div class="fullscreen_slider slider_bg">
                                                <ul>
                                                  <!-- SLIDE 1 -->
                                                  <li data-transition="fade" data-slotamount="5" data-masterspeed="700" >
                                                  	  <img src="${pageContext.request.contextPath}/static/common/img/slider/transparent.png" alt="slide1" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat" />              
                                                      <!-- LAYER NR. 1 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img slide_left_img"
                                                           data-x="0"
                                                           data-y="0"
                                                           data-speed="800"
                                                           data-start="700"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/chair_left.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 2 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img slide_right_img"
                                                           data-x="0"
                                                           data-y="0"
                                                           data-speed="1000"
                                                           data-start="1200"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/chair_right.png" alt=""/>
                                                      </div> 
                                                    
                                                      <!-- LAYER NR. 3 -->                
                                                      <div class="tp-caption lft ltt tp-resizeme slide_title slide_info_center"
                                                           data-x="0"
                                                           data-y="214"
                                                           data-speed="600"
                                                           data-start="1200"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="300"
                                                           data-endeasing="Power4.easeIn">Our Life's Work
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 4 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_descr slide_info_center"
                                                           data-x="0"
                                                           data-y="351"
                                                           data-speed="600"
                                                           data-start="1200"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn">We Put Our Hearts and Souls into Making Every Project.<br>We Undertake the Very Best It Can Possibly Be.
                                                      </div>                                                      
                                                      
                                                      <!-- LAYER NR. 5 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_btn"
                                                           data-x="419"
                                                           data-y="479"
                                                           data-speed="800"
                                                           data-start="1400"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn"><a href="javascript:void(0);">i Like It! Purchase</a>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 6 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_btn type2"
                                                           data-x="609"
                                                           data-y="479"
                                                           data-speed="800"
                                                           data-start="1500"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn"><a href="javascript:void(0);">Go on Surfing</a>
                                                      </div>
                                                  </li>
                                                  
                                                  <!-- SLIDE 2 -->
                                                  <li data-transition="fade" data-slotamount="5" data-masterspeed="700" > 
                                                      <img src="${pageContext.request.contextPath}/static/common/img/slider/transparent.png" alt="slide2" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat" />             
                                                      <!-- LAYER NR. 1 -->                
                                                      <div class="tp-caption lft ltt tp-resizeme slide_title slide_info_center"
                                                           data-x="0"
                                                           data-y="45"
                                                           data-speed="800"
                                                           data-start="1400"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="300"
                                                           data-endeasing="Power4.easeIn">Better Websites for All
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 2 -->
                                                      <div class="tp-caption lft ltt tp-resizeme slide_descr slide_info_center"
                                                           data-x="0"
                                                           data-y="175"
                                                           data-speed="700"
                                                           data-start="1200"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn">We Created Beautifully-Crafted Websites that Stand out from the Crowd 
                                                      </div>  
                                                      
                                                      <!-- LAYER NR. 3 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img z_index2"
                                                           data-x="185"
                                                           data-y="247"
                                                           data-speed="800"
                                                           data-start="700"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/laptop.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 4 -->
                                                      <div class="tp-caption lfl ltl tp-resizeme slide_img z_index3"
                                                           data-x="58"
                                                           data-y="380"
                                                           data-speed="1000"
                                                           data-start="1200"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/ipad.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 5 -->
                                                      <div class="tp-caption lfr ltr tp-resizeme slide_img z_index4"
                                                           data-x="928"
                                                           data-y="700"
                                                           data-speed="1000"
                                                           data-start="1400"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/mouse.png" alt=""/>
                                                      </div>                                                    
                                                      
                                                      <!-- LAYER NR. 6 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img z_index5"
                                                           data-x="258"
                                                           data-y="522"
                                                           data-speed="1000"
                                                           data-start="1800"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/iphone.png" alt=""/>
                                                      </div>
                                                  </li>
                                                  
                                                  <!-- SLIDE 3 -->
                                                  <li data-transition="fade" data-slotamount="5" data-masterspeed="700" >
                                                      <img src="${pageContext.request.contextPath}/static/common/img/slider/transparent.png" alt="slide3" data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat" />              
                                                      <!-- LAYER NR. 1 -->
                                                      <div class="tp-caption customin z_index2"
                                                      	   data-x="692"
                                                           data-y="0"
                                                           data-customin="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0;scaleY:0;skewX:0;skewY:0;opacity:0;transformPerspective:1000;transformOrigin:50% 50%;"
                                                           data-speed="1500"
                                                           data-start="500"
                                                           data-easing="Power3.easeInOut"
                                                           data-endspeed="300"><img src="${pageContext.request.contextPath}/static/common/img/slider/desktop.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 2 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img z_index3"
                                                           data-x="700"
                                                           data-y="709"
                                                           data-speed="1400"
                                                           data-start="1300"
                                                           data-easing="Back.easeInOut"
                                                           data-endspeed="1000"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/keyboard.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 3 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_img z_index4"
                                                           data-x="1079"
                                                           data-y="725"
                                                           data-speed="1500"
                                                           data-start="1500"
                                                           data-easing="Back.easeInOut"
                                                           data-endspeed="500"
                                                           data-endeasing="Power4.easeIn"><img src="${pageContext.request.contextPath}/static/common/img/slider/mouse2.png" alt=""/>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 4 -->                
                                                      <div class="tp-caption lft ltt tp-resizeme slide_title font_size130"
                                                           data-x="0"
                                                           data-y="118"
                                                           data-speed="1000"
                                                           data-start="1800"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="300"
                                                           data-endeasing="Power4.easeIn">High
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 5 -->                
                                                      <div class="tp-caption lft ltt tp-resizeme slide_title font_size130"
                                                           data-x="0"
                                                           data-y="276"
                                                           data-speed="1000"
                                                           data-start="1600"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="300"
                                                           data-endeasing="Power4.easeIn">Standards
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 6 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_descr"
                                                           data-x="0"
                                                           data-y="420"
                                                           data-speed="1000"
                                                           data-start="1600"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn">Our Success is not Only Due to the Quality of Our<br>Work. It's Down to Attitude, Our Approach and the<br>Way We Treat Our Clients.
                                                      </div>                                                      
                                                      
                                                      <!-- LAYER NR. 7 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_btn"
                                                           data-x="0"
                                                           data-y="593"
                                                           data-speed="1000"
                                                           data-start="1800"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn"><a href="javascript:void(0);">I Like It! Purchase</a>
                                                      </div>
                                                      
                                                      <!-- LAYER NR. 8 -->
                                                      <div class="tp-caption lfb ltb tp-resizeme slide_btn type2"
                                                           data-x="190"
                                                           data-y="593"
                                                           data-speed="1000"
                                                           data-start="2000"
                                                           data-easing="Power4.easeOut"
                                                           data-endspeed="600"
                                                           data-endeasing="Power4.easeIn"><a href="javascript:void(0);">Go on Surfing</a>
                                                      </div>
                                                  </li>                                                                                                                                
                                                </ul>
                                            </div>
                                        </div>                                        	
                                    </div>
                                </div>
                            </div>  
                            <!-- //Slider -->
                            <!-- 内容栏 -->
                            <div class="row">
                             	<div class="col-sm-12 module_cont pb0">
                                	<div class="bg_title">
                                    	<h2 class="cnfont">欢迎！来到EBank</h2>
                                    </div>                                  
                                </div>
                             </div>
                             
                             
                             <div class="row">
                             	<div class="col-sm-3 module_cont module_iconboxes pb55 animate" data-anim-type="bounceIn" data-anim-delay="300">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon8_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon8_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon8_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon8_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">账户查询</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>快速查询各类账户信息</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-sm-3 module_cont module_iconboxes pb55 animate" data-anim-type="bounceIn" data-anim-delay="350">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon9_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon9_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon9_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon9_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">悦生活</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>生活缴费充值 信用卡</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-sm-3 module_cont module_iconboxes pb55 animate" data-anim-type="bounceIn" data-anim-delay="400">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon16_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon16_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon16_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon16_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">业务申请</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>信用卡、贷款快速申请</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div> 
                                <div class="col-sm-3 module_cont module_iconboxes pb55 animate" data-anim-type="bounceIn" data-anim-delay="450">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon7_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon7_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon7_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon7_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">网点业务预约</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>在线填单取号 网点办理</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-sm-3 module_cont module_iconboxes pb75 animate" data-anim-type="bounceIn" data-anim-delay="300">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon17_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon17_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon17_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon17_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">利率与行情</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>存贷利率 外汇贵金属行情</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-sm-3 module_cont module_iconboxes pb75 animate" data-anim-type="bounceIn" data-anim-delay="350">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon20_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon20_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon20_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon20_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">电子银行开通</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>金融生活 e路随行</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-sm-3 module_cont module_iconboxes pb75 animate" data-anim-type="bounceIn" data-anim-delay="400">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon6_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon6_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon6_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon6_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">常用下载</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>客户端 E路护航 证书下载</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div> 
                                <div class="col-sm-3 module_cont module_iconboxes pb75 animate" data-anim-type="bounceIn" data-anim-delay="450">
                                    <div class="module_content shortcode_iconbox type3">
                                        <a href="javascript:void(0);">			
                                            <div class="iconbox_wrapper">
                                            	<div class="icon_title_wrap">
                                                    <div class="ico">
                                                    	<img src="${pageContext.request.contextPath}/static/common/img/icons/icon11_b.png" class="icon_def icon_pas" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon11_b.png" class="icon_retina icon_pas" width="80" height="80" alt="" />
                                                        <img src="${pageContext.request.contextPath}/static/common/img/icons/icon11_bl.png" class="icon_def icon_hover" width="80" height="80" alt="" /><img src="${pageContext.request.contextPath}/static/common/img/retina/icons/icon11_bl.png" class="icon_retina icon_hover" width="80" height="80" alt="" />
                                                    </div>
                                                    <h5 class="iconbox_title">电话银行菜单定制</h5>
                                                </div>
                                                <div class="iconbox_body">						
                                                    <p>彰显个性 定制电话菜单</p>
                                                </div>					
                                            </div>
                                        </a>
                                    </div>
                                </div>            	
                             </div>
  
                             
                            <div class="row">
                                <div class="col-sm-12 module_cont animate" data-anim-type="fadeInUp" data-anim-delay="250">
                                    <div class="shortcode_promoblock">
                                        <div class="promoblock_wrapper">
                                            <div class="promo_text_block">
                                                <div class="promo_text_block_wrapper">
                                                	<h2 class="promo_text_main_title">We Create Awesome Web and Mobile Products for Your Business!</h2>
                                                    <h6 class="promo_text_additional_title">At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitiardo.</h6>
                                                </div>
                                            </div>        
                                            <div class="promo_button_block"><a class="shortcode_button btn_large btn_type5" href="javascript:void(0);">Hire Us Now</a></div>
                                            <div class="clear"></div>                                                                                
                                        </div>
                                    </div>
                                    <div class="clear"></div>
                                </div>                             	
                            </div>                                                                               
                             
                            <div class="row">
                             	<div class="col-sm-12 module_cont pb0">
                                	<div class="bg_title">
                                    	<h2>What We Do</h2>
                                    </div>                                   
                                </div>
                            </div> 
                            
                            <div class="row">                             	
                                <div class="col-sm-6 module_cont pb55 animate" data-anim-type="bounceInLeft" data-anim-delay="250">
                                    <img src="${pageContext.request.contextPath}/static/common/img/imgs/home2.jpg" class="img-responsive mt_23" alt="">
                                </div>
                                <div class="col-sm-6 module_cont module_accordion pb45 animate" data-anim-type="bounceInRight" data-anim-delay="250">
                                    <div class="shortcode_accordion_shortcode accordion">
                                        <h5 data-count="1" class="shortcode_accordion_item_title expanded_yes">Fully Customizable Design &amp; Layout<span class="ico"></span></h5>
                                        <div class="shortcode_accordion_item_body">
                                            <div class="ip">
                                            	<p>Donec et eleifend velit. Sed eget urna odio. Quisque pulvinar dolor purus, sed dignissim ante imperdiet ac. Sed vulputate lectus at enim aliquet suscipit. Proin metus nibh, tempor ut porta ultricies, sollicitudin id mauris. Aliquam neque lectus, condimentum </p>
                                                <ol>
                                                	<li>Donec et eleifend velit. Sed eget urna odio.</li>
                                                    <li>Quisque pulvinar dolor purus, sed dignissim ante imperdiet ac.</li>
                                                    <li>Sed vulputate lectus at enim aliquet suscipit.</li>
                                                    <li>Proin metus nibh, tempor ut porta ultricies, sollicitudin id mauris.</li>
                                                </ol>
                                            </div>
                                        </div>
                                        <h5 data-count="2" class="shortcode_accordion_item_title expanded_no">Fluid, Responsive &amp; Retina Ready<span class="ico"></span></h5>
                                        <div class="shortcode_accordion_item_body">
                                            <div class="ip">
                                                <p>Consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea lorem ipsum dolor sit amet.</p>
                                            </div>
                                        </div>
                                        <h5 data-count="3" class="shortcode_accordion_item_title expanded_no">SEO Optimized &amp; Valid Code<span class="ico"></span></h5>
                                        <div class="shortcode_accordion_item_body">
                                            <div class="ip">
                                                <p>Sed vulputate lectus at enim aliquet suscipit. Proin metus nibh, tempor ut porta ultricies, sollicitudin id mauris. Aliquam neque lectus, condimentum quis fringilla. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore.</p>
                                            </div>
                                        </div>
                                        <h5 data-count="4" class="shortcode_accordion_item_title expanded_no">Easy Drag &amp; Drop Admin Panel<span class="ico"></span></h5>
                                        <div class="shortcode_accordion_item_body">
                                            <div class="ip">
                                                <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia.</p>
                                            </div>
                                        </div>
                                        <h5 data-count="5" class="shortcode_accordion_item_title expanded_no">Outstanding &amp; Free Customer Support<span class="ico"></span></h5>
                                        <div class="shortcode_accordion_item_body">
                                            <div class="ip">
                                                <p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                             </div>
                             
                            <div class="fw_block bg_start pt74 pb50 grey_bg mb60">
                                <div class="row">
                                    <div class="col-sm-12 module_cont pb0">
                                        <div class="bg_title">
                                            <h2 class="fleft">Latest Works</h2>
                                            <!-- Filter_block -->
                                            <div class="filter_block">
                                                <div class="filter_navigation">
                                                    <ul id="options" class="splitter">
                                                        <li>
                                                            <ul data-option-key="filter" class="optionset">
                                                                <li class="selected"><a data-option-value="*" data-catname="all" href="#filter">All Works</a></li>
                                                                <li><a data-option-value=".branding" data-catname="branding" href="#filter">Branding</a></li>
                                                                <li><a data-option-value=".polygraphy" data-catname="polygraphy" href="#filter">Polygraphy</a></li>
                                                                <li><a data-option-value=".textstyle" data-catname="textstyle" href="#filter">Text Style</a></li>
                                                                <li><a data-option-value=".webui" data-catname="webui" href="#filter">Web UI</a></li>
                                                            </ul>
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <!-- //Filter_block -->
                                            <div class="clear"></div>
                                        </div>                                   
                                    </div>
                                </div> 

                                <div class="row">
                                    <div class="sorting_block image-grid featured_items photo_gallery" id="list">
                                        <div class="col-sm-4 branding element">                    
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/1.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Business Card</h5>
                                                            </div>
                                                            <div class="featured_meta">Print Design</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/1.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 polygraphy element">                    
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/2.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Iste natus</h5>
                                                            </div>
                                                            <div class="featured_meta">Advertisement</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/2.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>                                                                
                                                    </div>                                                                                                              
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 textstyle element">                    
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/3.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Quis autem</h5>
                                                            </div>
                                                            <div class="featured_meta">Business</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/3.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>                                                            
                                                    </div>                                                                                                              
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 webui element">                    
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/4.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Praesent Libero</h5>
                                                            </div>
                                                            <div class="featured_meta">Print Design</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/4.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                 
                                        </div>
                                        <div class="col-sm-4 branding element">                   
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/5.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Sed Cursus Ante</h5>
                                                            </div>
                                                            <div class="featured_meta">Business</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/5.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 polygraphy element">   
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/6.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Nulla Quis Sem</h5>
                                                            </div>
                                                            <div class="featured_meta">People</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/6.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 textstyle element">                   
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/7.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Duis Sagittis Ipsum</h5>
                                                            </div>
                                                            <div class="featured_meta">Business</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/7.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                   
                                        </div>
                                        <div class="col-sm-4 webui element">                    
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/8.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Curabitur Tortor</h5>
                                                            </div>
                                                            <div class="featured_meta">People</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/8.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                  
                                        </div>
                                        <div class="col-sm-4 branding element">                   
                                            <div class="item animate" data-anim-type="bounceIn" data-anim-delay="250">
                                                <div class="item_wrapper">                                  
                                                    <div class="img_block wrapped_img">
                                                        <img src="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/9.jpg" alt="">
                                                        <span class="block_fade"></span>
                                                        <div class="post_hover_info">
                                                            <div class="featured_items_title">
                                                                <h5>Class Aptent Taciti</h5>
                                                            </div>
                                                            <div class="featured_meta">Print Design</div> 
                                                            <a href="${pageContext.request.contextPath}/static/common/img/portfolio/370_300/9.jpg" class="photozoom featured_ico_link view_link"><i class="icon-expand"></i></a>
                                                            <a class="featured_ico_link view_link" href="portfolio_post_fullwidth.html"><i class="icon-link"></i></a>
                                                        </div>
                                                    </div>                                                                                                            
                                                </div>
                                            </div>                                  
                                        </div>                                                                                                                           
                                    </div>
                                    <div class="clear"></div>
                                    <div class="text-center animate" data-anim-type="fadeInUp" data-anim-delay="250"><a href="javascript:void(0);" class="load_more_works shortcode_button btn_normal btn_type5">Load More</a></div>
                                </div>                             
                            </div>
                            
                            <div class="row">
                                <div class="col-sm-12 module_cont pb0">
                                    <div class="bg_title">
                                        <h2>Our Key Features</h2>
                                    </div>                                  
                                </div>
                            </div> 
                            
                            <div class="row">
                            	<div class="col-sm-12 module_cont pb15 module_tabs animate" data-anim-type="fadeInUp" data-anim-delay="300">
                                    <div class="shortcode_tabs type3">
                                        <div class="all_head_sizer"><div class="all_heads_cont"></div><div class="clear"></div></div>
                                        <div class="all_body_sizer"><div class="all_body_cont"></div></div>
                                        <div class="shortcode_tab_item_title expand_no">StartUp</div>
                                        <div class="shortcode_tab_item_body tab-content clearfix">
                                            <div class="ip">
                                                <div class="tab_content">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                                    <img src="${pageContext.request.contextPath}/static/common/img/imgs/tab3_1.jpg" class="mt38" alt="" />                                                     
                                                </div>
                                            </div>
                                        </div>
                                        <div class="shortcode_tab_item_title expand_no">Promo Site</div>
                                        <div class="shortcode_tab_item_body tab-content clearfix">
                                            <div class="ip">
                                                <div class="tab_content">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                                    <img src="${pageContext.request.contextPath}/static/common/img/imgs/tab3_2.jpg" class="mt38" alt="" />                                                 
                                                </div> 
                                            </div>
                                        </div> 
                                        <div class="shortcode_tab_item_title expand_no">Article</div>
                                        <div class="shortcode_tab_item_body tab-content clearfix">
                                            <div class="ip">
                                            	<div class="tab_content">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                                    <img src="${pageContext.request.contextPath}/static/common/img/imgs/tab3_3.jpg" class="mt38" alt="" />                                                 
                                                </div>                                                  
                                            </div>
                                        </div>
                                        <div class="shortcode_tab_item_title expand_yes">Photo Story</div>
                                        <div class="shortcode_tab_item_body tab-content clearfix">
                                            <div class="ip">
                                            	<div class="tab_content">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                                                    <img src="${pageContext.request.contextPath}/static/common/img/imgs/tab3_4.jpg" class="mt38" alt="" />                                                 
                                                </div>                                                   
                                            </div>
                                        </div>                                        
                                        <div class="clear"></div>
                                    </div>
                                </div>
                            </div>                                	
                             
                            <div class="fw_block bg_start pt74 pb50 grey_bg mb0">
                                <div class="row">
                                    <div class="col-sm-12 module_cont pb0">
                                        <div class="bg_title">
                                            <h2>Our Skillset</h2>
                                        </div>                                   
                                    </div>
                                </div>
                            
                            	<div class="row skills_start">
                                    <div class="col-sm-12 module_cont pb0">
                                        <div class="shortcode_diagram items4">
                                            <ul class="diagram_list" data-bg="#ffffff" data-color="#22a1c4" data-width="5px" data-size="130px" data-fontsize="40px">
                                                <li class="diagram_li animate" data-anim-type="fadeInLeft" data-anim-delay="300">
                                                    <div class="diagram_wrapper">
                                                        <div class="diagram_item">
                                                            <div class="chart_wrapper">
                                                                <div class="chart" data-percent="75">75<span>%</span></div>
                                                            </div>
                                                            <div class="diagram_content">
                                                                <h3>Photoshop</h3>
                                                                <div class="diagram_descr">Temporibus autem quibusdam et aut officiis debitis aut rerum einem.</div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="diagram_li animate" data-anim-type="fadeInUp" data-anim-delay="250">
                                                    <div class="diagram_wrapper">
                                                        <div class="diagram_item">
                                                            <div class="chart_wrapper">
                                                                <div class="chart" data-percent="80">80<span>%</span></div>
                                                            </div>
                                                            <div class="diagram_content">
                                                                <h3>Wordpress</h3>
                                                                <div class="diagram_descr">Neceus saepe eveniet ut et voluptates repudiandae sint et molest.</div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="diagram_li animate" data-anim-type="fadeInUp" data-anim-delay="250">
                                                    <div class="diagram_wrapper">
                                                        <div class="diagram_item">
                                                            <div class="chart_wrapper">
                                                                <div class="chart" data-percent="90">90<span>%</span></div>
                                                            </div>
                                                            <div class="diagram_content">
                                                                <h3>Photography</h3>
                                                                <div class="diagram_descr">Itaque earum rerum hic tenet sapiente delectus, ut aut reiciendis ut.</div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li class="diagram_li animate" data-anim-type="fadeInRight" data-anim-delay="300">
                                                    <div class="diagram_wrapper">
                                                        <div class="diagram_item">
                                                            <div class="chart_wrapper">
                                                                <div class="chart" data-percent="100">100<span>%</span></div>
                                                            </div>
                                                            <div class="diagram_content">
                                                                <h3>HTML5</h3>
                                                                <div class="diagram_descr">Bus maiores alias consequatur aut perferendis doloribus asperiores.</div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>                                                                                                 
                                            </ul>
                                            <div class="clear"></div> 
                                        </div>                                  
                                    </div>
                                 </div>
                            </div>
                            
                            <div class="fw_block bg_start block_plus type1">
                                <div class="item animate" data-anim-type="fadeInLeft" data-anim-delay="400">
                                    <h2 class="item_title">Why Choose Us</h2>
                                    <p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas.</p>
                                    <a href="javascript:void(0);" class="shortcode_button btn_normal btn_type5">Learn More</a>
                                </div>
                                <div class="item bg_color2 animate" data-anim-type="fadeIn" data-anim-delay="250">
                                    <h2 class="item_title">What You Get</h2>
                                    <p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi</p>
                                    <a href="javascript:void(0);" class="shortcode_button btn_normal btn_type5">Purchase Now</a>
                                </div>
                                <div class="item animate" data-anim-type="fadeInRight" data-anim-delay="400">
                                    <h2 class="item_title">Careers at Groutek</h2>
                                    <p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus temporibus.</p>
                                    <a href="javascript:void(0);" class="shortcode_button btn_normal btn_type5">Learn More</a>
                                </div>
                            </div>
                            
                            <div class="row">
                             	<div class="col-sm-12 module_cont pb5">
                                	<div class="bg_title">
                                    	<h2>Our Clients</h2>
                                    </div>                                  
                                </div>
                            </div>
       
                            <div class="row">
                                <div class="col-sm-12 module_cont pb80">   
                                	<div class="section-clients featured_items">
                                    	<div class="items3">
                                            <ul class="client-list item_list">
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="250">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/1.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum unde omnis iste natus. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial1.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Linda Grey</b>
                                                                    <span class="title">Manager</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="350">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/2.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga einem like temporalis. 
Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis. At vero eos et samus et iusto odio qui blanditiis praesentium voluptatum deleniti atque corrupti quos jfont dolores et autem quibusdam et aut officis perferendis doloribus.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial4.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Amelia Smith</b>
                                                                    <span class="title">Creative Designer</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="300">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/3.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum unde omnis iste natus. Duis aute irure dolor in reprehenderit in voluptate velit esse.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial3.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Dave Cohen</b>
                                                                    <span class="title">Operations Manager</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="300">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/4.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum unde omnis iste natus.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial2.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Martha Lee</b>
                                                                    <span class="title">Pro Property Maintenance.</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="350">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/5.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Mollit anim id est laborum unde omnis iste natus duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial5.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Ronald Powell</b>
                                                                    <span class="title">Public Health Social Worker</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                                <li class="animate" data-anim-type="fadeInLeft" data-anim-delay="400">
                                                    <i>
                                                        <img class="icon-cl-sweden" src="${pageContext.request.contextPath}/static/common/img/imgs/partners/6.jpg" alt="">
                                                    </i>
                                                    <blockquote>
                                                        <p class="quote">Occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum unde omnis iste natus. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur excepteur sint.</p>
                                                        <div class="author">
                                                            <p>
                                                                <span class="img"><img src="${pageContext.request.contextPath}/static/common/img/imgs/testimonial6.jpg" alt=""></span>
                                                                <span class="cont">
                                                                    <b>Patricia Hollinger</b>
                                                                    <span class="title">Dental Technician</span>
                                                                </span>
                                                            </p>
                                                        </div>
                                                    </blockquote>
                                                </li>
                                            </ul>
                                        </div>
									</div>    
                                </div>
                            </div>                                   
                            
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </div>
    
    <!-- 尾部 -->
    <jsp:include page="common/index_footer.jsp"></jsp:include>
    
</body>
</html>