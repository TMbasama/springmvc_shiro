
package com.tm.ebank.account.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.account.entity.ExpeRecord;
import com.tm.ebank.account.service.ExpeRecordService;
import com.tm.ebank.common.service.BaseService;

/**
 * 
 * date: 2017年5月1日 上午11:50:54 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class ExpeRecordServiceImpl extends BaseService implements ExpeRecordService{

	@Override
	public List<ExpeRecord> queryLstByAcctId(Map<String, Object> map) throws Exception {
		
		
		return (List<ExpeRecord>) dao.selectList("expeRecord.queryLstByAcctId", map);
	}

	@Override
	public Integer queryCountByAcctId(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("expeRecord.queryCountByAcctId", map);
	}

	@Override
	public Integer insert(ExpeRecord expeRecord) throws Exception {
		
		
		return dao.insert("expeRecord.insert", expeRecord);
	}

	@Override
	public List<ExpeRecord> queryLstByUserId(Map<String, Object> map) throws Exception {
		
		
		return (List<ExpeRecord>) dao.selectList("expeRecord.queryLstByUserId", map);
	}

	@Override
	public Integer queryCountByUserId(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("expeRecord.queryCountByUserId", map);
	}

}

