
package com.tm.ebank.invest.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.entity.HoldingProd;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.invest.service.HoldingProdService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年4月29日 上午11:28:12 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class HoldingProdServiceImplTest extends BaseTest{
@Autowired	
private HoldingProdService service;
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
	 * Test method for {@link com.tm.ebank.invest.service.impl.HoldingProdServiceImpl#buyProd(com.tm.ebank.invest.entity.HoldingProd)}.
	 * @throws Exception 
	 */
	@Test
	public void testBuyProd() throws Exception {
		String nowTime=DateUntil.format(new Date(), DateUntil.FORMAT_SHORT);
		HoldingProd holdingProd=new HoldingProd(null, 666666L, 1L, 20000L, 20000L, 2000D, nowTime, nowTime, nowTime, "tan", nowTime, "tan", 0);
		service.buyProd(holdingProd);
	}

	/**
	 * Test method for {@link com.tm.ebank.invest.service.impl.HoldingProdServiceImpl#queryByAcctId(java.util.Map)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByAcctId() throws Exception {
		PageVo<FundProd> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		map.put("acct_id", "666666");
		service.queryHoldingLstByAcctId(map);
	}

}

