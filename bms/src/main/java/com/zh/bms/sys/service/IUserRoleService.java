
package com.zh.bms.sys.service;

import java.util.List;

import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.entity.Role;
import com.zh.bms.sys.entity.UserRole;

/**
 * 
 * date: 2017年3月22日 下午2:39:22 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IUserRoleService {
	public UserRole queryByUserId(Long userId)throws Exception;
	public Role queryRoleByUserId(Long userId)throws Exception;
	public List<Menu> queryMenuByUserId(Long userId)throws Exception;
	public boolean insert(UserRole userRole)throws Exception;
	public boolean deleteByUserId(Long userId)throws Exception;
}

