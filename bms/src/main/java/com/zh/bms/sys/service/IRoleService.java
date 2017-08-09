
package com.zh.bms.sys.service;


import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.entity.Role;

/**
 * 
 * date: 2017年3月20日 下午4:40:45 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IRoleService {
	public Role queryById(Long id)throws Exception;
	public PageVo<Role> queryLst(PageVo<Role> pv)throws Exception;
	public boolean insert(Role role)throws Exception;
	public boolean update(Role role)throws Exception;
	public boolean delete(Long id)throws Exception;
}

