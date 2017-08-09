
package com.zh.bms.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.bms.sys.dao.UserRoleMapper;
import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.entity.Role;
import com.zh.bms.sys.entity.UserRole;
import com.zh.bms.sys.service.IUserRoleService;

/**
 * 
 * date: 2017年3月22日 下午2:40:18 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements IUserRoleService{
	@Resource(name="userRoleDao")
	private UserRoleMapper userRoleDao;

	@Override
	public boolean insert(UserRole userRole) throws Exception {
		
		
		return userRoleDao.insert(userRole);
	}

	@Override
	public boolean deleteByUserId(Long userId) throws Exception {
		
		
		return userRoleDao.deleteByUserId(userId);
	}

	@Override
	public UserRole queryByUserId(Long userId) throws Exception {
		
		
		return userRoleDao.queryByUserId(userId);
	}

	@Override
	public Role queryRoleByUserId(Long userId) throws Exception {
		
		
		return userRoleDao.queryRoleByUserId(userId);
	}

	@Override
	public List<Menu> queryMenuByUserId(Long userId) throws Exception {
		
		
		return userRoleDao.queryMenuByUserId(userId);
	}

}

