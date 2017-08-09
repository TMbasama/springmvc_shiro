package com.clps.mms.util.exception;

/**
 * Project Name:clps_citi_icg_mms_2016_10_12
 * File Name:MenuServiceException.java
 * Package Name:com.clps.study.java.mms.util.exception
 * Date:2016年10月19日下午5:43:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

/**
 * ClassName:MenuServiceException 
 * Function: TODO ADD FUNCTION. 
 * Date:     2016年10月19日 下午5:43:29 
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public class MenuServiceException extends Exception{
	public static final String MENU_EXIST="该菜单已存在!";
	public static final String MENU_NOT_EXIST="该菜单不存在!";
	public static final String NO_REPEATADD="不可重复添加菜单";
	public static final String ADD_SUCCESS="添加成功";
	public static final String DELETE_SUCCESS="删除成功";
	public static final String DELETE_FAILED="删除失败";
	public static final String UPDATE_SUCCESS="更新成功";
	public static final String UPDATE_FAILED="更新失败";
	public static final String QUERY_SUCCESS="查询成功";
	public static final String QUERY_FAILED="查询失败";
	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */

	public MenuServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MenuServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MenuServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MenuServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

