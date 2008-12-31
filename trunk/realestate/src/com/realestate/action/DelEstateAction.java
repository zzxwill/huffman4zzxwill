/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * �ô�������ɾ��¥��estate��
 * 
 */

package com.realestate.action;

import java.io.File;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.pojo.Estate;

public class DelEstateAction extends ActionSupport{
	private String action = "delestate";
	private String id;
	
	public String execute(){
		
		Estate estate = new Estate();
		EstateDAO dao = new EstateDAO();
		Session session = dao.getSession();
		Transaction tran = session.beginTransaction();
		
		//����id���estate����
		estate = dao.findById(Integer.valueOf(id));
		
		//block for deleting files(images)
		String curPath = ServletActionContext.getServletContext().getRealPath("realestate");
		//��õ�ǰ·��
		
		File file = new File(curPath.substring(0,curPath.lastIndexOf('\\'))+"\\"+estate.getImage().replace("/", "\\"));
		//�õ�ͼ����ļ�·����ʵ����һ��file����
		
		if(file.isFile()){
			file.delete();//ɾ��
		}
		//end block
		
		dao.delete(estate);//ɾ��estate����
		tran.commit();
		session.close();
		
		return SUCCESS;
	}
	
	//setter �� getter����
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
}
