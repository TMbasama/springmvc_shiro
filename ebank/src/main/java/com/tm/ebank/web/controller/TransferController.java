
package com.tm.ebank.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tm.ebank.account.entity.AccountInfo;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.DataTableHelper;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.transfer.entity.TransferInfo;
import com.tm.ebank.transfer.service.TransferService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.DecimalUntil;
import com.tm.ebank.util.PageVoUtil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

/**
 * 
 * date: 2017年5月12日 下午11:40:19
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/transfer")
@Controller
public class TransferController extends BaseController {
	@Autowired
	private TransferService transferService;
	@Autowired
	private AccountService accountService;

	@RequestMapping("/apply")
	public String toApply() throws Exception {
		return "/transfer/apply";
	}

	@RequestMapping("/applyTransfer")
	@ResponseBody
	public Object Apply(@CurrentUser User user, TransferInfo info,Long acct_id) throws Exception {
		String time = DateUntil.format(new Date());
		info.setCreate_name(user.getUsername());
		info.setCreate_time(time);
		info.setCreate_name(user.getUsername());
		info.setUpdate_time(time);
		info.setFrom_acct_id(acct_id);
		info.setUser_id(user.getId());
		AccountInfo dbInfo=accountService.queryByAcctId(acct_id);
		info.setFrom_acct_name(dbInfo.getOwer_name());
		Double acct_balance=DecimalUntil.sub(dbInfo.getAcct_balance(), info.getTrans_amount());
		if(acct_balance<0){
			return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
		}
		AccountInfo accountInfo=new AccountInfo();
		accountInfo.setAcct_balance(acct_balance);
		accountInfo.setAcct_id(acct_id);
		if (transferService.insert(info) > 0 && accountService.updateBalance(accountInfo)>0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}

	@RequestMapping("/applyProcess")
	public ModelAndView toApplyProccess(Long id) throws Exception {
		ModelAndView view = new ModelAndView("transfer/applyProcess");
		return view;
	}

	@RequestMapping("/queryAcctLst")
	@ResponseBody
	public Object queryAcctLst(@CurrentUser User user) throws Exception {
		DataTableHelper<TransferInfo> dataTableHelper = new DataTableHelper<>();
		PageVo<TransferInfo> pv = dataTableHelper.getTableData(this.request);
		Map<String, Object> map = PageVoUtil.getMap(pv);
		map.put("user_id", user.getId());
		List<TransferInfo> list = transferService.queryAcctLst(map);
		Integer count = transferService.queryAcctCount(map);
		pv.setAllcount(count);
		pv.setList(list);
		Map<String, Object> resultMap = dataTableHelper.getReturnMap(pv);
		return resultMap;
	}
}
