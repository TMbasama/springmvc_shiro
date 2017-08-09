
package com.zh.bms.store.service;


import java.util.List;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.store.entity.Store;

/**
 * 
 * date: 2017年3月13日 下午2:54:00 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IStoreService {
	public Store queryById(Long id)throws Exception;
	public PageVo<Store> queryLst(PageVo<Store> pv)throws Exception;
	public List<Store> queryAll()throws Exception;
	public boolean insert(Store store)throws Exception;
	public boolean update(Store store)throws Exception;
	public boolean delete(Long id)throws Exception;
}

