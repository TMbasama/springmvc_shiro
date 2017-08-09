
package com.zh.bms.sys.service;

import java.util.List;
import java.util.Map;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.entity.Menu;

/**
 * 
 * date: 2017年2月28日 下午4:04:06 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IMenuService {
public List<Menu> queryAll() throws Exception;
public PageVo<Menu> queryLst(PageVo<Menu> pv) throws Exception;
public Menu queryById(Long id)throws Exception;
public Menu queryByName(String name)throws Exception;
public boolean insert(Menu menu)throws Exception;
public boolean update(Menu menu)throws Exception;
public boolean delete(Long id)throws Exception;
}

