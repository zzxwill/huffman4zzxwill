/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于获得estate的信息。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.pojo.Estate;
import com.realestate.pojo.House;

public class EstateInfoAction extends ActionSupport{
	private Integer id;
	private Integer houseId = 0;
	
	Estate estate = new Estate();
	
	EstateDAO dao = new EstateDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();

	public String execute(){
		if(dao.findById(id) != null){
			estate = dao.findById(id);
			
			if(!estate.getHouses().isEmpty()){
				houseId = ((House)estate.getHouses().iterator().next()).getId();
				//获得套房的id，貌似是不需要的
			}
			
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getHouseId(){
		return this.houseId;
	}
	
	public void setHouseId(Integer houseId){
		this.houseId = houseId;
	}
	
	public Estate getEstate() {
		return this.estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}
}
