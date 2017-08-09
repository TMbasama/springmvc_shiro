
package com.zh.bms.sys.entity;

import java.io.Serializable;

/**
 * 
 * 
 * @author fanny
 * @version 
 *
 */
public class User implements Serializable{

	/**
	 * 
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id; //用户id
	private String username;//用户名
	private String password;//密码
	private String phone;//电话
	private String email;//电子邮箱
	private String birthday;//生日
	private String IDCard;
	private Long shop;//所属店
	private String shopName;//店铺名称
	private String roleName="暂无";//角色名称
	private String createName;//创建人名
	private String createDate;//创建日期
	private String updateName;//更新人名
	private String updateDate;//更新日期
	private Integer status;//状态 1 有效 0 删除
	
	
	public User() {
		
		super();
		
	}
	
	public User(Long id, String username, String password, String phone, String email, String birthday, String iDCard,
			Long shop, String createName, String createDate, String updateName, String updateDate, Integer status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.birthday = birthday;
		IDCard = iDCard;
		this.shop = shop;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Long getShop() {
		return shop;
	}
	public void setShop(Long shop) {
		this.shop = shop;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", email="
				+ email + ", birthday=" + birthday + ", IDCard=" + IDCard + ", shop=" + shop + ", createName="
				+ createName + ", createDate=" + createDate + ", updateName=" + updateName + ", updateDate="
				+ updateDate + ", status=" + status + "]";
	}
	
	

}

