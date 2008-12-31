/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于添加套房的信息的transfer，获得楼盘
 * estate对象。下一个页面（添加套房的表单）可以
 * 使用。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.pojo.Estate;

public class AddHouseInfoActionTransfer extends ActionSupport{
	private Integer id;
	private Estate estate;
	
	EstateDAO dao = new EstateDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();
	
	public String execute(){
		estate = dao.findById(id);
		return SUCCESS;
	}
	
	//setter 和 getter方法
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Estate getEstate(){
		return this.estate;
	}
	
	public void setEstate(Estate estate){
		this.estate = estate;
	}
}
