
package com.tm.ebank.invest.entity;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * 
 * date: 2017年4月27日 下午1:51:49 
 *
 * @author tony.tan
 * @version 
 *
 */
public class FundProd implements Serializable {
	/**
	 * 
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id;// id
	private String name;// 基金名称
	private String code;// 基金代码 000000
	private int type;// 基金类型 股票型 QDII 混合型
	private String currency;// 币种
	private Double curr_price;// 最新净值
	private String curr_date;// 净值日期
	private Double near_oneday;// 近一日
	private Double near_onemouth;// 近一月
	private Double near_threemouth;// 近三月
	private Double near_sixmouth;// 近六月
	private Double near_oneyear;// 近一年
	private int rate;// 评级
	private String create_name;
	private String create_date;
	private String update_name;
	private String update_date;
	private int status;

	public FundProd() {

		super();

	}


	public FundProd(Long id, String name, String code, int type, String currency, Double curr_price, String curr_date,
			Double near_oneday, Double near_onemouth, Double near_threemouth, Double near_sixmouth, Double near_oneyear,
			int rate, String create_name, String create_date, String update_name, String update_date, int status) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.type = type;
		this.currency = currency;
		this.curr_price = curr_price;
		this.curr_date = curr_date;
		this.near_oneday = near_oneday;
		this.near_onemouth = near_onemouth;
		this.near_threemouth = near_threemouth;
		this.near_sixmouth = near_sixmouth;
		this.near_oneyear = near_oneyear;
		this.rate = rate;
		this.create_name = create_name;
		this.create_date = create_date;
		this.update_name = update_name;
		this.update_date = update_date;
		this.status = status;
	}







	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}





	public Double getCurr_price() {
		return curr_price;
	}


	public void setCurr_price(Double curr_price) {
		this.curr_price = curr_price;
	}


	public String getCurr_date() {
		return curr_date;
	}


	public void setCurr_date(String curr_date) {
		this.curr_date = curr_date;
	}


	public Double getNear_oneday() {
		return near_oneday;
	}


	public void setNear_oneday(Double near_oneday) {
		this.near_oneday = near_oneday;
	}


	public Double getNear_onemouth() {
		return near_onemouth;
	}


	public void setNear_onemouth(Double near_onemouth) {
		this.near_onemouth = near_onemouth;
	}


	public Double getNear_threemouth() {
		return near_threemouth;
	}


	public void setNear_threemouth(Double near_threemouth) {
		this.near_threemouth = near_threemouth;
	}


	public Double getNear_sixmouth() {
		return near_sixmouth;
	}


	public void setNear_sixmouth(Double near_sixmouth) {
		this.near_sixmouth = near_sixmouth;
	}


	public Double getNear_oneyear() {
		return near_oneyear;
	}


	public void setNear_oneyear(Double near_oneyear) {
		this.near_oneyear = near_oneyear;
	}


	public int getRate() {
		return rate;
	}



	public void setRate(int rate) {
		this.rate = rate;
	}



	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_name() {
		return update_name;
	}

	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Fund [id=" + id + ", name=" + name + ", code=" + code + ", type=" + type + ", currency=" + currency
				+ ", curr_price=" + curr_price + ", curr_date=" + curr_date + ", near_oneday=" + near_oneday
				+ ", near_onemouth=" + near_onemouth + ", near_threemouth=" + near_threemouth + ", near_sixmouth="
				+ near_sixmouth + ", near_oneyear=" + near_oneyear + ", rate=" + rate + ", create_name=" + create_name
				+ ", create_date=" + create_date + ", update_name=" + update_name + ", update_date=" + update_date
				+ ", status=" + status + "]";
	}

}
