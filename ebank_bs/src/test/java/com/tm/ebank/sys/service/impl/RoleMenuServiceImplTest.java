
package com.tm.ebank.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.ebank.common.BaseTest;
import com.tm.ebank.sys.entity.RoleMenu;
import com.tm.ebank.sys.service.RoleMenuService;

/**
 * 
 * date: 2017年4月5日 上午10:18:50 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class RoleMenuServiceImplTest extends BaseTest{
	@Autowired
    private RoleMenuService service;
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
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleMenuServiceImpl#queryByRoleId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByRoleId() throws Exception {
		service.queryByRoleId(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleMenuServiceImpl#queryMenuIdsByRoleId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryMenuIdsByRoleId() throws Exception {
		service.queryMenuIdsByRoleId(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleMenuServiceImpl#queryMenuByRoleId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryMenuByRoleId() throws Exception {
		service.queryMenuByRoleId(1L);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleMenuServiceImpl#insert(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		List<RoleMenu> list=new ArrayList<>();
		RoleMenu rm1=new RoleMenu(1L, 2L);
		RoleMenu rm2=new RoleMenu(1L, 3L);
		list.add(rm1);
		list.add(rm2);
		service.insert(list);
	}

	/**
	 * Test method for {@link com.tm.ebank.sys.service.impl.RoleMenuServiceImpl#deleteByMenuId(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteByMenuId() throws Exception {
		List<Long> menuId=new ArrayList<>();
		menuId.add(2L);
		menuId.add(3L);
		service.deleteByMenuId(menuId);
	}

}

