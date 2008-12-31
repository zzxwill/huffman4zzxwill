/**
 * 
 */
package com.realestate.action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.DeveloperDAO;
import com.realestate.pojo.Developer;

/**
 * @author Administrator
 *
 */
public class DeveloperInfoAction extends ActionSupport{ 
	
	private String address;
	private String url;
	private String telephone;
	private String information;
	private String post;
	private String email;
	private String license;
	private String companyName;
	private String password;
	private String name;
	DeveloperDAO dao=new DeveloperDAO();
	Session session=dao.getSession();
	Transaction trans=session.beginTransaction();

	public String execute() throws Exception {
		
	
		Developer bean=new Developer();
		  Byte b1=0;
		  bean.setName(name);
		  bean.setCompanyName(companyName);
		  bean.setPost(post);
		  bean.setPassword(password);
		  bean.setLicense(license);
		  bean.setTelephone(telephone);
		  bean.setEmail(email); 
		  bean.setInformation(information);
		  bean.setUrl(url);
		  bean.setAddress(address);
		  bean.setStatus(b1);
		  dao.save(bean);
		  trans.commit();
		
		return SUCCESS;
		
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
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
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
	 * @return the information
	 */
	public String getInformation() {
		return information;
	}
	/**
	 * @param information the information to set
	 */
	public void setInformation(String information) {
		this.information = information;
	}
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
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
	 * @return the license
	 */
	public String getLicense() {
		return license;
	}
	/**
	 * @param license the license to set
	 */
	public void setLicense(String license) {
		this.license = license;
	}
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
