
package com.tm.ebank.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tm.ebank.common.controller.BaseController;
import com.tm.ebank.common.util.DataTableHelper;
import com.tm.ebank.common.util.JsonResponseUtils;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.creditcard.entity.ApplyInfo;
import com.tm.ebank.creditcard.service.CreditCardService;
import com.tm.ebank.user.entity.User;
import com.tm.ebank.util.DateUntil;
import com.tm.ebank.web.bind.annotation.CurrentUser;

@Controller
@RequestMapping("/creditcard")
public class CreditCardController extends BaseController{
	@Autowired
	private CreditCardService service;
	@RequestMapping("/applyCard")
	public String toApplyCard(){
		return "creditcard/applycard";
	}
	@RequestMapping("/applyProcess")
	public String toApplyProcess(){
		return "creditcard/applyProcess";
	}
	@RequestMapping("/submitApply")
	@ResponseBody
	public Object submitApply(@CurrentUser User currentUser,ApplyInfo applyInfo) throws Exception{
		String nowTime=DateUntil.format(new Date());
		applyInfo.setUser_id(currentUser.getId());
		applyInfo.setApply_time(nowTime);
		System.out.println(applyInfo);
	    if(service.applyCard(applyInfo)>0){
	    	return JsonResponseUtils.createJsonResponse(true, "0000", "0000", applyInfo);
	    }
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", applyInfo);
	}
	@RequestMapping("/queryProcess")
	@ResponseBody
	public Object queryProcess(@CurrentUser User currentUser) throws Exception{
		ApplyInfo applyInfo=service.queryByUserId(currentUser.getId());
		System.out.println(applyInfo);
		if (null!=applyInfo) {
			Date date=DateUntil.parse(applyInfo.getApply_time());
			String time=DateUntil.format(date ,DateUntil.FORMAT_SHORT);
			String desc=null;
			applyInfo.setApply_time(time);
			switch (applyInfo.getCheck_status()) {
			case 1:
				desc="您于"+time+"在线提交申请，我行已收到，将尽快为您处理。";
				break;
			case 2:
				desc="您的信用卡于"+time+"审核成功，请稍等我行会尽快寄给你。";
				break;
			case 3:
				desc="您的信用卡于"+time+"邮寄成功，请查看物流信息。";
				break;
			case 4:
				desc="您的信用卡于"+time+"接收成功，祝你用卡愉快。";
				break;

			default:
				break;
			}
			return JsonResponseUtils.createJsonResponse(true, "0000", desc, applyInfo);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null);
	}
	@RequestMapping("/reportLoss")
	public String reportLoss()throws Exception{
		return "creditcard/reportLoss";
	}
	@RequestMapping("/queryCreditcard")
	@ResponseBody
	public Object queryCreditcard(@CurrentUser User user)throws Exception{
		DataTableHelper<ApplyInfo> dataTableHelper=new DataTableHelper<>();
		PageVo<ApplyInfo> pv=dataTableHelper.getTableData(this.request);
		ApplyInfo applyInfo=service.queryByUserId(user.getId());
		List<ApplyInfo> list=new ArrayList<>();
		list.add(applyInfo);
		pv.setList(list);
		pv.setAllcount(1);
		Map<String,Object> resultMap=dataTableHelper.getReturnMap(pv);
		
		return resultMap;
	}
	@RequestMapping("/applyLoss")
	@ResponseBody
	public Object applyLoss(@CurrentUser User user)throws Exception{
		if (service.applyLoss(user.getId())>0) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", user);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", user);
	}

}

