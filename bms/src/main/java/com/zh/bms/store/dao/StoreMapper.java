
package com.zh.bms.store.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.store.entity.Store;

/**
 * 
 * date: 2017年3月13日 下午2:32:56 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("storeDao")
public interface StoreMapper {
	public Store queryById(Long id)throws Exception;
	public Integer queryCount(Map<String,Object> map)throws Exception;
	public List<Store> queryLst(Map<String,Object> map)throws Exception;
	public List<Store> queryAll()throws Exception;
	public boolean insert(Store store)throws Exception;
	public boolean update(Store store)throws Exception;
	public boolean delete(Long id)throws Exception;
}

