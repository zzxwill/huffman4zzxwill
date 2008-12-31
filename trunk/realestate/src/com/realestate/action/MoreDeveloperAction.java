package com.realestate.action;

import java.util.List;


import com.opensymphony.xwork2.ActionSupport;

import com.realestate.dao.DeveloperDAO;

import com.realestate.pojo.Developer;

public class MoreDeveloperAction extends ActionSupport {

	private DeveloperDAO dao;
	private static final int pageSize = 20;
	private  int i=0;
	private List<Developer> developerList;
	
     
	public String execute() throws Exception {
		dao = new DeveloperDAO();
		developerList = dao.findAllListByPage(pageSize, i);
		return SUCCESS;
	}



	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public List<Developer> getDeveloperList() {
		return developerList;
	}

	public void setDeveloperList(List<Developer> developerList) {
		this.developerList = developerList;
	}

}
