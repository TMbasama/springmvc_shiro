
package com.clps.mms.sys.role.service.impl;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.role.service.IRoleService;
import com.clps.mms.sys.vo.PageVo;

/**
 * ClassName: RoleServiceImplTest.
 * Function: TODO ADD FUNCTION.
 * Reason: TODO ADD REASON(可选).
 * date: 2017年1月13日 下午2:54:04 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class RoleServiceImplTest {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	IRoleService service=(IRoleService) context.getBean("roleService");
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
	 * Test method for {@link com.clps.mms.sys.role.service.impl.RoleServiceImpl#insertRole(com.clps.mms.sys.role.model.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsertRole() throws Exception {
		Role role=new Role("dba1", null, null, "tan", null, "tan", null);
		assertEquals(true, service.insertRole(role));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.role.service.impl.RoleServiceImpl#updateRoleById(com.clps.mms.sys.role.model.Role)}.
	 * @throws Exception 
	 */
	@Test
	public void testUpdateRoleById() throws Exception {
		Role role=new Role("dbagg", 2L, null, "dsd", null, "dsd", null);
		role.setId(16L);
		assertEquals(true, service.updateRoleById(role));
		
	}

	/**
	 * Test method for {@link com.clps.mms.sys.role.service.impl.RoleServiceImpl#deleteRoleById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteRoleById() throws Exception {
		assertEquals(true, service.deleteRoleById(16L,"tan"));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.role.service.impl.RoleServiceImpl#queryRoleLst(com.clps.mms.sys.vo.PageVo)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryRoleLst() throws Exception {
		PageVo<Role> pageVo=new PageVo<>();
		pageVo.setPage(1);
		pageVo.setLimitPage(10);
		LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
		lhm.put("sortname", "name");
		lhm.put("sortorder", "asc");
		pageVo.setSort(lhm);
		assertNotNull(service.queryRoleLst(pageVo));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.role.service.impl.RoleServiceImpl#queryRoleById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryRoleById() throws Exception {
		assertNotNull(service.queryRoleById(7L));
	}

}

