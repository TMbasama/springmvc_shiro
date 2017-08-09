
package com.tm.ebank.creditcard.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.creditcard.entity.ApplyInfo;
import com.tm.ebank.creditcard.service.CreditCardService;

/**
 * 
 * 
 * date: 2017年4月27日 下午2:09:26 
 *
 * @author tony.tan
 * @version 
 *
 */
@Service
public class CreditCardServiceImpl extends BaseService implements CreditCardService{

	@Override
	public ApplyInfo queryById(Long id) throws Exception {
		
		
		return (ApplyInfo) dao.selectOne("creditcard.queryById", id);
	}
	@Override
	public ApplyInfo queryByUserId(Long id) throws Exception {
		
		
		return (ApplyInfo) dao.selectOne("creditcard.queryByUserId", id);
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("creditcard.queryCount", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ApplyInfo> queryLst(Map<String, Object> map) throws Exception {
		
		
		return (List<ApplyInfo>) dao.selectList("creditcard.queryLst", map);
	}

	@Override
	public Integer insert(ApplyInfo applyInfo) throws Exception {
		
		
		return dao.insert("creditcard.insert", applyInfo);
	}

	@Override
	public Integer review(ApplyInfo applyInfo) throws Exception {
		
		
		return dao.update("creditcard.review", applyInfo);
	}

	@Override
	public Integer delete(Long id) throws Exception {
		
		
		return null;
	}

	@Override
	public Integer applyCard(ApplyInfo applyInfo) throws Exception {
		
		
		return dao.insert("creditcard.applyCard", applyInfo);
	}
	@Override
	public Integer applyLoss(Long user_id) throws Exception {
		
		
		return dao.update("creditcard.applyLoss", user_id);
	}



}

