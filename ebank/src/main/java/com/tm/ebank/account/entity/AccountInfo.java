
package com.tm.ebank.account.entity;

/**
 * 
 * date: 2017年4月30日 上午11:11:26
 *
 * @author tony.tan
 * @version
 * 
 */
public class AccountInfo {
	private Long id;// 账户编号
	private Long acct_id;// 账户卡号
	private String acct_pwd;// 账户密码
	private String pwd_salt;// 密码的盐
	private String ower_name;// 持卡人名
	private String ower_idcard;// 持卡人身份证号
	private String ower_phone;// 持卡人手机号码
	private String ower_email;// 持卡人电子邮箱
	private String acct_nickname;// 账户别名
	private String acct_currency;// 币种
	private Double acct_balance;// 账户余额
	private int sign_status;// 签约状态
	private int acct_status;// 账户状态
	private int online_bank;// 网上银行
	private int mobile_bank;// 手机银行
	private int acct_payment;// 账户支付
	private String create_time;// 创建时间
	private String create_name;// 创建人名
	private String update_time;// 更新时间
	private String update_name;// 更新人名

	public AccountInfo() {

		super();

	}

	public AccountInfo(Long id, Long acct_id, String acct_pwd, String pwd_salt, String ower_name, String ower_idcard,
			String ower_phone, String ower_email, String acct_nickname, String acct_currency, Double acct_balance,
			int sign_status, int acct_status, int online_bank, int mobile_bank, int acct_payment, String create_time,
			String create_name, String update_time, String update_name) {
		super();
		this.id = id;
		this.acct_id = acct_id;
		this.acct_pwd = acct_pwd;
		this.pwd_salt = pwd_salt;
		this.ower_name = ower_name;
		this.ower_idcard = ower_idcard;
		this.ower_phone = ower_phone;
		this.ower_email = ower_email;
		this.acct_nickname = acct_nickname;
		this.acct_currency = acct_currency;
		this.acct_balance = acct_balance;
		this.sign_status = sign_status;
		this.acct_status = acct_status;
		this.online_bank = online_bank;
		this.mobile_bank = mobile_bank;
		this.acct_payment = acct_payment;
		this.create_time = create_time;
		this.create_name = create_name;
		this.update_time = update_time;
		this.update_name = update_name;
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

	public String getAcct_pwd() {
		return acct_pwd;
	}

	public void setAcct_pwd(String acct_pwd) {
		this.acct_pwd = acct_pwd;
	}

	public String getPwd_salt() {
		return pwd_salt;
	}

	public void setPwd_salt(String pwd_salt) {
		this.pwd_salt = pwd_salt;
	}

	public String getOwer_name() {
		return ower_name;
	}

	public void setOwer_name(String ower_name) {
		this.ower_name = ower_name;
	}

	public String getOwer_idcard() {
		return ower_idcard;
	}

	public void setOwer_idcard(String ower_idcard) {
		this.ower_idcard = ower_idcard;
	}

	public String getOwer_phone() {
		return ower_phone;
	}

	public void setOwer_phone(String ower_phone) {
		this.ower_phone = ower_phone;
	}

	public String getOwer_email() {
		return ower_email;
	}

	public void setOwer_email(String ower_email) {
		this.ower_email = ower_email;
	}

	public String getAcct_nickname() {
		return acct_nickname;
	}

	public void setAcct_nickname(String acct_nickname) {
		this.acct_nickname = acct_nickname;
	}

	public String getAcct_currency() {
		return acct_currency;
	}

	public void setAcct_currency(String acct_currency) {
		this.acct_currency = acct_currency;
	}

	public Double getAcct_balance() {
		return acct_balance;
	}

	public void setAcct_balance(Double acct_balance) {
		this.acct_balance = acct_balance;
	}

	public int getSign_status() {
		return sign_status;
	}

	public void setSign_status(int sign_status) {
		this.sign_status = sign_status;
	}

	public int getAcct_status() {
		return acct_status;
	}

	public void setAcct_status(int acct_status) {
		this.acct_status = acct_status;
	}

	public int getOnline_bank() {
		return online_bank;
	}

	public void setOnline_bank(int online_bank) {
		this.online_bank = online_bank;
	}

	public int getMobile_bank() {
		return mobile_bank;
	}

	public void setMobile_bank(int mobile_bank) {
		this.mobile_bank = mobile_bank;
	}

	public int getAcct_payment() {
		return acct_payment;
	}

	public void setAcct_payment(int acct_payment) {
		this.acct_payment = acct_payment;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public String getUpdate_name() {
		return update_name;
	}

	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}

	@Override
	public String toString() {
		return "AccountInfo [id=" + id + ", acct_num=" + acct_id + ", acct_pwd=" + acct_pwd + ", pwd_salt=" + pwd_salt
				+ ", ower_name=" + ower_name + ", ower_idcard=" + ower_idcard + ", ower_phone=" + ower_phone
				+ ", ower_email=" + ower_email + ", acct_nickname=" + acct_nickname + ", acct_currency=" + acct_currency
				+ ", acct_balance=" + acct_balance + ", sign_status=" + sign_status + ", acct_status=" + acct_status
				+ ", online_bank=" + online_bank + ", mobile_bank=" + mobile_bank + ", acct_payment=" + acct_payment
				+ ", create_time=" + create_time + ", create_name=" + create_name + ", update_time=" + update_time
				+ ", update_name=" + update_name + "]";
	}

}
