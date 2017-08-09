
package com.zh.bms.product.service.impl;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zh.bms.product.entity.Product;
import com.zh.bms.product.service.ProductService;

import sun.misc.BASE64Encoder;


/**
 * 
 * date: 2017年3月9日 下午2:35:24 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class ProductServiceImplTest {
@Resource(name="prodService")	
private ProductService service;
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
	 * Test method for {@link com.zh.bms.product.service.impl.ProductServiceImpl#queryById(java.lang.Long)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryById() throws Exception {
		Product prod=service.queryById(1L);
		BASE64Encoder encoder=new BASE64Encoder();
		String s=encoder.encode(prod.getImage());
		//put("blob", "data:image/jpeg;base64," + blob);
	}

	/**
	 * Test method for {@link com.zh.bms.product.service.impl.ProductServiceImpl#queryByUniqueNum(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public void testQueryByUniqueNum() throws Exception {
		service.queryByUniqueNum("");
	}

	/**
	 * Test method for {@link com.zh.bms.product.service.impl.ProductServiceImpl#queryLst(com.zh.bms.common.vo.PageVo)}.
	 */
	@Test
	public void testQueryLst() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zh.bms.product.service.impl.ProductServiceImpl#insert(com.zh.bms.product.entity.Product)}.
	 * @throws Exception 
	 */
	@Test
	public void testInsert() throws Exception {
		File file=new File("C:\\Users\\Administrator\\Desktop\\test\\6.jpg");
		InputStream inputStream=new FileInputStream(file);
		byte[] buf=new byte[inputStream.available()];
		inputStream.read(buf);
		System.out.println(buf.toString());
		Product prod=new Product(null, "产品6", buf, "20", "00000006", "tan", "11", "tan", "222", 1);
		service.insert(prod);
	}

	/**
	 * Test method for {@link com.zh.bms.product.service.impl.ProductServiceImpl#delete(java.lang.Long)}.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}

