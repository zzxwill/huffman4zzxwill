package com.realestate.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.ManagerDAO;
import com.realestate.pojo.Manager;
public class AdminLoginAction extends ActionSupport implements Action{

//	AdminLogin admin=new AdminLogin();
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	ManagerDAO managerDAO=new ManagerDAO();
	Manager manager=managerDAO.findById(new Integer(1));
	public String name2=manager.getName();
	public String password2=manager.getPassword();
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String nameDB=name2;
		String passwordDB=password2;
		/*
		 * ��import com.AdminLogin;�����������ݿ��е��û��������롣��ȡ�õ��û�����������бȽϣ�
		 */		
		if(getUsername().equals(nameDB)&&getPassword().equals(passwordDB)){
			/*
			 * ���ı�����ȡ��������getUsername;
			 */
			return "success";
		}else{
			return "error";
		}
	}
	public void validate() {
//		if(username==null||username.trim().equals("")){
		if(username==null||username.equals("")){
			addFieldError("username","�û�������Ϊ�գ�");
		}
		if(password==null||password.equals("")){
			addFieldError("password","���벻��Ϊ�գ�");
		}
	}
}
