
package com.tm.ebank.invest.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.invest.entity.HoldingProd;

/**
 * 
 * date: 2017年4月29日 上午11:04:02 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface HoldingProdService {
public Integer buyProd(HoldingProd holdingProd)throws Exception;
public List<HoldingProd> queryHoldingLstByAcctId(Map<String,Object> map)throws Exception;
public Integer queryHoldingCount(Map<String,Object> map)throws Exception;
}

