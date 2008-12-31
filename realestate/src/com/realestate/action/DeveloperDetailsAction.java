package com.realestate.action;

import com.opensymphony.xwork2.ActionSupport;

import com.realestate.dao.DeveloperDAO;

import com.realestate.pojo.Developer;

public class DeveloperDetailsAction extends ActionSupport {
	
		private DeveloperDAO dao;
		private int id;
		private Developer developer;

     public String execute() throws Exception {
    	 dao=new DeveloperDAO();
    	  developer=dao.findById(id);
		   return  SUCCESS;
	}

	public Developer getDeveloper() {
		return developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}