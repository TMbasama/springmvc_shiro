
package com.tm.ebank.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tm.ebank.sys.entity.User;
import com.tm.ebank.web.bind.annotation.CurrentUser;

/**
 * 
 * date: 2017年2月23日 上午10:33:52
 *
 * @author tony.tan
 * @version
 * 
 */
@Controller
public class IndexController {
	//@Autowired
	//private UserService1 userService1;

	@RequestMapping("/")
	public String index(@CurrentUser User loginUser, Model model) {
		System.out.println("index...");
		//Set<String> permissions = userService.findPermissions(loginUser.getUsername());
		//List<Resource> menus = resourceService.findMenus(permissions);
		//model.addAttribute("menus", menus);
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
