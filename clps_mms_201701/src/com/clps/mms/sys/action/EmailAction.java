package com.clps.mms.sys.action;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Controller;

import com.clps.mms.util.jmail.facade.JmailSendFacade;
import com.clps.mms.util.jmail.listener.impl.ConsoleJmailSendListener;
import com.clps.mms.util.jmail.model.JmailInfo;
import com.clps.mms.util.jmail.random.RandomChar;
import com.clps.mms.util.jmail.server.JmailServer;
import com.clps.mms.util.jmail.template.JmailServiceTemplate;
import com.clps.mms.util.jmail.template.impl.FreemarkerJmailTemplateService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
@Controller
public class EmailAction extends BaseAction implements ModelDriven<JmailInfo>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JmailInfo jmailinfo;
	private JmailServer jmailServer;
	private JmailServiceTemplate jmailTemplateService;
	private JmailSendFacade jmailSendFacade;

	public JmailInfo getJmailinfo() {
		return jmailinfo;
	}

	public void setJmailinfo(JmailInfo jmailinfo) {
		this.jmailinfo = jmailinfo;
	}

	public EmailAction() {
		jmailServer = new JmailServer();
		jmailTemplateService = new FreemarkerJmailTemplateService();
		jmailSendFacade = new JmailSendFacade();
	}

	// 启动邮件服务器
	public void startServer() {
		jmailServer.init();// 服务器初始化
		jmailServer.addEmailListener(new ConsoleJmailSendListener());
		jmailTemplateService.init();// 模板引擎初始化
		jmailSendFacade.setEmailServer(jmailServer);// 注册邮件服务器
		jmailSendFacade.setEmailTemplateService(jmailTemplateService);// 注册模板
	}

	// 发送邮件
	public String sendEmail() throws InterruptedException {
		startServer();
		System.out.println("send");
		jmailinfo.setFrom("13687919300@163.com");
		jmailinfo.setJmailAccepterAddress(String.valueOf(jmailinfo.getJmailAccepterAddress()));
		jmailinfo.setTemplateId("reset_password");
		jmailinfo.addParameter("title",String.valueOf(jmailinfo.getPtit()));
		jmailinfo.addParameter("body", String.valueOf(jmailinfo.getPbod()));
		jmailinfo.addParameter("name", "huritian");
		jmailinfo.addParameter("Randomnumber", RandomChar.getRandomALLChar(10));
		System.out.println(jmailinfo);
		// jmailInfo.addParameter("newPassword", "123456");
		// 你的密码已经被重置为${newPassword}
		// 发送
		jmailSendFacade.send(jmailinfo);
		Thread.sleep(10000);
		return SUCCESS;
	}
	
	public String sendUrl() throws InterruptedException{
		startServer();
		String rangenum=RandomChar.getRandomALLChar(4);
		jmailinfo.setFrom("13687919300@163.com");
		jmailinfo.setJmailAccepterAddress(String.valueOf(jmailinfo.getJmailAccepterAddress()));
		jmailinfo.setTemplateId("find_password");
		jmailinfo.addParameter("url", createLink());
		jmailinfo.addParameter("Randomnumber", rangenum);
		System.out.println(jmailinfo);
		System.out.println(rangenum);
		session.put("rangenum", rangenum);
		jmailSendFacade.send(jmailinfo);
		Thread.sleep(10000);
		return SUCCESS;
	}

	/** 
	*
	* @Title: createLink 
	* @Description: 创建URL
	* @param     设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	private String createLink() {
		String path=httpRequest.getContextPath();
		String basePath=httpRequest.getScheme()+"://"+httpRequest.getServerName()+":"+httpRequest.getServerPort()+path;
		String url="请勿回复本邮件.点击下面的链接,输入验证码并重设密码,本邮件超过30分钟,链接将会失效，需要重新申请找回密码."+basePath+"/jsp/forgetPwd3.jsp";
		return url;
	}
	
	public static void main(String[] args) {
	}
	
	@Override
	public JmailInfo getModel() {
		if (jmailinfo==null) {
			jmailinfo=new JmailInfo();
		}
		return jmailinfo;
	}



}
