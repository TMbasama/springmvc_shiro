
package com.tm.ebank.creditcard.service.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.creditcard.entity.ApplyInfo;
import com.tm.ebank.creditcard.service.CreditCardService;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.service.BaseTest;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;

public class CreditCardServiceImplTest extends BaseTest{
	@Autowired
    private CreditCardService service;
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
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testReview() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testApplyCard() throws Exception {
		String nowTime=DateUntil.format(new Date());
		ApplyInfo applyInfo=new ApplyInfo(null, 1L, null, "张三", "360122199906066666", "南昌", "龙卡通", "大学", "江西省南昌市华东交通大学", "15088888888", "88888@ebank.com", nowTime, null, null, 1);
		service.applyCard(applyInfo);
	}

}

