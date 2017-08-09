
package com.zh.bms.sys.service.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.sys.entity.UserRole;

/**
 * 
 * date: 2017年3月22日 下午2:42:33 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class UserRoleServiceImplTest {
	@Autowired
	private UserRoleServiceImpl service;

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
	 * Test method for {@link com.zh.bms.sys.service.impl.UserRoleServiceImpl#insert(com.zh.bms.sys.entity.UserRole)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		UserRole userRole=new UserRole(1L, 2L);
		service.insert(userRole);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.UserRoleServiceImpl#deleteByUserId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteByUserId() throws Exception {
		service.deleteByUserId(1L);
	}

}

