package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.opensymphony.xwork2.ActionSupport;

import com.realestate.dao.DeveloperDAO;

import com.realestate.pojo.Developer;

public class VoteAction extends ActionSupport {
	
		private DeveloperDAO dao=new DeveloperDAO();
		Transaction tran=dao.getSession().getTransaction();
 		private Developer developer;
		private  int id;

     public String execute() throws Exception {
    	 developer=dao.findById(id); 
    	 developer.setRank((short) (developer.getRank()+1));
    	 dao.save(developer);
    	 tran.begin();
    	 tran.commit();
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