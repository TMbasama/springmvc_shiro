
package com.zh.bms.sys.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.sys.entity.User;
import com.zh.bms.sys.service.IUserService;

/**
 * 
 * date: 2017年3月6日 下午1:59:47 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class UserServiceImplTest {
@Resource(name="userService")	
private IUserService userService;	

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
	 * Test method for {@link com.zh.bms.sys.service.impl.UserServiceImpl#insertUser(com.zh.bms.sys.entity.User)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsertUser() throws Exception {
		//User user=new User(null, "agilan", "1234", "15070080861", "总店","","","", "tan", "2017-3-6", "tan", "2017-3-6", null);
		//userService.insertUser(user);
		
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.UserServiceImpl#queryUserLst(java.util.Map)}.
	 */
	@Test
	public void testQueryUserLst() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.UserServiceImpl#queryUserCount(java.util.Map)}.
	 */
	@Test
	public void testQueryUserCount() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.UserServiceImpl#deleteUser(java.lang.Long)}.
	 */
	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

}

