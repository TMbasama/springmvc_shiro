
package com.clps.mms.sys.user_role.service;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.user_role.model.UserRole;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: IUserRoleService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月8日 上午11:20:11 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IUserRoleService {
	public boolean insertUserRole(UserRole userRole,String manager)throws Exception;
	public Role queryRoleByUserId(Long userId)throws Exception;
	public UserRole queryUserRoleByUserId(Long userId)throws Exception;
	public boolean deleteUserRoleByUserId(Long userId)throws Exception;
}

