
package com.tm.ebank.invest.entity;

/**
 * 
 * date: 2017年4月29日 上午10:57:49
 *
 * @author tony.tan
 * @version
 * 
 */
public class HoldingFundProd {
	private Long id;
	private Long acct_id;
	private Long prod_id;
	private String name;
	private Double hold_price;//持有基金总价
	private Double hold_amount;//持有总数
	private Double buy_worth;//买入时价格
	private Double net_worth;//当前最新价格
	private Double earn_price;//当前盈利
	private String buy_time;//买入时间
	private String create_time;
	private String create_name;
	private String update_time;
	private String update_name;
	private int status;

	public HoldingFundProd() {

		super();

	}

	public HoldingFundProd(Long id, Long acct_id, Long prod_id, Double hold_price, Double hold_amount, Double buy_worth,
			Double net_worth, Double earn_price, String buy_time, String create_time, String create_name,
			String update_time, String update_name, int status) {
		super();
		this.id = id;
		this.acct_id = acct_id;
		this.prod_id = prod_id;
		this.hold_price = hold_price;
		this.hold_amount = hold_amount;
		this.buy_worth = buy_worth;
		this.net_worth = net_worth;
		this.earn_price = earn_price;
		this.buy_time = buy_time;
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

	public Double getHold_price() {
		return hold_price;
	}

	public void setHold_price(Double hold_price) {
		this.hold_price = hold_price;
	}

	public Double getHold_amount() {
		return hold_amount;
	}

	public void setHold_amount(Double hold_amount) {
		this.hold_amount = hold_amount;
	}

	public Double getBuy_worth() {
		return buy_worth;
	}

	public void setBuy_worth(Double buy_worth) {
		this.buy_worth = buy_worth;
	}

	public Double getNet_worth() {
		return net_worth;
	}

	public void setNet_worth(Double net_worth) {
		this.net_worth = net_worth;
	}

	public Double getEarn_price() {
		return earn_price;
	}

	public void setEarn_price(Double earn_price) {
		this.earn_price = earn_price;
	}

	public String getBuy_time() {
		return buy_time;
	}

	public void setBuy_time(String buy_time) {
		this.buy_time = buy_time;
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
		return "HoldingFundProd [id=" + id + ", acct_id=" + acct_id + ", prod_id=" + prod_id + ", name=" + name
				+ ", hold_price=" + hold_price + ", hold_amount=" + hold_amount + ", buy_worth=" + buy_worth
				+ ", net_worth=" + net_worth + ", earn_price=" + earn_price + ", buy_time=" + buy_time
				+ ", create_time=" + create_time + ", create_name=" + create_name + ", update_time=" + update_time
				+ ", update_name=" + update_name + ", status=" + status + "]";
	}

	

}
