package com.example.pojo;

public class User {
	private Long id;
	private String userName;
	private String userSex;
	private int userAge;

	public User() {

	}

	public User(String userName, String userSex, int userAge) {
		super();
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

}
