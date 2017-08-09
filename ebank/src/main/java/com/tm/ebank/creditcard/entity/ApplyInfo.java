
package com.tm.ebank.creditcard.entity;
/**
 * 
 * 
 * date: 2017年4月27日 下午1:50:19 
 *
 * @author tony.tan
 * @version 
 *
 */
public class ApplyInfo {
private Long id;//申请编号
private Long user_id;//用户编号
private String creditcard_num;//信用卡号
private String apply_name;//客户姓名
private String apply_idcard;//身份证号
private String city;//所在城市
private String card_type;//卡种
private String education;//学历
private String address;//详细地址
private String phone;//手机号码
private String email;//电子邮箱
private String apply_time;//申请时间
private String check_name;//审核人
private String check_time;//审核时间
private int check_status;//审核状态 1申请成功 2审核成功 3邮寄中 4用户接收完成

public ApplyInfo() {
	
	super();
	
}

public ApplyInfo(Long id, Long user_id, String creditcard_num, String apply_name, String apply_idcard, String city,
		String card_type, String education, String address, String phone, String email, String apply_time,
		String check_name, String check_time, int check_status) {
	super();
	this.id = id;
	this.user_id = user_id;
	this.creditcard_num = creditcard_num;
	this.apply_name = apply_name;
	this.apply_idcard = apply_idcard;
	this.city = city;
	this.card_type = card_type;
	this.education = education;
	this.address = address;
	this.phone = phone;
	this.email = email;
	this.apply_time = apply_time;
	this.check_name = check_name;
	this.check_time = check_time;
	this.check_status = check_status;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Long getUser_id() {
	return user_id;
}

public void setUser_id(Long user_id) {
	this.user_id = user_id;
}

public String getCreditcard_num() {
	return creditcard_num;
}

public void setCreditcard_num(String creditcard_num) {
	this.creditcard_num = creditcard_num;
}

public String getApply_name() {
	return apply_name;
}

public void setApply_name(String apply_name) {
	this.apply_name = apply_name;
}

public String getApply_idcard() {
	return apply_idcard;
}

public void setApply_idcard(String apply_idcard) {
	this.apply_idcard = apply_idcard;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCard_type() {
	return card_type;
}

public void setCard_type(String card_type) {
	this.card_type = card_type;
}

public String getEducation() {
	return education;
}

public void setEducation(String education) {
	this.education = education;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getApply_time() {
	return apply_time;
}

public void setApply_time(String apply_time) {
	this.apply_time = apply_time;
}

public String getCheck_name() {
	return check_name;
}

public void setCheck_name(String check_name) {
	this.check_name = check_name;
}

public String getCheck_time() {
	return check_time;
}

public void setCheck_time(String check_time) {
	this.check_time = check_time;
}

public int getCheck_status() {
	return check_status;
}

public void setCheck_status(int check_status) {
	this.check_status = check_status;
}

@Override
public String toString() {
	return "ApplyInfo [id=" + id + ", user_id=" + user_id + ", creditcard_num=" + creditcard_num + ", apply_name="
			+ apply_name + ", apply_idcard=" + apply_idcard + ", city=" + city + ", card_type=" + card_type
			+ ", education=" + education + ", address=" + address + ", phone=" + phone + ", email=" + email
			+ ", apply_time=" + apply_time + ", check_name=" + check_name + ", check_time=" + check_time
			+ ", check_status=" + check_status + "]";
}



}

