
package com.tm.ebank.common.ztree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.tm.ebank.sys.entity.Menu;

/**
 * 
 * date: 2017年3月21日 上午10:56:43
 *
 * @author tony.tan
 * @version
 * 
 */
public class ZMenuTree extends Tree<Menu> {
     public ZMenuTree() {
		
	}

	public ZMenuTree(List<Menu> dataList) {
		super.nodeList = new HashMap<>();
		// 根据结果集构造节点列表（存入散列表）
		for (Iterator<Menu> it = dataList.iterator(); it.hasNext();) {
			Menu menu = (Menu)it.next();
			Node node = new Node();
			node.setId(menu.getId());
			node.setName(menu.getName());;
			node.setpId(menu.getParentId());
			node.setUrl(menu.getUrl());
			node.setChecked(menu.isChecked());
			super.nodeList.put(node.getId(), node);
			if (menu.getParentId()==0) {
				super.root=node;
			}
		}
	}

}
