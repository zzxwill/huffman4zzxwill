/**
 * 
 */
package com.realestate.action;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

import com.realestate.dao.EstateDAO;

import com.realestate.pojo.Estate;

/**
 * @author ³Â¾ýÁú version 1.0 2008Äê11ÔÂ27ÈÕ
 */
 
public class MoreEstateAction extends ActionSupport {

	private final EstateDAO dao = new EstateDAO();
	private static  final int pageSize = 10;
	private static int i=0;

	List<Estate> estateList = null;
     
	public String execute() throws Exception {
		this.setEstateList(dao.findAllListByPage(pageSize, i));
		
		return SUCCESS;
	}


	/**
	 * @return the i
	 */
	public static int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public static void setI(int i) {
		MoreEstateAction.i = i;
	}

	/**
	 * @return the estateList
	 */
	public List<Estate> getEstateList() {
		return estateList;
	}

	/**
	 * @param estateList the estateList to set
	 */
	public void setEstateList(List<Estate> estateList) {
		this.estateList = estateList;
	}

}
