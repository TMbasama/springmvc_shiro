package com.clps.mms.sys.menu.service.impl;

import java.io.IOException;

/**
 * Project Name:Copy of clps_citi_icg_2016_10_02
 * File Name:ServiceImpl.java
 * Package Name:com.clps.study.java.mms.menu.service
 * Date:2016年10月17日上午11:43:09
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clps.mms.log.sys.dao.LogMapper;
import com.clps.mms.log.sys.model.LogModel;
import com.clps.mms.sys.menu.dao.MenuMapper;
import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.sys.menu.service.IMenuService;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.DateFormat;
import com.clps.mms.util.exception.MenuServiceException;
import com.clps.mms.util.exception.MyDataException;
import com.clps.mms.util.log.LogHelper;
import com.clps.mms.util.poi.IExcelHelper;
import com.clps.mms.util.poi.impl.ExcelHelperImpl;

/**
 * ClassName:MenuServiceImpl Function: MenuService的具体实现类 Date: 2016年11月6日
 * 上午11:43:09
 * 
 * @author zhangyi
 * @since JDK 1.7
 */
@Service("menuService")
public class MenuServiceImpl implements IMenuService {
	@Resource(name="menuDao")
	private MenuMapper menumapper;
	@Resource(name="logDao")
	private LogMapper logDao;
	/*public void setMenumapper(MenuMapper menumapper) {
		this.menumapper = menumapper;
	}

	@Autowired
	public MenuServiceImpl(MenuMapper menumapper) {
		this.setMenumapper(menumapper);

	}*/

	private List<Menu> list;
	private Menu menu;
	private Logger log;
	private static HSSFWorkbook wb;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	private IExcelHelper ieh;

	public MenuServiceImpl() {
		this.list = new ArrayList<>();
		this.menu = new Menu();
		this.ieh = new ExcelHelperImpl();
		this.log = Logger.getLogger("console");
	}

	/**
	 * 查询所有有菜单信息
	 * 
	 * @param allmenu
	 *            name...
	 * @return List<Menu>
	 **/
	@Override
	public List<Menu> getAllMenuInfo() throws MenuServiceException {
		try {
			if (menumapper != null) {
				list = menumapper.queryAllMenu();
				log.info(MenuServiceException.QUERY_SUCCESS);
			}
		} catch (MyDataException e) {
			e.printStackTrace();
			log.error(MenuServiceException.QUERY_FAILED);
		}
		return list;
	}

	/**
	 * 按Id查询菜单信息
	 * 
	 * @param Long
	 *            id
	 * @return Menu
	 **/
	@Override
	public Menu getMenuInfoById(Long id) throws MenuServiceException {
		System.out.println("getByIdService");
		try {
			return menu = menumapper.queryMenuById(id);
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(MenuServiceException.QUERY_FAILED);
		}
		return null;
	}

