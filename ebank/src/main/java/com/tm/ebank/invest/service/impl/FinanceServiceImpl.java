
package com.tm.ebank.invest.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.invest.entity.FinanceProd;
import com.tm.ebank.invest.service.FinanceService;
@Service
public class FinanceServiceImpl extends BaseService implements FinanceService{

	@Override
	public FinanceProd queryById(Long id) throws Exception {
		
		
		return (FinanceProd) dao.selectOne("fm.queryById", id);
	}

	@Override
	public FinanceProd queryByName(String name) throws Exception {
		
		
		return (FinanceProd) dao.selectOne("fm.queryByName", name);
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("fm.queryCount", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FinanceProd> queryLst(Map<String, Object> map) throws Exception {
		
		
		return (List<FinanceProd>) dao.selectList("fm.queryLst", map);
	}

	@Override
	public Integer insert(FinanceProd prod) throws Exception {
		
		
		return dao.insert("fm.insert", prod);
	}

	@Override
	public Integer update(FinanceProd prod) throws Exception {
		
		
		return dao.update("fm.update", prod);
	}

	@Override
	public Integer delete(Long id) throws Exception {
		
		
		return dao.update("fm.delete", id);
	}

}

