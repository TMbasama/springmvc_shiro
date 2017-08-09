
package com.tm.ebank.web.controller;

import java.util.Date;
import java.util.List;

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
import com.tm.ebank.sys.service.MenuService;
import com.tm.ebank.sys.service.UserRoleService;
import com.tm.ebank.util.DateUntil;

/**
 * 
 * date: 2017年3月1日 下午1:10:59
 *
 * @author tony.tan
 * @version
 * 
 */
@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController {
	@Autowired
	private MenuService menuService;
	@Autowired
    private UserRoleService userRoleService;
	@RequestMapping("/findByUserId")
	@ResponseBody
	public Object findByUserId(Long userId)throws Exception{
		List<Menu> dataList=userRoleService.queryMenuByUserId(userId);
		Menu menu=new Menu();
		menu.setId(1L);
		menu.setName("根节点");
		menu.setImage("sss");
		menu.setUrl("root");
		menu.setParentId(0L);
		dataList.add(menu);
		System.out.println("dddddddddddd"+dataList);
		Tree<Menu> menuTree = new ZMenuTree(dataList);
		List<Node> nodeList = menuTree.build();
		return JsonResponseUtils.createJsonResponse( true, "0000", "111", nodeList,null);
	}
	@RequestMapping("/view")
	@ResponseBody
	public Object view() throws Exception {
		List<Menu> dataList = menuService.queryAll();
		Tree<Menu> menuTree = new ZMenuTree(dataList);
		List<Node> nodeList = menuTree.build();
		System.out.println("nodeList:"+nodeList);
		//JSONArray ja=new JSONArray(nodeList);
		//System.out.println(ja.toString());
		return JsonResponseUtils.createJsonResponse( true, "0000", "111", nodeList,null);
	}
	@RequestMapping("/list")
	@ResponseBody
	public Object getLst(PageVo<Menu> pv)throws Exception{
		menuService.queryLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}
	@RequestMapping("findById")
	@ResponseBody
	public Object findById(@RequestParam("id")Long id)throws Exception{
		Menu menu=menuService.queryById(id);
		if(menu!=null){
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", menu, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/add")
	@ResponseBody
	public Object add(Menu menu)throws Exception{
		String nowDate=DateUntil.format(new Date());
		menu.setCreateDate(nowDate);
		menu.setCreateName("tan");
		menu.setUpdateDate(nowDate);
		menu.setUpdateName("tan");
		if (menuService.insert(menu)>0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Menu menu)throws Exception{
		String nowDate=DateUntil.format(new Date());
		menu.setUpdateDate(nowDate);
		menu.setUpdateName("tan");
		if(menuService.update(menu)>0){
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(@RequestParam("id")Long id)throws Exception{
		if(menuService.delete(id)>0){
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}

}
