package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;

public class TurnAction extends ActionSupport {
	private String type; // ���ڽ����ж��Ƿ�����(1)�����û�(0)����ע��



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
