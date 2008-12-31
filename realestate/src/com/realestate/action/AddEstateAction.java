/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * 该代码用于添加楼盘，从用户填写的表单中获取信息，
 * 写入数据库。实现了上传照片的功能。
 * 
 */
package com.realestate.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.DeveloperDAO;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.TypedetailDAO;
import com.realestate.pojo.Developer;
import com.realestate.pojo.Estate;
import com.realestate.pojo.Typedetail;

public class AddEstateAction extends ActionSupport{
	//以下定义用于上传文件用
	private File file;
	private String filename;
	private String suffix;
	private static final int BUFFER_SIZE = 8 * 1024;
	
	private String action = "addestate";	//用于添加完成后转至jsp页面时的识别、判断
	
	//以下是楼盘的表中的字段的定义
	private String id;
	private String name;
	private String location;
	private String type;
	private String greenRate;
	private String traffic;
	private String environment;
	private String total;
	private String presale;
	private String sold;
	private String avgPrice;
	private String startPrice;
	
	public String execute() throws UnsupportedEncodingException{
		Estate estate = new Estate();
		EstateDAO Edao = new EstateDAO();
		Developer developer = new Developer();
		DeveloperDAO Ddao = new DeveloperDAO();
		Typedetail typedetail = new Typedetail();
		TypedetailDAO Tdao = new TypedetailDAO();
		
		Session session = Edao.getSession();
		Transaction tran = session.beginTransaction();
		
		developer = Ddao.findById(Integer.valueOf(id));
		//根据id获得developer对象
		
		//下面这个循环用于根据房屋类型（字符串）找到typedetail对象，用于下面estate的set方法
		for(int i = 0;i < Tdao.findAll().size();i++){
			if(((Typedetail)(Tdao.findAll().get(i))).getType().equals(type)){
				typedetail = (Typedetail)Tdao.findAll().get(i);
			}
		}
		
		//block for uploading files
		File file = new File(filename);
		suffix = filename.substring(filename.indexOf('.'), filename.length());
		//用于获得文件后缀，可以支持多种图片格式的上传
		//这里是根据estate的name命名图片，方便管理
		File dst = new File(ServletActionContext.getServletContext().getRealPath("images")+"\\estate\\"+name+suffix);
		copy(file,dst);
		//end block
		
		//设置estate对象
		estate.setAvgPrice(Integer.valueOf(avgPrice));
		estate.setDeveloper(developer);
		estate.setEnvironment(environment);
		estate.setGreenRate(Short.valueOf(greenRate));
		estate.setImage("images/estate/"+name+suffix);
		estate.setLocation(location);
		estate.setName(name);
		estate.setPresale(Integer.valueOf(presale));
		estate.setSold(Integer.valueOf(sold));
		estate.setStartPrice(Integer.valueOf(startPrice));
		estate.setTotal(Integer.valueOf(total));
		estate.setTraffic(traffic);
		estate.setTypedetail(typedetail);
		
		Edao.save(estate);
		tran.commit();
		session.close();

		return SUCCESS;	//返回
	}
	
	//下面这个类用于上传文件/照片
	private static void copy(File src, File dst){
		try{
			InputStream in = null ;
			OutputStream out = null ;
			try{                
				in = new BufferedInputStream( new FileInputStream(src), BUFFER_SIZE);
				out = new BufferedOutputStream( new FileOutputStream(dst), BUFFER_SIZE);
                byte [] buffer = new byte [BUFFER_SIZE];
                
				while(in.read(buffer) > 0){
					out.write(buffer);
				}
			}
			finally{
				if(null != in){
					in.close();
				} 
                if(null != out){
                	out.close();
                }
            }
        }
		catch(Exception e){
           e.printStackTrace();
		} 
	}
	
	//getter 和setter方法的定义，其中很多的方法是用不上的
	public String getFilename(){
		return this.filename;
	}
	
	public void setFilename(String filename){
		this.filename = filename;
	}
	
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
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getGreenRate(){
		return this.greenRate;
	}
	
	public void setGreenRate(String greenRate){
		this.greenRate = greenRate;
	}
	
	public String getTraffic(){
		return this.traffic;
	}
	
	public void setTraffic(String traffic){
		this.traffic = traffic;
	}
	
	public String getEnvironment(){
		return this.environment;
	}
	
	public void setEnvironment(String environment){
		this.environment = environment;
	}
	
	public String getTotal(){
		return this.total;
	}
	
	public void setTotal(String total){
		this.total = total;
	}
	
	public String getPresale(){
		return this.presale;
	}
	
	public void setPresale(String presale){
		this.presale = presale;
	}
	
	public String getSold(){
		return this.sold;
	}
	
	public void setSold(String sold){
		this.sold = sold;
	}
	
	public String getAvgPrice(){
		return this.avgPrice;
	}
	
	public void setAvgPrice(String avgPrice){
		this.avgPrice = avgPrice;
	}
	
	public String getStartPrice(){
		return this.startPrice;
	}
	
	public void setStartPrice(String startPrice){
		this.startPrice = startPrice;
	}
}
