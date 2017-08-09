package com.clps.mms.sys.role.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.clps.mms.log.sys.dao.LogMapper;
import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.sys.role.dao.RoleMapper;
import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.role.service.IRoleService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.common.StringUtil;
import com.clps.mms.util.exception.DataAccessException;
import com.clps.mms.util.log.LogHelper;

/**
 * ClassName: PermissionServiceImpl. 
 * date: 2017年1月9日 上午11:54:48
 * @author tony.tan
 * @version
 * 
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService {
	@Resource(name = "roleDao")
	private RoleMapper roleDao;
	@Resource(name="logDao")
	private LogMapper logDao;

	@Override
	public boolean insertRole(Role role) throws Exception {
		try {
			String date=DateFormat.format(new Date());
			role.setCreateDate(date);
			role.setUpdateDate(date);
			if (roleDao.insertRole(role)) {
				LogModel model=new LogModel();
				model.setCreateName(role.getCreateName());
				model.setCreateDate(role.getCreateDate());
				model.setOperateMenu("角色管理");
				model.setOperateName(role.getName());
				model.setResourceName("角色");
			    logDao.insert(LogHelper.getAddLogModel(model));
			    return true;
			}
		} catch (DataAccessException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean updateRoleById(Role role) throws Exception {
		try {
			String date=DateFormat.format(new Date());
			role.setUpdateDate(date);
			if (role.getName()!=null&&!role.getName().equals("")&&
			    role.getDeptId()!=null&&!role.getDeptId().equals("")&&
				role.getUpdateDate()!=null&&!role.getUpdateDate().equals("")&&
			    role.getUpdateName()!=null&&!role.getUpdateName().equals("")) {
			if(roleDao.updateRoleById(role)){
				LogModel model=new LogModel();
				model.setCreateName(role.getCreateName());
				model.setCreateDate(DateFormat.format(new Date()));
				model.setOperateMenu("角色管理");
				model.setOperateName(role.getName());
				model.setResourceName("角色");
				Map<String,Object> map=new HashMap<>();
				map.put("name", role.getName());
				map.put("deptId", role.getDeptId());
				logDao.insert(LogHelper.getUpdateModel(model, map));
				return true;
				 }
			}
		} catch (DataAccessException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public boolean deleteRoleById(Long id,String manager) throws Exception {
		try {
			Role role =this.queryRoleById(id);
			if (role!=null) {
				if(roleDao.deleteRoleById(id)){
				LogModel model=new LogModel();
				model.setCreateName(manager);
				model.setCreateDate(DateFormat.format(new Date()));
				model.setOperateMenu("角色管理");
				model.setOperateName(role.getName());
				model.setResourceName("角色");
				logDao.insert(LogHelper.getDeleteModel(model));
				return true;
				}
			}
		} catch (DataAccessException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return false;
	}
	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.clps.mms.sys.role.service.IRoleService#queryAll()
	 */
	@Override
	public List<Role> queryAll() throws Exception {
		
		return roleDao.queryAll();
	}
	@Override
	public PageVo<Role> queryRoleLst(PageVo<Role> pageVo) throws Exception {
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
		try {
			Long count = roleDao.queryRoleCount(map);
			List<Role> roleList = roleDao.queryRoleLst(map);
			pageVo.setList(roleList);
			pageVo.setAllcount(count.toString());
		} catch (DataAccessException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return pageVo;
	}

	@Override
	public Role queryRoleById(Long id) throws Exception {
		try {
			if (id!=null) {
				
				return roleDao.queryRoleById(id);
			}
		} catch (DataAccessException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}


}
