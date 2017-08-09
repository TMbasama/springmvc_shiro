
package com.tm.ebank.sys.entity;

import java.io.Serializable;


/**
 * 
 * date: 2017年2月28日 下午3:49:30
 *
 * @author tony.tan
 * @version
 * 
 */
public class Menu implements Serializable {
	/**
	 * 
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Long id; // 菜单id
	private String name; // 菜单名
	private String image; // 菜单图标
	private String url; // 菜单url
	private String description;// 菜单描述
	private Long parentId;// 父菜单id -1没有父菜单
	private String orderId;// 排序
	private String createName;// 创建人名
	private String createDate;// 创建时间
	private String updateName;// 更新人名
	private String updateDate;// 更新时间
	private boolean checked=false;//是否被选中
	private String status;// 状态

	public Menu() {

		super();

	}

	public Menu(Long id, String name, String image, String url, String description, Long parentId, String orderId,
			String createName, String createDate, String updateName, String updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.url = url;
		this.description = description;
		this.parentId = parentId;
		this.orderId = orderId;
		this.createName = createName;
		this.createDate = createDate;
		this.updateName = updateName;
		this.updateDate = updateDate;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	/*
	 * public boolean isRootNode() { return parentId==1; }
	 */
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Menu menu = (Menu) o;

		if (id != null ? !id.equals(menu.id) : menu.id != null)
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", image=" + image + ", url=" + url + ", description="
				+ description + ", parentId=" + parentId + ", orderId=" + orderId + ", createName=" + createName
				+ ", createDate=" + createDate + ", updateName=" + updateName + ", updateDate=" + updateDate
				+ ", status=" + status + "]";
	}

}
