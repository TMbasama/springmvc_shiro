
package com.zh.bms.mem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zh.bms.mem.entity.Member;

/**
 * 
 * date: 2017年3月9日 上午9:45:38 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Repository("memDao")
public interface MemberMapper {
	public Member queryById(Long id)throws Exception;
	public Member queryByCardNum(String cardNum)throws Exception;
	public Integer adminQueryCount(Map<String, Object> map)throws Exception;
	public List<Member> adminQueryLst(Map<String,Object> map)throws Exception;
	public Integer userQueryCount(Map<String, Object> map)throws Exception;
	public List<Member> userQueryLst(Map<String,Object> map)throws Exception;
	public boolean insert(Member mem)throws Exception;
	public boolean update(Member mem)throws Exception;
	public boolean delete(Long id)throws Exception;
}

