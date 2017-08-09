
package com.tm.ebank.user.entity;


/**
 * Function: TODO ADD FUNCTION. date: 2017年2月21日 下午3:34:05
 *
 * @author tony.tan
 * @version
 * 
 */
public class User {
	private Long id;// id
	private String username;// 用户名
	private String password;// 密码
	private String salt;// 加密用的盐
	private String name;//客户真实姓名
	private String idcard;//身份证号
	private int gender;//性别 1男 0女
	private String phone;//手机
	private String email;//电子邮箱
	private int age;//年龄
	private String birthday;//生日
	private String create_time;
	private String create_name;
	private String update_time;
	private String update_name;
	private Boolean locked = Boolean.FALSE;
	private int status; //0不可用 1可用

	public User() {

		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id,  String username, String password, String salt, 
			Boolean locked) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.locked = locked;
	}
	
	

	public User(Long id, String username, String password, String salt, String name, String idcard, int gender,
			String phone, String email, int age, String birthday, String create_time, String create_name,
			String update_time, String update_name, Boolean locked, int status) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.name = name;
		this.idcard = idcard;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.birthday = birthday;
		this.create_time = create_time;
		this.create_name = create_name;
		this.update_time = update_time;
		this.update_name = update_name;
		this.locked = locked;
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


	public String getBirthday() {
		return birthday;
	}

	public void setBrithday(String birthday) {
		this.birthday = birthday;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", salt=" + salt + ", name="
				+ name + ", idcard=" + idcard + ", gender=" + gender + ", phone=" + phone + ", email=" + email
				+ ", age=" + age + ", birthday=" + birthday + ", create_time=" + create_time + ", create_name="
				+ create_name + ", update_time=" + update_time + ", update_name=" + update_name + ", locked=" + locked
				+ ", status=" + status + "]";
	}



}
