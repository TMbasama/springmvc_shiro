
package com.tm.ebank.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.entity.ExpeRecord;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.account.service.ExpeRecordService;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.DecimalUntil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

@RequestMapping("/enjoyLife")
@Controller
public class EnjoyLifeController {
@Autowired	
private AccountService accountService;
@Autowired
private ExpeRecordService expeRecordService;	
/**
 * 跳转到水费界面	
 * @return
 *
 */
@RequestMapping("/waterRecharge")	
public String toWaterRecharge(){
	return "enjoyLife/waterRecharge";
}
@RequestMapping("/payWater")
@ResponseBody
public Object payWater(ExpeRecord expeRecord,String water_acct_id)throws Exception{
	
	AccountInfo accountInfo=accountService.queryByAcctId(expeRecord.getAcct_id());
	AccountInfo updateInfo=new AccountInfo();
	updateInfo.setAcct_id(expeRecord.getAcct_id());
	Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), expeRecord.getPay_amount());
	if (avail_balance<0) {
		return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
	}
	updateInfo.setAcct_balance(avail_balance);
	Integer acct_count=accountService.updateBalance(updateInfo);
	Date date=new Date();
	String time=DateUntil.format(date);
	String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
	expeRecord.setCreate_short_time(shortTime);
	expeRecord.setCreate_time(time);
	expeRecord.setIncome_amount(0D);
	expeRecord.setAvail_balance(avail_balance);
	expeRecord.setOther_acct_id(111111L);
	expeRecord.setThird_acct(water_acct_id);
	expeRecord.setOther_name("水费公司");
	if(expeRecordService.insert(expeRecord)>0&&acct_count>0){
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
	}
	return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
}
/**
 * 跳转到电费界面	
 * @return
 *
 */
@RequestMapping("/electricityRecharge")	
public String toElectircityRecharge(){
	return "enjoyLife/electricityRecharge";
}
@RequestMapping("/payElec")
@ResponseBody
public Object payElec(ExpeRecord expeRecord,String elec_acct_id)throws Exception{
	
	AccountInfo accountInfo=accountService.queryByAcctId(expeRecord.getAcct_id());
	AccountInfo updateInfo=new AccountInfo();
	updateInfo.setAcct_id(expeRecord.getAcct_id());
	Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), expeRecord.getPay_amount());
	if (avail_balance<0) {
		return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
	}
	updateInfo.setAcct_balance(avail_balance);
	Integer acct_count=accountService.updateBalance(updateInfo);
	Date date=new Date();
	String time=DateUntil.format(date);
	String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
	expeRecord.setCreate_short_time(shortTime);
	expeRecord.setCreate_time(time);
	expeRecord.setIncome_amount(0D);
	expeRecord.setAvail_balance(avail_balance);
	expeRecord.setOther_acct_id(222222L);
	expeRecord.setThird_acct(elec_acct_id);
	expeRecord.setOther_name("电费公司");
	if(expeRecordService.insert(expeRecord)>0&&acct_count>0){
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
	}
	return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
}
/**
 * 跳转到燃气费界面	
 * @return
 *
 */
@RequestMapping("/gasRecharge")	
public String toGasRecharge(){
	return "enjoyLife/gasRecharge";
}

@RequestMapping("/payGas")
@ResponseBody
public Object payGas(ExpeRecord expeRecord,String gas_acct_id)throws Exception{
	
	AccountInfo accountInfo=accountService.queryByAcctId(expeRecord.getAcct_id());
	AccountInfo updateInfo=new AccountInfo();
	updateInfo.setAcct_id(expeRecord.getAcct_id());
	Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), expeRecord.getPay_amount());
	if (avail_balance<0) {
		return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
	}
	updateInfo.setAcct_balance(avail_balance);
	Integer acct_count=accountService.updateBalance(updateInfo);
	Date date=new Date();
	String time=DateUntil.format(date);
	String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
	expeRecord.setCreate_short_time(shortTime);
	expeRecord.setCreate_time(time);
	expeRecord.setIncome_amount(0D);
	expeRecord.setAvail_balance(avail_balance);
	expeRecord.setOther_acct_id(333333L);
	expeRecord.setThird_acct(gas_acct_id);
	expeRecord.setOther_name("燃气费公司");
	if(expeRecordService.insert(expeRecord)>0&&acct_count>0){
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
	}
	return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
}
/**
 * 跳转到手机缴费界面	
 * @return
 *
 */
@RequestMapping("/phoneRecharge")	
public ModelAndView toPhoneRecharge(@CurrentUser User user){
	ModelAndView view=new ModelAndView("enjoyLife/phoneRecharge");
	view.addObject("user", user);
	return view;
}
@RequestMapping("/payPhone")
@ResponseBody
public Object payPhone(ExpeRecord expeRecord,String phone)throws Exception{
	AccountInfo accountInfo=accountService.queryByAcctId(expeRecord.getAcct_id());
	AccountInfo updateInfo=new AccountInfo();
	updateInfo.setAcct_id(expeRecord.getAcct_id());
	Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), expeRecord.getPay_amount());
	if (avail_balance<0) {
		return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
	}
	updateInfo.setAcct_balance(avail_balance);
	Integer acct_count=accountService.updateBalance(updateInfo);
	Date date=new Date();
	String time=DateUntil.format(date);
	String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
	expeRecord.setCreate_short_time(shortTime);
	expeRecord.setCreate_time(time);
	expeRecord.setIncome_amount(0D);
	expeRecord.setAvail_balance(avail_balance);
	expeRecord.setOther_acct_id(10086L);
	expeRecord.setThird_acct(phone);
	expeRecord.setOther_name("中国移动");
	if(expeRecordService.insert(expeRecord)>0&&acct_count>0){
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
	}
	return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
}
}

