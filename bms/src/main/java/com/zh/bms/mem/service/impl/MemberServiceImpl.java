
package com.zh.bms.mem.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.bms.common.vo.PageVo;
import com.zh.bms.mem.dao.MemberMapper;
import com.zh.bms.mem.entity.Member;
import com.zh.bms.mem.service.MemberService;
import com.zh.bms.util.PageVoUtil;

/**
 * 
 * date: 2017年3月9日 上午10:12:29 
 *
 * @author tony.tan
 * @version 
 * 
 */
@Service("memService")
public class MemberServiceImpl implements MemberService{
	@Resource(name="memDao")
    private MemberMapper memDao;
	@Override
	public Member queryById(Long id) throws Exception {
		
		
		return memDao.queryById(id);
	}

	@Override
	public Integer adminQueryCount(Map<String, Object> map) throws Exception {
		
		
		return memDao.adminQueryCount(map);
	}

	@Override
	public PageVo<Member> adminQueryLst(PageVo<Member> pageVo) throws Exception {
		Map<String, Object> map = PageVoUtil.getMap(pageVo);
		List<Member> memList=memDao.adminQueryLst(map);
		Integer count=memDao.adminQueryCount(map);
		pageVo.setAllcount(count.toString());
		pageVo.setList(memList);
		return pageVo;
	}
	@Override
	public Integer userQueryCount(Map<String, Object> map) throws Exception {
		
		
		return memDao.userQueryCount(map);
	}

	@Override
	public PageVo<Member> userQueryLst(PageVo<Member> pageVo,Long shop) throws Exception {
		
		Map<String, Object> map = PageVoUtil.getMap(pageVo);
		map.put("shop", shop);
		List<Member> memList=memDao.userQueryLst(map);
		Integer count=memDao.userQueryCount(map);
		pageVo.setAllcount(count.toString());
		pageVo.setList(memList);
		return pageVo;
	}
	@Override
	public boolean insert(Member mem) throws Exception {
		
		if (memDao.queryByCardNum(mem.getCardNum())==null) {
			
			return memDao.insert(mem);
		}
		return false;
	}

	@Override
	public boolean delete(Long id) throws Exception {
		if (memDao.queryById(id)!=null) {
			return memDao.delete(id);
		}
		
		return false;
	}

	@Override
	public boolean update(Member mem) throws Exception {
		
		return memDao.update(mem);
	}



}

