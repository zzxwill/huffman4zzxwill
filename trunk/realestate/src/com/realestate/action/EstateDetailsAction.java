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
 * @author ³Â¾ýÁú
 *version 1.0
 *2008Äê11ÔÂ29ÈÕ
 */

public class EstateDetailsAction extends ActionSupport {
	private EstateDAO dao=new EstateDAO();
    private  int id; 
  
    Estate estate;

	 public String execute() throws Exception {		
		 estate=dao.findById(id);
		   return  SUCCESS;
	}
	

	


	/**
	 * @return the estate
	 */
	public Estate getEstate() {
		return estate;
	}





	/**
	 * @param estate the estate to set
	 */
	public void setEstate(Estate estate) {
		this.estate = estate;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}






	
	

}
