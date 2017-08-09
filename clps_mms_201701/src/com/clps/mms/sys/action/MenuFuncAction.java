
package com.clps.mms.sys.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;

import com.clps.mms.sys.menu_function.model.MenuFunction;
import com.clps.mms.sys.menu_function.service.IMenuFuncService;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.common.AjaxReturnInfo;




/**
 * ClassName: MenuPermAction.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月17日 下午4:14:09 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Controller
public class MenuFuncAction extends BaseAction{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="menuFuncService")
	private IMenuFuncService service;
	private Long menuId;
	private String funcIds;
	private Map<String, Object> resultMap;
	
	public String queryAll()throws Exception{
		List<Map<String,Object>> queryData=service.queryAll();
		Map<String,List<Map<String,Object>>> map=new HashMap<>();
		for (Map<String, Object> map1 : queryData) {
			String menuName=map1.get("m_name").toString();
			map1.remove("m_name");
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
	public String queryByMenuId()throws Exception{
		AjaxReturnInfo ari=null;
		List<MenuFunction> list=service.queryMenuFuncByMenuId(menuId);
		if (list!=null) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("list", list);
		}else {
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	public String insertMenuFunc()throws Exception{
		System.out.println("funcIds:"+funcIds);
		AjaxReturnInfo ari=null;
		List<MenuFunction> list=new ArrayList<>();
		String userName=this.session.get("username").toString();
		String date=DateFormat.format(new Date());
		List<Long> updateIdList=new ArrayList<>();
		//解析前台的json数据
		JSONArray ja=new JSONArray(funcIds);
		for(int i=0;i<ja.length();i++){
			String s=ja.get(i).toString();
			Long permId=Long.parseLong(s);
			updateIdList.add(permId);
		}
		//查询原有功能Id
		List<Long> queryList=service.queryFuncIdByMenuId(menuId);
		//前台没有传值做删除
		List<Long> deleteList=new ArrayList<>();
		deleteList.addAll(queryList);
		deleteList.removeAll(updateIdList);
		System.out.println("deleteList:"+deleteList);
		updateIdList.removeAll(queryList);
		for (Long long1 : updateIdList) {
			MenuFunction mp=new MenuFunction();
			mp.setMenu_id(menuId);
			mp.setFunc_id(long1);
			mp.setCreateDate(date);
			mp.setCreateName(userName);
			mp.setUpdateDate(date);
			mp.setUpdateName(userName);
			mp.setIsEnable(1);
			list.add(mp);
		}
		for (Long long1 : deleteList) {
			MenuFunction mp=new MenuFunction();
			mp.setMenu_id(menuId);
			mp.setFunc_id(long1);
			mp.setCreateDate(date);
			mp.setCreateName(userName);
			mp.setUpdateDate(date);
			mp.setUpdateName(userName);
			mp.setIsEnable(0);
			list.add(mp);
		}
		System.out.println(list);
		if(service.insertMenuFunc(list)!=0){
			ari=AjaxReturnInfo.success("成功");
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	
	public String getFuncIds() {
		return funcIds;
	}
	public void setFuncIds(String funcIds) {
		this.funcIds = funcIds;
	}
	public Map<String, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	
}

