/**
 * 用户信息实体类
 */
package com.example.entity;

public class User {

	private String user_id;
	private String user_name;
	private String user_level;
	private String password;
	private String mobile;
	private boolean cancellation;
	private String token;
    
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_level() {
		return user_level;
	}
	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean isCancellation() {
		return cancellation;
	}

	public void setCancellation(boolean cancellation) {
		this.cancellation = cancellation;
	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_level=" + user_level + ", password="
				+ password + ", mobile=" + mobile + ",cancellation=" + cancellation +",token= " + token +"]";
	}
	
}
