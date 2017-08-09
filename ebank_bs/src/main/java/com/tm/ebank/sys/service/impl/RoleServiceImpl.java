
package com.tm.ebank.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.service.RoleService;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年4月1日 下午3:40:19 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class RoleServiceImpl extends BaseService implements RoleService{

	@Override
	public Role queryById(Long id) throws Exception {
		
		
		return (Role) this.dao.selectOne("role.queryById", id);
	}
	
	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) this.dao.selectOne("role.queryCount", map);
	}
	@Override
	public PageVo<Role> queryLst(PageVo<Role> pv) throws Exception {
		Map<String,Object> map=PageVoUtil.getMap(pv);
		List<Role> roleList=(List<Role>) this.dao.selectList("role.queryLst", map);
		Integer count=(Integer) this.dao.selectOne("role.queryCount", map);
		pv.setList(roleList);
		pv.setAllcount(count.toString());
		return pv;
	}

	@Override
	public int insert(Role role) throws Exception {
		
		
		return  this.dao.insert("role.insert", role);
	}

	@Override
	public int update(Role role) throws Exception {
		
		
		return this.dao.update("role.update", role);
	}

	@Override
	public int delete(Long id) throws Exception {
		
		
		return this.dao.update("role.delete", id);
	}


}

