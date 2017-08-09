
package com.zh.bms.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.product.entity.Product;

/**
 * 
 * date: 2017年3月9日 下午1:41:00 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("prodDao")
public interface ProductMapper {
public Product queryById(Long id)throws Exception;
public Product queryByUniqueNum(String uniqueNum)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<Product> queryLst(Map<String,Object> map)throws Exception;
public boolean insert(Product prod)throws Exception;
public boolean update(Product prod)throws Exception;
public boolean delete(Long id)throws Exception;
}

