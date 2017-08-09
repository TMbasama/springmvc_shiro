
package com.tm.ebank.invest.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.invest.entity.HoldingFundProd;
import com.tm.ebank.invest.entity.HoldingProd;
import com.tm.ebank.invest.service.HoldingFundProdService;

/**
 * 
 * date: 2017年4月29日 上午11:13:03 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
public class HoldingFundProdServiceImpl extends BaseService implements HoldingFundProdService{

	@Override
	public Integer buyProd(HoldingFundProd holdingFundProd) throws Exception {
		
		
		return dao.insert("holdingFund.buyProd", holdingFundProd);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoldingFundProd> queryHoldingLstByAcctId(Map<String,Object> map) throws Exception {
		
		
		return (List<HoldingFundProd>) dao.selectList("holdingFund.queryHoldingLstByAcctId", map);
	}

	@Override
	public Integer queryHoldingCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("holdingFund.queryHoldingCount", map);
	}

}

