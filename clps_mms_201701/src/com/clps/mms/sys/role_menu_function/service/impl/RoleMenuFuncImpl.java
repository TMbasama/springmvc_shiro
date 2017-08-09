
package com.clps.mms.sys.role_menu_function.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.sys.role_menu_function.dao.RoleMenuFuncMapper;
import com.clps.mms.sys.role_menu_function.model.RoleMenuFunc;
import com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService;

/**
 * ClassName: RoleMenuFuncImpl.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月19日 下午3:02:09 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("roleMenuFuncService")
public class RoleMenuFuncImpl implements IRoleMenuFuncService{
	@Resource(name="roleMenuFuncDao")
     private RoleMenuFuncMapper roleMenuFuncDao;
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService#saveOrUpdate(java.util.List)
	 */
	@Override
	public Integer saveOrUpdate(List<RoleMenuFunc> list) throws Exception {
		System.out.println("list:"+list);
		return roleMenuFuncDao.saveOrUpdate(list);
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService#queryMenuFuncIdByRoleId(java.lang.Long)
	 */
	@Override
	public List<Long> queryMenuFuncIdByRoleId(Long id) throws Exception {
		
		return roleMenuFuncDao.queryMenuFuncIdByRoleId(id);
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService#queryMenuFuncByRoleId(java.lang.Long)
	 */
	@Override
	public List<Map<String, Object>> queryMenuFuncByRoleId(Long id) throws Exception {
		
		// TODO Auto-generated method stub
		return roleMenuFuncDao.queryMenuFuncByRoleId(id);
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService#queryFuncByRoleId(java.util.Map)
	 */
	@Override
	public List<Map<String, Object>> queryFuncByRoleId(Map<String, Object> map) throws Exception {
		
		// TODO Auto-generated method stub
		return roleMenuFuncDao.queryFuncByRoleId(map);
	}

}

