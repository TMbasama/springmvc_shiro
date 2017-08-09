
package com.clps.mms.sys.menu_function.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.menu_function.model.MenuFunction;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: MenuFuncMapper.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月17日 下午2:02:17 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("menuFuncDao")
public interface MenuFuncMapper {
public List<MenuFunction> queryMenuFuncByMenuId(Long id)throws DataAccessException;
public List<Long> queryFuncIdByMenuId(Long id)throws DataAccessException;
public List<Map<String,Object>> queryAll()throws DataAccessException;
public Integer insertMenuFunc(List<MenuFunction> list)throws DataAccessException;
}

