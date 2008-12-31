/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于transfer，根据id获得developer
 * 对象，下一个页面（一个添加楼盘的表单）可以使
 * 用getter方法获得这些信息。
 * 
 */

package com.realestate.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.DeveloperDAO;
import com.realestate.pojo.Developer;

public class AddEstateActionTransfer extends ActionSupport{
	private Integer id;
	private Developer developer;
	private DeveloperDAO dao;
	
	public String execute(){
		developer = new Developer();
		dao = new DeveloperDAO();
		ActionContext actionContext = ActionContext.getContext(); 
		Map session = actionContext.getSession(); 
		
		id = (Integer) session.get("userid");
		//从session中获得id的值
		developer = dao.findById(id);

		return SUCCESS;
	}
	
	//gettet 与setter方法
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Developer getDeveloper(){
		return this.developer;
	}
	
	public void setDeveloper(Developer developer){
		this.developer = developer;
	}
}
