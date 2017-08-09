
package com.zh.bms.common.tree;

import java.util.Comparator;

/**
 * 
 * 节点比较器 
 * date: 2017年3月1日 上午10:59:29 
 *
 * @author tony.tan
 * @version 
 * @param <T>
 * 
 */
@SuppressWarnings("rawtypes")
public class NodeIDComparator implements Comparator{

	 // 按照节点编号比较 
	@Override
	public int compare(Object o1, Object o2) {
		Long l1=((Node)o1).getId();
		Long l2=((Node)o2).getId();
		return (l1 < l2 ? -1 : (l1 == l2 ? 0 : 1));
	}




}

