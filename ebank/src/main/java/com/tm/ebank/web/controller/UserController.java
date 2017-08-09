
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
import com.tm.ebank.account.entity.ExpeRecord;
import com.tm.ebank.account.service.AccountService;
import com.tm.ebank.account.service.ExpeRecordService;
import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.DataTableHelper;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.user.entity.UserAcct;
import com.tm.ebank.user.service.UserService;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.util.PageVoUtil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

/**
 * 
 * date: 2017年4月30日 下午5:44:03
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/user")
@Controller
public class UserController extends BaseController {
	@Autowired
	private UserService userService;
	@Autowired
	private AccountService acctService;
	@Autowired
	private ExpeRecordService expeRecordService;

	@RequestMapping("/register")
	public String toRegister() throws Exception {
		return "/user/register";
	}

	@RequestMapping("/userRegister")
	@ResponseBody
	public Object register(User user) throws Exception {
		String time = DateUntil.format(new Date());
		user.setCreate_time(time);
		user.setCreate_name(user.getUsername());
		user.setUpdate_name(user.getUsername());
		user.setUpdate_time(time);
		if (userService.insert(user) > 0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}

	@RequestMapping("/registerOnlineBank")
	@ResponseBody
	public Object registerOnlineBank(User user, Long acct_id) throws Exception {
		String time = DateUntil.format(new Date());
		user.setCreate_time(time);
		user.setCreate_name(user.getUsername());
		user.setUpdate_name(user.getUsername());
		user.setUpdate_time(time);
		if (userService.insert(user) > 0) {
			UserAcct userAcct = new UserAcct(1L, acct_id);
			acctService.applyOnlineBank(acct_id);
			userService.addAccount(userAcct);
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}

	@RequestMapping("/profile")
	public ModelAndView toProfile(@CurrentUser User user) throws Exception {
		ModelAndView view = new ModelAndView("/user/profile");
		view.addObject("user", user);
		return view;
	}

	@RequestMapping("/queryAccount")
	@ResponseBody
	public Object queryAccount(@CurrentUser User user) throws Exception {
		DataTableHelper<AccountInfo> dataTableHelper = new DataTableHelper<>();
		PageVo<AccountInfo> pv = dataTableHelper.getTableData(this.request);
		Map<String, Object> map = PageVoUtil.getMap(pv);
		map.put("id", user.getId());
		Integer count = userService.queryAcctCount(map);
		List<AccountInfo> accountList = userService.queryAcctLst(map);
		pv.setList(accountList);
		pv.setAllcount(count);
		Map<String, Object> resultMap = dataTableHelper.getReturnMap(pv);
		return resultMap;
	}
	@RequestMapping("/myExpeRecord")
	@ResponseBody
	public Object myExpeRecord(@CurrentUser User user)throws Exception{
		DataTableHelper<ExpeRecord> dataTableHelper=new DataTableHelper<>();
		PageVo<ExpeRecord> pv=dataTableHelper.getTableData(this.request);
		Map<String, Object> map=PageVoUtil.getMap(pv);
		map.put("user_id", user.getId());
		List<ExpeRecord> list=expeRecordService.queryLstByUserId(map);
		Integer count=expeRecordService.queryCountByUserId(map);
		pv.setList(list);
		pv.setAllcount(count);
		Map<String, Object> resultMap = dataTableHelper.getReturnMap(pv);
		return resultMap;
	}
}
