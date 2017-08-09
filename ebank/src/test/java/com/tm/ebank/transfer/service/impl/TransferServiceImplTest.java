
package com.tm.ebank.transfer.service.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.transfer.entity.TransferInfo;
import com.tm.ebank.transfer.service.TransferService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年5月12日 下午11:16:06 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class TransferServiceImplTest extends BaseTest{
@Autowired	
private TransferService service;
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
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryByAcctId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByAcctId() throws Exception {
		service.queryByAcctId(666666L);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#insert(com.tm.ebank.transfer.entity.TransferInfo)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String time=DateUntil.format(new Date());
		TransferInfo info=new TransferInfo(null,1L, 666666L, "谈铭", 88888888L, "fanny", 2000D, "tan", time, "tan", time, 1);
		service.insert(info);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryLst(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<TransferInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryLst(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryCount(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryCount() throws Exception {
		PageVo<TransferInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryCount(map);
	}
	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryLst(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryAcctLst() throws Exception {
		PageVo<TransferInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryAcctLst(map);
	}
	
	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#queryCount(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryAcctCount() throws Exception {
		PageVo<TransferInfo> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryAcctCount(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.transfer.service.impl.TransferServiceImpl#checkTransfer(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testCheckTransfer() throws Exception {
		service.checkTransfer(1L);
	}

}

