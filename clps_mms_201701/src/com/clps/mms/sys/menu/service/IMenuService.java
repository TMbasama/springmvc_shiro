package com.clps.mms.sys.menu.service;


import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.clps.mms.sys.menu.model.Menu;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.exception.MenuServiceException;



public interface IMenuService {
	
	/**
	 * 查询所有有菜单信息
	 * @param    query alluser name,sex...
	 * @return  List<User>
	 * **/
	public List<Menu> getAllMenuInfo()throws MenuServiceException;
	
	/**
	 * 按名字查询菜单信息
	 * @param  username
	 * @return  List<User>
	 * **/
	public Menu getMenuInfoById(Long id)throws MenuServiceException;
	
	
	/**
	 * 按名字查询菜单信息
	 * @param  username
	 * @return  List<User>
	 * **/
	public Menu getMenuInfoByName(String name)throws MenuServiceException;
	
	/**
	 * 保存菜单信息
	 * @param   user
	 * @return  User
	 * **/
	@Transactional
	public boolean addMenuInfo( Menu menu)throws MenuServiceException;
	
	/**
	 * 按菜单名删除菜单
	 * @param  id
	 * @return  User
	 * **/
	@Transactional
	public boolean deleteMenuInfoById(Long id,String manager)throws MenuServiceException;
	
	/**
	 * 按Id更新菜单信息
	 * @param  id
	 * @return  User
	 * **/
	@Transactional
	public boolean updateMenuInfoById(Menu menu)throws MenuServiceException;
	
	public PageVo<Menu> findMenuList(PageVo<Menu> pageVo)throws MenuServiceException;

	public Long findMenuCount(Map<String, Object> map)throws MenuServiceException;
	
	public List<Menu> getRootList()throws MenuServiceException;
	
	public List<Menu> getChildrenList()throws MenuServiceException;
	
	public List<Menu> getOrgList()throws MenuServiceException;
}
