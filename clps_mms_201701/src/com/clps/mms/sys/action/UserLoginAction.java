
/**
 * Project Name:clps_mms_copyright_201610
 * File Name:LoginAction.java
 * Package Name:com.clps.mms.sys.action
 * Date:2016年11月15日上午11:03:25
 * Copyright (c) 2016, tmbasama@163.com All Rights Reserved.
 *
 */
package com.clps.mms.sys.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.stereotype.Controller;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.user.model.UserInfo;
import com.clps.mms.sys.user.service.IUserService;
import com.clps.mms.sys.user_role.service.IUserRoleService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ClassName: LoginAction. Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON(可选). date: 2016年11月15日 上午11:03:25
 *
 * @author tony.tan
 * @version
 * 
 */
@Controller
public class UserLoginAction extends ActionSupport implements SessionAware {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String prePage;
	@Resource(name="userService")
	private IUserService service=null;
	@Resource(name = "userRoleService")
	private IUserRoleService userRoleservice;
	private Map<String, Object> session;


	public String execute() {
			UserInfo user;
			try {
				user = service.login(username, password);
				System.out.println("user:-------------" + user);
				if (user != null) {
					Role role=userRoleservice.queryRoleByUserId(user.getId());
					this.session.put("username", user.getName());
					this.session.put("userRoleId", role.getId());
					System.out.println("roleId:"+role.getId());
					return SUCCESS;
				}
			} catch (Exception e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
				/*
				 * Department
				 * department=deptService.findDepartmentById(user.getDepartment(
				 * )); String menus=department.getMenus();
				 * System.out.println("menus:"+menus);
				 */
				return INPUT;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
	public String getPrePage() {
		return prePage;
	}

	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;

	}
	
}
