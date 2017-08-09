
package com.tm.ebank.common.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.tm.ebank.sys.entity.Menu;


/**
 * 
 * date: 2017年3月1日 下午1:31:50 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class MenuTree extends Tree<Menu>{
	public MenuTree() {
		
	}
	public MenuTree(List<Menu> dataList) {
		super.nodeList = new HashMap<>();
		// 根据结果集构造节点列表（存入散列表）
		for (Iterator<Menu> it = dataList.iterator(); it.hasNext();) {
			Menu menu = (Menu)it.next();
			Node node = new Node();
			node.setId(menu.getId());
			node.setText(menu.getName());
			node.setParentId(menu.getParentId());
			node.setUrl(menu.getUrl());
			super.nodeList.put(node.getId(), node);
			if (menu.getParentId()==0) {
				super.root=node;
			}
		}
	}

	
	

}

