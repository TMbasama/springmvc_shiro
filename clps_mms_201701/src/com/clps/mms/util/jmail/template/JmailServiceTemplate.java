package com.clps.mms.util.jmail.template;

/**
 * Project Name:Jmail
 * File Name:JmailServiceTemplate.java
 * Package Name:com.clps.study.jmail.template
 * Date:2016年11月8日下午3:32:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/


import java.util.Map;

/**
 * ClassName:JmailServiceTemplate <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 下午3:32:58 <br/>
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public interface JmailServiceTemplate {
	
	/**
	 * 模板初始化   加载配置...
	 */
	public void init();
	
	/**
	 * 获得模板中的元素转换成String字符串
	 */
	public abstract String getText(String templateId,
			Map<Object, Object> parameters);
		
		
		

}

