package com.realestate.action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.opensymphony.xwork2.ActionSupport;

import com.realestate.dao.NoticeDAO;

import com.realestate.pojo.Notice;

public class PlacardDetailsAction extends ActionSupport {
	
	private NoticeDAO dao;
	private Notice notice;   
	private int id;
     public String execute() throws Exception {
    	 dao=new NoticeDAO();
    	 notice=dao.findById(id);
		   return  SUCCESS;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}
}