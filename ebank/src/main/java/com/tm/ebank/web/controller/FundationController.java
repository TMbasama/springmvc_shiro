
package com.tm.ebank.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.entity.ExpeRecord;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.account.service.ExpeRecordService;
import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.DataTableHelper;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.invest.entity.FundProd;
import com.tm.ebank.invest.entity.HoldingFundProd;
import com.tm.ebank.invest.service.FundService;
import com.tm.ebank.invest.service.HoldingFundProdService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.DecimalUntil;
import com.tm.ebank.util.PageVoUtil;
import com.tm.ebank.web.bind.annotation.CurrentUser;
@RequestMapping("/fund")
@Controller
public class FundationController extends BaseController{
@Autowired
private FundService fundService;
@Autowired
private HoldingFundProdService holdingFundProdService;
@Autowired
private AccountService accountService;
@Autowired
private ExpeRecordService expeRecordService;
/**
 * 跳转到fund/product.jsp页面
 * @return
 *
 */
@RequestMapping("/product")	
public String toFundProduct(){
	
	return "fund/product";
}
/**
 * 分页查询基金产品列表
 * @return
 * @throws Exception
 *
 */
@RequestMapping("/prodList")
@ResponseBody
public Object getFundProdList() throws Exception{
	DataTableHelper<FundProd> dataTableHelper=new DataTableHelper<>();
	PageVo<FundProd> pv=dataTableHelper.getTableData(this.request);
	Map<String,Object> map=PageVoUtil.getMap(pv);
	List<FundProd> fundList=fundService.queryLst(map);
	Integer count=fundService.queryCount(map);
	pv.setList(fundList);
	pv.setAllcount(count);
	Map<String,Object> resultMap=dataTableHelper.getReturnMap(pv);
	return resultMap;
}
/**
 * 跳转到/finance/product/purchase.jsp页面
 * @param id
 * @return
 * @throws Exception
 *
 */
@RequestMapping(value="/product/purchase")
public ModelAndView toFinancePurchase(@RequestParam("id")Long id)throws Exception{
	ModelAndView view=new ModelAndView("/fund/purchase");
	FundProd prod=fundService.queryById(id);
	view.addObject("fundProd", prod);
	return view;
}
@RequestMapping("/product/buyProd")
@ResponseBody
public Object FundPurchase(@CurrentUser User user,HoldingFundProd holdingFundProd) throws Exception{
	//付款账号
	AccountInfo accountInfo=accountService.queryByAcctId(holdingFundProd.getAcct_id());
	Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), holdingFundProd.getHold_price());
	if (avail_balance<0) {
		return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
	}
	accountInfo.setAcct_balance(avail_balance);
    Integer count=accountService.updateBalance(accountInfo);
	//持有产品
	FundProd prod=fundService.queryById(holdingFundProd.getProd_id());
	Date date=new Date();
	String longTime=DateUntil.format(date);
	String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
	Double hold_amount=DecimalUntil.div(holdingFundProd.getHold_price(), prod.getCurr_price());
	Double earn_price=DecimalUntil.mul(hold_amount, prod.getCurr_price(), 2);
	holdingFundProd.setHold_amount(hold_amount);
	holdingFundProd.setBuy_worth(prod.getCurr_price());
	holdingFundProd.setEarn_price(earn_price);
	holdingFundProd.setBuy_time(shortTime);
	holdingFundProd.setCreate_time(longTime);
	holdingFundProd.setCreate_name(user.getUsername());
	holdingFundProd.setUpdate_name(user.getUsername());
	holdingFundProd.setUpdate_time(longTime);
	//消费记录
	ExpeRecord expeRecord=new ExpeRecord();
	expeRecord.setAcct_id(holdingFundProd.getAcct_id());
	expeRecord.setCreate_short_time(shortTime);
	expeRecord.setCreate_time(longTime);
	expeRecord.setPay_amount(holdingFundProd.getHold_price());
	expeRecord.setIncome_amount(0D);
	expeRecord.setAvail_balance(avail_balance);
	expeRecord.setOther_acct_id(8000000L);
	expeRecord.setOther_name("我行基金账户");
	if (holdingFundProdService.buyProd(holdingFundProd)>0&&expeRecordService.insert(expeRecord)>0&&count>0) {
		
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", holdingFundProd);
	}
	return JsonResponseUtils.createJsonResponse(false, "0000", "0000", null);
}
@RequestMapping("/myfund")
public String toMyFund()throws Exception{
	return "fund/myfund";
}
@RequestMapping("/myfundLst")
@ResponseBody
public Object myFundLst(@CurrentUser User user)throws Exception{
	DataTableHelper<HoldingFundProd> dataTableHelper=new DataTableHelper<>();
	PageVo<HoldingFundProd> pv=dataTableHelper.getTableData(this.request);
	Map<String,Object>map=PageVoUtil.getMap(pv);
	map.put("id",  user.getId());
	Integer count=holdingFundProdService.queryHoldingCount(map);
	List<HoldingFundProd> prodList=holdingFundProdService.queryHoldingLstByAcctId(map);
	if(count!=0){
	for (HoldingFundProd holdingFundProd : prodList) {
		Double hold_amount=holdingFundProd.getHold_amount();
		Double net_worth=holdingFundProd.getNet_worth();
		Double earn_price=DecimalUntil.sub(DecimalUntil.mul(net_worth, hold_amount, 2),
				holdingFundProd.getHold_price());
		System.out.println("hp:"+holdingFundProd.getHold_price());
		System.out.println("nh:"+DecimalUntil.mul(net_worth, hold_amount, 2));
		System.out.println("ep:"+earn_price);
		holdingFundProd.setEarn_price(earn_price);
		
	}
	}
	pv.setList(prodList);
	pv.setAllcount(count);
	Map<String,Object> returnMap=dataTableHelper.getReturnMap(pv);
	return returnMap;
}
}

