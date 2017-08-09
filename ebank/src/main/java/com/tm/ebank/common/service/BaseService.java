package com.tm.ebank.common.service;



import javax.annotation.Resource;

import com.tm.ebank.common.dao.BaseDao;

public abstract class BaseService {
	//protected Logger log=Logger.getLogger(getName());
	@Resource
	protected BaseDao dao;
	protected String getName(){
		return getClass().getName();
	}
	
}
