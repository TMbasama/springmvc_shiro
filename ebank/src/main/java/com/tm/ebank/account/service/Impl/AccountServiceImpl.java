
package com.tm.ebank.account.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.user.service.PasswordHelper;

/**
 * 
 * date: 2017年4月30日 上午11:47:42 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
public class AccountServiceImpl extends BaseService implements AccountService{
@Autowired	
private PasswordHelper passwordHelper;
	@Override
	public AccountInfo queryByAcctId(Long acct_id) throws Exception {
		
		
		return (AccountInfo) dao.selectOne("acct.queryByAcctId", acct_id);
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) dao.selectOne("acct.queryCount", map);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountInfo> queryLst(Map<String, Object> map) throws Exception {
		
		
		return (List<AccountInfo>) dao.selectList("acct.queryLst", map);
	}

	@Override
	public Integer insert(AccountInfo accountInfo) throws Exception {
		
		
		return dao.insert("acct.insert", accountInfo);
	}

	@Override
	public Integer update(AccountInfo accountInfo) throws Exception {
		passwordHelper.encryptPassword(accountInfo);
		return dao.update("acct.update", accountInfo);
	}

	@Override
	public Integer delete(Long acct_id) throws Exception {
		
		
		return dao.update("acct.delete", acct_id);
	}

	@Override
	public boolean verifyPwd(AccountInfo info) throws Exception {
		AccountInfo dbInfo=this.queryByAcctId(info.getAcct_id());
		return passwordHelper.DecryptPassword(info, dbInfo);
	}

	@Override
	public Integer applyOnlineBank(Long acct_id) throws Exception {
		
		
		return dao.update("acct.applyOnlineBank", acct_id);
	}

	@Override
	public Integer applyMobileBank(Long acct_id) throws Exception {
		
		
		return dao.update("acct.applyMobileBank", acct_id);
	}

	@Override
	public Integer applyAccountPay(Long acct_id) throws Exception {
		
		
		return dao.update("acct.applyAccountPay", acct_id);
	}

	@Override
	public Integer updateBalance(AccountInfo accountInfo) throws Exception {
		
		
		return dao.update("acct.updateBalance", accountInfo);
	}

}

