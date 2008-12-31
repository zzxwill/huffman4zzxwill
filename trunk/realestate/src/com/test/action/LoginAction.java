package com.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.form.LoginForm;

public class LoginAction extends ActionSupport  implements ModelDriven{
	private LoginForm loginForm=null;
	public Object getModel() {
		return loginForm;
	}
	private boolean check(){
		
		return true;
	}
	public String execute() throws Exception {
		

		return SUCCESS;
		
	}
	public void validate() {
		this.addFieldError(null, null);
	}
	
	

}
