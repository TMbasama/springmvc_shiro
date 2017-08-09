
package com.clps.mms.sys.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.role.service.IRoleService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DataTableHelper;
import com.clps.mms.util.common.AjaxReturnInfo;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class RoleAction extends BaseAction implements ModelDriven<Role>{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="roleService")
	private IRoleService service=null;
	private Role role=null;
	private Map<String,Object> resultMap;
	
	
	public String findById()throws Exception{
		AjaxReturnInfo ari=null;
		Role queryRole=service.queryRoleById(role.getId());
		if (null!=queryRole) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("role", queryRole);
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	public String queryAll() throws Exception{
		AjaxReturnInfo ari=null;
		List<Role> data=service.queryAll();
		if (null!=data) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("list", data);
		}else {
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	public String getRoleLst() throws Exception{
		DataTableHelper<Role> helper=new DataTableHelper<>();
		PageVo<Role> pageVo=helper.getTableData(this.httpRequest);
		pageVo=service.queryRoleLst(pageVo);
		resultMap=helper.getReturnMap(pageVo);
		return "json";
	}
    public String add() throws Exception{
    	AjaxReturnInfo ari=null;
    	String sName=this.session.get("username").toString();
    	role.setCreateName(sName);
    	role.setUpdateName(sName);
    	if (service.insertRole(role)) {
			ari=AjaxReturnInfo.success("成功");
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
    	resultMap=ari.getReturnMap();
    	return "input";
    }
    public String update() throws Exception{
    	AjaxReturnInfo ari=null;
    	System.out.println(role);
    	String sName=this.session.get("username").toString();
    	role.setUpdateName(sName);
    	if (service.updateRoleById(role)) {
			ari=AjaxReturnInfo.success("成功");
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
    	resultMap=ari.getReturnMap();
    	return "input";
    }
    public String delete() throws Exception{
    	AjaxReturnInfo ari=null;
    	String sName=this.session.get("username").toString();
    	if (service.deleteRoleById(role.getId(),sName)) {
			ari=AjaxReturnInfo.success("成功");
		}else{
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
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Role getModel() {
		if(role==null){
			role=new Role();
		}
		return role;
	}

}

