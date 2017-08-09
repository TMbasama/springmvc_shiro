
package com.tm.ebank.transfer.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.transfer.entity.TransferInfo;
import com.tm.ebank.transfer.service.TransferService;

/**
 * 
 * date: 2017年5月12日 下午10:54:04 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class TransferServiceImpl extends BaseService implements TransferService{

	@Override
	public TransferInfo queryById(Long id) throws Exception {
		
		
		return (TransferInfo) dao.selectOne("trans.queryById", id);
	}

	@Override
	public TransferInfo queryByAcctId(Long acct_id) throws Exception {
		
		
		return (TransferInfo) dao.selectOne("trans.queryByAcctId", acct_id);
	}

	@Override
	public Integer insert(TransferInfo info) throws Exception {
		
		
		return dao.insert("trans.insert", info);
	}


	@Override
	public Integer delete(Long id) throws Exception {
		
		
		return dao.update("trans.delete", id);
	}

	@Override
	public List<TransferInfo> queryLst(Map<String, Object> map) throws Exception {
		
		
		return (List<TransferInfo>) dao.selectList("trans.queryLst", map);
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("trans.queryCount", map);
	}

	@Override
	public Integer checkTransfer(Long id) throws Exception {
		
		
		return dao.update("trans.checkTransfer", id);
	}

	@Override
	public List<TransferInfo> queryAcctLst(Map<String, Object> map) throws Exception {
		
		
		return (List<TransferInfo>) dao.selectList("trans.queryAcctLst", map);
	}

	@Override
	public Integer queryAcctCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("trans.queryAcctCount", map);
	}

}

