
package com.zh.bms.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zh.bms.common.controller.BaseController;
import com.zh.bms.common.util.JsonResponseUtils;
import com.zh.bms.common.vo.PageVo;
import com.zh.bms.store.entity.Store;
import com.zh.bms.store.service.IStoreService;
import com.zh.bms.util.DateUntil;

/**
 * 
 * date: 2017年3月15日 下午3:11:40
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping(value = "/store")
@Controller
public class StoreContorller extends BaseController{
	@Resource(name = "storeService")
	private IStoreService service;

	
	@RequestMapping("/queryAll")
	@ResponseBody
	public Object queryAll()throws Exception{
		List<Store> list=service.queryAll();
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", list, null);
	}
	@RequestMapping(value = "/view")
	@ResponseBody
	public Object view(PageVo<Store> pv) throws Exception {
		service.queryLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "0000", pv.getList(), pv.getAllcount());
	}

	@RequestMapping(value = "/findById")
	@ResponseBody
	public Object findById(@RequestParam Long id) throws Exception {
		Store store = service.queryById(id);
		if (null != store) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", store, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null, null);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object add(Store store) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		store.setCreateDate(nowDate);
		store.setCreateName(manager);
		store.setUpdateDate(nowDate);
		store.setUpdateName(manager);
		if (service.insert(store)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", store, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0000", null, null);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Object update(Store store) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		store.setUpdateDate(nowDate);
		store.setUpdateName(manager);
		System.out.println("update:" + store.toString());
		if (service.update(store)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", store, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null, null);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Object delete(@RequestParam("id") Long id) throws Exception {
		if (service.delete(id)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "0000", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "0001", null, null);
	}
}
