
package com.tm.ebank.sys.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.BaseTest;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.service.MenuService;
import com.tm.ebank.util.DateUntil;

/**
 * 
 * date: 2017年3月31日 上午10:21:35 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class MenuServiceImplTest extends BaseTest{
@Autowired
private MenuService service;
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
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#queryAll()}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryAll() throws Exception {
		service.queryAll();
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#queryLst(java.util.Map)}.
	 */
	@Test
	public void testQueryLst() {
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#queryCount(java.util.Map)}.
	 */
	@Test
	public void testQueryCount() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#queryByName(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByName() throws Exception {
		service.queryByName("");
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#insert(com.tm.ebank.sys.entity.Menu)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Menu menu=new Menu(null, "test1", "ddd", "ss", "fwe32", 2L, "2", "tan", nowDate, "tan", nowDate);
		service.insert(menu);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#update(com.tm.ebank.sys.entity.Menu)}.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.MenuServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(18L);
	}

}

