
package com.tm.ebank.transfer.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.transfer.entity.TransferInfo;

/**
 * 
 * date: 2017年5月12日 下午10:42:50 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface TransferService {
public TransferInfo queryById(Long id)throws Exception;
public TransferInfo queryByAcctId(Long from_acct_id)throws Exception;
public Integer insert(TransferInfo info)throws Exception;
public Integer delete(Long id)throws Exception;
public List<TransferInfo> queryAcctLst(Map<String,Object> map)throws Exception;
public Integer queryAcctCount(Map<String,Object> map)throws Exception;
public List<TransferInfo> queryLst(Map<String,Object> map)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public Integer checkTransfer(Long id)throws Exception;
}

