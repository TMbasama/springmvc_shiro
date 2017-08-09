
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

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.store.entity.Store;
import com.zh.bms.sys.entity.Role;
import com.zh.bms.util.DateUntil;

/**
 * 
 * date: 2017年3月20日 下午5:02:28 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class RoleServiceImplTest {
@Autowired	
private RoleServiceImpl service;
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
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(2L);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleServiceImpl#queryLst(com.zh.bms.common.vo.PageVo)}.
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
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleServiceImpl#insert(com.zh.bms.sys.entity.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Role role=new Role(null, "管理员1", "管理员1", "tan", nowDate, "tan", nowDate, 0);
		service.insert(role);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleServiceImpl#update(com.zh.bms.sys.entity.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testUpdate() throws Exception {
		String nowDate=DateUntil.format(new Date());
		Role role=new Role(2L, "管理员1", "管理员2", null, null, "tan", nowDate, 0);
		service.update(role);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(2L);
	}

}

