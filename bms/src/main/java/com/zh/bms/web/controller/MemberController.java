
package com.zh.bms.web.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.bms.common.controller.BaseController;
import com.zh.bms.common.util.JsonResponseUtils;
import com.zh.bms.common.vo.PageVo;
import com.zh.bms.mem.entity.Member;
import com.zh.bms.mem.service.MemberService;
import com.zh.bms.sys.entity.User;
import com.zh.bms.sys.service.IUserService;
import com.zh.bms.util.DateUntil;

/**
 * 
 * date: 2017年3月9日 上午11:06:49
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/member")
@Controller
public class MemberController extends BaseController {
	@Resource(name = "memService")
	private MemberService service;

	@RequestMapping("/adminView")
	@ResponseBody
	public Object adminView(PageVo<Member> pv) throws Exception {
		service.adminQueryLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}
	
	@RequestMapping("/view")
	@ResponseBody
	public Object view(PageVo<Member> pv) throws Exception {
		User user= (User) this.session.getAttribute("user");
		if(user.getShop()==1){
			service.adminQueryLst(pv);
		}else{
			
			service.userQueryLst(pv,user.getShop());
		}
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}
	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	@ResponseBody
	public Object findById(@RequestParam("id") Long id) throws Exception {
		Member m=service.queryById(id);
		if (m!=null) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", m, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "111", null, null);
	}

	@RequestMapping("/add")
	@ResponseBody
	public Object add(Member m) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		m.setCreateDate(nowDate);
		m.setUpdateDate(nowDate);
		m.setCreateName(manager);
		m.setUpdateName(manager);
		if (service.insert(m)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(true, "0001", "222", null, null);
	}

	@RequestMapping("/update")
	@ResponseBody
	public Object update(Member m) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		m.setUpdateDate(nowDate);
		m.setUpdateName(manager);
		if (service.update(m)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(true, "0001", "222", null, null);
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(Long id) throws Exception {
		if (service.delete(id)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(true, "0001", "222", null, null);
	}
}
