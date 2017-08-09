<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="footer">
    	<div class="container">
        	<div class="pre_footer">
            	<div class="row">
            	    <div class="col-sm-3">
                    	<div class="sidepanel widget_review">
                        	<h4 class="title">关于我们</h4>
                            <div class="last_review">
                            	<p class="review_text">我们追求卓越，然时间、经验、能力有限。EBank有很多不足的地方，希望大家包容、不吝赐教，给我们提意见、建议。感谢你们！</p>
                                <div class="clear"></div>
                            </div>
                        </div>
                    </div>
                     <div class="col-sm-3">
                    	<div class="sidepanel widget_text">
                        	<h4 class="title">软件协议</h4>
                            <p>Ebank使用 MIT 许可证发布，用户可以自由使用、复制、修改、合并、出版发行、散布、再授权及贩售 EBank 及其副本。</p>
                        </div>
                    </div>
                     <div class="col-sm-3">
                    	<div class="sidepanel widget_text">
                        	<h4 class="title">技术支持</h4>
                            <p><span>安全组件：</span>Shiro</p>
                            <p><span>前台框架：</span>Bootstrap、jQuery、 Seajs、FontAwesome、etc.</p>
                            <p><span>后台框架：</span>SpringMVC+Mybatis</p>
                        </div>
                    </div>
                	<div class="col-sm-3">
                    	<div class="sidepanel widget_text">
                        	<h4 class="title">联系详情</h4>
                            <p><span>电话:</span> 15070080861</p>
                            <p><span>地址:</span> 上海市浦东新区</p>
                            <p><span>电子邮箱:</span> <a href="mailto:#">tmbasama@163.com</a></p>
                            <div class="footer_socials">
                            	<ul>
                                	<li><a href="javascript:void(0);" class="soc_fb"><i class="icon-facebook"></i></a></li>
                                    <li><a href="javascript:void(0);" class="soc_tweet"><i class="icon-twitter"></i></a></li>
                                    <li><a href="javascript:void(0);" class="soc_google"><i class="icon-google-plus"></i></a></li>
                                    <li><a href="javascript:void(0);" class="soc_dribbble"><i class="icon-dribbble"></i></a></li>
                                    <li><a href="javascript:void(0);" class="soc_pinterest"><i class="icon-pinterest"></i></a></li>
                                </ul>
                            </div>
                        </div>	
                    </div>
                   
                </div>
            </div>
            <div class="footer_bottom">
            	<div class="copyright">Copyright 2017. All Rights Reserved by tonytan</div>
                <div class="clear"></div>
            </div>
        </div>
    </div>  
    
    <div class="fixed-menu"></div>
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/jquery.min.js"></script>	   
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/modules.js"></script>	
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/theme.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/color_panel.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/jquery.themepunch.plugins.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/jquery.themepunch.revolution.min.js"></script>    
    <script type="text/javascript">
		jQuery(document).ready(function() {
		   "use strict";			   						
		   jQuery('.fullscreen_slider').show().revolution({
				delay: 5000,
				startwidth: 1170,
				startheight: 765,
				fullWidth:"off",
				fullScreen:"on",
				navigationType:"bullet",
				fullScreenOffsetContainer: ".main_header",
				fullScreenOffset: ""
			});							
		});
	</script> 
    
    <!-- Portfolio -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/jquery.isotope.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/sorting.js"></script>
    <script>	
		items_set = [                    
			{src : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/10.jpg', zoom : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/10.jpg', url : 'portfolio_post_fullwidth.html', columnclass: 'col-sm-4', sortcategory: 'webui', title: 'Unde Sed ut', itemcategory: 'Print Design'},
			{src : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/11.jpg', zoom : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/11.jpg', url : 'portfolio_post_fullwidth.html', columnclass: 'col-sm-4', sortcategory: 'polygraphy', title: 'Tempore Nam Libero', itemcategory: 'Business'},
			{src : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/12.jpg', zoom : '${pageContext.request.contextPath}/static/common/img/portfolio/370_300/12.jpg', url : 'portfolio_post_fullwidth.html', columnclass: 'col-sm-4', sortcategory: 'textstyle', title: 'Dolores Magni', itemcategory: 'People'}
		];
		jQuery('#list').portfolio_addon({
			type : 2, // 2-4 columns portfolio
			load_count : 3,
			items : items_set
		});
	</script> 