
package com.tm.ebank.account.service.Impl;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.user.service.PasswordHelper;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年4月30日 上午11:52:12 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class AccountServiceImplTest extends BaseTest{
	@Autowired
	private AccountService service;

	/**
	 * @throws java.lang.Exception
	 * 
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 * 
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#queryByAcctId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByAcctId() throws Exception {
		AccountInfo dbInfo=service.queryByAcctId(666666L);
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#queryCount(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryCount() throws Exception {
		PageVo<AccountInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryCount(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#queryLst(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<AccountInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryLst(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#insert(com.tm.ebank.account.entity.AccountInfo)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String time=DateUntil.format(new Date());
		AccountInfo accountInfo=new AccountInfo(null, 666666L, "123456", "", "tan", "360122199906166666", "18888888888", "tmbasama@163.com", "龙卡", "人民币",20000D, 1, 1, 1, 1, 1, time, "tan", time, "tan");
		service.insert(accountInfo);
	}

	@Test
	public void testVerifyPwd() throws Exception {
		AccountInfo info=new AccountInfo();
		info.setAcct_id(666666L);
		info.setAcct_pwd("123456");
		System.out.println(service.verifyPwd(info));
	}
	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#update(com.tm.ebank.account.entity.AccountInfo)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.AccountServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(666666L);
	}

}

