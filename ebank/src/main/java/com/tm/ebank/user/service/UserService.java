
package com.tm.ebank.user.service;


import java.util.List;
import java.util.Map;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.entity.UserAcct;

/**
 * 
 * date: 2017年3月30日 上午10:57:52 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface UserService {
	public User queryByName(String username)throws Exception;
	public User queryById(Long id)throws Exception;
	public Integer queryCount(Map<String,Object> map)throws Exception;
	public List<User> queryLst(Map<String,Object> map)throws Exception;
	public Integer queryAcctCount(Map<String,Object> map)throws Exception;
	public List<AccountInfo> queryAcctLst(Map<String,Object> map)throws Exception;
	public Integer insert(User user)throws Exception;
	public Integer update(User user)throws Exception;
	public Integer delete(Long id)throws Exception;
	public Integer addAccount(UserAcct userAcct)throws Exception;
}

