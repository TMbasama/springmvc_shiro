
package com.zh.bms.mem.entity;

/**
 * 
 * date: 2017年3月9日 上午9:48:01
 *
 * @author tony.tan
 * @version
 * 
 */
public class Member {
	private Long id;//会员id
	private String name;//会员名字
	private String gender;//会员性别
	private String birthday;//会员出生日期
	private String phone;//会员手机号码
	private String cardNum;//会员卡号
	private String level;//会员等级
	private Long shop;//所属店
	private String shopName;//店铺名称
	private Long totalAmount;//消费总金额
	private String createName;//创建会员的管理员名
	private String createDate;//创建时间
	private String updateName;//更新人名
	private String updateDate;//更新时间
	private int status;//状态

	public Member() {

		super();

	}

	public Member(Long id, String name, String gender, String birthday, String phone, String cardNum, String level,
			Long totalAmount, String createName, String createDate, String updateName, String updateDate, int status) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.cardNum = cardNum;
		this.level = level;
		this.totalAmount = totalAmount;
		this.createName = createName;
		this.createDate = createDate;
		this.updateName = updateName;
		this.updateDate = updateDate;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getShop() {
		return shop;
	}

	public void setShop(Long shop) {
		this.shop = shop;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", phone="
				+ phone + ", cardNum=" + cardNum + ", level=" + level + ", totalAmount=" + totalAmount + ", createName="
				+ createName + ", createDate=" + createDate + ", updateName=" + updateName + ", updateDate="
				+ updateDate + ", status=" + status + "]";
	}
	


}
