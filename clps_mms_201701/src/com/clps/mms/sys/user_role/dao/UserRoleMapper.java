
package com.clps.mms.sys.user_role.dao;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.user_role.model.UserRole;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: UserRoleMapper.
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月8日 上午10:39:32 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("userRoleDao")
public interface UserRoleMapper {
	/**
	 * 
	 * insertUserRole:(这里用一句话描述这个方法的作用). 
	 * @param userRole
	 * @return
	 * @throws DataAccessException
	 */
public boolean insertUserRole(UserRole userRole)throws DataAccessException;
public Role queryRoleByUserId(Long userId)throws DataAccessException;
public UserRole queryUserRoleByUserId(Long userId)throws DataAccessException;
public boolean deleteUserRoleByUserId(Long userId)throws DataAccessException;
}

