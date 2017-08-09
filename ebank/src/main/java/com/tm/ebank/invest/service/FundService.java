
package com.tm.ebank.invest.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.invest.entity.FundProd;

public interface FundService {
public FundProd queryById(Long id)throws Exception;
public FundProd queryByName(String name)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<FundProd> queryLst(Map<String,Object> map)throws Exception;
public Integer insert(FundProd fund)throws Exception;
public Integer update(FundProd fund)throws Exception;
public Integer delete(Long id)throws Exception;
}

