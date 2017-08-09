
package com.tm.ebank.sys.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

/**
 * Function: TODO ADD FUNCTION. date: 2017年2月21日 下午3:34:05
 *
 * @author tony.tan
 * @version
 * 
 */
public class User {
	private Long id;// id
	private Long organizationId;// 所属公司
	private String username;// 用户名
	private String password;// 密码
	private String salt;// 加密用的盐
	private int gender;//性别
	private String phone;//手机
	private String email;//电子邮箱
	private int age;//年龄
	private String brithday;//生日
	private List<Long> roleIds;// 拥有的角色集合
	private Boolean locked = Boolean.FALSE;
	private int status; //0不可用 1可用

	public User() {

		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, Long organizationId, String username, String password, String salt, List<Long> roleIds,
			Boolean locked) {
		super();
		this.id = id;
		this.organizationId = organizationId;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.roleIds = roleIds;
		this.locked = locked;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
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

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
    
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBrithday() {
		return brithday;
	}

	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}

	public List<Long> getRoleIds() {
		if (roleIds == null) {
			roleIds = new ArrayList<>();
		}
		return roleIds;
	}

	public void setRoleIds(List<Long> roleIds) {
		this.roleIds = roleIds;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * 
	 * getCredentialsSalt:获取拼接的盐.
	 * 
	 * @return
	 */
	public String getCredentialsSalt() {
		return username + salt;
	}

	/**
	 * 
	 * getRoleIdsStr:将roleId拼接成字符串.
	 * 
	 * @return
	 */
	public String getRoleIdsStr() {
		if (CollectionUtils.isEmpty(roleIds)) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (Long roleId : roleIds) {
			sb.append(roleId);
			sb.append(",");
		}
		return sb.toString();
	}

	/**
	 * 
	 * setRoleIdsStr:设置roleId字符串.
	 * 
	 * @param roleIdsStr
	 */
	public void setRoleIdsStr(String roleIdsStr) {
		if (StringUtils.isEmpty(roleIdsStr)) {
			return;
		}
		String[] roleIdStrs = roleIdsStr.split(",");
		for (String roleIdStr : roleIdStrs) {
			if (StringUtils.isEmpty(roleIdStr)) {
				continue;
			}
			this.getRoleIds().add(Long.valueOf(roleIdStr));
		}
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;
		User user = (User) o;
		if (this.id != null ? !this.id.equals(user.id) : user != null)
			return false;
		return true;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		return this.id != null ? id.hashCode() : 0;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", organizationId=" + organizationId + ", username=" + username + ", password="
				+ password + ", salt=" + salt + ", gender=" + gender + ", phone=" + phone + ", email=" + email
				+ ", age=" + age + ", brithday=" + brithday + ", roleIds=" + roleIds + ", locked=" + locked + "]";
	}


}
