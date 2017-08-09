
package com.zh.bms.test.tree;
/** 
* 节点类 
*/  
public class Node {  
 /** 
  * 节点编号 
  */  
 public Long id;  
 /** 
  * 节点内容 
  */  
 public String text;  
 /** 
  * 父节点编号 
  */  
 public Long parentId;  
 /** 
  * 孩子节点列表 
  */  
 private Children children = new Children(); 
 
 
 
   
 public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public Long getParentId() {
	return parentId;
}

public void setParentId(Long parentId) {
	this.parentId = parentId;
}

public Children getChildren() {
	return children;
}

public void setChildren(Children children) {
	this.children = children;
}

// 先序遍历，拼接JSON字符串  
 public String toString() {    
  String result = "{"  
   + "id : '" + id + "'"  
   + ", text : '" + text + "'";  
    
  if (children != null && children.getSize() != 0) {  
   result += ", children : " + children.toString();  
  } else {  
   result += ", leaf : true";  
  }  
      
  return result + "}";  
 }  
   
 // 兄弟节点横向排序  
 public void sortChildren() {  
  if (children != null && children.getSize() != 0) {  
   children.sortChildren();  
  }  
 }  
   
 // 添加孩子节点  
 public void addChild(Node node) {  
  this.children.addChild(node);  
 }  
}  
  
