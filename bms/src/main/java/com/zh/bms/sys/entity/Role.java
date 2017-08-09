
package com.zh.bms.sys.entity;
/**
 * 
 * date: 2017年3月20日 下午3:55:58 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class Role {
private Long id;
private String name;
private String description;
private String createName;
private String createDate;
private String updateName;
private String updateDate;
private int status;


public Role() {
	
	super();
	
}
public Role(Long id, String name, String description, String createName, String createDate, String updateName,
		String updateDate, int status) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.createName = createName;
	this.createDate = createDate;
	this.updateName = updateName;
	this.updateDate = updateDate;
	this.status = status;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCreateName() {
	return createName;
}
public void setCreateName(String createName) {
	this.createName = createName;
}
public String getCreateDate() {
	return createDate;
}
public void setCreateDate(String createDate) {
	this.createDate = createDate;
}
public String getUpdateName() {
	return updateName;
}
public void setUpdateName(String updateName) {
	this.updateName = updateName;
}
public String getUpdateDate() {
	return updateDate;
}
public void setUpdateDate(String updateDate) {
	this.updateDate = updateDate;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "Role [id=" + id + ", name=" + name + ", description=" + description + ", createName=" + createName
			+ ", createDate=" + createDate + ", updateName=" + updateName + ", updateDate=" + updateDate + ", status="
			+ status + "]";
}

}

