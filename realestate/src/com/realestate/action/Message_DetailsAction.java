/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于获得message的详细信息。
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
			
			//若点击了信息详情，则将message已读属性置为1
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
