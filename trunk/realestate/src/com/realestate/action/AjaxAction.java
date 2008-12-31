package com.realestate.action;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import com.opensymphony.xwork2.ActionSupport;

public class AjaxAction extends ActionSupport{
	private String name;
	private int age;
	private Date birthday;
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public void validate() {
		Set<String> users=new HashSet<String>();
		users.add("max");
		users.add("scott");
		if(users.contains(name)){
			addFieldError("name", "你输入的用户已经存在");
		}
	}
	
	
}
