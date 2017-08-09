
package com.tm.ebank.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.service.UserService;
import com.tm.ebank.util.DateUntil;

/**
 * 
 * date: 2017年2月23日 下午3:10:07 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
    @RequestMapping(value = "/login")
    public String showLoginForm(HttpServletRequest req, Model model) {
    	System.out.println("跳转到登录界面");
        String exceptionClassName = (String)req.getAttribute("shiroLoginFailure");
        String error = null;
        if(UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        }else if(ExcessiveAttemptsException.class.getName().equals(exceptionClassName)){
        	error="重复次数大于三次，锁定24小时";
        } 
         else if(exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
        return "login";
    }
    @RequestMapping("/register")
	public String toRegister() throws Exception {
		return "register";
	}
    @RequestMapping("/userRegister")
	@ResponseBody
	public Object register(User user) throws Exception {
		String time = DateUntil.format(new Date());
		user.setCreate_time(time);
		user.setCreate_name(user.getUsername());
		user.setUpdate_name(user.getUsername());
		user.setUpdate_time(time);
		if (userService.insert(user) > 0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
}
