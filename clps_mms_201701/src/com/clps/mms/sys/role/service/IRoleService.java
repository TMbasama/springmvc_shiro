package com.clps.mms.sys.role.service;

import java.util.List;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.sys.vo.PageVo;
import com.clps.mms.util.exception.DataAccessException;

/**
 * 
 * ClassName: IRoleService.
 * Function: TODO ADD FUNCTION.
 * date: 2017年1月13日 下午2:34:54 
 *
 * @author tony.tan
 * @version 
 *
 */
public interface IRoleService {
/**
 * 
 * insertRole:添加角色. 
 * @param role
 * @return
 * @throws Exception
 */
public boolean insertRole(Role role)throws Exception;
/**
 * 
 * updateRoleById:根据id更新角色. 
 * @param role
 * @return
 * @throws Exception
 */
public boolean updateRoleById(Role role)throws Exception;
/**
 * 
 * deleteRoleById:根据id删除角色. 
 * @param id
 * @return
 * @throws Exception
 */
public boolean deleteRoleById(Long id,String manager)throws Exception;
/**
 * 
 * queryAll:查询所有的角色. 
 * @return
 * @throws Exception
 */
public List<Role> queryAll()throws Exception;
/**
 * 
 * queryRoleLst:分页查询角色. 
 * @param pageVo
 * @return
 * @throws Exception
 */
public PageVo<Role> queryRoleLst(PageVo<Role> pageVo)throws Exception;
/**
 * 
 * queryRoleById:根据id查询角色. 
 * @param id
 * @return
 * @throws Exception
 */

public Role queryRoleById(Long id)throws Exception;
}

