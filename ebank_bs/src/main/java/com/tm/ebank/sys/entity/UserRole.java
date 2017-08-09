
package com.tm.ebank.sys.entity;

/**
 * 
 * date: 2017年3月22日 下午2:20:29
 *
 * @author tony.tan
 * @version
 * 
 */
public class UserRole {
	private Long user_id;
	private Long role_id;

	public UserRole() {

		super();

	}

	public UserRole(Long user_id, Long role_id) {
		super();
		this.user_id = user_id;
		this.role_id = role_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	@Override
	public boolean equals(Object o) {
		UserRole ur=(UserRole) o;
		if (ur.getRole_id()==this.role_id&&ur.getUser_id()==this.user_id) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "UserRole [user_id=" + user_id + ", role_id=" + role_id + "]";
	}

}
