
package com.zh.bms.common.tree;

import java.util.LinkedList;
import java.util.List;

import org.codehaus.jackson.map.annotate.JsonSerialize;


/**
 * 节点类 date: 2017年3月1日 上午10:42:07
 *
 * @author tony.tan
 * @version
 * 
 */
public class Node{
	private Long id;
	private Long parentId;
	private String text;
	private String image;
	private String url;
	private Long orderId;
	private String status;
	@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
	private List<Node> children=new LinkedList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
		String result= "Node [id=" + id + ", parentId=" + parentId + ", text=" + text + ", image=" + image + ", url=" + url
				+ ", orderId=" + orderId  ;
		if (children!=null&&children.size()!=0) {
			result +=", children=" + children;
		}else {
			result += ", leaf =true";
		}
		return result+"]";
	}
}
