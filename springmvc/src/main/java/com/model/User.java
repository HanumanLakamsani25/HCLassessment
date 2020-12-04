package com.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
	@NotNull
	private int userId;
	@NotEmpty(message="custom username")
	@Size(min=5,max=15)
	private String userName;
	@NotEmpty(message="custom username")
	@Size(min=3,max=8)
	private String password;

	public User() {
		super();

	}

	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
