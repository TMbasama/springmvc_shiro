
package com.zh.bms.product.service;


import com.zh.bms.common.vo.PageVo;
import com.zh.bms.product.entity.Product;

/**
 * 
 * date: 2017年3月9日 下午2:21:20 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface ProductService {
	public Product queryById(Long id)throws Exception;
	public Product queryByUniqueNum(String uniqueNum)throws Exception;
	public PageVo<Product> queryLst(PageVo<Product> pv)throws Exception;
	public boolean insert(Product prod)throws Exception;
	public boolean update(Product prod)throws Exception;
	public boolean delete(Long id)throws Exception;
}

