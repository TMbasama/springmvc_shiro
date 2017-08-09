
package com.tm.ebank.common.ztree;

import java.util.LinkedList;
import java.util.List;


/**
 * 节点类 date: 2017年3月1日 上午10:42:07
 *
 * @author tony.tan
 * @version
 * 
 */
public class Node{
	private Long id;
	private Long pId;
	private String name;
	private String image;
	private String url;
	private Long orderId;
	private String status;
	private boolean open=true;
	private boolean checked=false;
	private boolean leaf=false;
	private List<Node> children=new LinkedList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	// 先序遍历，拼接JSON字符串
	/*public String toString() {
		String result = "{" + "id : '" + id + "'" + ", text : '" + text + "'"+",parentId:'"+parentId+"'";

		if (children != null && children.getSize() != 0) {
			result += ", children : " + children.toString();
		} else {
			result += ", leaf : true";
		}

		return result + "}";
	}*/
	
	 // 兄弟节点横向排序  
	/*public void sortChildren(){
		if (children!=null&&children.getSize()!=0) {
			children.sortChildren();
		}
	}*/

	
	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	// 添加孩子节点  
	public boolean addChild(Node node){
		return this.children.add(node);
	}

	@Override
	public String toString() {
		String result="Node [id=" + id + ", pId=" + pId + ", name=" + name + ", image=" + image + ", url=" + url + ", orderId="
				+ orderId + ", status=" + status + ", open=" + open ;
		if (children!=null&&children.size()!=0) {
			leaf=false;
			result +=", children=" + children+", leaf =false";
		}else {
			leaf=true;
			result += ", leaf =true";
		}
		return result+"]";
	}
	

}
