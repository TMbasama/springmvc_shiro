package com.clps.mms.util.jmail.properties;

/**
 * Project Name:Jmail
 * File Name:PropertiesConfig.java
 * Package Name:com.clps.study.jmail.configure
 * Date:2016年11月8日上午11:11:06
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/


import java.io.IOException;
import java.util.Properties;


/**
 * ClassName:PropertiesConfig <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年11月8日 上午11:11:06 <br/>
 * @author   zhangyi
 * @since    JDK 1.7 
 */
public class PropertiesConfig {
	private static final Properties PRO_CONFIG = new Properties();//创建一个properties对象
	private static final String PRO_CONFIG_FILE = "/sys_config.properties";
	
	/**
	 * 无参构造器
	 * 
	 * **/
	public PropertiesConfig() {

	}
	

	/**
	 * 通过properties文件配置参数，与代码分离
	 * 
	 * **/
	static{
		try {
			PRO_CONFIG.load(PropertiesConfig.class.getResourceAsStream(PRO_CONFIG_FILE));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 返回properties对象
	 * 
	 * **/
	public static Properties getConfiguration(){
		return PRO_CONFIG;
	}

}

