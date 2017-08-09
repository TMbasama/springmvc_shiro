package com.tm.ebank.common.util;

import com.tm.ebank.common.vo.JsonResponseVo;

/**
 * 返回数据的工具类
 * 
 * date: 2017年3月1日 下午2:35:47 
 *
 * @author tony.tan
 * @version 
 *
 */
public class JsonResponseUtils {

	/**
	 * 返回json数据的模板
	  * createJsonResponse(这里用一句话描述这个方法的作用)
	  * @Title: createJsonResponse
	  * @Description: TODO
	  * @param @param re
	  * @param @param code
	  * @param @param desc
	  * @param @param data
	  * @param @return    设定文件
	  * @return JsonResponseVo    返回类型
	  * @throws
	 */
	public static JsonResponseVo createJsonResponse(boolean re,String code,String desc,Object data,String count){
		JsonResponseVo jv = new JsonResponseVo();
		jv.setResult(re);
		if(re){
			jv.setCode("0000");
		}
		if(code!=null&&!code.equals("")){
			jv.setCode(code);
		}
		if(desc!=null&&!desc.equals("")){
			jv.setDesc(desc);
		}
		jv.setData(data);
		jv.setCount(count);
		return jv;
	}
	
}
