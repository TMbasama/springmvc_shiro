
package com.clps.mms.sys.user_role.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.log.sys.dao.LogMapper;
import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.user_role.dao.UserRoleMapper;
import com.clps.mms.sys.user_role.model.UserRole;
import com.clps.mms.sys.user_role.service.IUserRoleService;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.exception.DataAccessException;
import com.clps.mms.util.log.LogHelper;

/**
 * ClassName: UserRoleService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月8日 上午11:20:55 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("userRoleService")
public class UserRoleServiceImpl implements IUserRoleService{
	@Resource(name="userRoleDao")
    private UserRoleMapper userRoleDao;
	@Resource(name="logDao")
	private LogMapper logDao;
	
	public UserRoleServiceImpl() {
		
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.user_role.service.IUserRoleService#insertUserRole(com.clps.mms.sys.user_role.model.UserRole)
	 */
	@Override
	public boolean insertUserRole(UserRole userRole,String manager) throws Exception {
		
		 if(userRoleDao.insertUserRole(userRole)){
			 LogModel model=new LogModel();
			 model.setCreateName(manager);
			 model.setCreateDate(DateFormat.format(new Date()));
			 model.setOperateMenu("用户角色管理");
			 model.setResourceName("用户角色");
			 Map<String, Object> map=new HashMap<>();
			 map.put("userId", userRole.getUser_id());
			 map.put("roleId", userRole.getRole_id());
			 logDao.insert(LogHelper.getUpdateModel(model, map));
			 return true;
		 }
		 return false;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.user_role.service.IUserRoleService#queryRoleByUserId(java.lang.Long)
	 */
	@Override
	public Role queryRoleByUserId(Long userId) throws DataAccessException {
		
		// TODO Auto-generated method stub
		return userRoleDao.queryRoleByUserId(userId);
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.user_role.service.IUserRoleService#queryUserRoleByUserId(java.lang.Long)
	 */
	@Override
	public UserRole queryUserRoleByUserId(Long userId) throws Exception {
		
		// TODO Auto-generated method stub
		return userRoleDao.queryUserRoleByUserId(userId);
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.user_role.service.IUserRoleService#deleteUserRoleByUserId(java.lang.Long)
	 */
	@Override
	public boolean deleteUserRoleByUserId(Long userId) throws Exception {
		
		// TODO Auto-generated method stub
		return userRoleDao.deleteUserRoleByUserId(userId);
	}

}

