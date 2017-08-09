
package com.clps.mms.sys.menu_function.model;

/**
 * ClassName: MenuFunction.
 * Function: TODO ADD FUNCTION. 
 * date: 2017年1月17日
 * 下午1:32:44
 *
 * @author tony.tan
 * @version
 * 
 */
public class MenuFunction {
	private Long menu_id;
	private Long func_id;
	private String createName;
	private String createDate;
	private String updateName;
	private String updateDate;
	private Integer isEnable;

	public MenuFunction() {

		super();
		// TODO Auto-generated constructor stub
	}



	public MenuFunction(Long menu_id, Long func_id, String createName, String createDate, String updateName,
			String updateDate, Integer isEnable) {
		super();
		this.menu_id = menu_id;
		this.func_id = func_id;
		this.createName = createName;
		this.createDate = createDate;
		this.updateName = updateName;
		this.updateDate = updateDate;
		this.isEnable = isEnable;
	}



	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	

	public Long getFunc_id() {
		return func_id;
	}



	public void setFunc_id(Long func_id) {
		this.func_id = func_id;
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



	public Integer getIsEnable() {
		return isEnable;
	}



	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}



	@Override
	public String toString() {
		return "MenuFunction [menu_id=" + menu_id + ", func_id=" + func_id + ", createName=" + createName
				+ ", createDate=" + createDate + ", updateName=" + updateName + ", updateDate=" + updateDate
				+ ", isEnable=" + isEnable + "]";
	}



	

}
