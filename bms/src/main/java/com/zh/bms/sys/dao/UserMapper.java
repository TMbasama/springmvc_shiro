
package com.zh.bms.sys.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.sys.entity.User;

/**
 * 
 * date: 2017年3月6日 下午1:39:18 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("userDao")
public interface UserMapper {
public boolean insertUser(User user)throws Exception;
public boolean updateUser(User user)throws Exception;
public List<User> queryUserLst(Map<String,Object> map)throws Exception;
public Integer queryUserCount(Map<String,Object> map)throws Exception;
public User queryById(Long id)throws Exception;
public User queryByName(String username)throws Exception;
public boolean deleteUser(Long id)throws Exception;
}

