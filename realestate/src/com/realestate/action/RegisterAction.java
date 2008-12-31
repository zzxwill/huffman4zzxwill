package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.realestate.pojo.User;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();//需要初始化
	private String repassword;
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String execute() throws Exception {
		return SUCCESS;
	}
	public User getModel() {
		return user;
	}
	
}
