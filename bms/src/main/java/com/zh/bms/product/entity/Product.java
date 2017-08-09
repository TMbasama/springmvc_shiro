
package com.zh.bms.product.entity;

/**
 * 
 * date: 2017年3月9日 下午1:59:52
 *
 * @author tony.tan
 * @version
 * 
 */
public class Product {
	private Long id;//产品id
	private String name;//产品名称
	private byte[] image;//产品图片
	private String reImage;
	private String price;//价格
	private String uniqueNum;//标示码
	private String createName;//创建人名
	private String createDate;//创建日期
	private String updateName;//更新人名
	private String updateDate;//更新日期
	private int status;//状态

	public Product() {

		super();

	}



	public Product(Long id, String name, byte[] image, String price, String uniqueNum, String createName,
			String createDate, String updateName, String updateDate, int status) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.uniqueNum = uniqueNum;
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


	public byte[] getImage() {
		return image;
	}



	public void setImage(byte[] image) {
		this.image = image;
	}



	public String getReImage() {
		return reImage;
	}



	public void setReImage(String reImage) {
		this.reImage = reImage;
	}



	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getUniqueNum() {
		return uniqueNum;
	}

	public void setUniqueNum(String uniqueNum) {
		this.uniqueNum = uniqueNum;
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
		return "Product [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", uniqueNum="
				+ uniqueNum + ", createName=" + createName + ", createDate=" + createDate + ", updateName=" + updateName
				+ ", updateDate=" + updateDate + ", status=" + status + "]";
	}

}
