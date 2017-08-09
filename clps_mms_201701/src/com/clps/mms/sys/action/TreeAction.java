package com.clps.mms.sys.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.sys.menu.service.IMenuService;
import com.clps.mms.sys.tree.IMenuToTree;
import com.clps.mms.sys.tree.ITreeModel;
import com.clps.mms.sys.tree.impl.LigerUiMenuToTree;
import com.clps.mms.util.exception.MenuServiceException;

@Controller
public class TreeAction extends BaseAction {
	/**
	 * Id
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private IMenuService menuService;

	public void getTreeJson() throws IOException, MenuServiceException {
		httpResponse = ServletActionContext.getResponse();
		httpResponse.setContentType("text/json;charset=utf-8");
		PrintWriter out = httpResponse.getWriter();
		String json = null;
		StringBuffer stringBuffer = new StringBuffer();
		IMenuToTree iToTree = new LigerUiMenuToTree();
		List<ITreeModel> treeList = new ArrayList<>();
		List<Menu> menuList = menuService.getOrgList();// 获得组织好数据的Menu
		Iterator<Menu> iteratorm = menuList.iterator();
		while (iteratorm.hasNext()) {
			Menu menu = iteratorm.next();
			ITreeModel tree = iToTree.menuToTree(menu);
			stringBuffer.append(tree.toTreeJson()).append(",");

		}
		if (stringBuffer.length() > 0) {
			json = "["+String.valueOf(stringBuffer.substring(0, stringBuffer.length()-1))+"]";
		}
		out.print(json);
		out.flush();
		out.close();
	}


}
