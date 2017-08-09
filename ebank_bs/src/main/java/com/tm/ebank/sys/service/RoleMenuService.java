
package com.tm.ebank.sys.service;

import java.util.List;

import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.RoleMenu;

/**
 * 
 * date: 2017年3月21日 下午3:18:28 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface RoleMenuService {
	public List<RoleMenu> queryByRoleId(Long roleId)throws Exception;
	public List<Long> queryMenuIdsByRoleId(Long roleId)throws Exception;
	public List<Menu> queryMenuByRoleId(Long roleId)throws Exception;
	public Integer insert(List<RoleMenu> list)throws Exception;
	public Integer deleteByMenuId(List<Long> menuId)throws Exception;
}

