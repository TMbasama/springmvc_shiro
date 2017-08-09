package com.clps.mms.util.jmail.listener.impl;

/**
 * Project Name:Jmail
 * File Name:ConsoleJmailSendListener.java
 * Package Name:com.clps.study.jmail.listener.impl
 * Date:2016年11月8日下午3:10:32
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/


import org.apache.log4j.Logger;

import com.clps.mms.util.jmail.listener.JmailSendListener;
import com.clps.mms.util.jmail.model.JmailContext;


/**
 * ClassName:ConsoleJmailSendListener 
 * Function: 跟踪一下邮件的发送过程，在邮件的发送开始，结束和异常出现时打印出一些基本信息
 * Date:     2016年11月8日 下午3:10:32 
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public class ConsoleJmailSendListener implements JmailSendListener{
	private Logger log;

	public ConsoleJmailSendListener() {
		this.log=Logger.getLogger("console");
	}
	
	@Override
	public void sendbefore(JmailContext jmailcontext) {
		log.info("Start to send mail: "+jmailcontext.getJinfo());
	}

	@Override
	public void sendafter(JmailContext jmailcontext) {
		log.info("End of sending: "+jmailcontext.getJinfo());
	}

	@Override
	public void throwableafter(JmailContext jmailcontext) {
		log.info("Error Occurs when sending email :"+jmailcontext.getJinfo());
		
	}

}

