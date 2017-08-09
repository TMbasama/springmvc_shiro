package com.clps.mms.util.jmail.facade;

import com.clps.mms.util.jmail.model.JmailInfo;
import com.clps.mms.util.jmail.server.JmailServer;
import com.clps.mms.util.jmail.template.JmailServiceTemplate;

/**
 * Project Name:Jmail
 * File Name:JmailSendFacade.java
 * Package Name:com.clps.study.jmail.facade
 * Date:2016年11月8日下午4:30:23
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *


/**
 * ClassName:JmailSendFacade <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 下午4:30:23 <br/>
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public class JmailSendFacade {
	private JmailServiceTemplate jmailTemplateService;//模板服务器
	private JmailServer jmailServer;//邮件服务器
	
	public void setEmailTemplateService(JmailServiceTemplate jmailTemplateService) {
		this.jmailTemplateService = jmailTemplateService;
	}
	
	public void setEmailServer(JmailServer jmailServer) {
		this.jmailServer = jmailServer;
	}
	
	/**
	 * 发送邮件
	 * @param emailInfo 邮件参数封装，emailInfo的title和content字段的值将被重置为实际的值
	 */
	public void send(JmailInfo jmailInfo){
		String title = jmailTemplateService.getText(jmailInfo.getTemplateId()+"-title", jmailInfo.getParameters());
		String content = jmailTemplateService.getText(jmailInfo.getTemplateId()+"-body", jmailInfo.getParameters());
		jmailInfo.setBody(content);
		jmailInfo.setTitle(title);
		jmailServer.sendSingle(jmailInfo);;
		
	}

}

