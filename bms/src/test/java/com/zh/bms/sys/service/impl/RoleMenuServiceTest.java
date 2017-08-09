
package com.zh.bms.sys.service.impl;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.sys.entity.RoleMenu;

/**
 * 
 * date: 2017年3月21日 下午3:27:31 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class RoleMenuServiceTest {
@Autowired	
private RoleMenuServiceImpl service;
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
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleMenuServiceImpl#queryByRoleId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByRoleId() throws Exception {
		service.queryByRoleId(1L);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleMenuServiceImpl#insert(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		List<RoleMenu> list=new ArrayList<>();
	    for(int i=0;i<=3;i++){
	    Long j=(long) i;
		RoleMenu roleMenu=new RoleMenu(1L, j);
		list.add(roleMenu);
	   }
	   service.insert(list);
	}

	/**
	 * Test method for {@link com.zh.bms.sys.service.impl.RoleMenuServiceImpl#deleteByMenuId(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteByMenuId() throws Exception {
		List<Long> list=new ArrayList<>();
		for(Long i=0L;i<=3;i++){
			list.add(i);
		}
		service.deleteByMenuId(list);
	}

}

