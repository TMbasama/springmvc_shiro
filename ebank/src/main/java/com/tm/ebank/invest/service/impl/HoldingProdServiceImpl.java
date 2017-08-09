
package com.tm.ebank.invest.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.invest.entity.HoldingProd;
import com.tm.ebank.invest.service.HoldingProdService;

/**
 * 
 * date: 2017年4月29日 上午11:13:03 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
public class HoldingProdServiceImpl extends BaseService implements HoldingProdService{

	@Override
	public Integer buyProd(HoldingProd holdingProd) throws Exception {
		
		
		return dao.insert("holding.buyProd", holdingProd);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoldingProd> queryHoldingLstByAcctId(Map<String,Object> map) throws Exception {
		
		
		return (List<HoldingProd>) dao.selectList("holding.queryHoldingLstByAcctId", map);
	}

	@Override
	public Integer queryHoldingCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("holding.queryHoldingCount", map);
	}

}

