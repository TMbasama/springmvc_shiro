
package com.clps.mms.sys.user_role.model;
/**
 * ClassName: UserRole.
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月8日 上午10:12:21 
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
	// TODO Auto-generated constructor stub
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
public String toString() {
	return "UserRole [user_id=" + user_id + ", role_id=" + role_id + "]";
}


}

