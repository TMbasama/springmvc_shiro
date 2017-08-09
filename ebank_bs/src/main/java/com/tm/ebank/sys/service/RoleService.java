
package com.tm.ebank.sys.service;

import java.util.Map;

import com.tm.ebank.common.vo.PageVo;
import com.tm.ebank.sys.entity.Role;

/**
 * 
 * date: 2017年4月1日 下午3:36:05 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface RoleService {
	/**
	 * 根据id查询角色
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	public Role queryById(Long id)throws Exception;
	/**
	 * 查询总数
	 * @param map
	 * @return
	 * @throws Exception
	 *
	 */
	public Integer queryCount(Map<String,Object> map)throws Exception;
	/**
	 * 分页查询角色列表
	 * @param pv
	 * @return
	 * @throws Exception
	 *
	 */
	public PageVo<Role> queryLst(PageVo<Role> pv)throws Exception;
	/**
	 * 添加角色
	 * @param role
	 * @return
	 * @throws Exception
	 *
	 */
	public int insert(Role role)throws Exception;
	/**
	 * 更新角色
	 * @param role
	 * @return
	 * @throws Exception
	 *
	 */
	public int update(Role role)throws Exception;
	/**
	 * 删除角色
	 * @param id
	 * @return
	 * @throws Exception
	 *
	 */
	public int delete(Long id)throws Exception;
}

