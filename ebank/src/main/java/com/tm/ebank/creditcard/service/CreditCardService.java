
package com.tm.ebank.creditcard.service;

import java.util.List;
import java.util.Map;

import com.tm.ebank.creditcard.entity.ApplyInfo;

public interface CreditCardService {
public ApplyInfo queryById(Long id)throws Exception;
/**
 * 根据用户的id查找信用卡申请信息
 * @param id
 * @return
 * @throws Exception
 *
 */
public ApplyInfo queryByUserId(Long id)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<ApplyInfo> queryLst(Map<String,Object> map)throws Exception;
public Integer insert(ApplyInfo applyInfo)throws Exception;
public Integer applyCard(ApplyInfo applyInfo)throws Exception;
public Integer review(ApplyInfo applyInfo)throws Exception;
public Integer applyLoss(Long user_id)throws Exception;
public Integer delete(Long id)throws Exception;
}

