
package com.zh.bms.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.sys.entity.Role;

/**
 * 
 * date: 2017年3月20日 下午4:27:09 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("roleDao")
public interface RoleMapper {
public Role queryById(Long id)throws Exception;
public Integer queryCount(Map<String,Object> map)throws Exception;
public List<Role> queryLst(Map<String,Object> map)throws Exception;
public boolean insert(Role role)throws Exception;
public boolean update(Role role)throws Exception;
public boolean delete(Long id)throws Exception;
}

