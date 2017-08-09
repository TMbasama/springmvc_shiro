
package com.zh.bms.mem.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.mem.entity.Member;
import com.zh.bms.util.DateUntil;

/**
 * 
 * date: 2017年3月9日 上午10:37:25 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class MemberServiceImplTest {
@Autowired	
private MemberServiceImpl service;
	/**
	 * @param    
	 * @return
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @param    
	 * @return
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.zh.bms.mem.service.impl.MemberServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(2L);
	}

	/**
	 * Test method for {@link com.zh.bms.mem.service.impl.MemberServiceImpl#queryCount(java.util.Map)}.
	 */
	@Test
	public void testQueryCount() {
	}

	/**
	 * Test method for {@link com.zh.bms.mem.service.impl.MemberServiceImpl#queryLst(com.zh.bms.common.vo.PageVo)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<Member> pv=new PageVo<>();
		pv.setPageIndex(1);
		pv.setPageSize(10);
		//Assert.assertNotNull(service.queryLst(pv));
	}

	/**
	 * Test method for {@link com.zh.bms.mem.service.impl.MemberServiceImpl#insert(com.zh.bms.mem.entity.Member)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String date=DateUntil.format(new Date());
		//Member mem=new Member(null, "tan", "男", "2017-2-3", "15070080861", "000000001", 1, 2001L, "tan", date, "tan", date, 0);
		//service.insert(mem);
	}

	/**
	 * Test method for {@link com.zh.bms.mem.service.impl.MemberServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(1L);
	}

}

