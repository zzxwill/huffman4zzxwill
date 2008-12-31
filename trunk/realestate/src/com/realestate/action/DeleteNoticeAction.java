package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.ManagerDAO;
import com.realestate.dao.NoticeDAO;
import com.realestate.pojo.House;
import com.realestate.pojo.Manager;
import com.realestate.pojo.Notice;
public class DeleteNoticeAction extends ActionSupport implements Action{

//	AdminLogin admin=new AdminLogin();
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int noticeID;
	
	
	
	
	
	
	
//	Notice notice=new Notice();
	
//	public String name2=manager.getName();
//	public String password2=manager.getPassword();
	public String execute() throws Exception {
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		// TODO Auto-generated method stub
//		String nameDB=name2;
//		String passwordDB=password2;
		/*
		 * ��import com.AdminLogin;�����������ݿ��е��û��������롣��ȡ�õ��û�����������бȽϣ�
		 */		
/*		if(getUsername().equals(nameDB)&&getPassword().equals(passwordDB)){
			
			return "success";
		}else{
			return "error";
		}*/
		try{
			
			NoticeDAO dao=new NoticeDAO();
			Notice notice=dao.findById(noticeID);
			//notice.setTitle("zzxwill");
			//notice.setContent("zzxwill");
		
			//����house������
		//	notice.setTitle(title);
		//	notice.setContent(content);
		
			//�������ݿ�
			session.delete(notice);
			tx.commit();
			session.close();
			
			return "success";
		}
		catch (Exception e){
			e.printStackTrace();
			return "error";
		}
		
	}
/*	public void validate() {
//		if(username==null||username.trim().equals("")){
		if(username==null||username.equals("")){
			addFieldError("username","�û�������Ϊ�գ�");
		}
		if(password==null||password.equals("")){
			addFieldError("password","���벻��Ϊ�գ�");
		}
	}*/

	public int getNoticeID() {
		return noticeID;
	}
	public void setNoticeID(int noticeID) {
		this.noticeID = noticeID;
	}
	
}
