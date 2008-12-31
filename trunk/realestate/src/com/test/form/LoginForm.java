package com.test.form;

public class LoginForm {
	private String name=null;
	private String password=null;
	int type=0;//0表示普通用户，1表示房地产商；
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}	
