
package com.tm.ebank.util;

import java.util.HashMap;
import java.util.Map;

import com.tm.ebank.common.vo.PageVo;

/**
 * 
 * date: 2017年3月9日 上午10:19:10 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class PageVoUtil {
public static Map<String,Object> getMap(PageVo pv){
	Integer page = pv.getPageIndex();
	Integer limitPage = pv.getPageSize();
	if (page < 1) {
		page = 1;
	}
	Integer offset = (page - 1) * limitPage;
	String sortName=pv.getSortName();
	String sortOrder=pv.getSortOrder();
	Map<String, Object> map = new HashMap<>();
	String pageWhere1=pv.getPageWhere1();
	String pageWhere2=pv.getPageWhere2();
	String pageWhere3=pv.getPageWhere3();
	String pageWhere4=pv.getPageWhere4();
	if (pageWhere1!=null&&pageWhere1!="") {
		System.out.println(pageWhere1);
		map.put("pageWhere1", pageWhere1);
	}
	if (pageWhere2!=null&&pageWhere2!="") {
		map.put("pageWhere2",pageWhere2);
	}
	if (pageWhere3!=null&&pageWhere3!="") {
		map.put("pageWhere3", pageWhere3);
	}
	if (pageWhere4!=null&&pageWhere4!="") {
		map.put("pageWhere4", pageWhere4);
	}
	map.put("offset", offset);
	map.put("limit", limitPage);
	map.put("sortName", sortName);
	map.put("sortOrder", sortOrder);
	return map;
}
}

