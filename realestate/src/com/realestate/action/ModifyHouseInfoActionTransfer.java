package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

public class ModifyHouseInfoActionTransfer extends ActionSupport{
	private String id;
	private House house;
	
	public String execute(){
		house = new House();
		HouseDAO dao = new HouseDAO();
		
		house = dao.findById(Integer.valueOf(id));
		
		return SUCCESS;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public House getHouse(){
		return this.house;
	}
	
	public void setHouse(House house){
		this.house = house;
	}
}
