
package com.tm.ebank.invest.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.invest.entity.FinanceProd;

public interface FinanceService {
public FinanceProd queryById(Long id)throws Exception;
public FinanceProd queryByName(String name)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<FinanceProd> queryLst(Map<String,Object> map)throws Exception;
public Integer insert(FinanceProd prod)throws Exception;
public Integer update(FinanceProd prod)throws Exception;
public Integer delete(Long id)throws Exception;
}

