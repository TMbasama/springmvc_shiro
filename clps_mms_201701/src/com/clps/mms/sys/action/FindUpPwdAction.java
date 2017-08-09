/**   
 *  Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
* @Title: FindUpPwdAction.java 
* @Package com.clps.mms.sys.action 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Administrator  
* @date 2017年2月14日 下午2:48:09 
* @version V1.0   
*/
package com.clps.mms.sys.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.clps.mms.sys.user.model.UserInfo;
import com.clps.mms.sys.user.service.IUserService;
import com.clps.mms.util.MD5;
import com.clps.mms.util.exception.UserServiceException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

/** 
* @ClassName: FindUpPwdAction 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Administrator 
* @date 2017年2月14日 下午2:48:09 
* @version 1.0 
*/
@Controller
public class FindUpPwdAction extends BaseAction implements ModelDriven<UserInfo>{

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 1L;
	
	@Resource(name="userService")
	private IUserService service=null;
	
	private UserInfo userinfo=null;
	
	/**
	 * @throws UserServiceException  
	*
	* @Title: UpdateUserPwd 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param     设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	public String updateUserPwd() throws UserServiceException {
		UserInfo user=null;
		//获得保存在session中的username
		String username = (String) this.session.get("name");
		System.out.println(username);
		//根据用户名找到该用户信息
		user=service.findUserInfoByName(username);
		System.out.println(user);
		//获得验证码
		String rangenum=(String) this.session.get("rangenum");
		System.out.println(rangenum);
		//获得前台的验证码
		String r_num=this.httpRequest.getParameter("rangecode");
		System.out.println(r_num);
		//获得前台设置的新密码
		String passwd=userinfo.getPassword();
		System.out.println(r_num);
		if (r_num.equals(rangenum)) {
			if (user!=null) {
				user.setPassword(MD5.getMD5Str(passwd));
				service.updateUserInfoById(user);
			}
		}else {
			System.out.println("验证码验证错误");
			return ERROR;
		}
		//设置新密码
		return SUCCESS;
	}

	/** (非 Javadoc) 
	* <p>Title: getModel</p> 
	* <p>Description: </p> 
	* @return 
	* @see com.opensymphony.xwork2.ModelDriven#getModel() 
	*/
	@Override
	public UserInfo getModel() {
		if (userinfo==null) {
			userinfo=new UserInfo();
		}
		
		return userinfo;
	}
	
	

}
