/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于获得套房列表。
 * 
 */

package com.realestate.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

public class HouseListAction extends ActionSupport{
	private String id;
	private List<House> houseList = new ArrayList<House>();
	private List<House> tmp = new ArrayList<House>();;
	private HouseDAO Hdao = new HouseDAO();
	
	@SuppressWarnings("unchecked")
	public String execute(){
		tmp = Hdao.findAll();

		for(int i = 0;i < tmp.size();i++){
			if(tmp.get(i).getEstate().getId().equals(Integer.valueOf(id))){
				houseList.add(tmp.get(i));
			}
		}
		
		return SUCCESS;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public List<House> getHouseList(){
		return houseList;
	}
	
	public void setHouseList(List<House> houseList){
		this.houseList = houseList;
	}
}
