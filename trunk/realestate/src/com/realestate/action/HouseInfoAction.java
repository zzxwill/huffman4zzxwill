/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于获得house的详细信息。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

public class HouseInfoAction extends ActionSupport{
	private Integer id;
	private Integer estateid;
	private House house;
	private String houseType;
	private String[] map = {"零","一","二","三","四","五"};
	private short type;
	
	HouseDAO dao = new HouseDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();
	
	public String execute(){
		if(dao.findById(id) != null){
			house = dao.findById(id);
			
			type = house.getType();
			houseType = map[type/10]+"室"+map[type % 10]+"厅";
			
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
	
	public Integer getEstateid(){
		return this.estateid;
	}
	
	public void setEstateid(Integer estateid){
		this.estateid = estateid;
	}
	
	public House getHouse(){
		return this.house;
	}
	
	public void setHouse(House house){
		this.house = house;
	}
	
	public String getHouseType(){
		return this.houseType;
	}
	
	public void setHouseType(String houseType){
		this.houseType = houseType;
	}
}
