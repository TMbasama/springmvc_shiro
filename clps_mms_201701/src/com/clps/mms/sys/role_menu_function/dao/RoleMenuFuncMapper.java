
package com.clps.mms.sys.role_menu_function.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.role_menu_function.model.RoleMenuFunc;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: RoleMenuFuncMapper.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月19日 下午2:59:24 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("roleMenuFuncDao")
public interface RoleMenuFuncMapper {
public Integer saveOrUpdate(List<RoleMenuFunc> list)throws DataAccessException;
public List<Map<String,Object>> queryMenuFuncByRoleId(Long id)throws DataAccessException;
public List<Long> queryMenuFuncIdByRoleId(Long id)throws DataAccessException;
public List<Map<String, Object>> queryFuncByRoleId(Map<String,Object> map)throws DataAccessException;
}

