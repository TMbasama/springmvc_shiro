
package com.clps.mms.sys.role.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clps.mms.sys.role.model.Role;
import com.clps.mms.util.exception.DataAccessException;

/**
 * ClassName: RoleMapper.
 * Function: TODO ADD FUNCTION.
 * Reason: TODO ADD REASON(可选).
 * date: 2017年1月9日 上午9:37:03 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("roleDao")
public interface RoleMapper {
/**
 * 
 * insertRole:添加角色. 
 * @param role
 * @return
 * @throws DataAccessException
 */
public boolean insertRole(Role role)throws DataAccessException;
/**
 * 
 * updateRoleById:根据ID更新角色. 
 * @param role
 * @return
 * @throws DataAccessException
 */
public boolean updateRoleById(Role role)throws DataAccessException;
/**
 * 
 * queryAll:查询所有的角色. 
 * @return
 * @throws DataAccessException
 */
public List<Role> queryAll()throws DataAccessException;
/**
 * 
 * queryRoleLst:分页查询用户角色. 
 * @param map
 * @return
 * @throws DataAccessException
 */
public List<Role> queryRoleLst(Map<String, Object> map)throws DataAccessException;
/**
 * 
 * queryRoleById:根据ID查询角色. 
 * @param id
 * @return
 * @throws DataAccessException
 */
public Role queryRoleById(Long id)throws DataAccessException;
/**
 * 
 * queryRoleByName:根据名字查询角色. 
 * @param name
 * @return
 * @throws DataAccessException
 */
public Role queryRoleByName(String name)throws DataAccessException;
/**
 * 
 * queryRoleCount:查询角色总条数. 
 * @param map
 * @return
 * @throws DataAccessException
 */
public Long queryRoleCount(Map<String,Object> map)throws DataAccessException;
/**
 * 
 * deleteRoleById:逻辑删除角色. 
 * @param perm
 * @return
 * @throws DataAccessException
 */
public boolean deleteRoleById(Long id)throws DataAccessException;
}

