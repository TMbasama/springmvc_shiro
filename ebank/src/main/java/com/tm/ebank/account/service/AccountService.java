
package com.tm.ebank.account.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.account.entity.AccountInfo;

/**
 * 
 * date: 2017年4月30日 上午11:41:52 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface AccountService {
public AccountInfo queryByAcctId(Long acct_id)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<AccountInfo> queryLst(Map<String,Object> map)throws Exception;
public boolean verifyPwd(AccountInfo info)throws Exception;
public Integer insert(AccountInfo accountInfo)throws Exception;
public Integer update(AccountInfo accountInfo)throws Exception;
public Integer delete(Long acct_id)throws Exception;
public Integer applyOnlineBank(Long acct_id)throws Exception;
public Integer applyMobileBank(Long acct_id)throws Exception;
public Integer applyAccountPay(Long acct_id)throws Exception;
public Integer updateBalance(AccountInfo accountInfo)throws Exception;
}

