package com.validate.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData 
{

	@NotBlank(message = "User name can not be empty !!")
	@Size(min = 4,max = 12,message = "User name must be between 4 to 12 characters")
	private String userName;
	
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	private String email;
	
	@AssertTrue(message = "must agree term and condition !!")
	private Boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Boolean getAgreed() {
		return agreed;
	}
	
	public void setAgreed(Boolean agreed) {
		this.agreed = agreed;
	}
	
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
	
}
