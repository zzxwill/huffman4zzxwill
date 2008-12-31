/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于删除楼盘estate。
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
		
		//根据id获得estate对象
		estate = dao.findById(Integer.valueOf(id));
		
		//block for deleting files(images)
		String curPath = ServletActionContext.getServletContext().getRealPath("realestate");
		//获得当前路径
		
		File file = new File(curPath.substring(0,curPath.lastIndexOf('\\'))+"\\"+estate.getImage().replace("/", "\\"));
		//得到图像的文件路径并实例化一个file对象
		
		if(file.isFile()){
			file.delete();//删除
		}
		//end block
		
		dao.delete(estate);//删除estate对象
		tran.commit();
		session.close();
		
		return SUCCESS;
	}
	
	//setter 和 getter方法
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
