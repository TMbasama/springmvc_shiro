
package com.tm.ebank.sys.service.impl;


import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.sys.entity.User;
import com.tm.ebank.sys.service.UserService;

/**
 * 
 * date: 2017年3月30日 上午10:58:32 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

@Override
public User queryByName(String username) throws Exception {
	
	return (User) this.dao.selectOne("user.queryByName",username);
}

@Override
public User queryById(Long id) throws Exception {
	
	
	return null;
}

}

