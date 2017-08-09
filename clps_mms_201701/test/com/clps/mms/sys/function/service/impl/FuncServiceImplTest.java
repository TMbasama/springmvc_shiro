
package com.clps.mms.sys.function.service.impl;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.mms.sys.function.model.Function;
import com.clps.mms.sys.function.service.IFuncService;
import com.clps.mms.sys.vo.PageVo;

/**
 * ClassName: FuncServiceImplTest.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月18日 下午2:03:40 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class FuncServiceImplTest {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	IFuncService service=(IFuncService) context.getBean("funcService");
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
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#FuncServiceImpl()}.
	 * @throws Exception 
	 */
	@Test
	public void testFuncServiceImpl() throws Exception {
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#queryFuncById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryFuncById() throws Exception {
		assertNotNull(service.queryFuncById(1L));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#queryFuncByName(java.lang.String)}.
	 * @throws Exception
	 */
	@Test
	public void testQueryFuncByName() throws Exception {
		assertNotNull(service.queryFuncByName("add"));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#queryFuncLst(com.clps.mms.sys.vo.PageVo)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryFuncLst() throws Exception {
		PageVo<Function> pageVo=new PageVo<>();
		pageVo.setPage(1);
		pageVo.setLimitPage(10);
		LinkedHashMap<String, String> lhm=new LinkedHashMap<>();
		lhm.put("sortname", "name");
		lhm.put("sortorder", "asc");
		pageVo.setSort(lhm);
		assertNotNull(service.queryFuncLst(pageVo));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#insertFunc(com.clps.mms.sys.function.model.Function)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsertFunc() throws Exception {
		Function func=new Function("ttt", null, "tan", null, "tan", null);
		assertEquals(true, service.insertFunc(func));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#updateFunc(com.clps.mms.sys.function.model.Function)}.
	 * @throws Exception
	 */
	@Test
	public void testUpdateFunc() throws Exception {
		Function func=new Function();
		func.setId(9L);
		func.setName("update");
		func.setUpdateName("tan");
		assertEquals(true, service.updateFunc(func));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.function.service.impl.FuncServiceImpl#deleteFunc(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testDeleteFunc() throws Exception {
		assertEquals(true, service.deleteFunc(10L,"tan"));
	}

}

