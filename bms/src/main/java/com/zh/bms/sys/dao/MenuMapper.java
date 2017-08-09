
package com.zh.bms.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.sys.entity.Menu;

/**
 * 
 * date: 2017年2月28日 下午3:57:30 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("menuDao")
public interface MenuMapper {
public List<Menu> queryAll() throws Exception;
public List<Menu> queryLst(Map<String,Object> map) throws Exception;
public Integer queryCount(Map<String,Object> map) throws Exception;
public Menu queryById(Long id)throws Exception;
public Menu queryByName(String name)throws Exception;
public boolean insert(Menu menu)throws Exception;
public boolean update(Menu menu)throws Exception;
public boolean delete(Long id)throws Exception;
}

