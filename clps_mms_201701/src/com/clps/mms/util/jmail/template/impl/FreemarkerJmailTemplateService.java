package com.clps.mms.util.jmail.template.impl;

/**
 * Project Name:Jmail
 * File Name:FreemarkerJmailTemplateService.java
 * Package Name:com.clps.study.jmail.template
 * Date:2016年11月8日下午3:44:14
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/


import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.clps.mms.util.jmail.template.JmailServiceTemplate;

import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * ClassName:FreemarkerJmailTemplateService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 下午3:44:14 <br/>
 * 默认的模板技术实现，采用了缓存技术，第一次用到模板的时候会去读取文件，以后都共享内存中的实例了
 * @author zhangyi
 * @since JDK 1.7
 */
public class FreemarkerJmailTemplateService implements JmailServiceTemplate {

	private static final String TEMPLATE_PATH = "/email/";// 邮件模板的存放位置
	private static final Map<String, Template> TEMPLATE_CACHE = new HashMap<String, Template>();// 启动模板缓存
	private static final String SUFFIX = ".ftl";// 模板文件后缀
	private Configuration config;// 模板引擎配置
	private static final String DATE_FORMATE = "yyyy-MM-dd HH:mm:ss";//日期合适

	/**
	 * 初始化加载配置
	 * **/
	@Override
	public void init() {
		config = new Configuration();
		config.setTemplateLoader(new ClassTemplateLoader(FreemarkerJmailTemplateService.class, TEMPLATE_PATH));
		config.setEncoding(Locale.getDefault(), "UTF-8");
		config.setDateFormat(DATE_FORMATE);
	}

	
	/**
	 * 读取模板
	 * **/
	@Override
	public String getText(String templateId, Map<Object, Object> parameters) {
		String templateFile = templateId + SUFFIX;
		Template template = TEMPLATE_CACHE.get(templateFile);
		try {
			if (template == null) {
				template = config.getTemplate(templateFile);
				TEMPLATE_CACHE.put(templateFile, template);
			}
			StringWriter stringWriter = new StringWriter();
			template.process(parameters, stringWriter);
			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
