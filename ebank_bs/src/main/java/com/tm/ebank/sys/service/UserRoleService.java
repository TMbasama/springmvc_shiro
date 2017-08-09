
package com.tm.ebank.sys.service;

import java.util.List;

import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.entity.UserRole;

/**
 * 
 * date: 2017年3月22日 下午2:39:22 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface UserRoleService {
	public UserRole queryByUserId(Long userId)throws Exception;
	public Role queryRoleByUserId(Long userId)throws Exception;
	public List<Menu> queryMenuByUserId(Long userId)throws Exception;
	public int insert(UserRole userRole)throws Exception;
	public int deleteByUserId(Long userId)throws Exception;
}

