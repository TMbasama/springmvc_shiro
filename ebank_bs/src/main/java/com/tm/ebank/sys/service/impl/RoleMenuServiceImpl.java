
package com.tm.ebank.sys.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.RoleMenu;
import com.tm.ebank.sys.service.RoleMenuService;

/**
 * 
 * date: 2017年4月5日 上午10:10:14 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class RoleMenuServiceImpl extends BaseService implements RoleMenuService{

	@Override
	public List<RoleMenu> queryByRoleId(Long roleId) throws Exception {
		
		
		return (List<RoleMenu>) dao.selectList("role_menu.queryByRoleId", roleId);
	}

	@Override
	public List<Long> queryMenuIdsByRoleId(Long roleId) throws Exception {
		
		
		return (List<Long>) dao.selectList("role_menu.queryMenuIdsByRoleId", roleId);
	}

	@Override
	public List<Menu> queryMenuByRoleId(Long roleId) throws Exception {
		
		
		return (List<Menu>) dao.selectList("role_menu.queryMenuByRoleId", roleId);
	}

	@Override
	public Integer insert(List<RoleMenu> list) throws Exception {
		
		
		return dao.insert("role_menu.insert", list);
	}

	@Override
	public Integer deleteByMenuId(List<Long> menuId) throws Exception {
		
		
		return dao.delete("role_menu.deleteByMenuId", menuId);
	}

}

