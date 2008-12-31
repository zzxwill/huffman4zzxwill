package com.realestate.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.ContractDAO;
import com.realestate.dao.DeveloperDAO;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.MessageDAO;
import com.realestate.pojo.Contract;
import com.realestate.pojo.Developer;
import com.realestate.pojo.Estate;
import com.realestate.pojo.Message;
@SuppressWarnings("unchecked")
public class UserPageAction extends ActionSupport{

	private String type;
	private List<Estate> estate;
	
	private Developer developer;
	private List<Message> message;
	private List<Contract> contract;
	
	private EstateDAO estateDao;
	private DeveloperDAO developerDao;
	private MessageDAO messageDao;
	private ContractDAO contractDao;
	

	public String execute(){
		developer = new Developer();
		
		estateDao = new EstateDAO();
		developerDao = new DeveloperDAO();
		messageDao = new MessageDAO();
		contractDao = new ContractDAO();
		
		ActionContext actionContext = ActionContext.getContext(); 
		Map session = actionContext.getSession(); 
		
		if(session.get("usertype") != null){
			type = (String)session.get("usertype");
			
			if(type.equals("dev")){		//是房地产商的处理
				message = messageDao.findAll();
				contract = contractDao.findAll();
				estate = estateDao.findAll();
			}
			else
			if(type.equals("usr")){		//是注册用户的处理
				message = messageDao.findAll();
				
				contract = contractDao.findAll();
			}
			
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public List<Message> getMessage(){
		return this.message;
	}
	
	public void setMessage(List<Message> message){
		this.message = message;
	}
	
	public List<Contract> getContract(){
		return this.contract;
	}
	
	public void setContract(List<Contract> contract){
		this.contract = contract;
	}
	
	public List<Estate> getEstate(){
		return this.estate;
	}
	
	public void setEstate(List<Estate> estate){
		this.estate = estate;
	}


}
