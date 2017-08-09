package com.clps.mms.sys.tree.impl;

import org.apache.commons.lang.StringUtils;

import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.sys.tree.IMenuToTree;
import com.clps.mms.sys.tree.ITreeModel;

public class LigerUiMenuToTree implements IMenuToTree{
	
	public ITreeModel menuToTree(Menu menu){
		ITreeModel tree = new LigerUiTree();  

		tree.setId(String.valueOf(menu.getM_id()));
		tree.setName(menu.getM_name());
		if (!StringUtils.isEmpty(menu.getM_url())) {
			tree.setUrl(menu.getM_url());
		}
		if (!StringUtils.isEmpty(menu.getM_image())) {
			tree.setPic(menu.getM_image());
		}
		//递归遍历menu
		if(menu.getChildren() != null && menu.getChildren().size() > 0){
			//遍历每个子menu的children
			for(Menu child: menu.getChildren()){
				ITreeModel childTree = menuToTree(child);
				tree.addSubTree(childTree);  //组织好数据
			}
		}

		return tree;
	}
}
