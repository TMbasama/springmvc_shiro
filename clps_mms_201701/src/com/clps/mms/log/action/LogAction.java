
package com.clps.mms.log.action;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.log.sys.service.ILogService;
import com.clps.mms.sys.action.BaseAction;
import com.clps.mms.sys.function.model.Function;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DataTableHelper;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月20日 下午5:22:48 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class LogAction extends BaseAction{

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Resource(name="logService")
	private ILogService service;
	private Map<String, Object> resultMap;
	public String getLogLst()throws Exception{
		DataTableHelper<LogModel> helper=new DataTableHelper<>();
		PageVo<LogModel> pageVo=helper.getTableData(this.httpRequest);
		pageVo=service.queryLogLst(pageVo);
		resultMap=helper.getReturnMap(pageVo);
		return "json";
	}
	public Map<String, Object> getResultMap() {
		return resultMap;
	}
	public void setResultMap(Map<String, Object> resultMap) {
		this.resultMap = resultMap;
	}
	
	

}

