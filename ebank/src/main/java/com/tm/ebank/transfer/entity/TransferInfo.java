
package com.tm.ebank.transfer.entity;

/**
 * 
 * date: 2017年5月12日 下午10:43:16
 *
 * @author tony.tan
 * @version
 * 
 */
public class TransferInfo {
	private Long id;
	private Long user_id;
	private Long from_acct_id;
	private String from_acct_name;
	private Long to_acct_id;
	private String to_acct_name;
	private Double trans_amount;
	private String create_name;
	private String create_time;
	private String update_name;
	private String update_time;
	private int status;

	public TransferInfo() {

		super();

	}

	

	public TransferInfo(Long id, Long user_id, Long from_acct_id, String from_acct_name, Long to_acct_id,
			String to_acct_name, Double trans_amount, String create_name, String create_time, String update_name,
			String update_time, int status) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.from_acct_id = from_acct_id;
		this.from_acct_name = from_acct_name;
		this.to_acct_id = to_acct_id;
		this.to_acct_name = to_acct_name;
		this.trans_amount = trans_amount;
		this.create_name = create_name;
		this.create_time = create_time;
		this.update_name = update_name;
		this.update_time = update_time;
		this.status = status;
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

	public Long getFrom_acct_id() {
		return from_acct_id;
	}

	public void setFrom_acct_id(Long from_acct_id) {
		this.from_acct_id = from_acct_id;
	}

	public String getFrom_acct_name() {
		return from_acct_name;
	}

	public void setFrom_acct_name(String from_acct_name) {
		this.from_acct_name = from_acct_name;
	}

	public Long getTo_acct_id() {
		return to_acct_id;
	}

	public void setTo_acct_id(Long to_acct_id) {
		this.to_acct_id = to_acct_id;
	}

	public String getTo_acct_name() {
		return to_acct_name;
	}

	public void setTo_acct_name(String to_acct_name) {
		this.to_acct_name = to_acct_name;
	}

	public Double getTrans_amount() {
		return trans_amount;
	}

	public void setTrans_amount(Double trans_amount) {
		this.trans_amount = trans_amount;
	}

	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_name() {
		return update_name;
	}

	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}

	public String getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransferInfo [id=" + id + ", user_id=" + user_id + ", from_acct_id=" + from_acct_id
				+ ", from_acct_name=" + from_acct_name + ", to_acct_id=" + to_acct_id + ", to_acct_name=" + to_acct_name
				+ ", trans_amount=" + trans_amount + ", create_name=" + create_name + ", create_time=" + create_time
				+ ", update_name=" + update_name + ", update_time=" + update_time + ", status=" + status + "]";
	}

	

}
