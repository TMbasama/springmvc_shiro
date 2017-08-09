
package com.zh.bms.store.entity;

/**
 * 
 * date: 2017年3月13日 下午2:18:15
 *
 * @author tony.tan
 * @version
 * 
 */
public class Store {
	private Long id; // 连锁店的Id
	private String name; // 连锁店的名称
	private int type;// 连锁店的类型
	private String address; // 连锁店的地址
	private String phone;// 连锁店的电话
	private String manager;// 连锁店的负责人
	private String createName;// 创建人名
	private String createDate;// 创建时间
	private String updateName;// 更新人名
	private String updateDate;// 更新时间
	private String del;// 状态 N可用，Y删除

	public Store() {

		super();

	}


	public Store(Long id, String name, int type, String address, String phone, String manager, String createName,
			String createDate, String updateName, String updateDate, String del) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.address = address;
		this.phone = phone;
		this.manager = manager;
		this.createName = createName;
		this.createDate = createDate;
		this.updateName = updateName;
		this.updateDate = updateDate;
		this.del = del;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
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


	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", type=" + type + ", address=" + address + ", phone=" + phone
				+ ", manager=" + manager + ", createName=" + createName + ", createDate=" + createDate + ", updateName="
				+ updateName + ", updateDate=" + updateDate + ", del=" + del + "]";
	}



}
