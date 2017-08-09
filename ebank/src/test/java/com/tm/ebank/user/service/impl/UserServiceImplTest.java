
package com.tm.ebank.user.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.entity.UserAcct;
import com.tm.ebank.user.service.UserService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年4月30日 下午1:12:03 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class UserServiceImplTest extends BaseTest{
@Autowired	
private UserService service;
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
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#queryByName(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByName() throws Exception {
		service.queryByName("admin");
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#queryCount(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryCount() throws Exception {
		PageVo<User> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryCount(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#queryLst(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<User> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryLst(map);
	}
	@Test
	public void testQueryAcctCount() throws Exception {
		PageVo<AccountInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("id", 1L);
		service.queryAcctCount(map);
	}
	@Test
	public void testQueryAcctLst() throws Exception {
		PageVo<AccountInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("id", 1L);
		service.queryAcctLst(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#insert(com.tm.ebank.user.entity.User)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String time=DateUntil.format(new Date());
		User user=new User(null, "tony", "666666", "", "谈铭", "360122199906166666", 1, "18888888888", "tmbasama@163.com", 23, time, time, "admin", time, "admin", null, 1);
		service.insert(user);
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#update(com.tm.ebank.user.entity.User)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}
	@Test
	public void testaddAccount() throws Exception {
		UserAcct userAcct=new UserAcct(1L, 666666L);
		service.addAccount(userAcct);
	}

	/**
	 * Test method for {@link com.tm.ebank.user.service.impl.UserServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(2L);
	}

}

