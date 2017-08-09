
/**
 * Project Name:clps_mms_copyright_201610
 * File Name:PageVo.java
 * Package Name:com.clps.mms.sys.vo
 * Date:2016年11月29日下午2:53:24
 * Copyright (c) 2016, tmbasama@163.com All Rights Reserved.
 *
 */
package com.zh.bms.common.vo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * ClassName: PageVo.
 * Function: TODO ADD FUNCTION.
 * Reason: TODO ADD REASON(可选).
 * date: 2016年11月29日 下午2:53:24 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class PageVo<T> {
		
		//自定义搜索条件存放
		private HashMap<String, String> other;
		private String pageWhere1;//查询条件一
		private String pageWhere2;//查询条件二
		private String pageWhere3;//查询条件三
		private String pageWhere4;//查询条件四
		private String sortName;//排序名
		private String sortOrder;//排序方式
		private List<String> listParams;
		//页码
		private int pageIndex;//请求参数
		
		//每页条数
		private int pageSize;//请求参数
		
		//数据
		private List<T> list;//返回参数
		
		//总条数
		private String allcount;//返回参数
		
		//时间范围搜索 yyyy-mm-dd HH:mm:ss
		private HashMap<String, String> dateTime;
		//时间范围搜索 yyyy-mm-dd HH:mm:ss
		private HashMap<String, String> dateTime2;
		
		
		public String getPageWhere1() {
			return pageWhere1;
		}
		public void setPageWhere1(String pageWhere1) {
			this.pageWhere1 = pageWhere1;
		}
		public String getPageWhere2() {
			return pageWhere2;
		}
		public void setPageWhere2(String pageWhere2) {
			this.pageWhere2 = pageWhere2;
		}
		public String getPageWhere3() {
			return pageWhere3;
		}
		public void setPageWhere3(String pageWhere3) {
			this.pageWhere3 = pageWhere3;
		}
		public String getPageWhere4() {
			return pageWhere4;
		}
		public void setPageWhere4(String pageWhere4) {
			this.pageWhere4 = pageWhere4;
		}
		public HashMap<String, String> getOther() {
			return other;
		}
		public void setOther(HashMap<String, String> other) {
			this.other = other;
		}
		
		public List<String> getListParams() {
			return listParams;
		}
		public void setListParams(List<String> listParams) {
			this.listParams = listParams;
		}
		public int getPageIndex() {
			return pageIndex;
		}
		public void setPageIndex(int pageIndex) {
			this.pageIndex = pageIndex;
		}
		public int getPageSize() {
			return pageSize;
		}
		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}
		
		public String getSortName() {
			return sortName;
		}
		public void setSortName(String sortName) {
			this.sortName = sortName;
		}
		public String getSortOrder() {
			return sortOrder;
		}
		public void setSortOrder(String sortOrder) {
			this.sortOrder = sortOrder;
		}
		public List<T> getList() {
			return list;
		}
		public void setList(List<T> list) {
			this.list = list;
		}
		public String getAllcount() {
			return allcount;
		}
		public void setAllcount(String allcount) {
			this.allcount = allcount;
		}
		public HashMap<String, String> getDateTime() {
			return dateTime;
		}
		public void setDateTime(HashMap<String, String> dateTime) {
			this.dateTime = dateTime;
		}
		public HashMap<String, String> getDateTime2() {
			return dateTime2;
		}
		public void setDateTime2(HashMap<String, String> dateTime2) {
			this.dateTime2 = dateTime2;
		}
		
		
}

