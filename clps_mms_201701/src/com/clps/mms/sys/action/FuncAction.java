
package com.clps.mms.sys.action;

import java.util.Map;

import javax.annotation.Resource;

import com.clps.mms.sys.function.model.Function;
import com.clps.mms.sys.function.service.IFuncService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DataTableHelper;
import com.clps.mms.util.common.AjaxReturnInfo;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ClassName: FuncAction. Function: TODO ADD FUNCTION. date: 2017年1月16日
 * 下午3:44:33
 *
 * @author tony.tan
 * @version
 * 
 */
public class FuncAction extends BaseAction implements ModelDriven<Function> {
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name = "funcService")
	private IFuncService service;
	private Function func;
	private Map<String, Object> resultMap;
	
	
	
	public String findById()throws Exception{
		AjaxReturnInfo ari=null;
		Function queryFunc=service.queryFuncById(func.getId());
		if (null!=queryFunc) {
			ari=AjaxReturnInfo.success("成功");
			ari.add("func", queryFunc);
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
		resultMap=ari.getReturnMap();
		return "json";
	}
	
	public String getFuncLst() throws Exception{
		DataTableHelper<Function> helper=new DataTableHelper<>();
		PageVo<Function> pageVo=helper.getTableData(this.httpRequest);
		pageVo=service.queryFuncLst(pageVo);
		resultMap=helper.getReturnMap(pageVo);
		return "json";
	}
    public String add()throws Exception{
    	AjaxReturnInfo ari=null;
    	System.out.println(func);
    	String sName=this.session.get("username").toString();
    	func.setUpdateName(sName);
    	func.setCreateName(sName);
        if (service.insertFunc(func)) {
        	ari=AjaxReturnInfo.success("成功");
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
        resultMap=ari.getReturnMap();
    	return "input";
    }
    public String update() throws Exception{
    	AjaxReturnInfo ari=null;
    	System.out.println(func);
    	String sName=this.session.get("username").toString();
    	func.setUpdateName(sName);
    	if (service.updateFunc(func)) {
			ari=AjaxReturnInfo.success("成功");
		}else{
			ari=AjaxReturnInfo.failed("失败");
		}
    	resultMap=ari.getReturnMap();
    	return "input";
    }
	public Map<String, Object> getResultMap() {
		return resultMap;
	}

	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Function getModel() {
		if (func == null) {
			func = new Function();
		}
		return func;
	}

}
