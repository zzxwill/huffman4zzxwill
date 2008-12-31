package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;

public class TurnAction extends ActionSupport {
	private String type; // 用于接收判定是房产商(1)还是用户(0)进行注册



	public String execute() throws Exception {
		if ("usr".equals(type)) {
			return "usr";
		} else if("dev".equals(type))
			return "dev";
		else 
			return ERROR;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
