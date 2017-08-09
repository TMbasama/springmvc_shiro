
package com.clps.mms.util.log;

import java.util.Map;

import com.clps.mms.log.sys.model.LogModel;

/**
 * Function: TODO ADD FUNCTION.
 * date: 2017年2月20日 下午1:36:44 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class LogHelper {
private static final String IN="在";
private static final String ADD="添加";
private static final String UPDATE="更新";
private static final String DELETE="删除了";
private static final String PUT="把";
private static final String ON="上";
private static final String COMMA=",";
private static final String INFO_BEGIN="[";
private static final String INFO_MIDDLE="]改成了[";
private static final String INFO_END="]";
private static final StringBuffer sb=new StringBuffer();
public static LogModel getAddLogModel(LogModel logModel){
	sb.setLength(0);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getCreateName());
	sb.append(INFO_END);
	sb.append(IN);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getOperateMenu());
	sb.append(INFO_END);
	sb.append(ADD);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getResourceName());
	sb.append(INFO_END);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getOperateName());
	sb.append(INFO_END);
	logModel.setType(1);
	logModel.setContent(sb.toString());
	return logModel;
}
public static LogModel getUpdateModel(LogModel logModel,Map<String,Object> map){
	sb.setLength(0);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getCreateName());
	sb.append(INFO_END);
	sb.append(UPDATE);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getOperateMenu());
	sb.append(INFO_END);
	sb.append(COMMA);
	sb.append(PUT);
	for (Map.Entry<String, Object> entry: map.entrySet()) {
		sb.append(INFO_BEGIN);
        sb.append(entry.getKey());
        sb.append(INFO_MIDDLE);
        sb.append(entry.getValue());
        sb.append(INFO_END);
        sb.append(COMMA);
         
	}
	logModel.setType(2);
	logModel.setContent(sb.toString());
	return logModel;
}
public static LogModel getDeleteModel(LogModel logModel){
	sb.setLength(0);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getCreateName());
	sb.append(INFO_END);
	sb.append(PUT);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getOperateMenu());
	sb.append(INFO_END);
	sb.append(ON);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getResourceName());
	sb.append(INFO_END);
	sb.append(INFO_BEGIN);
	sb.append(logModel.getOperateName());
	sb.append(INFO_END);
	sb.append(DELETE);
	logModel.setType(3);
	logModel.setContent(sb.toString());
	return logModel;
}
}

