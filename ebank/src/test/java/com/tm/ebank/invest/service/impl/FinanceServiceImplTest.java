
package com.tm.ebank.invest.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.entity.FinanceProd;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.invest.service.FinanceService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

public class FinanceServiceImplTest extends BaseTest{
	@Autowired
    private FinanceService service;
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
	public void testQueryByName() {
		fail("Not yet implemented");
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
		//FinanceProd prod=new FinanceProd(null, "乾元-共享型 2016-80理财产品", "人民币", 10, 100, nowDate, 5.22, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-代工专享2017-11理财产品", "人民币", 5, 104, nowDate, 4.35, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-私享型2017-45理财产品", "人民币", 10, 182, nowDate, 4.4, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-共享型2017-36理财产品", "人民币",5, 105, nowDate, 4.2, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-共享型2017-37理财产品", "人民币",5, 138, nowDate, 4.35, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-资深客户专享2017-4理财产品", "人民币",5, 98, nowDate, 4.35, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-私享型2017-44理财产品", "人民币",10, 70, nowDate, 4.2, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-周周利开放式保本理财产品", "人民币",5, 30500, nowDate, 4.2, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-开鑫享 2017-26理财产品", "人民币",10, 121, nowDate, 4.35, nowDate, "tan", nowDate, "tan", 1);
		//FinanceProd prod=new FinanceProd(null, "乾元-共享型 2016-141理财产品", "人民币",5, 91, nowDate, 4.5, nowDate, "tan", nowDate, "tan", 1);
		FinanceProd prod=new FinanceProd(null, "乾元-私享型 2017-42理财产品", "人民币",600, 51, nowDate, 5.0, nowDate, "tan", nowDate, "tan", 1);
		service.insert(prod);
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

