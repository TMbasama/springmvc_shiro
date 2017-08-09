
package com.tm.ebank.account.service.Impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.entity.ExpeRecord;
import com.tm.ebank.account.service.ExpeRecordService;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年5月1日 上午11:54:07 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class ExpeRecordServiceImplTest extends BaseTest{
@Autowired
private ExpeRecordService service;
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
	 * Test method for {@link com.tm.ebank.account.service.Impl.ExpeRecordServiceImpl#queryLstByAcctId(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLstByAcctId() throws Exception {
		PageVo<ExpeRecord> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("acct_id", 666666D);
		service.queryLstByAcctId(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.ExpeRecordServiceImpl#queryCountByAcctId(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryCountByAcctId() throws Exception {
		PageVo<ExpeRecord> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("acct_id", 666666D);
		service.queryCountByAcctId(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.account.service.Impl.ExpeRecordServiceImpl#insert(com.tm.ebank.account.entity.ExpeRecord)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String time=DateUntil.format(new Date());
		String shortTime=DateUntil.format(new Date(), DateUntil.FORMAT_SHORT);
		ExpeRecord expeRecord=new ExpeRecord(null, 666666L, shortTime, time, 200D, 0D, 200000D, 10000L, "水费", "缴纳水费", 1);
		service.insert(expeRecord);
	}

}

