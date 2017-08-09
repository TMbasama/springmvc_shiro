
package com.tm.ebank.sys.service.impl;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.BaseTest;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.service.RoleService;
import com.tm.ebank.util.DateUntil;

/**
 * 
 * date: 2017年4月5日 上午9:36:49 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class RoleServiceImplTest extends BaseTest{
	@Autowired
    private RoleService service;
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
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#queryCount(java.util.Map)}.
	 */
	@Test
	public void testQueryCount() {
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#queryLst(com.tm.ebank.common.vo.PageVo)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<Role> pv=new PageVo<>();
		pv.setPageIndex(0);
		pv.setPageSize(10);
		service.queryLst(pv);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#insert(com.tm.ebank.sys.entity.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Role role =new Role(null, "test", "dsdsd222", "tan", nowDate, "tan", nowDate, 1);
		service.insert(role);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#update(com.tm.ebank.sys.entity.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testUpdate() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Role role =new Role(4L, "test1", "dsdsd", "tan", nowDate, "tan", nowDate, 1);
		service.update(role);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(4L);
	}

}

