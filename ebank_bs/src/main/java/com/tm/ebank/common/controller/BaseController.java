package com.tm.ebank.common.controller;


import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public abstract class BaseController {
	protected Logger log = LoggerFactory.getLogger(getClass().getName());
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
	/**
	 * 直接以流的方式输出内容到前端
	 * 
	 */
	protected void print(String content, HttpServletResponse response) throws Exception{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(content);
		out.flush();
		out.close();
	}
	/**
	 * 数据校验，返回数据校验的结果（错误的message）；若校验成功，返回null<br>
	 * <b>使用方法：</b><br>
	 * 1、在vo中对本次提交的表单数据注解校验。如<br>
	 * 	&nbsp;&nbsp;&nbsp;@NotEmpty(message="账户名称不能为空")<br>
	 * 	&nbsp;&nbsp;&nbsp;@Pattern(regexp = "[a-zA-Z0-9_]{4,15}", message = "账户名称需由字母、数字、下划线组成")<br>
	 * 	&nbsp;&nbsp;&nbsp;private String username;<br><br>
	 * 2、在处理的controller中，对提交的vo使用注解@Valid标识需要验证。如<br>
	 *  &nbsp;&nbsp;&nbsp;public AjaxReturnInfo addNewAccountInfo(@Valid UserVo user, BindingResult result,...<br>
	 *  注意到，其后会紧跟BindingResult的变量，这是用来存放校验结果的<br><br>
	 * 3、在controller内部，参照以下样例，调用validate()方法验证校验，返回的结果即是验证结果。如：<br>
	 *  &nbsp;&nbsp;&nbsp;String errorMsg=validate(result);<br>
	 *  &nbsp;&nbsp;&nbsp;if(errorMsg!=null){<br>
	 *   &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;return AjaxRtnUtil.createJsonResponse(true, "1", errorMsg, null);//code=1 数据校验失败<br>
	 *   &nbsp;&nbsp;&nbsp;}<br><br>
	 * 2016年8月26日 Seven
	 */
	protected String validate(BindingResult result) throws Exception{
		StringBuffer errorMsg=null;
		if(result.hasErrors()){
			errorMsg=new StringBuffer();
			List<ObjectError> errorList=result.getAllErrors();
			boolean first=true;
			for(ObjectError error:errorList){
				if(first){
					errorMsg.append(error.getDefaultMessage());
					first=false;
				}else{
					errorMsg.append("<br>"+error.getDefaultMessage());
				}
			}
		}
		return errorMsg==null?null:errorMsg.toString();
	}
	/**
	 *  判断参数map中的必输字段是否有值
	 * 
	 */
	protected boolean checkRequire(Map<String,Object> map){
		boolean l = false;
		 for (String key : map.keySet()) {
			   if(map.get(key)==null||map.get(key).equals("")){
				   l=false;
				   break;
			   }else {
				   l=true;
			   }
			  }
		 return l;
	}
	
}
