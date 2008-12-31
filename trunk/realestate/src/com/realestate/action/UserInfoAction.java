/**
 * 
 */
package com.realestate.action;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.UserDAO;

import com.realestate.pojo.User;

/**
 * @author Administrator
 *
 */

public class UserInfoAction extends ActionSupport {
	private Integer id;
	private String name;
	private String password;
	private String repassword;
	private String idNum;
	private String email;
	private String telephone;
	private String realName;
	private String address;

	
	UserDAO dao=new UserDAO();
	 Session session=dao.getSession();
	 Transaction tran=session.beginTransaction(); 
	 
	 
	
	 
	public  String execute(){ 
		  User bean=new User();
		  Byte b1=0;
		  bean.setName(name);
		  bean.setRealName(realName);
		  bean.setPassword(password);
		  bean.setIdNum(idNum);
		  bean.setTelephone(telephone);
		  bean.setEmail(email); 
		  bean.setAddress(address);
		  bean.setStatus(b1);
		  dao.save(bean);
		  tran.commit();
		return SUCCESS;
		
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the username
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param username the username to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the repassword
	 */
	public String getRepassword() {
		return repassword;
	}
	/**
	 * @param repassword the repassword to set
	 */
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	/**
	 * @return the idNum
	 */
	public String getIdNum() {
		return idNum;
	}
	/**
	 * @param idNum the idNum to set
	 */
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
