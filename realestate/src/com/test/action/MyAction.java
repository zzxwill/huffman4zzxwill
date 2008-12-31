package com.test.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {

	public String execute() throws Exception {
		ActionContext.getContext().put("username", "hello");
		return SUCCESS;
	}
	
}
