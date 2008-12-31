package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.pojo.Estate;

public class ModifyEstateActionTransfer extends ActionSupport{
	private int id;
	private Estate estate;
	
	public String execute(){
		estate = new Estate();
		EstateDAO dao = new EstateDAO();
		estate = dao.findById(id);
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Estate getEstate() {
		return estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}
	
}
