
package com.clps.mms.log.sys.service;

import java.util.List;
import java.util.Map;


import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.exception.DataAccessException;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月20日 下午2:51:12 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface ILogService {
	public boolean insert(LogModel model)throws DataAccessException;
	public PageVo<LogModel> queryLogLst(PageVo<LogModel> pageVo)throws DataAccessException;
}

