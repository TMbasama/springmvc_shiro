package com.clps.mms.util.jmail.model;

/**
 * Project Name:Jmail
 * File Name:JmalInfoFactory.java
 * Package Name:com.clps.study.jmail.factory
 * Date:2016年11月8日上午11:28:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/



/**
 * ClassName:JmalInfoFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2016年11月8日 上午11:28:58 <br/>
 * @author zhangyi
 * @since JDK 1.7
 */
public class JmailContext {
	private JmailInfo jinfo;// 创建一个邮件对象
	private Throwable throwable;// 创建一个异常抛出对象

	public JmailInfo getJinfo() {
		return jinfo;
	}

	public void setJinfo(JmailInfo jinfo) {
		this.jinfo = jinfo;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

}
