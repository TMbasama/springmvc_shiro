
package com.zh.bms.store.service.impl;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.store.entity.Store;
import com.zh.bms.store.service.IStoreService;
import com.zh.bms.util.DateUntil;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * date: 2017年3月15日 下午2:40:15 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class StoreServiceImplTest {
@Resource(name="storeService")
private IStoreService service;
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
	 * Test method for {@link com.zh.bms.store.service.impl.StoreServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		service.queryById(1L);
	}

	/**
	 * Test method for {@link com.zh.bms.store.service.impl.StoreServiceImpl#queryLst(com.zh.bms.common.vo.PageVo)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryLst() throws Exception {
		PageVo<Store> pv=new PageVo<>();
		pv.setPageIndex(0);
		pv.setPageSize(10);
		service.queryLst(pv);
	}

	/**
	 * Test method for {@link com.zh.bms.store.service.impl.StoreServiceImpl#insert(com.zh.bms.store.entity.Store)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		String date=DateUntil.format(new Date());
		Store store=new Store(null, "总店", 0, "浦东新区", "15070080861", "tan", "tan", date, "tan", date, null);
		service.insert(store);
	}

	/**
	 * Test method for {@link com.zh.bms.store.service.impl.StoreServiceImpl#delete(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDelete() throws Exception {
		service.delete(1L);
	}

	/**
	 * Test method for {@link com.zh.bms.store.service.impl.StoreServiceImpl#update(com.zh.bms.store.entity.Store)}.
	 * @throws Exception 
	 */
	@Test
	public void testUpdate() throws Exception {
		String date=DateUntil.format(new Date());
		Store store=new Store(2L, "分店1", 1, "浦东新区1", "15070080862", "fanny", "tan", date, "fanny", date, null);
		service.update(store);
	}

}

