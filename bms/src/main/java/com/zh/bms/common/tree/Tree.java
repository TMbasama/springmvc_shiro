
package com.zh.bms.common.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.zh.bms.sys.entity.Menu;

/**
 * 
 * date: 2017年3月1日 上午11:07:00
 *
 * @author tony.tan
 * @version
 * 
 */
public abstract class Tree <T>{
	protected List<T> dataList = null;// 数据源
	protected Map<Long, Node> nodeList = null;// 节点列表（散列表，用于临时存储节点对象）
	protected Node root = null;// 根节点

	public Tree() {
		super();
	}

	public List<Node> build() {
		buildTree(root);
		List<Node> results = new ArrayList<>();
		results.add(root);
		return results;
	}

	private void buildTree(Node parent) {
		// 构造无序的多叉树
		for (Map.Entry<Long, Node> t : nodeList.entrySet()) {
			Node node = (Node) t.getValue();
			if (node.getParentId() == 0) {
				parent = node;
				System.out.println("11");
			} else {
				((Node) nodeList.get(node.getParentId())).addChild(node);
			}

		}
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	
}
