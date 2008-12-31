package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.ManagerDAO;
import com.realestate.dao.NoticeDAO;
import com.realestate.pojo.House;
import com.realestate.pojo.Manager;
import com.realestate.pojo.Notice;
public class AddNoticeAction extends ActionSupport implements Action{

//	AdminLogin admin=new AdminLogin();
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String content;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
	NoticeDAO dao=new NoticeDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();
	
//	Notice notice=dao.findById(new Integer(1));
	Notice notice=new Notice();
	
//	public String name2=manager.getName();
//	public String password2=manager.getPassword();
	public String execute() throws Exception {
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
			//����house������
			notice.setTitle(title);
			notice.setContent(content);

		
			//�������ݿ�
			dao.save(notice);
			tran.commit();
			session.close();
			
			return "success";
		}
		catch (Exception e){
			e.printStackTrace();
			return "input";
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
	
}
