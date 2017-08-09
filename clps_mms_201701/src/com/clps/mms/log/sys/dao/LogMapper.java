
package com.clps.mms.log.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.util.exception.DataAccessException;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月20日 下午2:31:45 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("logDao")
public interface LogMapper {
public boolean insert(LogModel model)throws DataAccessException;
public List<LogModel> queryLogLst(Map<String, Object> map)throws DataAccessException;
public Long queryLogCount(Map<String, Object> map)throws DataAccessException;
}

