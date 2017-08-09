
package com.tm.ebank.invest.service.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.entity.HoldingFundProd;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.invest.service.HoldingFundProdService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年4月29日 下午7:14:22 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class HoldingFundProdServiceImplTest extends BaseTest{
	@Autowired
	private HoldingFundProdService service;

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
	 * Test method for {@link com.tm.ebank.invest.service.impl.HoldingFundProdServiceImpl#buyProd(com.tm.ebank.invest.entity.HoldingProd)}.
	 * @throws Exception 
	 */
	@Test
	public void testBuyProd() throws Exception {
		String nowTime=DateUntil.format(new Date(), DateUntil.FORMAT_SHORT);
		HoldingFundProd holdingFundProd=new HoldingFundProd(null, 666666L, 1L, 2000D, 30D, 2.3D, 2.6D, 300D, nowTime, nowTime, "tan", nowTime, "tan", 0);
		service.buyProd(holdingFundProd);
	}

	/**
	 * Test method for {@link com.tm.ebank.invest.service.impl.HoldingFundProdServiceImpl#queryHoldingLstByAcctId(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryHoldingLstByAcctId() throws Exception {
		PageVo<HoldingFundProd> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("acct_id", "666666");
		service.queryHoldingLstByAcctId(map);
	}

	/**
	 * Test method for {@link com.tm.ebank.invest.service.impl.HoldingFundProdServiceImpl#queryHoldingCount(java.util.Map)}.
	 */
	@Test
	public void testQueryHoldingCount() {
		fail("Not yet implemented");
	}

}

