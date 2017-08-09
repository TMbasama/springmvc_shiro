
package com.zh.bms.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.dao.RoleMapper;
import com.zh.bms.sys.entity.Role;
import com.zh.bms.sys.service.IRoleService;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * date: 2017年3月20日 下午4:42:00 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("roleService")
public class RoleServiceImpl implements IRoleService{
@Resource(name="roleDao")	
private RoleMapper roleDao;
	@Override
	public Role queryById(Long id) throws Exception {
		
		
		return roleDao.queryById(id);
	}

	@Override
	public PageVo<Role> queryLst(PageVo<Role> pv) throws Exception {
		Map<String,Object> map=PageVoUtil.getMap(pv);
		List<Role> roleList=roleDao.queryLst(map);
		Integer count=roleDao.queryCount(map);
		pv.setList(roleList);
		pv.setAllcount(count.toString());
		return pv;
	}

	@Override
	public boolean insert(Role role) throws Exception {
		
		return roleDao.insert(role);
	}

	@Override
	public boolean update(Role role) throws Exception {
		
		
		return roleDao.update(role);
	}

	@Override
	public boolean delete(Long id) throws Exception {
		
		
		return roleDao.delete(id);
	}

}

