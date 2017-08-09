
package com.clps.mms.sys.function.service;


import com.clps.mms.sys.function.model.Function;
import com.clps.mms.sys.vo.PageVo;

/**
 * ClassName: IFuncService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月16日 下午2:36:31 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IFuncService {
	public Function queryFuncById(Long id)throws Exception;
	public Function queryFuncByName(String name)throws Exception;
	public PageVo<Function> queryFuncLst(PageVo<Function> pageVo)throws Exception;
	public boolean insertFunc(Function func)throws Exception;
	public boolean updateFunc(Function func)throws Exception;
	public boolean deleteFunc(Long id,String manager)throws Exception;
}

