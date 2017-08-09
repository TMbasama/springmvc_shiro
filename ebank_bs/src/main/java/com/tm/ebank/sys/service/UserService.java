
package com.tm.ebank.sys.service;


import com.tm.ebank.sys.entity.User;

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
}

