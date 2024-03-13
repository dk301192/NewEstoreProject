package com.estore.model;

public class User {
//user table
	//uid,email,pasword,pwd,name
	public int uid ;
	public String name;
	public String password;
	public String email;
	
	public User()
	{}
	public User(int uid,String name,String password,String email) {
		this.uid=uid;
		this.name=name;
		this.password=password;
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	
}
