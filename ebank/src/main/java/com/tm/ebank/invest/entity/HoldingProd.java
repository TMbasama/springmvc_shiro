
package com.tm.ebank.invest.entity;

/**
 * 
 * date: 2017年4月29日 上午10:57:49
 *
 * @author tony.tan
 * @version
 * 
 */
public class HoldingProd {
	private Long id;
	private Long acct_id;
	private Long prod_id;
	private String name;
	private Long hold_amount;
	private Long avail_amount;
	private Double net_worth;
	private String worth_time;
	private String end_time;
	private String create_time;
	private String create_name;
	private String update_time;
	private String update_name;
	private int status;

	public HoldingProd() {

		super();

	}

	public HoldingProd(Long id, Long acct_id, Long prod_id, Long hold_amount, Long avail_amount, Double net_worth,
			String worth_time, String end_time, String create_time, String create_name, String update_time,
			String update_name, int status) {
		super();
		this.id = id;
		this.acct_id = acct_id;
		this.prod_id = prod_id;
		this.hold_amount = hold_amount;
		this.avail_amount = avail_amount;
		this.net_worth = net_worth;
		this.worth_time = worth_time;
		this.end_time = end_time;
		this.create_time = create_time;
		this.create_name = create_name;
		this.update_time = update_time;
		this.update_name = update_name;
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

	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHold_amount() {
		return hold_amount;
	}

	public void setHold_amount(Long hold_amount) {
		this.hold_amount = hold_amount;
	}

	public Long getAvail_amount() {
		return avail_amount;
	}

	public void setAvail_amount(Long avail_amount) {
		this.avail_amount = avail_amount;
	}

	public Double getNet_worth() {
		return net_worth;
	}

	public void setNet_worth(Double net_worth) {
		this.net_worth = net_worth;
	}

	public String getWorth_time() {
		return worth_time;
	}

	public void setWorth_time(String worth_time) {
		this.worth_time = worth_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HoldingProd [id=" + id + ", acct_id=" + acct_id + ", prod_id=" + prod_id + ", name=" + name
				+ ", hold_amount=" + hold_amount + ", avail_amount=" + avail_amount + ", net_worth=" + net_worth
				+ ", worth_time=" + worth_time + ", end_time=" + end_time + ", create_time=" + create_time
				+ ", create_name=" + create_name + ", update_time=" + update_time + ", update_name=" + update_name
				+ ", status=" + status + "]";
	}

	


}
