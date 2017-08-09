package com.tm.ebank.common.util;



import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import com.tm.ebank.common.vo.PageVo;

/**
 * ClassName: DataTableHelper.
 * Function: TODO ADD FUNCTION.
 * Reason: TODO ADD REASON(可选).
 * date: 2016年11月29日 上午11:06:38 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class DataTableHelper<T> {
	//页面发来的参数，原样返回
	private final String SECHO = "sEcho";
	//过滤前总记录数
	private final String ITOTALRECORDS = "iTotalRecords";
	//过滤后总记录数，我没有使用过滤，不太清楚和iTotalRecords的区别
	private final String ITOTALDISPLAYRECORDS = "iTotalDisplayRecords";
	private final String AADATA = "data";
	private final String IDISPLAYSTART = "iDisplayStart";
	private final String IDISPLAYLENGTH = "iDisplayLength";
	private final String SSORTDIR = "sSortDir_0";
	private final String ISORTCOL = "iSortCol_0";
	private final String MDATAPROP_ = "mDataProp_";

	private String sEcho = null;
	private int iDisplayStart = 0;
	private int iDisplayLength = 0;
	private int pageindex;
	private String SortCol = null;
	private String SortDir = null;

	/**
	 * 取值
	  * getTableData(这里用一句话描述这个方法的作用)
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的执行流程 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: getTableData
	  * @Description: TODO
	  * @param @param request
	  * @param @return    设定文件
	  * @return PageVo<T>    返回类型
	  * @throws
	 */
	public PageVo<T> getTableData(HttpServletRequest request) {
		PageVo<T> pv = new PageVo<T>();
		// 数据
		if (request.getParameter(SECHO) != null
				&& !request.getParameter(SECHO).equals("")) {
			sEcho = request.getParameter(SECHO);
			System.out.println(sEcho);
		}
		if (request.getParameter(IDISPLAYSTART) != null
				&& !request.getParameter(IDISPLAYSTART).equals("")) {
			iDisplayStart = Integer.parseInt(request
					.getParameter(IDISPLAYSTART));
			System.out.println(iDisplayStart);
		}
		if (request.getParameter(IDISPLAYLENGTH) != null
				&& !request.getParameter(IDISPLAYLENGTH).equals("")) {
			iDisplayLength = Integer.parseInt(request
					.getParameter(IDISPLAYLENGTH));
			System.out.println(iDisplayLength);
		}
		pageindex = iDisplayStart / iDisplayLength + 1;
		// 排序条件
		if (request.getParameter(SSORTDIR) != null
				&& !request.getParameter(SSORTDIR).equals("")) {
			SortDir = request.getParameter(SSORTDIR);
			System.out.println(SortDir);
		}
		if (request.getParameter(ISORTCOL) != null
				&& !request.getParameter(ISORTCOL).equals("")) {
			SortCol = request.getParameter(MDATAPROP_ + request.getParameter(ISORTCOL));
			System.out.println(SortCol);
		}
		if (request.getParameter("sSearch")!=null&&!request.getParameter("sSearch").equals("")) {
			System.out.println("sSearch:"+request.getParameter("sSearch"));
		}
		if (request.getParameter("sSearch_1")!=null&&!request.getParameter("sSearch_1").equals("")) {
			System.out.println("sSearch_1:"+request.getParameter("sSearch_1"));
		}
		LinkedHashMap<String, String> sort = new LinkedHashMap<String, String>();
		sort.put(SortCol, SortDir);
		//
		//pv.setSort(sort);
		pv.setSortName(SortCol);
		pv.setSortOrder(SortDir);
		pv.setPageIndex(pageindex);
		pv.setPageSize(iDisplayLength);
		return pv;
	}
	
	/**
	 * 返回值
	  * getReturnMap(这里用一句话描述这个方法的作用)
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的执行流程 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: getReturnMap
	  * @Description: TODO
	  * @param @param pv
	  * @param @return    设定文件
	  * @return HashMap<String,Object>    返回类型
	  * @throws
	 */
	public HashMap<String,Object> getReturnMap(PageVo<T> pv){
		HashMap<String,Object> resultMap=new HashMap<String,Object>();
		resultMap.put(SECHO,sEcho);
		resultMap.put(ITOTALRECORDS,pv.getAllcount());
		resultMap.put(ITOTALDISPLAYRECORDS,pv.getAllcount());
		if(pv.getAllcount()==0){
			resultMap.put(AADATA,null);
			
		}else{
			
			resultMap.put(AADATA,pv.getList());
		}
		System.out.println("list:"+pv.getList());
		return resultMap;
	}
}

