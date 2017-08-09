
package com.tm.ebank.user.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.entity.UserAcct;
import com.tm.ebank.user.service.PasswordHelper;
import com.tm.ebank.user.service.UserService;

/**
 * 
 * date: 2017年3月30日 上午10:58:32 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class UserServiceImpl extends BaseService implements UserService {
@Autowired	
private PasswordHelper passwordHelper;

@Override
public User queryByName(String username) throws Exception {
	
	return (User) dao.selectOne("user.queryByName",username);
}

@Override
public User queryById(Long id) throws Exception {
	
	
	return  (User) dao.selectOne("user.queryById", id);
}

@Override
public Integer queryCount(Map<String, Object> map) throws Exception {
	
	
	return (Integer) dao.selectOne("user.queryCount", map);
}

@Override
public List<User> queryLst(Map<String, Object> map) throws Exception {
	
	
	return (List<User>) dao.selectList("user.queryLst", map);
}

@Override
public Integer insert(User user) throws Exception {
	passwordHelper.encryptPassword(user);
	return dao.insert("user.insert", user);
}

@Override
public Integer update(User user) throws Exception {
	
	
	return null;
}

@Override
public Integer delete(Long id) throws Exception {
	
	
	return dao.delete("user.delete", id);
}

@Override
public Integer addAccount(UserAcct userAcct) throws Exception {
	
	
	return dao.insert("user.addAccount", userAcct);
}

@Override
public Integer queryAcctCount(Map<String, Object> map) throws Exception {
	
	
	return (Integer) dao.selectOne("user.queryAcctCount", map);
}

@Override
public List<AccountInfo> queryAcctLst(Map<String, Object> map) throws Exception {
	
	
	return (List<AccountInfo>) dao.selectList("user.queryAcctLst", map);
}

}

