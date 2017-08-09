
package com.tm.ebank.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.entity.UserAcct;
import com.tm.ebank.user.service.UserService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

/**
 * 
 * date: 2017年4月29日 下午10:14:27
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/internetbank")
@Controller
public class InternetBankController extends BaseController {
	@Autowired
	private UserService userService;
	@Autowired
	private AccountService acctService;
    /**
     * 跳转到开通网上银行界面
     * @return
     * @throws Exception
     *
     */
	@RequestMapping("/onlinebank")
	public String toOnlineBank() throws Exception {
		return "internetbank/onlinebank";
	}
    /**
     * 开通网上银行
     * @param user
     * @param acct_id
     * @return
     * @throws Exception
     *
     */
	@RequestMapping("/applyOnlineBank")
	@ResponseBody
	public Object applyOnlineBank(@CurrentUser User user, Long acct_id) throws Exception {
		UserAcct userAcct = new UserAcct(user.getId(), acct_id);
		if (acctService.applyOnlineBank(acct_id) > 0 && userService.addAccount(userAcct) > 0) {

			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}

		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
	 /**
     * 跳转到开通手机银行界面
     * @return
     * @throws Exception
     *
     */
	@RequestMapping("/mobilebank")
	public String toMobileBank() throws Exception {
		return "internetbank/mobilebank";
	}
	/**
	 * 开通手机银行
	 * @param user
	 * @param acct_id
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/applyMoblieBank")
	@ResponseBody
	public Object applyMoblieBank(@CurrentUser User user,Long acct_id)throws Exception{
		if(acctService.applyMobileBank(acct_id)>0){
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
	/**
	 * 跳转到开通账户支付界面
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/accountPay")
	public String toAccountPay() throws Exception {
		return "internetbank/accountPay";
	}
	/**
	 * 开通账户支付
	 * @param user
	 * @param acct_id
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/applyAccountPay")
	@ResponseBody
	public Object applyAccountPay(@CurrentUser User user,Long acct_id)throws Exception{
		if (acctService.applyAccountPay(acct_id)>0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
}
