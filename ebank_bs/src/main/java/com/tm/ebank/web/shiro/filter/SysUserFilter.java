
package com.tm.ebank.web.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.sys.Constants;
import com.tm.ebank.sys.service.UserService;

/**
 * 
 * date: 2017年2月24日 下午1:58:54 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class SysUserFilter extends PathMatchingFilter{
@Autowired
private UserService userService;
/**
	 * 
	 * @see org.apache.shiro.web.filter.PathMatchingFilter#onPreHandle(javax.servlet.ServletRequest, javax.servlet.ServletResponse, java.lang.Object)
	 */
	@Override
	protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		System.out.println("shiroFilter...");
		String username=(String) SecurityUtils.getSubject().getPrincipal();
		request.setAttribute(Constants.CURRENT_USER, userService.queryByName(username));
		return true;
		
	}
}

