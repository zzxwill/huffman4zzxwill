package com.realestate.action;

import java.util.List;

import org.hibernate.Query;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.DeveloperDAO;
import com.realestate.dao.EstateDAO;
import com.realestate.pojo.Developer;
import com.realestate.pojo.Estate;

public class SearchAction extends ActionSupport {
	private String content;
	private String type;
	private List<Developer> devResult;
	private List<Estate> estResult;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String execute() throws Exception {
		query();
		return SUCCESS;
	}
	@SuppressWarnings("unchecked")
	private void query() {
		if(type.equals("dev")){
			DeveloperDAO dao=new DeveloperDAO();
			dao.getSession().beginTransaction();
			devResult=(List<Developer>) dao.getSession().createQuery("from Developer where(companyName like '%"+content+"%')").list();
			dao.getSession().close();
		}
		else if(type.equals("est")){
			EstateDAO dao=new EstateDAO();
			dao.getSession().beginTransaction();
			estResult=(List<Estate>)dao.getSession().createQuery("from Estate where(name like '%"+content+"%')").list();
			
			dao.getSession().close();
		}
		
	}
	public List<Developer> getDevResult() {
		return devResult;
	}
	public void setDevResult(List<Developer> devResult) {
		this.devResult = devResult;
	}
	public List<Estate> getEstResult() {
		return estResult;
	}
	public void setEstResult(List<Estate> estResult) {
		this.estResult = estResult;
	}
	

}
