
package com.tm.ebank.user.entity;
/**
 * 
 * date: 2017年4月30日 下午6:00:16 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class UserAcct {
private Long user_id;
private Long acct_id;

public UserAcct() {
	
	super();
	
}

public UserAcct(Long user_id, Long acct_id) {
	super();
	this.user_id = user_id;
	this.acct_id = acct_id;
}

public Long getUser_id() {
	return user_id;
}

public void setUser_id(Long user_id) {
	this.user_id = user_id;
}

public Long getAcct_id() {
	return acct_id;
}

public void setAcct_id(Long acct_id) {
	this.acct_id = acct_id;
}

@Override
public String toString() {
	return "UserAcct [user_id=" + user_id + ", acct_id=" + acct_id + "]";
}

}

