
package com.tm.ebank.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.JsonResponseUtils;

/**
 * 
 * date: 2017年4月30日 下午2:44:01 
 *
 * @author tony.tan
 * @version 
 * 
 */
@RequestMapping("/account")
@Controller
public class AccountController extends BaseController{
	@Autowired
	private AccountService service;
	@RequestMapping("/validAcctId")
	@ResponseBody
	public Object validAcctId(Long acct_id)throws Exception{
		Map<String,Object> map=new HashMap<>();
		if(service.queryByAcctId(acct_id)!=null){
			map.put("valid", true);
			return map;
		}
		map.put("valid", false);
		return map;
	}
	@RequestMapping("/validToAcctId")
	@ResponseBody
	public Object validToAcctId(Long to_acct_id)throws Exception{
		Map<String,Object> map=new HashMap<>();
		if(service.queryByAcctId(to_acct_id)!=null){
			map.put("valid", true);
			return map;
		}
		map.put("valid", false);
		return map;
	}
	@RequestMapping("/verifyPwd")
	@ResponseBody
	public Object verifyPwd(AccountInfo info)throws Exception{
		if(service.verifyPwd(info)){
			AccountInfo dbInfo=service.queryByAcctId(info.getAcct_id());
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", dbInfo);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
}

