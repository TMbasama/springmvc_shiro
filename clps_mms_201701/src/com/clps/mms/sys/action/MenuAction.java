package com.clps.mms.sys.action;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.sys.menu.service.IMenuService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DataTableHelper;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.common.AjaxReturnInfo;
import com.clps.mms.util.exception.MenuServiceException;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class MenuAction extends BaseAction implements ModelDriven<Menu> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource(name="menuService")
	private IMenuService menuservice;
	private Menu menu;
	private Map<String, Object> resultMap;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

	public String getMenuInfo() throws MenuServiceException {
		DataTableHelper<Menu> dataTableHelper = new DataTableHelper<>();
		PageVo<Menu> pageVo = dataTableHelper.getTableData(this.httpRequest);
		pageVo = menuservice.findMenuList(pageVo);
		resultMap = dataTableHelper.getReturnMap(pageVo);
		return "json";
	}

	public String findByName() throws MenuServiceException {
		AjaxReturnInfo ari = null;
		Menu tempMenu = menuservice.getMenuInfoByName(menu.getM_name());
		if (tempMenu != null) {
			ari = AjaxReturnInfo.success("failed，有相同的菜单名");
			ari.add("menu", tempMenu);
		} else {
			ari = AjaxReturnInfo.failed("无相同菜单名");
		}
		resultMap = ari.getReturnMap();
		System.out.println("------------------" + resultMap);
		return "json";
	}

	public String addMenuInfo() throws MenuServiceException {
		System.out.println("addmenu start");
		AjaxReturnInfo ari = null;
		String sName=this.session.get("username").toString();
		menu.setM_createName(sName);
		menu.setM_updateName(sName);
		menu.setM_createDate(DateFormat.format(new Date()));
		menu.setM_updateDate(DateFormat.format(new Date()));
		System.out.println(menu);
		if (menuservice.addMenuInfo(menu)) {
			ari = AjaxReturnInfo.success("成功");
		} else {
			ari = AjaxReturnInfo.failed("失败");
		}
		resultMap = ari.getReturnMap();
		return "input";
	}

	public String findById() throws MenuServiceException {
		System.out.println("findbyId start");
		AjaxReturnInfo ari = null;
		Menu tempMenu = menuservice.getMenuInfoById(menu.getM_id());
		System.out.println(tempMenu);
		if (tempMenu != null) {
			ari = AjaxReturnInfo.success("成功");
			ari.add("menu", tempMenu);
		} else {
			ari = AjaxReturnInfo.failed("失败");
		}
		resultMap = ari.getReturnMap();
		System.out.println(resultMap);
		return "json";
	}

	public String updateMenu() throws MenuServiceException {
		AjaxReturnInfo ari = null;
		System.out.println("menu:" + menu);
		String sName=this.session.get("username").toString();
		menu.setM_updateName(sName);
		if (menuservice.updateMenuInfoById(menu)) {
				ari = AjaxReturnInfo.success("成功");
			} else {
				ari = AjaxReturnInfo.failed("失败");
			}
		resultMap = ari.getReturnMap();
		return "input";
	}
	
	public String deleteMenu() throws MenuServiceException{
		System.out.println("del");
		AjaxReturnInfo ari=null;
		String sName=this.session.get("username").toString();
		if (menuservice.deleteMenuInfoById(menu.getM_id(),sName)) {
			ari=AjaxReturnInfo.success("成功");
		}else {
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	

	@Override
	public Menu getModel() {
		if (menu == null) {
			menu = new Menu();
		}
		return menu;
	}

}
