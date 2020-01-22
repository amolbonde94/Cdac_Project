package com.cdac.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    
	
    private int roll_id;
	
    @NotNull
    @Size(min = 2, max = 30)
	private String username;
	private String password;
	private String cpassword;
	
	private String email;
	private String mobile;
	private String city;

	
	public int getRoll_id() {
		return roll_id;
	}

	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}
	
	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}