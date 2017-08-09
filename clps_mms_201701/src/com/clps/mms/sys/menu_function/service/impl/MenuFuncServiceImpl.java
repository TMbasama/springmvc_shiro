
package com.clps.mms.sys.menu_function.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.sys.menu_function.dao.MenuFuncMapper;
import com.clps.mms.sys.menu_function.model.MenuFunction;
import com.clps.mms.sys.menu_function.service.IMenuFuncService;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: MenuPermServiceImpl.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月17日 下午2:19:19 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("menuFuncService")
public class MenuFuncServiceImpl implements IMenuFuncService{
	@Resource(name="menuFuncDao")
    private MenuFuncMapper menuFuncDao;
	

	@Override
	public List<MenuFunction> queryMenuFuncByMenuId(Long id) throws DataAccessException {
		
		// TODO Auto-generated method stub
		return menuFuncDao.queryMenuFuncByMenuId(id);
	}

	@Override
	public Integer insertMenuFunc(List<MenuFunction> list) throws DataAccessException {
		System.out.println(list);
		return menuFuncDao.insertMenuFunc(list);
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.menu_function.service.IMenuFuncService#queryPermIdByMenuId(java.lang.Long)
	 */
	@Override
	public List<Long> queryFuncIdByMenuId(Long id) throws DataAccessException {
		
		// TODO Auto-generated method stub
		return menuFuncDao.queryFuncIdByMenuId(id);
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.menu_function.service.IMenuFuncService#queryAll()
	 */
	@Override
	public List<Map<String,Object>> queryAll() throws DataAccessException {
		
		// TODO Auto-generated method stub
		return menuFuncDao.queryAll();
	}


	



}

