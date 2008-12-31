/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * �ô������ڻ��message����ϸ��Ϣ��
 * 
 */

package com.realestate.action;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.MessageDAO;
import com.realestate.pojo.Message;

public class Message_DetailsAction extends ActionSupport{
	private Integer id;
	private Message message = new Message();
	
	MessageDAO dao = new MessageDAO();
	Session session = dao.getSession();
	Transaction tran = session.beginTransaction();
	
	public String execute(){
		if(dao.findById(id) != null){
			message = dao.findById(id);
			
			//���������Ϣ���飬��message�Ѷ�������Ϊ1
			if(message.getBeRead() == 0){
				byte bit = (byte)(1 & 0xff);
				
				message.setBeRead(bit);
				
				dao.save(message);
				tran.commit();
				session.close();
			}
			
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

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
