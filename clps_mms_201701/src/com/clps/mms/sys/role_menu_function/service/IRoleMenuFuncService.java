
package com.clps.mms.sys.role_menu_function.service;

import java.util.List;
import java.util.Map;

import com.clps.mms.sys.role_menu_function.model.RoleMenuFunc;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: IRoleMenuFuncService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月19日 下午3:01:18 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IRoleMenuFuncService {
	public Integer saveOrUpdate(List<RoleMenuFunc> list)throws Exception;
	public List<Long> queryMenuFuncIdByRoleId(Long id)throws Exception;
	public List<Map<String,Object>> queryMenuFuncByRoleId(Long id)throws Exception;
	public List<Map<String, Object>> queryFuncByRoleId(Map<String,Object> map)throws Exception;
}

