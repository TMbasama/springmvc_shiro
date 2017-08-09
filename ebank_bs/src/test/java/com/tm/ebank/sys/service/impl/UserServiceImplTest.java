
package com.tm.ebank.sys.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tm.ebank.sys.service.UserService;

/**
 * 
 * date: 2017年3月30日 上午11:34:22 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class UserServiceImplTest {
	@Autowired
	private UserService userService;

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
	 * Test method for {@link com.tm.ebank.sys.service.impl.UserServiceImpl#queryByName(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByName() throws Exception {
		userService.queryByName("admin");
	}

}

