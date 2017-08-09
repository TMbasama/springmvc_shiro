
package com.zh.bms.sys.service;

import java.util.List;
import java.util.Map;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.entity.User;

/**
 * 
 * date: 2017年3月6日 下午1:55:30 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface IUserService {
	public boolean insertUser(User user)throws Exception;
	public boolean updateUser(User user)throws Exception;
	public User queryById(Long id)throws Exception;
	public User queryByName(String username)throws Exception;
	public PageVo<User> queryUserLst(PageVo<User> pv)throws Exception;
	public Integer queryUserCount(Map<String,Object> map)throws Exception;
	public boolean deleteUser(Long id)throws Exception;
}

