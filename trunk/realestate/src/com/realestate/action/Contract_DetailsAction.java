/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于根据id查找到contract对象，下一个
 * 页面可通过getter方法得到。
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.ContractDAO;
import com.realestate.pojo.Contract;

public class Contract_DetailsAction extends ActionSupport{
	private Integer id;
	private Contract contract;
	
	private ContractDAO dao ;
	
	public String execute(){
		dao= new ContractDAO();
		if(dao.findById(id) != null){
			contract = dao.findById(id);
			
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Contract getContract() {
		return this.contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
