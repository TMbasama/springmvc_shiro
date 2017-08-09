
package com.zh.bms.product.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.product.dao.ProductMapper;
import com.zh.bms.product.entity.Product;
import com.zh.bms.product.service.ProductService;
import com.zh.bms.util.PageVoUtil;

import sun.misc.BASE64Encoder;

/**
 * 
 * date: 2017年3月9日 下午2:22:51 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("prodService")
public class ProductServiceImpl implements ProductService{
@Resource(name="prodDao")	
private ProductMapper prodDao;
	@Override
	public Product queryById(Long id) throws Exception {
		
		
		return prodDao.queryById(id);
	}

	@Override
	public Product queryByUniqueNum(String uniqueNum) throws Exception {
		
		
		return prodDao.queryByUniqueNum(uniqueNum);
	}

	@Override
	public PageVo<Product> queryLst(PageVo<Product> pv) throws Exception {
		Map<String,Object> map=PageVoUtil.getMap(pv);
		List<Product> prodList=prodDao.queryLst(map);
		for (Product product : prodList) {
			byte[] b=product.getImage();
			BASE64Encoder encoder=new BASE64Encoder();
			String image= encoder.encode(b);
			product.setReImage("data:image/jpeg;base64,"+image);
			product.setImage(null);
		}
		Integer count=prodDao.queryCount(map);
		pv.setList(prodList);
		pv.setAllcount(count.toString());
		return pv;
	}

	@Override
	public boolean insert(Product prod) throws Exception {
		if(prodDao.queryByUniqueNum(prod.getUniqueNum())==null){
			return prodDao.insert(prod);
		}
		
		return false;
	}
	@Override
	public boolean update(Product prod) throws Exception {
		if (prodDao.queryById(prod.getId())!=null) {
			
			return prodDao.update(prod);
		}
		return false;
	}
	@Override
	public boolean delete(Long id) throws Exception {
		
		if (prodDao.queryById(id)!=null) {
			return prodDao.delete(id);
		}
		return false;
	}


}

