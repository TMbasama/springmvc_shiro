package com.clps.mms.util.jmail.server;

/**
 * Project Name:Jmail
 * File Name:JmailServer.java
 * Package Name:com.clps.study.jmail.server
 * Date:2016年11月8日上午10:58:38
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.clps.mms.util.jmail.listener.JmailSendListener;
import com.clps.mms.util.jmail.model.JmailContext;
import com.clps.mms.util.jmail.model.JmailInfo;
import com.clps.mms.util.jmail.properties.PropertiesConfig;


/**
 * ClassName:JmailServer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2016年11月8日 上午10:58:38 <br/>
 * 
 * @author zhangyi
 * @since JDK 1.7
 */
public class JmailServer {
	private static final int POOL_SIZE = 5;// 定义线程池初始化容量为5
	private Session session;// 创建一个mailsession对象
	private ExecutorService threadPool;// 创建一个线程池对象管理多个线程
	private List<JmailSendListener> jmailSendListeners = new ArrayList<JmailSendListener>();// 创建一个邮件发送监听器对象

	/**
	 * 解析附件路径，并且将解析成功后的附件加入到附件对象的主体，作为邮件附件发送。
	 * 
	 * @param multipart
	 *            附件主体
	 * @param filePaths
	 *            附件路径
	 */
	private static void buildAttachFile(Multipart multipart, String filePaths) {
		try {
			if (filePaths.indexOf(";") != -1) {
				String[] paths = filePaths.split(";");
				for (int i = 0; i < paths.length; i++) {
					FileDataSource fileDataSource = new FileDataSource(paths[i]);
					MimeBodyPart body = new MimeBodyPart();
					body.setFileName(MimeUtility.encodeWord(fileDataSource.getName()));
					body.setDataHandler(new DataHandler(fileDataSource));
					multipart.addBodyPart(body);
				}
			} else {
				MimeBodyPart body = new MimeBodyPart();
				FileDataSource fds = new FileDataSource(filePaths);
				body.setDataHandler(new DataHandler(fds));
				// 对标题编码，不然附件无法显示出来
				// body.setFileName(MimeUtility.encodeWord(fds.getName()));
				multipart.addBodyPart(body);
			}
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 解析邮件地多个地址用英文分号隔开，返回邮件地址数组
	 * 
	 * @param addressStr
	 * @return
	 */
	private static Address[] addressBuilder(String addressStr) {
		String[] temp = null;
		Address[] tempAddressGroup = null;
		try {
			if (addressStr.indexOf(";") != -1) {
				temp = addressStr.split(";");
				tempAddressGroup = new InternetAddress[temp.length];
				for (int i = 0; i < temp.length; i++) {
					tempAddressGroup[i] = new InternetAddress(temp[i]);
				}
			} else {
				tempAddressGroup = new InternetAddress[] { new InternetAddress(addressStr) };
			}
		} catch (AddressException e) {
			e.printStackTrace();
		}
		return tempAddressGroup;
	}

	/**
	 * 判断地址是否为空
	 * 
	 * @param addressStr
	 * @return
	 */
	private static boolean checkNULL(String addressStr) {
		if (addressStr == null) {
			return true;
		} else if (addressStr.trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 邮箱登陆账号密码验证
	 * 
	 * @param userName
	 *            邮箱登陆用户名
	 * @param userPwd
	 *            登陆密码
	 * @return Authenticator
	 */
	private static Authenticator getAuth(String userName, String userPwd) {
		// 加锁适用于多线程
		// Object lock = new Object();
		final String name = userName;
		final String pwd = userPwd;
		Authenticator authenticator = null;
		// synchronized (lock) {
		authenticator = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(name, pwd);
			}
		};
		// }
		return authenticator;
	}

	public void init() {
		final Properties properties = PropertiesConfig.getConfiguration();
		this.threadPool = Executors.newFixedThreadPool(POOL_SIZE);
		Authenticator authenticator = getAuth(properties.getProperty("mail.smtp.username"),
				properties.getProperty("mail.smtp.password"));
		this.session = Session.getDefaultInstance(properties, authenticator);
		this.session.setDebug(true);// 打印调试
	}

	/**
	 * 发送单条Email
	 * send方法中采用java线程池技术ExcecuteService,在初始化时初始大小为5的线程池，以后每次发送邮件都开启一个新的任务来执行，
	 * 每发送一个邮件都依次执行JmailSendListener的sendbefore,snedafter,throwableafter方法，
	 * 从来可以灵活扩展邮件发送的处理逻辑 
	 * @param jinfo
	 * @return
	 */
	public void sendSingle(final JmailInfo jinfo) {
		this.threadPool.execute(new Runnable() {
			@Override
			public void run() {
				JmailContext jmailContext = new JmailContext();
				jmailContext.setJinfo(jinfo);
				doBefore(jmailContext);
				try {
					Message msg = buildMessage(jinfo);
					Transport.send(msg);
					doAfter(jmailContext);
				} catch (Exception e) {
					jmailContext.setThrowable(e);
					doAfterThrowable(jmailContext);
				}
			}
		});

	}

	/**
	 * 发送多条Email
	 * 
	 * @param jmailInfos
	 */
	public void send(List<JmailInfo> jmailInfos) {
		for (JmailInfo jmailInfo : jmailInfos) {
			sendSingle(jmailInfo);
		}
	}

	/**
	 * 建立邮件
	 * 
	 * @param jinfo
	 * @return Message
	 * @throws MessagingException
	 * @throws AddressException
	 */
	private Message buildMessage(JmailInfo jmailInfo) throws AddressException, MessagingException {
		MimeMessage message = new MimeMessage(this.session);
		message.setFrom(getAddress(jmailInfo.getFrom()));
		if (!checkNULL(jmailInfo.getJmailAccepterAddress())) {
			message.addRecipients(RecipientType.TO, addressBuilder(jmailInfo.getJmailAccepterAddress()));// 直接发送
																											// 可以群发
		}
		if (!checkNULL(jmailInfo.getCcAddress())) {
			message.addRecipients(RecipientType.CC, addressBuilder(jmailInfo.getCcAddress()));// 抄送
		}
		if (!checkNULL(jmailInfo.getBccAddress())) {
			message.addRecipients(RecipientType.BCC, addressBuilder(jmailInfo.getBccAddress()));// 密送
		}
		// 邮件标题
		message.setSubject(jmailInfo.getTitle());
		// 邮件发送日期
		message.setSentDate(new Date());
		// 创建附件主体
		Multipart multipart = new MimeMultipart();
		BodyPart messageBodyPart = new MimeBodyPart();
		// 内容部分添加文本内容，编码格式为UTF-8
		messageBodyPart.setContent(jmailInfo.getBody(), "text/plain;charset=UTF-8");
		multipart.addBodyPart(messageBodyPart);
		message.setContent(multipart);
		// 附件路径不为空，添加附件
		if (!checkNULL(jmailInfo.getAttachfile())) {
			// 解析附件路径
			buildAttachFile(multipart, jmailInfo.getAttachfile());
			message.setContent(multipart);
		}
		message.setContent(multipart);
		message.saveChanges();
		return message;
	}

	/**
	 * 获得收件人地址
	 * 
	 * @param address
	 * @return InternetAddress
	 */
	private InternetAddress getAddress(String address) throws AddressException {
		return new InternetAddress(address);
	}
	
	public void addEmailListener(JmailSendListener JmailSendListener) {
		this.jmailSendListeners.add(JmailSendListener);
	}

	/**
	 * 监听发送邮件前的操作
	 * 
	 * @param jmailcontext
	 * @return
	 */
	private void doBefore(JmailContext jmailcontext) {
		for (JmailSendListener jmailSendListener : this.jmailSendListeners) {
			jmailSendListener.sendbefore(jmailcontext);
			;
		}
	}

	/**
	 * 监听发送邮件后的操作
	 * 
	 * @param jmailcontext
	 * @return
	 */
	private void doAfter(JmailContext jmailcontext) {
		for (JmailSendListener jmailSendListener : this.jmailSendListeners) {
			jmailSendListener.sendafter(jmailcontext);
		}
	}

	/**
	 * 监听抛出异常后的操作
	 * 
	 * @param jmailcontext
	 * @return
	 */
	private void doAfterThrowable(JmailContext jmailcontext) {
		for (JmailSendListener jmailSendListener : this.jmailSendListeners) {
			jmailSendListener.throwableafter(jmailcontext);
		}
	}
	
	
	
	

}
