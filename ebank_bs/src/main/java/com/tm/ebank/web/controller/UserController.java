
package com.tm.ebank.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.entity.User;
import com.tm.ebank.sys.entity.UserRole;
import com.tm.ebank.sys.service.UserRoleService;
import com.tm.ebank.sys.service.UserService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.MD5Utils;

/**
 * 
 * date: 2017年3月6日 下午2:07:13
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/user")
@Controller
public class UserController extends BaseController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRoleService userRoleService;

	@RequestMapping("/view")
	@ResponseBody
	public Object view(PageVo<User> pv) throws Exception {
		//userService.queryUserLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public Object add(User user)throws Exception{
		String nowDate=DateUntil.format(new Date());
		String password=user.getPassword();
		String manager=(String) this.session.getAttribute("username");
		user.setPassword(MD5Utils.getMD5Str(password));
		/*if(userService.insertUser(user)){
			
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}*/
		return JsonResponseUtils.createJsonResponse(false, "0001", "222", null, null);
	}
	@RequestMapping("/update")
	@ResponseBody
	public Object update(User user)throws Exception{
		String nowDate=DateUntil.format(new Date());
		String manager=(String) this.session.getAttribute("username");
		/*if (userService.updateUser(user)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}*/
		return JsonResponseUtils.createJsonResponse(false, "0001", "222", null, null);
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object login(String username,String password)throws Exception{
		User user=userService.queryByName(username);
		if (user==null) {
			return JsonResponseUtils.createJsonResponse(false, "0001", "该用户不存在！", null, null);
		}
		if (user.getPassword().equals(MD5Utils.getMD5Str(password))) {
			this.session.setAttribute("userId", user.getId());
			this.session.setAttribute("username", username);
			return JsonResponseUtils.createJsonResponse(true, "0000", "登录成功!", "jsp/index.jsp", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0002", "用户密码错误!", null, null);
	}
	
	
	@RequestMapping("/findRoleByUserId")
	@ResponseBody
	public Object findRoleByUserId(Long userId)throws Exception{
		Role role=userRoleService.queryRoleByUserId(userId);
		if (null!=role) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", role, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "222", null, null);
	}
	@RequestMapping("/configRole")
	@ResponseBody
	public Object configRole(UserRole userRole)throws Exception{
		UserRole queryUserRole=userRoleService.queryByUserId(userRole.getUser_id());
		if(queryUserRole!=null){
			if(userRole.getRole_id()==queryUserRole.getRole_id()){
				return JsonResponseUtils.createJsonResponse( false, "0001", "222", null, null);
			}else{
				userRoleService.deleteByUserId(userRole.getUser_id());
			}
		}
		/*if(userRoleService.insert(userRole)){
			return JsonResponseUtils.createJsonResponse( true, "0000", "111", null, null);
		}*/
		return JsonResponseUtils.createJsonResponse( false, "0001", "222", null, null);
	}
	@RequestMapping(value="/findById",method=RequestMethod.GET)
	@ResponseBody
	public Object findById(@RequestParam("id")Long id)throws Exception{
		User user=userService.queryById(id);
		if(null!=user){
			return JsonResponseUtils.createJsonResponse( true, "0000", "111", user, null);
		}
		return JsonResponseUtils.createJsonResponse( false, "0001", "222", null, null);
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Object delete(@RequestParam("id")Long id)throws Exception{
		/*if(userService.deleteUser(id)){
			return JsonResponseUtils.createJsonResponse(true, "0000", "222", null, null);
		}*/
		return JsonResponseUtils.createJsonResponse( false, "0001", "222", null, null);
	}
}
