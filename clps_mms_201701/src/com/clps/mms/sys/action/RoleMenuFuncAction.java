
package com.clps.mms.sys.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

import com.clps.mms.sys.role_menu_function.model.RoleMenuFunc;
import com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService;
import com.clps.mms.util.common.AjaxReturnInfo;

/**
 * ClassName: RoleMenuFuncAction. Function: TODO ADD FUNCTION. date: 2017年1月19日
 * 下午3:36:09
 *
 * @author tony.tan
 * @version
 * 
 */
@Controller
public class RoleMenuFuncAction extends BaseAction {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "roleMenuFuncService")
	private IRoleMenuFuncService service;
	private Map<String, Object> resultMap;
	private String menuFuncIds;
	private Long roleId;
	private Long menuId;
    
	public String queryFuncByRoleId()throws Exception{
		Map<String,Object> map=new HashMap<>();
		map.put("roleId", roleId);
		map.put("menuId", menuId);
		List<Map<String,Object>> list=service.queryFuncByRoleId(map);
		JSONArray ja=new JSONArray(list);
		this.httpResponse.setContentType("text/html;charset=utf-8");
		PrintWriter pw=this.httpResponse.getWriter();
		pw.print(ja.toString());
		pw.flush();
		pw.close();
		return null;
	}
	public String queryMenuFuncIdByRoleId()throws Exception{
		AjaxReturnInfo ari=null;
		List<Long>queryMenuFuncIds=service.queryMenuFuncIdByRoleId(roleId);
		if (queryMenuFuncIds!=null) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("queryMenuFuncIds", queryMenuFuncIds);
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	public String queryMenuFuncByRoleId()throws Exception{
		List<Map<String,Object>> queryData=service.queryMenuFuncByRoleId(roleId);
		Map<String,List<Map<String,Object>>> map=new HashMap<>();
		for (Map<String, Object> map1 : queryData) {
			String menuName=map1.get("menuName").toString();
			map1.remove("menuName");
			if(!map.containsKey(menuName)){
			List<Map<String,Object>>sList=new ArrayList<>();
			sList.add(map1);
			map.put(menuName, sList);
			}else{
				List<Map<String,Object>>sList=map.get(menuName);
				sList.add(map1);
				map.remove(menuName);
				map.put(menuName, sList);
			}
		}
		System.out.println(map);
		this.httpResponse.setContentType("text/html;charset=utf-8");
		PrintWriter out=this.httpResponse.getWriter();
		JSONObject jo=new JSONObject(map);
		out.print(jo.toString());
		out.flush();
		out.close();
		return null;
	}
	/*public String queryMenuFuncByRoleId()throws Exception{
		List<Map<String,Object>> list=service.queryMenuFuncByRoleId(roleId);
		Set<Map<String,Object>> level2=new HashSet<>();
		Map<String,List<Map<String,Object>>> level3Map=new HashMap<>();
		System.out.println(list);
		for (Map<String,Object> map : list) {
			String menuName=map.get("menuName").toString();
			String menuId=map.get("menuId").toString();
			String funcName=map.get("funcName").toString();
			if(!level3Map.containsKey(menuId)){
				List<Map<String,Object>>t1List=new ArrayList<>();
				Map<String,Object> t1Map=new HashMap<>();
				t1Map.put("text", funcName);
				t1List.add(t1Map);
				level3Map.put(menuId, t1List);
				}else{
					List<Map<String,Object>>t2List=level3Map.get(menuId);
					Map<String,Object> t2Map=new HashMap<>();
					t2Map.put("text", funcName);
					t2List.add(t2Map);
					level3Map.remove(menuId);
					level3Map.put(menuId, t2List);
				}
			Map<String,Object> t3Map=new HashMap<>();
			t3Map.put("id", menuId);
			t3Map.put("text", menuName);
			level2.add(t3Map);
		}
		System.out.println("l2:"+level2);
		System.out.println(level3Map);
		Map<String, Object> respMap=new HashMap<>();
		respMap.put("l2", level2);
		respMap.put("l3", level3Map);
		this.httpResponse.setContentType("text/html;charset=utf-8");
		PrintWriter out=this.httpResponse.getWriter();
		JSONObject jo=new JSONObject(respMap);
		out.print(jo.toString());
		out.flush();
		out.close();
		return null;
	}*/
	public String saveOrUpdate() throws Exception {
		AjaxReturnInfo ari = null;
		List<RoleMenuFunc> list = new ArrayList<>();
		System.out.println("id:" + menuFuncIds);
		System.out.println("id:" + roleId);
		List<Long> updateIdList = new ArrayList<>();
		// 解析前台的json数据
		JSONArray ja = new JSONArray(menuFuncIds);
		for (int i = 0; i < ja.length(); i++) {
			String s = ja.get(i).toString();
			Long menuFuncId = Long.parseLong(s);
			updateIdList.add(menuFuncId);
		}
		List<Long> queryList = service.queryMenuFuncIdByRoleId(roleId);
		// 前台没有传值做删除
		List<Long> deleteList = new ArrayList<>();
		deleteList.addAll(queryList);
		deleteList.removeAll(updateIdList);
		if (deleteList != null) {
			for (Long long1 : deleteList) {
				RoleMenuFunc roleMenuFunc = new RoleMenuFunc();
				roleMenuFunc.setRole_id(roleId);
				roleMenuFunc.setMenuFunc_id(long1);
				roleMenuFunc.setIsEnable(0);
				list.add(roleMenuFunc);
			}
		}
		updateIdList.removeAll(queryList);
		if (updateIdList != null) {
			for (Long long1 : updateIdList) {
				RoleMenuFunc roleMenuFunc = new RoleMenuFunc();
				roleMenuFunc.setRole_id(roleId);
				roleMenuFunc.setMenuFunc_id(long1);
				roleMenuFunc.setIsEnable(1);
				list.add(roleMenuFunc);
			}
		}
		if (service.saveOrUpdate(list) > 0) {
			ari = AjaxReturnInfo.success("成功");
		} else {
			ari = AjaxReturnInfo.failed("失败");
		}
		resultMap = ari.getReturnMap();
		return "json";
	}

	public String getMenuFuncIds() {
		return menuFuncIds;
	}

	public void setMenuFuncIds(String menuFuncIds) {
		this.menuFuncIds = menuFuncIds;
	}
    
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

}
