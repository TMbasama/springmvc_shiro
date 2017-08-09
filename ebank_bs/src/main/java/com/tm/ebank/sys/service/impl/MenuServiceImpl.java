
package com.tm.ebank.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tm.ebank.common.service.BaseService;
import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Menu;
import com.tm.ebank.sys.entity.Role;
import com.tm.ebank.sys.service.MenuService;
import com.tm.ebank.util.PageVoUtil;

/**
 * 
 * date: 2017年3月31日 上午10:11:34 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service
@SuppressWarnings("unchecked")
public class MenuServiceImpl extends BaseService implements MenuService{

	@Override
	public List<Menu> queryAll() throws Exception {
		
		
		return (List<Menu>) this.dao.selectList("menu.queryAll");
	}

	@Override
	public PageVo<Menu> queryLst(PageVo<Menu> pv) throws Exception {
		Map<String,Object> map=PageVoUtil.getMap(pv);
		List<Menu> menuList=(List<Menu>) this.dao.selectList("menu.queryLst", map);
		Integer count=this.queryCount(map);
		pv.setList(menuList);
		pv.setAllcount(count.toString());
		return pv;
	}

	@Override
	public Integer queryCount(Map<String, Object> map) throws Exception {
		
		
		return (Integer) this.dao.selectOne("menu.queryCount", map);
	}

	@Override
	public Menu queryById(Long id) throws Exception {
		
		
		return (Menu) this.dao.selectOne("menu.queryById", id);
	}

	@Override
	public Menu queryByName(String name) throws Exception {
		
		
		return (Menu) this.dao.selectOne("menu.queryByName", name);
	}

	@Override
	public int insert(Menu menu) throws Exception {
		
		
		return this.dao.insert("menu.insert", menu);
	}

	@Override
	public int update(Menu menu) throws Exception {
		
		
		return this.dao.update("menu.update", menu);
	}

	@Override
	public int delete(Long id) throws Exception {
		
		
		return this.dao.update("menu.delete", id);
	}

}

