package org.woo.web.member.domain;

public class MemberVO {
	private String key;
	private String nickname;
	private String pw;
	private String name;
	private String email;
	private Integer phoneNumber;
	private Integer birthday;
	private String gender;
	private Integer auth;
	private String interlock_type;
	private String regdate;
	private String updatedate;
	private String authdate;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Integer getBirthday() {
		return birthday;
	}
	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAuth() {
		return auth;
	}
	public void setAuth(Integer auth) {
		this.auth = auth;
	}
	public String getInterlock_type() {
		return interlock_type;
	}
	public void setInterlock_type(String interlock_type) {
		this.interlock_type = interlock_type;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public String getAuthdate() {
		return authdate;
	}
	public void setAuthdate(String authdate) {
		this.authdate = authdate;
	}
	@Override
	public String toString() {
		return "MemberVO [key=" + key + ", nickname=" + nickname + ", pw=" + pw + ", name=" + name + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", birthday=" + birthday + ", gender=" + gender + ", auth=" + auth
				+ ", interlock_type=" + interlock_type + ", regdate=" + regdate + ", updatedate=" + updatedate
				+ ", authdate=" + authdate + "]";
	}
	
	
}
