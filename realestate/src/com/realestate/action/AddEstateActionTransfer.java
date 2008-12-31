/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * �ô�������transfer������id���developer
 * ������һ��ҳ�棨һ�����¥�̵ı�������ʹ
 * ��getter���������Щ��Ϣ��
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
		//��session�л��id��ֵ
		developer = dao.findById(id);

		return SUCCESS;
	}
	
	//gettet ��setter����
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
