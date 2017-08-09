package com.clps.mms.util.jmail.model;

/**
 * Project Name:Jmail
 * File Name:JmailInfo.java
 * Package Name:com.clps.study.jmail.model
 * Date:2016年11月8日上午11:21:04
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:JmailInfo Function: EmailInfo include id,from... Date: 2016年11月8日
 * 上午11:21:04
 * 
 * @author zhangyi
 * @since JDK 1.7
 */
public class JmailInfo {
	private long id;// 邮件id
	private String from;// 寄件人邮箱地址
	private String jmailAccepterAddress;// 接收人地址
	private String ccAddress;// 抄送地址
	private String bccAddress;// 密送地址
	private String title;// 标题
	private String body;// 邮箱内容
	private String templateId;// 邮件模板id
	private String attachfile;// 邮箱附件
	private String ptit;
	private String pbod;
	private Map<Object, Object> parameters = new HashMap<Object, Object>();// 邮件参数

	/**
	 * parameters get,setmethod
	 * 
	 **/
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

	public String getPtit() {
		return ptit;
	}

	public void setPtit(String ptit) {
		this.ptit = ptit;
	}

	public String getPbod() {
		return pbod;
	}

	public void setPbod(String pbod) {
		this.pbod = pbod;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getJmailAccepterAddress() {
		return jmailAccepterAddress;
	}

	public void setJmailAccepterAddress(String jmailAccepterAddress) {
		this.jmailAccepterAddress = jmailAccepterAddress;
	}

	public String getCcAddress() {
		return ccAddress;
	}

	public void setCcAddress(String ccAddress) {
		this.ccAddress = ccAddress;
	}

	public String getBccAddress() {
		return bccAddress;
	}

	public void setBccAddress(String bccAddress) {
		this.bccAddress = bccAddress;
	}

	public String getAttachfile() {
		return attachfile;
	}

	public void setAttachfile(String attachfile) {
		this.attachfile = attachfile;
	}

	/**
	 * add parameters
	 * 
	 **/
	public void addParameter(Object key, Object value) {
		this.parameters.put(key, value);
	}

	/**
	 * remove parameters
	 * 
	 **/
	public void removeParameter(Object key) {
		this.parameters.remove(key);
	}

	public Map<Object, Object> getParameters() {
		return parameters;
	}

	public void setParameters(Map<Object, Object> parameters) {
		this.parameters = parameters;
	}

	@Override
	public String toString() {
		return "JmailInfo [id=" + id + ", from=" + from + ", jmailAccepterAddress=" + jmailAccepterAddress
				+ ", ccAddress=" + ccAddress + ", bccAddress=" + bccAddress + ", title=" + title + ", body=" + body
				+ ", templateId=" + templateId + ", attachfile=" + attachfile + ", parameters=" + parameters + "]";
	}

}
