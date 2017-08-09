/**
 * Project Name:clps_mms_copyright_201610
 * File Name:LogModel.java
 * Package Name:com.clps.mms.log.model
 * Date:2016年10月19日下午1:43:55
 * Copyright (c) 2016, tmbasama@163.com All Rights Reserved.
 *
*/

package com.clps.mms.log.sys.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName:LogModel Function: TODO ADD FUNCTION. Reason: TODO ADD REASON.
 * Date: 2016年10月19日 下午1:43:55
 * 
 * @author tony.tan
 * 
 */
public class LogModel implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Integer type;//1 add 2 update 3 delete
	private String content;
	private String operateMenu;//操作的菜单
	private String operateName;//操作的名字
	private String resourceName;//操作的资源
	private String createName;//日志创建人
	private String createDate;
	private String remark;

	public LogModel() {

		super();
		// TODO Auto-generated constructor stub
	}

   

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

    
	public String getOperateMenu() {
		return operateMenu;
	}



	public void setOperateMenu(String operateMenu) {
		this.operateMenu = operateMenu;
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

   

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

   

	public String getResourceName() {
		return resourceName;
	}



	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}



	public String getOperateName() {
		return operateName;
	}



	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}



	@Override
	public String toString() {
		return "LogModel [id=" + id + ", type=" + type + ", content=" + content + ", operateMenu=" + operateMenu
				+ ", operateName=" + operateName + ", resourceName=" + resourceName + ", createName=" + createName
				+ ", createDate=" + createDate + ", remark=" + remark + "]";
	}







    
    
}
