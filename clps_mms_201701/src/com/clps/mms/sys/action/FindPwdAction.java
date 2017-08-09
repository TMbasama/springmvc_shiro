package com.clps.mms.sys.action;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.clps.mms.sys.user.model.UserInfo;
import com.clps.mms.sys.user.service.IUserService;
import com.clps.mms.util.exception.UserServiceException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 校验验证码
 * */
@Controller
public class FindPwdAction extends BaseAction implements ModelDriven<UserInfo>{
	
	private static final long serialVersionUID = 1L;

	private boolean flag;
	
	
	
	
	@Resource(name="userService")
	private IUserService service=null;
	
	private UserInfo userinfo=null;

	
	
	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public String validateCode() throws UserServiceException
	{
		UserInfo user=null;
		httpRequest=ServletActionContext.getRequest();
		//获得前台输入的验证码
		String code=httpRequest.getParameter("code");
		//获得Session中保存的验证码
		String validateC = (String)ActionContext.getContext().getSession().get("validateCode");
		//获得前台传来的name
		String username=userinfo.getName();
		user=service.findUserInfoByName(username);
		System.out.println(user+"user");
		
		//如果验证码正确且user不为空根据用户名查出邮箱
		if (validateC.equals(code)&&user!=null) {
			session.put("email", user.getEmail());
			session.put("name", user.getName());
			flag=true;
			return SUCCESS;
		} else {
			flag=false;
			return ERROR;
		}
	}
	
	
	
	

	@Override
	public UserInfo getModel() {
		if (userinfo==null) {
			userinfo=new UserInfo();
		}
		return userinfo;
	}

	
}
