
package com.clps.mms.sys.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.user_role.model.UserRole;
import com.clps.mms.sys.user_role.service.IUserRoleService;
import com.clps.mms.util.common.AjaxReturnInfo;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ClassName: UserRoleAction. Function: TODO ADD FUNCTION. date: 2017年2月8日
 * 上午11:41:14
 *
 * @author tony.tan
 * @version
 * 
 */
@Controller
public class UserRoleAction extends BaseAction implements ModelDriven<UserRole> {
	private static final long serialVersionUID = 1L;
	@Resource(name = "userRoleService")
	private IUserRoleService service;
	private UserRole userRole;
	private Map<String, Object> resultMap;

	public String saveOrUpdate() throws Exception {
		AjaxReturnInfo ari = null;
		String sName=this.session.get("username").toString();
		if (service.queryUserRoleByUserId(userRole.getUser_id())!=null) {
			if(!service.deleteUserRoleByUserId(userRole.getUser_id())){
				ari = AjaxReturnInfo.failed("失败");
				return "input";
			}
		}
		if (service.insertUserRole(userRole,sName)) {
			ari = AjaxReturnInfo.success("成功");
		} else {
			ari = AjaxReturnInfo.failed("失败");
		}
		resultMap = ari.getReturnMap();
		return "input";
	}
	public String findRoleByUserId() throws Exception{
		AjaxReturnInfo ari=null;
		System.out.println("-------"+userRole.getUser_id());
		Role role=service.queryRoleByUserId(userRole.getUser_id());
		if (null!=role) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("datas", role);
		}else {
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}

	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public UserRole getModel() {
		if (userRole == null) {
			userRole = new UserRole();
		}
		return userRole;
	}
}
