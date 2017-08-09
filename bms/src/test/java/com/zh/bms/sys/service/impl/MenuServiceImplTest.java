
package com.zh.bms.sys.service.impl;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.sys.entity.Menu;
import com.zh.bms.util.DateUntil;

/**
 * 
 * date: 2017年3月20日 下午1:35:15 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class MenuServiceImplTest {
@Autowired	
private MenuServiceImpl service;
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
	 * Test method for {@link com.zh.bms.sys.service.impl.MenuServiceImpl#queryAll()}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryAll() throws Exception {
		service.queryAll();
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.MenuServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		System.out.println(service.queryById(2L));
	}
	@Test
	public void testQueryByName() throws Exception {
		System.out.println(service.queryByName("系统管理"));
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.MenuServiceImpl#insert(com.zh.bms.sys.entity.Menu)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Menu menu=new Menu(null, "test1", "logo", "url1", "r32r2", 2L, "3", "tan", nowDate, "tan", nowDate);
		service.insert(menu);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.MenuServiceImpl#update(com.zh.bms.sys.entity.Menu)}.
	 * @throws Exception 
	 */
	@Test
	public void testUpdate() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Menu menu=new Menu(15L, "test0", "logo0", "url0", "r32r20", 2L, "0", null, null, "tan", nowDate);
		service.update(menu);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.MenuServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(15L);
	}

}

