
package com.tm.ebank.invest.entity;
/**
 * 
 * 
 * date: 2017年4月27日 下午1:50:31 
 *
 * @author tony.tan
 * @version 
 *
 */
public class FinanceProd {
	private Long id; //理财产品id
	private String name;//名称
	private String currency;//币种
	private Integer start_amount;//起购金额
	private Integer deadline;//投资期限
	private String issue_date;//发行日期
	private Double profit;//预期年化收益率
	private String create_date;//创建时间
	private String create_name;//创建人名
	private String update_date;//更新时间
	private String update_name;//更新人名
	private int status;

	public FinanceProd() {

		super();

	}

	public FinanceProd(Long id, String name, String currency, Integer start_amount, Integer deadline, String issue_date,
			Double profit, String create_date, String create_name, String update_date, String update_name, int status) {
		super();
		this.id = id;
		this.name = name;
		this.currency = currency;
		this.start_amount = start_amount;
		this.deadline = deadline;
		this.issue_date = issue_date;
		this.profit = profit;
		this.create_date = create_date;
		this.create_name = create_name;
		this.update_date = update_date;
		this.update_name = update_name;
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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getStart_amount() {
		return start_amount;
	}

	public void setStart_amount(Integer start_amount) {
		this.start_amount = start_amount;
	}

	public Integer getDeadline() {
		return deadline;
	}

	public void setDeadline(Integer deadline) {
		this.deadline = deadline;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
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
		return "FinanceProd [id=" + id + ", name=" + name + ", currency=" + currency + ", start_amount=" + start_amount
				+ ", deadline=" + deadline + ", issue_date=" + issue_date + ", profit=" + profit + ", create_date="
				+ create_date + ", create_name=" + create_name + ", update_date=" + update_date + ", update_name="
				+ update_name + ", status=" + status + "]";
	}

}
