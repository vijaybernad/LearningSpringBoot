package com.mine.vj.learningSpringBoot.models;

public class UserDetails {
	private String userName;
	private String password;
	
	public UserDetails(String userName, String password) {		
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	
	public String getPassword() {
		return password;
	}
}
