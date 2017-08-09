
package com.zh.bms.sys.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.sys.dao.UserMapper;
import com.zh.bms.sys.entity.User;
import com.zh.bms.sys.service.IUserService;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * date: 2017年3月6日 下午1:56:20
 *
 * @author tony.tan
 * @version
 * 
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource(name = "userDao")
	private UserMapper userDao;

	@Override
	public User queryById(Long id) throws Exception {
		
		
		return userDao.queryById(id);
	}

	/**
	 * 
	 * @see com.zh.bms.sys.service.IUserService#insertUser(com.zh.bms.sys.entity.User)
	 */
	@Override
	public boolean insertUser(User user) throws Exception {

		return userDao.insertUser(user);
	}

	/**
	 * 
	 * @see com.zh.bms.sys.service.IUserService#queryUserCount(java.util.Map)
	 */
	@Override
	public Integer queryUserCount(Map<String, Object> map) throws Exception {

		return userDao.queryUserCount(map);
	}

	/**
	 * 
	 * @see com.zh.bms.sys.service.IUserService#deleteUser(java.lang.Long)
	 */
	@Override
	public boolean deleteUser(Long id) throws Exception {

		return userDao.deleteUser(id);
	}

	/**
	 * 
	 * @see com.zh.bms.sys.service.IUserService#queryUserLst(com.zh.bms.common.vo.PageVo)
	 */
	@Override
	public PageVo<User> queryUserLst(PageVo<User> pv) throws Exception {
		Map<String, Object> map = PageVoUtil.getMap(pv);
		List<User> userList = userDao.queryUserLst(map);
		Integer userCount = userDao.queryUserCount(map);
		pv.setList(userList);
		pv.setAllcount(userCount.toString());
		return pv;
	}


	@Override
	public User queryByName(String username) throws Exception {
		
		
		return userDao.queryByName(username);
	}

	@Override
	public boolean updateUser(User user) throws Exception {
		
		
		return userDao.updateUser(user);
	}


}
