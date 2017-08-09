
package com.tm.ebank.account.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.account.entity.ExpeRecord;

/**
 * 
 * date: 2017年5月1日 上午11:36:52 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface ExpeRecordService {
public List<ExpeRecord> queryLstByAcctId(Map<String,Object> map)throws Exception;
public Integer queryCountByAcctId(Map<String,Object> map)throws Exception;
public List<ExpeRecord> queryLstByUserId(Map<String,Object> map)throws Exception;
public Integer queryCountByUserId(Map<String,Object> map)throws Exception;
public Integer insert(ExpeRecord expeRecord)throws Exception;
}

