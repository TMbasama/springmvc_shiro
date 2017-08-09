
package com.tm.ebank.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.entity.UserRole;
import com.tm.ebank.sys.service.UserRoleService;

/**
 * 
 * date: 2017年4月5日 上午9:59:57 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class UserRoleServiceImpl extends BaseService implements UserRoleService{
	

	@Override
	public UserRole queryByUserId(Long userId) throws Exception {
		
		
		return (UserRole) dao.selectOne("user_role.queryByUserId", userId);
	}

	@Override
	public Role queryRoleByUserId(Long userId) throws Exception {
		
		
		return (Role) dao.selectOne("user_role.queryRoleByUserId", userId);
	}

	@Override
	public List<Menu> queryMenuByUserId(Long userId) throws Exception {
		
		
		return (List<Menu>) dao.selectList("user_role.queryMenuByUserId", userId);
	}

	@Override
	public int insert(UserRole userRole) throws Exception {
		
		
		return dao.insert("user_role.insert", userRole);
	}

	@Override
	public int deleteByUserId(Long userId) throws Exception {
		
		
		return dao.delete("user_role.deleteByUserId", userId);
	}

}

