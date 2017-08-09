
package com.zh.bms.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.bms.common.controller.BaseController;
import com.zh.bms.common.tree.MenuTree;
import com.zh.bms.common.tree.Node;
import com.zh.bms.common.tree.Tree;
import com.zh.bms.common.util.JsonResponseUtils;
import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.service.IMenuService;
import com.zh.bms.sys.service.IUserRoleService;
import com.zh.bms.util.DateUntil;

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
	private IMenuService menuService;
	@Autowired
    private IUserRoleService userRoleService;
	/**
	 * 通过用户id查询他所有菜单
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/findByUserId")
	@ResponseBody
	public Object findByUserId(Long userId)throws Exception{
		List<Menu> dataList=userRoleService.queryMenuByUserId(userId);
		//虚拟化根节点
		Menu menu=new Menu();
		menu.setId(1L);
		menu.setName("根节点");
		menu.setImage("sss");
		menu.setUrl("root");
		menu.setParentId(0L);
		dataList.add(menu);
		System.out.println("dddddddddddd"+dataList);
		//构建菜单树形结构对象
		Tree<Menu> menuTree = new MenuTree(dataList);
		List<Node> nodeList = menuTree.build();
		return JsonResponseUtils.createJsonResponse( true, "0000", "111", nodeList,null);
	}
	@RequestMapping("/view")
	@ResponseBody
	public Object view() throws Exception {
		List<Menu> dataList = menuService.queryAll();
		Tree<Menu> menuTree = new MenuTree(dataList);
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
		String manager=(String) this.session.getAttribute("username");
		menu.setCreateDate(nowDate);
		menu.setCreateName(manager);
		menu.setUpdateDate(nowDate);
		menu.setUpdateName(manager);
		if (menuService.insert(menu)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/update")
	@ResponseBody
	public Object update(Menu menu)throws Exception{
		String nowDate=DateUntil.format(new Date());
		String manager=(String) this.session.getAttribute("username");
		menu.setUpdateDate(nowDate);
		menu.setUpdateName(manager);
		if(menuService.update(menu)){
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(@RequestParam("id")Long id)throws Exception{
		if(menuService.delete(id)){
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}

}
