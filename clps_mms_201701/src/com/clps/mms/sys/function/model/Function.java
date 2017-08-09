
package com.clps.mms.sys.function.model;

import java.io.Serializable;

/**
 * ClassName: Function. Function: TODO ADD FUNCTION. date: 2017年1月16日
 * 下午2:11:54
 *
 * @author tony.tan
 * @version
 * 
 */
public class Function implements Serializable {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String createDate;
	private String createName;
	private String updateDate;
	private String updateName;
	private Integer isEnable;
	
    
	public Function() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	public Function(Long id, String name, String createDate, String createName, String updateDate, String updateName,
			Integer isEnable) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
		this.createName = createName;
		this.updateDate = updateDate;
		this.updateName = updateName;
		this.isEnable = isEnable;
	}
    
	public Function(String name, String createDate, String createName, String updateDate, String updateName,
			Integer isEnable) {
		super();
		this.name = name;
		this.createDate = createDate;
		this.createName = createName;
		this.updateDate = updateDate;
		this.updateName = updateName;
		this.isEnable = isEnable;
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

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	@Override
	public String toString() {
		return "Function [id=" + id + ", name=" + name + ", createDate=" + createDate + ", createName=" + createName
				+ ", updateDate=" + updateDate + ", updateName=" + updateName + ", isEnable=" + isEnable + "]";
	}
	

}
