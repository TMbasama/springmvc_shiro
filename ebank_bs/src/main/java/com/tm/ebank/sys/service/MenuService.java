
package com.tm.ebank.sys.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.Role;

/**
 * 
 * date: 2017年3月31日 上午10:10:49 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface MenuService {
	/**
	 * 查询所有菜单
	 * @param    
	 * @return
	 */
	public List<Menu> queryAll() throws Exception;
	/**
	 * 分页查询所有菜单
	 * @param    
	 * @return  
	 */
	public PageVo<Menu> queryLst(PageVo<Menu> pv) throws Exception;
	/**
	 * 查询菜单总数
	 * @param map
	 * @return
	 * @throws Exception
	 *
	 */
	public Integer queryCount(Map<String,Object> map) throws Exception;
	/**
	 * 根据id查询菜单
	 * @param id
	 * @return 
	 * @throws Exception
	 *
	 */
	public Menu queryById(Long id)throws Exception;
	/**
	 * 根据name查询菜单
	 * @param name
	 * @return
	 * @throws Exception
	 *
	 */
	public Menu queryByName(String name)throws Exception;
	/**
	 * 添加菜单
	 * @param menu
	 * @return
	 * @throws Exception
	 *
	 */
	public int insert(Menu menu)throws Exception;
	/**
	 * 更新菜单
	 * @param menu
	 * @return
	 * @throws Exception
	 *
	 */
	public int update(Menu menu)throws Exception;
	/**
	 * 删除菜单
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	public int delete(Long id)throws Exception;
}

