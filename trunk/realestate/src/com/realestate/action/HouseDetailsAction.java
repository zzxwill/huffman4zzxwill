/**
 * 
 */
package com.realestate.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

/**
 * @author ³Â¾ýÁú
 * version 1.0
 * 2008Äê12ÔÂ6ÈÕ
 *
 */
public class HouseDetailsAction extends ActionSupport {
	private HouseDAO dao ;
	private  int eid;

	List<House> houseList ;
	public String execute() throws Exception {
		dao=new HouseDAO();
		 Query query=dao.getSession().createQuery("from House h where h.estate.id="+eid);
		 houseList=query.list();
		   return  SUCCESS;
	}
	
	/**
	 * @return the houseList
	 */
	public List<House> getHouseList() {
		return houseList;
	}
	/**
	 * @param houseList the houseList to set
	 */
	public void setHouseList(List<House> houseList) {
		this.houseList = houseList;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}


	
	
	}

	