	/**
	 * 保存菜单信息
	 * 
	 * @param menu
	 * @return
	 **/
	@Override
	public boolean addMenuInfo(Menu menu) throws MenuServiceException {
		System.out.println("start menuaddservice");
		try {
			if(menumapper.saveMenu(menu)){
				LogModel model=new LogModel();
				model.setCreateName(menu.getM_createName());
				model.setCreateDate(menu.getM_createDate());
				model.setOperateMenu("菜单管理");
				model.setOperateName(menu.getM_name());
				model.setResourceName("菜单");
			    logDao.insert(LogHelper.getAddLogModel(model));
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 按Id删除菜单
	 * 
	 * @param id
	 * @return
	 **/
	@Override
	public boolean deleteMenuInfoById(Long id,String manager) throws MenuServiceException {
		System.out.println("delete");
		try {
			Menu menu=menumapper.queryMenuById(id);
			if (menu!=null) {
			 if(menumapper.deleteMenuById(id)){
						LogModel model=new LogModel();
						model.setCreateName(manager);
						model.setCreateDate(DateFormat.format(new Date()));
						model.setOperateMenu("菜单管理");
						model.setOperateName(menu.getM_name());
						model.setResourceName("菜单");
						logDao.insert(LogHelper.getDeleteModel(model));
						return true;
			 }
			} 
		} catch (Exception e) {
			log.error(MenuServiceException.DELETE_FAILED);
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 按Id更新菜单信息
	 * 
	 * @param menu
	 * @return
	 **/
	@Override
	public boolean updateMenuInfoById(Menu menu) throws MenuServiceException {
		try {
			if(menumapper.updateMenuById(menu)){
				LogModel model=new LogModel();
				model.setCreateName(menu.getM_updateName());
				model.setCreateDate(DateFormat.format(new Date()));
				model.setOperateMenu("菜单管理");
				model.setOperateName(menu.getM_name());
				model.setResourceName("角色");
				Map<String,Object> map=new HashMap<>();
				map.put("name", menu.getM_name());
				logDao.insert(LogHelper.getUpdateModel(model, map));
				return true;
			}
			log.info(MenuServiceException.UPDATE_SUCCESS);
		} catch (Exception e) {
			log.error(MenuServiceException.DELETE_FAILED);
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Long findMenuCount(Map<String, Object> map) throws MenuServiceException {
		try {
			return menumapper.queryMenuCount(map);
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PageVo<Menu> findMenuList(PageVo<Menu> pageVo) throws MenuServiceException {
		Integer page = pageVo.getPage() - 1;
		Integer limitPage = pageVo.getLimitPage();
		Map<String, Object> map = new HashMap<>();
		map.put("pageIndex", page);
		map.put("iDisplayLength", limitPage);
		Long count = this.findMenuCount(map);
		try {
			list = menumapper.queryMenuList(map);
			pageVo.setList(list);
			pageVo.setAllcount(count.toString());
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pageVo;
	}


	// 获得所有根节点菜单
	public List<Menu> getRootList() {
		try {
			List<Menu> menuList = menumapper.queryAllMenu();// 查出所有的菜单
			List<Menu> parentMenuList = new ArrayList<Menu>(); // 取出父亲结点的菜单
			if (menuList != null && menuList.size() > 0) {
				Iterator<Menu> menuIterator = menuList.iterator();
				while (menuIterator.hasNext()) {
					Menu menu = menuIterator.next();
					if (StringUtils.isEmpty(menu.getM_parentid())) {
						parentMenuList.add(menu);// 得到所有父节点菜单
					}
				}
			}
			return parentMenuList;
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<Menu> getChildrenList() {
		try {
			List<Menu> menuList = menumapper.queryAllMenu();
			List<Menu> childrenMenuList = new ArrayList<Menu>(); // 取出所有子菜单
			if (menuList != null && menuList.size() > 0) {
				Iterator<Menu> mIterator = menuList.iterator();
				while (mIterator.hasNext()) {
					Menu menu = mIterator.next();
					if (StringUtils.isNotEmpty(menu.getM_parentid())) {
						childrenMenuList.add(menu);
					}
				}
			}
			return childrenMenuList;
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 查出所有的菜单
		return null;
	}

	public List<Menu> getOrgList() {
		List<Menu> parentList = getRootList();
		List<Menu> childList = getChildrenList();

		for (Menu rMenu : parentList) {
			List<Menu> childrenList = new ArrayList<>();
			Menu rootMenu = rMenu;
			for (Menu cMenu : childList) {
				Menu childMenu = cMenu;
				if (childMenu.getM_parentid().equals(String.valueOf(rootMenu.getM_id()))) {
					childrenList.add(childMenu);// 找出匹配根节点的子菜单添加到集合中
					rootMenu.setChildren(childrenList);// 设置子节点
				}
			}
		}

		// 组织父子菜单
		// if (parentList != null && parentList.size() > 0) {
		// Iterator<Menu> iteratorp = parentList.iterator();
		// Iterator<Menu> iteratorc = childList.iterator();
		// while (iteratorp.hasNext()) {
		// List<Menu> childrenList = new ArrayList<>();
		// Menu rootMenu = iteratorp.next();// 遍历出根节点菜单
		// System.out.println("根节点" + rootMenu);
		// while (iteratorc.hasNext()) {
		// Menu childMenu = iteratorc.next();// 遍历出子菜单
		// System.out.println("子节点" + childMenu);
		//
		// if
		// (childMenu.getM_parentid().equals(String.valueOf(rootMenu.getM_id())))
		// {
		// childrenList.add(childMenu);// 找出匹配根节点的子菜单添加到集合中
		// rootMenu.setChildren(childrenList);// 设置子节点
		// }
		// }
		// }
		// }
		System.out.println(parentList);
		return parentList;
	}

	@Override
	public Menu getMenuInfoByName(String name) throws MenuServiceException {
		try {
			return menumapper.queryMenuByName(name);
		} catch (MyDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
