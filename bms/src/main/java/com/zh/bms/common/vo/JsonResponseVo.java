package com.zh.bms.common.vo;



import java.io.Serializable;
/**
 * 
 * 系统标准返回数据类型
 * date: 2017年3月1日 下午2:08:09 
 *
 * @author tony.tan
 * @version 
 *
 */
public class JsonResponseVo implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）
	 */

	private static final long serialVersionUID = -6242354947776304699L;
	// 返回结果
	private boolean result;
	// 状态码
	private String code;
	// 状态描述
	private String desc;
	// 输出数据
	private Object data;
	private String count;
	
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "JsonResponseVo [result=" + result + ", code=" + code + ", desc=" + desc + ", data=" + data + "]";
	}

}
