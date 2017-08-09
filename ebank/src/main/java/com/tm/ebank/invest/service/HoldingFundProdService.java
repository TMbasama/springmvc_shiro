
package com.tm.ebank.invest.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.invest.entity.HoldingFundProd;

/**
 * 
 * date: 2017年4月29日 上午11:04:02 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface HoldingFundProdService {
public Integer buyProd(HoldingFundProd holdingFundProd)throws Exception;
public List<HoldingFundProd> queryHoldingLstByAcctId(Map<String,Object> map)throws Exception;
public Integer queryHoldingCount(Map<String,Object> map)throws Exception;
}

