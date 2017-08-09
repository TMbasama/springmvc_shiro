
package com.clps.mms.sys.role.model;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: Permission. Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON(可选). date: 2016年11月14日 下午5:27:03
 *
 * @author tony.tan
 * @version
 * 
 */
public class Role implements Serializable{
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;//职位的id
	private String name;//职位的名称
	private Long deptId;//对应部门表的id
	private String createDate;//创建时间
	private String createName;//创建人名
	private String updateDate;//更新时间
	private String updateName;//更新人名
	private String description;//职位描述
	private Integer isEnable;//是否可用

	public Role() {

		super();
		// TODO Auto-generated constructor stub
	}


	public Role(String name, Long deptId, String createDate, String createName, String updateDate,
			String updateName, String description) {
		super();
		this.name = name;
		this.deptId = deptId;
		this.createDate = createDate;
		this.createName = createName;
		this.updateDate = updateDate;
		this.updateName = updateName;
		this.description = description;
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

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
    
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", deptId=" + deptId + ", createDate=" + createDate
				+ ", createName=" + createName + ", updateDate=" + updateDate + ", updateName=" + updateName
				+ ", description=" + description + ", isEnable=" + isEnable + "]";
	}
    
	
   
}
