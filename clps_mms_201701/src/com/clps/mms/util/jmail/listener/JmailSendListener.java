package com.clps.mms.util.jmail.listener;

import com.clps.mms.util.jmail.model.JmailContext;

/**
 * Project Name:Jmail
 * File Name:JmailSendListener.java
 * Package Name:com.clps.study.jmail.lisener
 * Date:2016年11月8日上午11:17:25
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/



/**
 * ClassName:JmailSendListener <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 上午11:17:25 <br/>
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public interface JmailSendListener {
	
	/**
	 * 邮件发送前做的操作
	 * @param jmailcontext
	 */
	public abstract void sendbefore(JmailContext jmailcontext);
	
	/**
	 * 邮件发送后做的操作
	 * @param jmailcontext
	 */
	public abstract void sendafter(JmailContext jmailcontext);
	
	/**
	 * 邮件发送后抛出异常做的操作
	 * @param jmailcontext
	 */
	public abstract void throwableafter(JmailContext jmailcontext);
	
	

}

