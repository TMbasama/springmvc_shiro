
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
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.invest.service.FundService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

public class FundServiceImplTest extends BaseTest{
	@Autowired
    private FundService service;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	@Test
	public void testQueryByName() throws Exception {
		service.queryByName("嘉实沪港深精选");
	}

	@Test
	public void testQueryCount() throws Exception {
		PageVo<FundProd> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryCount(map);
	}

	@Test
	public void testQueryLst() throws Exception {
		PageVo<FundProd> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		Map<String,Object> map=PageVoUtil.getMap(pv);
		service.queryLst(map);
	}

	@Test
	public void testInsert() throws Exception {
		String nowDate=DateUntil.format(new Date(), DateUntil.FORMAT_SHORT);
		//Fund fund=new Fund(null, "嘉实沪港深精选", "001878", 1, "人民币", 1.3770, nowDate, 0.51, 5.52, 18.60, 21.43, 23.2, 1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "华宝海外", "001878", 1, "人民币", 1.3770, nowDate, 0.51, 5.52, 18.60, 21.43, 23.2, 1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "博时行业轮动", "001878", 1, "人民币", 1.1321, nowDate, 0.26, 5.68, 16.95, 10.35, 32.57, 1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "国泰互联网加", "001542", 1, "人民币", 1.4880, nowDate, -0.07, 6.68, 16.34, 17.26, 33.57, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "上投大蓝筹", "376510", 1, "人民币", 1.4940, nowDate, 0.07, 7.04, 16.26, 12.84, 16.99, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "鹏华消费优选", "206007", 1, "人民币", 1.8090, nowDate, 0.17, 5.60, 15.74, 13.35, 20.68, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "上投核心成长", "000457", 1, "人民币", 2.0170, nowDate, 0.05, 4.35, 15.65, 9.86, 26.62, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "国泰金鑫", "519606", 1, "人民币", 1.6960, nowDate, 0.58, 7.21, 15.45, 12.37, 37.38, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "国泰新经济", "000742", 1, "人民币", 2.1600, nowDate, -0.05, 6.59, 15.10, 17.11, 35.97, -1, "tan", nowDate, "tan", nowDate, 0);
		//Fund fund=new Fund(null, "南方品质优选", "002851", 1, "人民币", 2.1690, nowDate, -0.17, 4.38, 14.95, 17.96, -1.0, -1, "tan", nowDate, "tan", nowDate, 0);
		FundProd fund=new FundProd(null, "上投成长动力", "000073", 1, "人民币", 1.1570, nowDate, -0.26, 6.15, 14.78, 6.34, 0.70, -1, "tan", nowDate, "tan", nowDate, 0);
		service.insert(fund);
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}

