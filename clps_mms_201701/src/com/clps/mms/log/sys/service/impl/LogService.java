
package com.clps.mms.log.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.log.sys.dao.LogMapper;
import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.log.sys.service.ILogService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.exception.DataAccessException;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月20日 下午2:52:33 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("logService")
public class LogService implements ILogService{
@Resource(name="logDao")
private LogMapper logDao;
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.log.sys.service.ILogService#insert(com.clps.mms.log.sys.model.LogModel)
	 */
	@Override
	public boolean insert(LogModel model) throws DataAccessException {
		
		// TODO Auto-generated method stub
		return logDao.insert(model);
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.log.sys.service.ILogService#queryLogLst(com.clps.mms.sys.vo.PageVo)
	 */
	@Override
	public PageVo<LogModel> queryLogLst(PageVo<LogModel> pageVo) throws DataAccessException {
		Integer page = pageVo.getPage();
		Integer limitPage = pageVo.getLimitPage();
		if (page < 1) {
			page = 1;
		}
		Integer offset = (page - 1) * limitPage;
		Map<String, String> where = pageVo.getWhere2();
		Map<String, String> sort = pageVo.getSort();
		Map<String, Object> map = new HashMap<>();
		String pageWhere1=where.get("pageWhere1");
		String pageWhere2=where.get("pageWhere2");
		String pageWhere3=where.get("pageWhere3");
		String pageWhere4=where.get("pageWhere4");
		System.out.println(pageWhere1);
		System.out.println(pageWhere2);
		System.out.println(pageWhere3);
		System.out.println(pageWhere4);
		map.put("pageWhere1", pageWhere1);
		map.put("pageWhere2", pageWhere2);
		map.put("pageWhere3", pageWhere3);
		map.put("pageWhere4", pageWhere4);
		map.put("offset", offset);
		map.put("limit", limitPage);
		map.put("sortname", sort.get("sortname"));
		map.put("sortorder", sort.get("sortorder"));
		Long count =logDao.queryLogCount(map);
		List<LogModel>list=logDao.queryLogLst(map);
		pageVo.setList(list);
		pageVo.setAllcount(count.toString());
		return pageVo;
	}

}

