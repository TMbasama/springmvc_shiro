
package com.zh.bms.store.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.store.dao.StoreMapper;
import com.zh.bms.store.entity.Store;
import com.zh.bms.store.service.IStoreService;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * 
 * @author fanny
 * @version 
 *
 */
@Service("storeService")
public class StoreServiceImpl implements IStoreService{
@Resource(name="storeDao")
private StoreMapper storeDao;
	@Override
	public Store queryById(Long id) throws Exception {
		
		
		return storeDao.queryById(id);
	}

	@Override
	public PageVo<Store> queryLst(PageVo<Store> pv) throws Exception {
		Map<String, Object> map=PageVoUtil.getMap(pv);
		List<Store> storeList=storeDao.queryLst(map);
		Integer count=storeDao.queryCount(map);
		pv.setList(storeList);
		pv.setAllcount(count.toString());
		return pv;
	}

	@Override
	public boolean insert(Store store) throws Exception {
		
		if (this.queryById(store.getId())==null) {
			return storeDao.insert(store);
		}
		return false;
	}

	@Override
	public boolean delete(Long id) throws Exception {
		
		
		return storeDao.delete(id);
	}

	@Override
	public boolean update(Store store) throws Exception {
		if (this.queryById(store.getId())!=null) {
			return storeDao.update(store);
		}
		
		return false;
	}

	@Override
	public List<Store> queryAll() throws Exception {
		
		
		return storeDao.queryAll();
	}

}

