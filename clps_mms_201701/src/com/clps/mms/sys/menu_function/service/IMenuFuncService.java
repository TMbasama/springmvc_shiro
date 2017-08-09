
package com.clps.mms.sys.menu_function.service;

import java.util.List;
import java.util.Map;

import com.clps.mms.sys.menu_function.model.MenuFunction;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: IMenuPermService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月17日 下午2:16:13 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IMenuFuncService {
	public List<MenuFunction> queryMenuFuncByMenuId(Long id)throws DataAccessException;
	public List<Long> queryFuncIdByMenuId(Long id)throws DataAccessException;
	public List<Map<String,Object>> queryAll()throws DataAccessException;
	public Integer insertMenuFunc(List<MenuFunction> list)throws DataAccessException;
}

