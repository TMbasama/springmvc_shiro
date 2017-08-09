
package com.clps.mms.sys.role_menu_function.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.role_menu_function.model.RoleMenuFunc;
import com.clps.mms.sys.role_menu_function.service.IRoleMenuFuncService;

/**
 * ClassName: RoleMenuFuncImplTest.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月19日 下午3:05:21 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class RoleMenuFuncImplTest {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	IRoleMenuFuncService service=(IRoleMenuFuncService) context.getBean("roleMenuFuncService");
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
	 * Test method for {@link com.clps.mms.sys.role_menu_function.service.impl.RoleMenuFuncImpl#saveOrUpdate(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testSaveOrUpdate() throws Exception {
		List<RoleMenuFunc> list=new ArrayList<>();
		RoleMenuFunc rmf1=new RoleMenuFunc(1L, 1L, 1);
		RoleMenuFunc rmf2=new RoleMenuFunc(1L, 2L, 1);
		RoleMenuFunc rmf3=new RoleMenuFunc(1L, 3L, 1);
		list.add(rmf1);
		list.add(rmf2);
		list.add(rmf3);
		assertNotNull(service.saveOrUpdate(list));
	}

}

