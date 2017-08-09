package com.clps.mms.sys.menu.model;


/**
 * Project Name:Copy of clps_citi_icg_2016_10_02
 * File Name:Menu.java
 * Package Name:com.clps.study.java.mms.menu.model
 * Date:2016年11月6日 上午11:43:57
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * ClassName:Menu Function: Menu实体类 Date: 2016年10月17日 上午11:43:57
 * 
 * @author zhangyi
 * @since JDK 1.7
 */
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * Menu的无参构造函数
	 * 
	 */
	public Menu() {
		super();
		// TODO Auto-generated constructor stub

	}


	public Menu( String m_name, String m_description, String m_address, String m_createDate,
			String m_createName, String m_updateDate, String m_updateName, String m_image, 
			String m_superid) {
		super();
		//this.m_id = m_id;
		this.m_name = m_name;
		this.m_description = m_description;
		this.m_address = m_address;
		this.m_createDate = m_createDate;
		this.m_createName = m_createName;
		this.m_updateDate = m_updateDate;
		this.m_updateName = m_updateName;
		this.m_image = m_image;
		//this.m_state = m_state;
		this.m_superid = m_superid;
	}


	private Long m_id;// 菜单编号
	private String m_name;// 菜单名称
	private String m_description;// 菜单描述
	private String m_address;// 菜单地址
	private String m_createDate;// 菜单创建日期
	private String m_createName;// 菜单建立的人名
	private String m_updateDate;// 菜单修改日期
	private String m_updateName;// 菜单修改人名
	private String m_image;// 菜单图标
	private int m_state;// 菜单状态
	private String m_superid;// 子菜单名称
	private String m_parentid;//父菜单id
	private String m_order;
	private List<Menu> children;
	private String m_url;
	

	

	public String getM_url() {
		return m_url;
	}


	public void setM_url(String m_url) {
		this.m_url = m_url;
	}


	public String getM_parentid() {
		return m_parentid;
	}


	public void setM_parentid(String m_parentid) {
		this.m_parentid = m_parentid;
	}


	public String getM_order() {
		return m_order;
	}


	public void setM_order(String m_order) {
		this.m_order = m_order;
	}


	public List<Menu> getChildren() {
		return children;
	}


	public void setChildren(List<Menu> children) {
		this.children = children;
	}


	public Long getM_id() {
		return m_id;
	}


	public void setM_id(Long m_id) {
		this.m_id = m_id;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public String getM_description() {
		return m_description;
	}


	public void setM_description(String m_description) {
		this.m_description = m_description;
	}


	public String getM_address() {
		return m_address;
	}


	public void setM_address(String m_address) {
		this.m_address = m_address;
	}


	public String getM_createDate() {
		return m_createDate;
	}


	public void setM_createDate(String m_createDate) {
		this.m_createDate = m_createDate;
	}


	public String getM_createName() {
		return m_createName;
	}


	public void setM_createName(String m_createName) {
		this.m_createName = m_createName;
	}


	public String getM_updateDate() {
		return m_updateDate;
	}


	public void setM_updateDate(String m_updateDate) {
		this.m_updateDate = m_updateDate;
	}


	public String getM_updateName() {
		return m_updateName;
	}


	public void setM_updateName(String m_updateName) {
		this.m_updateName = m_updateName;
	}


	public String getM_image() {
		return m_image;
	}


	public void setM_image(String m_image) {
		this.m_image = m_image;
	}


	public int getM_state() {
		return m_state;
	}


	public void setM_state(int m_state) {
		this.m_state = m_state;
	}


	public String getM_superid() {
		return m_superid;
	}


	public void setM_superid(String m_superid) {
		this.m_superid = m_superid;
	}


	@Override
	public String toString() {
		return "Menu [m_id=" + m_id + ", m_name=" + m_name + ", m_description=" + m_description + ", m_address="
				+ m_address + ", m_createDate=" + m_createDate + ", m_createName=" + m_createName + ", m_updateDate="
				+ m_updateDate + ", m_updateName=" + m_updateName + ", m_image=" + m_image + ", m_state=" + m_state
				+ ", m_superid=" + m_superid + ", m_parentid=" + m_parentid + ", m_order=" + m_order + ", children="
				+ children + ", m_url=" + m_url + "]";
	}


	
}
