
package com.clps.mms.sys.role_menu_function.model;
/**
 * ClassName: RoleMenuFunc.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月19日 下午2:41:13 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class RoleMenuFunc {
	private Long role_id;
	private Long menuFunc_id;
	private Integer isEnable;
	public RoleMenuFunc() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	

	public RoleMenuFunc(Long role_id, Long menuFunc_id, Integer isEnable) {
		super();
		this.role_id = role_id;
		this.menuFunc_id = menuFunc_id;
		this.isEnable = isEnable;
	}


	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	

	public Long getMenuFunc_id() {
		return menuFunc_id;
	}


	public void setMenuFunc_id(Long menuFunc_id) {
		this.menuFunc_id = menuFunc_id;
	}


	public Integer getIsEnable() {
		return isEnable;
	}
	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}


	@Override
	public String toString() {
		return "RoleMenuFunc [role_id=" + role_id + ", menuFunc_id=" + menuFunc_id + ", isEnable=" + isEnable + "]";
	}
	
	

}

