/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于删除套房。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

public class DelHouseInfoAction extends ActionSupport{
	private String action = "delhouseinfo";
	private String id;
	private String estateid;
	
	public String execute(){
		House house = new House();
		HouseDAO dao = new HouseDAO();
		Session session = dao.getSession();
		Transaction tran = session.beginTransaction();
		
		house = dao.findById(Integer.valueOf(id));
		estateid = house.getEstate().getId().toString();
		dao.delete(house);
		tran.commit();
		session.close();

		return SUCCESS;
	}
	
	public String getAction(){
		return this.action;
	}
	
	public void setAction(String action){
		this.action = action;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getEstateid(){
		return this.estateid;
	}
	
	public void setEstateid(String estateid){
		this.estateid = estateid;
	}
}
