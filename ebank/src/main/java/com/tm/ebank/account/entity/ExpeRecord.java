
package com.tm.ebank.account.entity;
/**
 * 
 * date: 2017年5月1日 上午11:29:41 
 *
 * @author tony.tan
 * @version 
 * 
 */
public class ExpeRecord {
private Long id;
private Long acct_id;
private String create_short_time;
private String create_time;
private Double pay_amount;
private Double income_amount;
private Double avail_balance;
private Long other_acct_id;
private String other_name;
private String third_acct;
private String description;
private int status;
public ExpeRecord() {
	
	super();
	
}
public ExpeRecord(Long id, Long acct_id, String create_short_time, String create_time, Double pay_amount,
		Double income_amount, Double avail_balance, Long other_acct_id, String other_name, String description,
		int status) {
	super();
	this.id = id;
	this.acct_id = acct_id;
	this.create_short_time = create_short_time;
	this.create_time = create_time;
	this.pay_amount = pay_amount;
	this.income_amount = income_amount;
	this.avail_balance = avail_balance;
	this.other_acct_id = other_acct_id;
	this.other_name = other_name;
	this.description = description;
	this.status = status;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Long getAcct_id() {
	return acct_id;
}
public void setAcct_id(Long acct_id) {
	this.acct_id = acct_id;
}
public String getCreate_short_time() {
	return create_short_time;
}
public void setCreate_short_time(String create_short_time) {
	this.create_short_time = create_short_time;
}
public String getCreate_time() {
	return create_time;
}
public void setCreate_time(String create_time) {
	this.create_time = create_time;
}
public Double getPay_amount() {
	return pay_amount;
}
public void setPay_amount(Double pay_amount) {
	this.pay_amount = pay_amount;
}
public Double getIncome_amount() {
	return income_amount;
}
public void setIncome_amount(Double income_amount) {
	this.income_amount = income_amount;
}
public Double getAvail_balance() {
	return avail_balance;
}
public void setAvail_balance(Double avail_balance) {
	this.avail_balance = avail_balance;
}
public Long getOther_acct_id() {
	return other_acct_id;
}
public void setOther_acct_id(Long other_acct_id) {
	this.other_acct_id = other_acct_id;
}
public String getOther_name() {
	return other_name;
}
public void setOther_name(String other_name) {
	this.other_name = other_name;
}

public String getThird_acct() {
	return third_acct;
}
public void setThird_acct(String third_acct) {
	this.third_acct = third_acct;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "ExpeRecord [id=" + id + ", acct_id=" + acct_id + ", create_short_time=" + create_short_time
			+ ", create_time=" + create_time + ", pay_amount=" + pay_amount + ", income_amount=" + income_amount
			+ ", avail_balance=" + avail_balance + ", other_acct_id=" + other_acct_id + ", other_name=" + other_name
			+ ", third_acct=" + third_acct + ", description=" + description + ", status=" + status + "]";
}


}

