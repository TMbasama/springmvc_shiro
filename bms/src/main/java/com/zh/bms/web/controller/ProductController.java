
package com.zh.bms.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zh.bms.common.controller.BaseController;
import com.zh.bms.common.util.JsonResponseUtils;
import com.zh.bms.common.vo.PageVo;
import com.zh.bms.product.entity.Product;
import com.zh.bms.product.service.ProductService;
import com.zh.bms.util.DateUntil;

import sun.misc.BASE64Encoder;

/**
 * 
 * date: 2017年3月9日 下午3:31:13
 *
 * @author tony.tan
 * @version
 * 
 */
@RequestMapping("/product")
@Controller
public class ProductController extends BaseController {
	@Resource(name = "prodService")
	private ProductService prodService;
	private byte[] uploadFile;

	@RequestMapping("/view")
	@ResponseBody
	public Object view(PageVo<Product> pv) throws Exception {
		prodService.queryLst(pv);
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", pv.getList(), pv.getAllcount());
	}

	@RequestMapping(value = "/findById", method = RequestMethod.GET)
	@ResponseBody
	public Object findById(@RequestParam("id") Long id) throws Exception {
		Product prod = prodService.queryById(id);
		if (prod != null) {
			byte[] b = prod.getImage();
			BASE64Encoder encoder = new BASE64Encoder();
			String image = encoder.encode(b);
			prod.setReImage("data:image/jpeg;base64," + image);
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", prod, null);
		}

		return JsonResponseUtils.createJsonResponse(true, "0001", "111", null, null);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Object add(Product prod) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		prod.setImage(uploadFile);
		prod.setCreateName(manager);
		prod.setCreateDate(nowDate);
		prod.setUpdateName(manager);
		prod.setUpdateDate(nowDate);
		if (prodService.insert(prod)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(true, "0001", "111", null, null);
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public Object update(Product prod) throws Exception {
		String nowDate = DateUntil.format(new Date());
		String manager = (String) this.session.getAttribute("username");
		prod.setUpdateDate(nowDate);
		prod.setUpdateName(manager);
		if (prodService.update(prod)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", "1111", null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, "0001", "2222", null, null);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public Object delete(@RequestParam Long id) throws Exception {
		if (prodService.delete(id)) {
			return JsonResponseUtils.createJsonResponse(true, "0000", null, null, null);
		}
		return JsonResponseUtils.createJsonResponse(false, null, null, null, null);
	}
    /**
     * 图片文件上传
     * @param request
     * @param response
     * @return
     * @throws Exception
     *
     */
	@RequestMapping(consumes = "multipart/form-data", value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public Object upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		String newRealFileName = null;
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("file");
		String realFileName = file.getOriginalFilename();
		if (file.getSize() / 1024 >= 5 * 1024) {
			resultMap.put("code", "1");
			resultMap.put("msg", "图片大小不能超过5M");
			return JsonResponseUtils.createJsonResponse(true, "0001", "222", "图片不能超过5M", null);
		} else {
			System.out.println("获得文件名：" + realFileName);
			uploadFile = null;
			uploadFile = file.getBytes();
		}
		return JsonResponseUtils.createJsonResponse(true, "0000", "111", realFileName, null);
	}
}
