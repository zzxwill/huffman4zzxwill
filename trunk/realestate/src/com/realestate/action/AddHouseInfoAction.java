/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于添加套房的信息。根据提交的表单将house
 * 对象写入数据库。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.HouseDAO;
import com.realestate.pojo.House;

public class AddHouseInfoAction extends ActionSupport{
	private String action="addhouseinfo";
	private String id;
	private House house;
	private String msg;
	
	//house在数据库表中的字段定义
	private String estate;
	private String floor;
	private String type1;
	private String type2;
	private String status;
	private Short statusShort;
	private String price;
	private String area;
	
	HouseDAO dao = new HouseDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();
	
	EstateDAO estateDao = new EstateDAO();
	Session estateSession = estateDao.getSession();
	Transaction estateTran = estateSession.beginTransaction();
	
	public String execute(){
		//将字符串转为数字表示
		if(status.equals("已售")){
			statusShort = 0;
		}
		else
		if(status.equals("预约")){
			statusShort = 1;
		}
		else
		if(status.equals("待售")){
			statusShort = 2;
		}
		
		try{
			//设置house的属性
			house = new House();
			house.setArea(Integer.parseInt(area));
			house.setEstate(estateDao.findById(Integer.parseInt(id)));
			house.setFloor(Short.parseShort(floor));
			house.setPrice(Integer.parseInt(price));
			house.setStatus(statusShort);
			house.setType((short)(Short.parseShort(type1)*10+Short.parseShort(type2)));
			
			//存入数据库
			dao.save(house);
			tran.commit();
			session.close();
			
			return SUCCESS;
		}
		catch (Exception e){
			e.printStackTrace();
			return INPUT;
		}
	}
	
	//getter 和 setter方法
	public String getAction(){
		return this.action;
	}
	
	public void setAction(String action){
		this.action = action;
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getMsg(){
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}
	
	public String getEstate() {
		return this.estate;
	}

	public void setEstate(String estate) {
		this.estate = estate;
	}

	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getType1() {
		return this.type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return this.type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}
	
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public House getHouse(){
		return this.house;
	}
	
	public void setHouse(House house){
		this.house = house;
	}
}
