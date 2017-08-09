
package com.tm.ebank.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.common.ztree.Node;
import com.tm.ebank.common.ztree.Tree;
import com.tm.ebank.common.ztree.ZMenuTree;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.entity.RoleMenu;
import com.tm.ebank.sys.service.MenuService;
import com.tm.ebank.sys.service.RoleMenuService;
import com.tm.ebank.sys.service.RoleService;
import com.tm.ebank.util.DateUntil;

/**
 * 
 * date: 2017年3月20日 下午5:24:32
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/role")
@Controller
public class RoleController extends BaseController{
	@Autowired
	private MenuService menuService;
	@Autowired
	private RoleService service;
	@Autowired
	private RoleMenuService roleMenuService;

	@RequestMapping("/view")
	@ResponseBody
	public Object view(PageVo<Role> pv) throws Exception {
		service.queryLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}
	@RequestMapping("/findMenuByRoleId")
	@ResponseBody
	public Object findMenuByRoleId(Long roleId)throws Exception{
		List<Menu> AllMenuList=menuService.queryAll();
		List<Long> queryMenuIdsList=roleMenuService.queryMenuIdsByRoleId(roleId);
		for (Menu menu : AllMenuList) {
			if (queryMenuIdsList.contains(menu.getId())) {
				menu.setChecked(true);
			}
		}
		System.out.println("AllMenu:"+AllMenuList);
		Tree<Menu> tree=new ZMenuTree(AllMenuList);
		List<Node> nodeList=tree.build();
		return JsonResponseUtils.createJsonResponse(true, "0000", "1111", nodeList, null);
	}
	@RequestMapping("/findById")
	@ResponseBody
	public Object findById(Long id)throws Exception{
		Role role=service.queryById(id);
		if (role!=null) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", role, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/configMenu")
	@ResponseBody
	public Object configMenu(String menuIds, Long roleId)throws Exception{
		List<Long> updateIdList = new ArrayList<>();
		// 解析前台的json数据
		JSONArray ja = new JSONArray(menuIds);
		for (int i = 0; i < ja.length(); i++) {
			String s = ja.get(i).toString();
			Long menuId = Long.parseLong(s);
			updateIdList.add(menuId);
		}
		//查询角色的菜单
		List<Long> queryIdList=roleMenuService.queryMenuIdsByRoleId(roleId);
		List<Long> deleteIdList=new ArrayList<>();
		if(queryIdList!=null){
		//取差集，删除前台没有传来的menuId
		deleteIdList.addAll(queryIdList);
		deleteIdList.removeAll(updateIdList);
		//取差集，插入前台传来的menuId
		updateIdList.removeAll(queryIdList);
		System.out.println("delete:"+deleteIdList);
		System.out.println("update:"+updateIdList);
		System.out.println("query:"+queryIdList);
		}
		if (deleteIdList.size()!=0) {
			roleMenuService.deleteByMenuId(deleteIdList);
		}
		List<RoleMenu> data=new ArrayList<>();
		for (Long  menuId: updateIdList) {
			RoleMenu rm=new RoleMenu(roleId, menuId);
			data.add(rm);
		}
		if (updateIdList.size()!=0) {
			roleMenuService.insert(data);
		}
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
	}
    @RequestMapping("/add")
    @ResponseBody
	public Object add(Role role) throws Exception {
    	String nowDate=DateUntil.format(new Date());
    	role.setCreateDate(nowDate);
    	role.setCreateName("tan");
    	role.setUpdateDate(nowDate);
    	role.setUpdateName("tan");
		if (service.insert(role)>0) {

			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
    @RequestMapping("/update")
    @ResponseBody
    public Object update(Role role)throws Exception{
    	String nowDate=DateUntil.format(new Date());
    	role.setUpdateDate(nowDate);
    	role.setUpdateName("tan");
    	if (service.update(role)>0) {
			
    		return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
    	return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
    }
    @RequestMapping("delete")
    @ResponseBody
    public Object delete(@RequestParam("id") Long id)throws Exception{
    	if(service.delete(id)>0){
    		return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
    	}
    	return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
    }
}
