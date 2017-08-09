
package com.clps.mms.sys.function.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.log.sys.dao.LogMapper;
import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.sys.function.dao.FuncMapper;
import com.clps.mms.sys.function.model.Function;
import com.clps.mms.sys.function.service.IFuncService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.log.LogHelper;

/**
 * ClassName: FuncServiceImpl.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月16日 下午2:38:09 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("funcService")
public class FuncServiceImpl implements IFuncService{
	@Resource(name="funcDao")
    private FuncMapper funcDao;
	@Resource(name="logDao")
	private LogMapper logDao;
    
	public FuncServiceImpl() {
		
		super();
		// TODO Auto-generated constructor stub
	}

   /**
    *     
    * TODO 简单描述该方法的实现功能（可选）.
    * @see com.clps.mms.sys.function.service.IFuncService#queryFuncById(java.lang.Long)
    */
	@Override
	public Function queryFuncById(Long id) throws Exception {
		
		return funcDao.queryFuncById(id);
	}

	/**
	 * 
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.function.service.IFuncService#queryFuncByName(java.lang.String)
	 */
	@Override
	public Function queryFuncByName(String name) throws Exception {
		
		// TODO Auto-generated method stub
		return funcDao.queryFuncByName(name);
	}

	/**
	 * 
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.function.service.IFuncService#queryFuncLst(com.clps.mms.sys.vo.PageVo)
	 */
	@Override
	public PageVo<Function> queryFuncLst(PageVo<Function> pageVo) throws Exception {
		Integer page = pageVo.getPage();
		Integer limitPage = pageVo.getLimitPage();
		if (page < 1) {
			page = 1;
		}
		Integer offset = (page - 1) * limitPage;
		Map<String, String> where = pageVo.getWhere2();
		Map<String, String> sort = pageVo.getSort();
		Map<String, Object> map = new HashMap<>();
		map.put("offset", offset);
		map.put("limit", limitPage);
		map.put("sortname", sort.get("sortname"));
		map.put("sortorder", sort.get("sortorder"));
		Long count=funcDao.queryFuncCount(map);
		List<Function> funcList=funcDao.queryFuncLst(map);
		pageVo.setAllcount(count.toString());
		pageVo.setList(funcList);
		return pageVo;
	}

	
	@Override
	public boolean insertFunc(Function func) throws Exception {
		String date=DateFormat.format(new Date());
		func.setCreateDate(date);
		func.setUpdateDate(date);
		if (func.getName()!=null&&!func.getName().equals("")&&
			func.getCreateDate()!=null&&!func.getCreateDate().equals("")&&	
			func.getCreateName()!=null&&!func.getCreateName().equals("")&&
			func.getUpdateDate()!=null&&!func.getUpdateDate().equals("")&&
			func.getUpdateName()!=null&&!func.getUpdateName().equals("")) {
		if (funcDao.insertFunc(func)) {
			LogModel model=new LogModel();
			model.setCreateName(func.getCreateName());
			model.setCreateDate(func.getCreateDate());
			model.setOperateMenu("功能管理");
			model.setOperateName(func.getName());
			model.setResourceName("功能");
		    logDao.insert(LogHelper.getAddLogModel(model));
			return true;
		}
		}
		return false;
	}
	@Override
	public boolean updateFunc(Function func) throws Exception {
		String date=DateFormat.format(new Date());
		func.setUpdateDate(date);
		if (func.getName()!=null&&!func.getName().equals("")&&
			func.getUpdateDate()!=null&&!func.getUpdateDate().equals("")&&
			func.getUpdateName()!=null&&!func.getUpdateName().equals("")) {
			if(funcDao.updateFunc(func)){
				LogModel model=new LogModel();
				model.setCreateName(func.getUpdateName());
				model.setCreateDate(DateFormat.format(new Date()));
				model.setOperateMenu("功能管理");
				model.setOperateName(func.getName());
				model.setResourceName("功能");
				Map<String,Object> map=new HashMap<>();
				map.put("name", func.getName());
				logDao.insert(LogHelper.getUpdateModel(model, map));
				return true;
			}
		}
		return false;
	}


	/**
	 * 
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.function.service.IFuncService#deleteFunc(java.lang.Long)
	 */
	@Override
	public boolean deleteFunc(Long id,String manager) throws Exception {
		Function func=funcDao.queryFuncById(id);
		if (func!=null) {
			
			if(funcDao.deleteFunc(id)){
				LogModel model=new LogModel();
				model.setCreateName(manager);
				model.setCreateDate(DateFormat.format(new Date()));
				model.setOperateMenu("功能管理");
				model.setOperateName(func.getName());
				model.setResourceName("功能");
				logDao.insert(LogHelper.getDeleteModel(model));
				return true;
			}
		}
		return false;
	}



}

