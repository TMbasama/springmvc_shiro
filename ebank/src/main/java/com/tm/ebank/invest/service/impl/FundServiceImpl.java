
package com.tm.ebank.invest.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.service.FundService;
@Service
@SuppressWarnings("unchecked")
public class FundServiceImpl extends BaseService implements FundService{

	@Override
	public FundProd queryById(Long id) throws Exception {
		
		
		return (FundProd) dao.selectOne("fund.queryById", id);
	}

	@Override
	public FundProd queryByName(String name) throws Exception {
		
		
		return (FundProd) dao.selectOne("fund.queryByName", name);
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("fund.queryCount", map);
	}

	@Override
	public List<FundProd> queryLst(Map<String, Object> map) throws Exception {
		
		
		return (List<FundProd>) dao.selectList("fund.queryLst", map);
	}

	@Override
	public Integer insert(FundProd fund) throws Exception {
		
		
		return dao.insert("fund.insert", fund);
	}

	@Override
	public Integer update(FundProd fund) throws Exception {
		
		
		return dao.update("fund.update", fund);
	}

	@Override
	public Integer delete(Long id) throws Exception {
		
		
		return dao.update("fund", id);
	}

}

