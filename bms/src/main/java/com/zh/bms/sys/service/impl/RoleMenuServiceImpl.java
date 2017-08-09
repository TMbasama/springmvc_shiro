
package com.zh.bms.sys.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.sys.dao.RoleMenuMapper;
import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.entity.RoleMenu;
import com.zh.bms.sys.service.IRoleMenuService;

/**
 * 
 * date: 2017年3月21日 下午3:21:40 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements IRoleMenuService{
	@Resource(name="roleMenuDao")
    private RoleMenuMapper roleMenuDao;
	@Override
	public List<RoleMenu> queryByRoleId(Long roleId) throws Exception {
		
		
		return roleMenuDao.queryByRoleId(roleId);
	}

	@Override
	public Integer insert(List<RoleMenu> list) throws Exception {
		
		
		return roleMenuDao.insert(list);
	}

	@Override
	public Integer deleteByMenuId(List<Long> menuId) throws Exception {
		
		
		return roleMenuDao.deleteByMenuId(menuId);
	}

	@Override
	public List<Long> queryMenuIdsByRoleId(Long roleId) throws Exception {
		
		
		return roleMenuDao.queryMenuIdsByRoleId(roleId);
	}

	@Override
	public List<Menu> queryMenuByRoleId(Long roleId) throws Exception {
		
		
		return roleMenuDao.queryMenuByRoleId(roleId);
	}

}

