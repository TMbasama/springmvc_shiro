
package com.zh.bms.sys.entity;

/**
 * 
 * date: 2017年3月21日 下午2:54:25
 *
 * @author tony.tan
 * @version
 * 
 */
public class RoleMenu {
	private Long role_id;
	private Long menu_id;

	public RoleMenu() {

		super();

	}

	public RoleMenu(Long role_id, Long menu_id) {
		super();
		this.role_id = role_id;
		this.menu_id = menu_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	@Override
	public String toString() {
		return "RoleMenu [role_id=" + role_id + ", menu_id=" + menu_id + "]";
	}

}
