
package com.tm.ebank.web.controller;

import java.util.Date;
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
import com.tm.ebank.invest.entity.FinanceProd;
import com.tm.ebank.invest.entity.HoldingProd;
import com.tm.ebank.invest.service.FinanceService;
import com.tm.ebank.invest.service.HoldingProdService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.DecimalUntil;
import com.tm.ebank.util.PageVoUtil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

/**
 * 
 * date: 2017年4月29日 下午6:12:43 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Controller
public class FinanceController extends BaseController{
	@Autowired
	private FinanceService financeService;
	@Autowired
	private HoldingProdService holdingProdService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private ExpeRecordService expeRecordService;
	/**
	 * 跳转到/finanace/product.jsp页面
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/finance/product")
	public String toFinanceProdList() throws Exception{
	return "/finance/product";	
	}
	/**
	 * 分页查询理财产品页面
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/finance/prodList")
	@ResponseBody
	public Object getFinanceProdList()throws Exception{
		DataTableHelper<FinanceProd> dataTableHelper=new DataTableHelper<>();
		PageVo<FinanceProd> pv=dataTableHelper.getTableData(this.request);
		Map<String,Object>map=PageVoUtil.getMap(pv);
		List<FinanceProd> financeList=financeService.queryLst(map);
		Integer count=financeService.queryCount(map);
		pv.setList(financeList);
		pv.setAllcount(count);
		Map<String, Object> resultMap=dataTableHelper.getReturnMap(pv);
		return resultMap;
	}
	/**
	 * 跳转到/finance/product/purchase.jsp页面
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping(value="/finance/product/purchase")
	public ModelAndView toFinancePurchase(@RequestParam("id")Long id)throws Exception{
		ModelAndView view=new ModelAndView("/finance/purchase");
		FinanceProd prod=financeService.queryById(id);
		view.addObject("financeProd", prod);
		return view;
	}
	/**
	 * 用户购买理财产品
	 * @param user
	 * @param holdingProd
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/finance/product/buyProd")
	@ResponseBody
	public Object FinancePurchase(@CurrentUser User user,HoldingProd holdingProd) throws Exception{
		//更新账户余额
		AccountInfo accountInfo=accountService.queryByAcctId(holdingProd.getAcct_id());
	    Double avail_balance=DecimalUntil.sub(accountInfo.getAcct_balance(), holdingProd.getHold_amount().doubleValue());
	    if (avail_balance<0) {
	    	return JsonResponseUtils.createJsonResponse(false, "0001", "余额不足", null);
		}
	    accountInfo.setAcct_balance(avail_balance);
	    Integer count =accountService.updateBalance(accountInfo);
		//持有产品
		FinanceProd prod=financeService.queryById(holdingProd.getProd_id());
		Date date=new Date();
		Date newDate=DateUntil.addDay(date, prod.getDeadline());
		String longTime=DateUntil.format(date);
		String shortTime=DateUntil.format(date, DateUntil.FORMAT_SHORT);
		String newShrotTime=DateUntil.format(newDate, DateUntil.FORMAT_SHORT);
		holdingProd.setAvail_amount(holdingProd.getHold_amount());
		holdingProd.setWorth_time(newShrotTime);
		holdingProd.setEnd_time(newShrotTime);
		holdingProd.setCreate_name(user.getUsername());
		holdingProd.setUpdate_name(user.getUsername());
		holdingProd.setCreate_time(longTime);
		holdingProd.setUpdate_time(longTime);
		//holdingProd.setNet_worth(2000D);
		//消费记录
		ExpeRecord expeRecord=new ExpeRecord();
		expeRecord.setAcct_id(holdingProd.getAcct_id());
		expeRecord.setCreate_short_time(shortTime);
		expeRecord.setCreate_time(longTime);
		expeRecord.setPay_amount(holdingProd.getHold_amount().doubleValue());
		expeRecord.setIncome_amount(0D);
		expeRecord.setAvail_balance(avail_balance);
		expeRecord.setOther_acct_id(9000000L);
		expeRecord.setOther_name("我行理财产品账户");
		if(	holdingProdService.buyProd(holdingProd)>0&&expeRecordService.insert(expeRecord)>0&&
			    count>0){
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", holdingProd);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
	/**
	 * 跳转到持有产品查询界面
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/myfinance")
	public String toHoldingProduct()throws Exception{
		return "finance/myfinance";
	}
	@RequestMapping("/myfinanceLst")
	@ResponseBody
	public Object getHoldingProductLst(@CurrentUser User user)throws Exception{
		DataTableHelper<HoldingProd> dataTableHelper=new DataTableHelper<>();
		PageVo<HoldingProd> pv=dataTableHelper.getTableData(this.request);
		Map<String,Object>map=PageVoUtil.getMap(pv);
		map.put("id", user.getId());
		List<HoldingProd> prodList=holdingProdService.queryHoldingLstByAcctId(map);
		Integer count=holdingProdService.queryHoldingCount(map);
		pv.setList(prodList);
		pv.setAllcount(count);
		Map<String,Object> returnMap=dataTableHelper.getReturnMap(pv);
		return returnMap;
	}

}

