
package com.zh.bms.sys.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.common.tree.Tree;
import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.dao.MenuMapper;
import com.zh.bms.sys.entity.Menu;
import com.zh.bms.sys.service.IMenuService;
import com.zh.bms.test.tree.Node;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * date: 2017年2月28日 下午4:06:15
 *
 * @author tony.tan
 * @version
 * 
 */
@Service("menuService")
public class MenuServiceImpl implements IMenuService {
	@Resource(name = "menuDao")
	private MenuMapper menuDao;

	/**
	 * 
	 * @see com.zh.bms.sys.service.IMenuService#queryAll()
	 */
	@Override
	public List<Menu> queryAll() throws Exception {

		return menuDao.queryAll();

	}
	@Override
	public PageVo<Menu> queryLst(PageVo<Menu> pv) throws Exception {
		Map<String,Object> map=PageVoUtil.getMap(pv);
		List<Menu> menuList=menuDao.queryLst(map);
		Integer count=menuDao.queryCount(map);
		pv.setAllcount(count.toString());
		pv.setList(menuList);
		return pv;
	}
	@Override
	public Menu queryById(Long id) throws Exception {

		return menuDao.queryById(id);
	}

	@Override
	public Menu queryByName(String name) throws Exception {

		return menuDao.queryByName(name);
	}
	@Override
	public boolean insert(Menu menu) throws Exception {
		return menuDao.insert(menu);
	}

	@Override
	public boolean update(Menu menu) throws Exception {

		return menuDao.update(menu);
	}

	@Override
	public boolean delete(Long id) throws Exception {

		return menuDao.delete(id);
	}



}
