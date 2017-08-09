
package com.zh.bms.sys.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.entity.RoleMenu;

/**
 * 
 * date: 2017年3月21日 下午3:11:20 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("roleMenuDao")
public interface RoleMenuMapper {
public List<RoleMenu> queryByRoleId(Long roleId)throws Exception;
public List<Long> queryMenuIdsByRoleId(Long roleId)throws Exception;
public List<Menu> queryMenuByRoleId(Long roleId)throws Exception;
public Integer insert(List<RoleMenu> list)throws Exception;
public Integer deleteByMenuId(List<Long> menuId)throws Exception;
}

