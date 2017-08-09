
package com.zh.bms.mem.service;

import java.util.Map;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.mem.entity.Member;

/**
 * 
 * date: 2017年3月9日 上午10:11:47 
 *
 * @author tony.tan
 * @version 
 * 
 */
public interface MemberService {
	public Member queryById(Long id)throws Exception;
	public Integer adminQueryCount(Map<String, Object> map)throws Exception;
	public PageVo<Member> adminQueryLst(PageVo<Member> pageVo)throws Exception;
	public Integer userQueryCount(Map<String, Object> map)throws Exception;
	public PageVo<Member> userQueryLst(PageVo<Member> pageVo,Long shop)throws Exception;
	public boolean insert(Member mem)throws Exception;
	public boolean update(Member mem)throws Exception;
	public boolean delete(Long id)throws Exception;
}

