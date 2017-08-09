
package com.clps.mms.sys.menu_function.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clps.mms.sys.menu_function.model.MenuFunction;
import com.clps.mms.sys.menu_function.service.IMenuFuncService;
import com.clps.mms.util.DateFormat;

/**
 * ClassName: MenuFuncServiceImplTest.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月18日 下午3:00:20 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class MenuFuncServiceImplTest {
	ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	IMenuFuncService service=(IMenuFuncService) context.getBean("menuFuncService");
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
	 * Test method for {@link com.clps.mms.sys.menu_function.service.impl.MenuFuncServiceImpl#queryMenuFuncByMenuId(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryMenuFuncByMenuId() throws Exception {
		assertNotNull(service.queryMenuFuncByMenuId(1L));
	}

	/**
	 * Test method for {@link com.clps.mms.sys.menu_function.service.impl.MenuFuncServiceImpl#insertMenuFunc(java.util.List)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsertMenuFunc() throws Exception {
		List<MenuFunction> list=new ArrayList<MenuFunction>();
		String date=DateFormat.format(new Date());
		MenuFunction mp1=new MenuFunction(2L, 1L, "tan",date , "tan", date,1);
		MenuFunction mp2=new MenuFunction(2L, 2L, "tan",date , "tan", date,1);
		MenuFunction mp3=new MenuFunction(2L, 3L, "tan",date , "tan", date,1);
		list.add(mp1);
		list.add(mp2);
		list.add(mp3);
		assertNotNull(service.insertMenuFunc(list));
	}
	@Test
	public void testQueryAll() throws Exception {
		List<Map<String,Object>> list=service.queryAll();
		assertNotNull(list);
		System.out.println(list);
		Map<String,List<Map<String,Object>>> map=new HashMap<>();
		for (Map<String, Object> map1 : list) {
			String menuName=map1.get("m_name").toString();
			map1.remove("m_name");
			if(!map.containsKey(menuName)){
			List<Map<String,Object>>sList=new ArrayList<>();
			sList.add(map1);
			map.put(menuName, sList);
			}else{
				List<Map<String,Object>>sList=map.get(menuName);
				sList.add(map1);
				map.remove(menuName);
				map.put(menuName, sList);
			}
		}
		System.out.println(map);
	}
}

