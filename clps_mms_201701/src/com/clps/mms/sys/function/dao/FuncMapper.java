
package com.clps.mms.sys.function.dao;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.function.model.Function;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: FuncMapper.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月16日 下午2:02:16 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("funcDao")
public interface FuncMapper {
public Function queryFuncById(Long id)throws DataAccessException;
public Function queryFuncByName(String name)throws DataAccessException;
public List<Function> queryFuncLst(Map<String,Object> map)throws DataAccessException;
public Long queryFuncCount(Map<String,Object> map)throws DataAccessException;
public boolean insertFunc(Function perm)throws DataAccessException;
public boolean updateFunc(Function perm)throws DataAccessException;
public boolean deleteFunc(Long id)throws DataAccessException;
}

