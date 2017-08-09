package com.clps.mms.sys.menu.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.util.exception.MyDataException;

@Repository("menuDao")
public interface MenuMapper {

	/**
	 * 查询所有有菜单信息
	 * 
	 * @param query
	 *            alluser name,sex...
	 * @return List<Menu>
	 **/
	public List<Menu> queryAllMenu() throws MyDataException;

	/**
	 * 按ID查询菜单信息
	 * 
	 * @param id
	 * @return Menu
	 **/
	public Menu queryMenuById(Long id) throws MyDataException;

	/**
	 * 按菜单名查询菜单信息
	 * 
	 * @param name
	 * @return Menu
	 **/
	public Menu queryMenuByName(String name) throws MyDataException;

	/**
	 * 保存菜单信息
	 * 
	 * @param menu
	 * @return
	 **/
	public boolean saveMenu(Menu menu) throws MyDataException;

	/**
	 * 按菜单名删除菜单
	 * 
	 * @param id
	 * @return
	 **/
	public boolean deleteMenuById(Long id) throws MyDataException;

	/**
	 * 按Id更新菜单信息
	 * 
	 * @param menu
	 * @return
	 **/
	public boolean updateMenuById(Menu menu) throws MyDataException;

	public List<Menu> queryMenuList(Map<String, Object> map)throws MyDataException;
	
	public Long queryMenuCount(Map<String, Object> map)throws MyDataException;

}
