
package com.clps.mms.sys.user_role.service;

import static org.junit.Assert.*;

import org.apache.catalina.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.mms.sys.user_role.model.UserRole;

/**
 * ClassName: UserRoleServiceTest.
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月8日 上午11:27:46 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class UserRoleServiceTest {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	IUserRoleService service=(IUserRoleService) context.getBean("userRoleService");
	/**
	 * setUp:(这里用一句话描述这个方法的作用). 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * tearDown:(这里用一句话描述这个方法的作用). 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sys.user_role.service.impl.UserRoleServiceImpl#insertUserRole(com.clps.mms.sys.user_role.model.UserRole)}.
	 */
	@Test
	public void testInsertUserRole() {
		UserRole userRole=new UserRole(2L, 1L);
		try {
			service.insertUserRole(userRole,"tan");
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}

