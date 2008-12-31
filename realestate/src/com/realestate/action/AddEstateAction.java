/*
 * @last modified date 2008-12-19
 * @author baos,SCSE,Beihang University
 * 
 * @description
 * �ô����������¥�̣����û���д�ı��л�ȡ��Ϣ��
 * д�����ݿ⡣ʵ�����ϴ���Ƭ�Ĺ��ܡ�
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
	//���¶��������ϴ��ļ���
	private File file;
	private String filename;
	private String suffix;
	private static final int BUFFER_SIZE = 8 * 1024;
	
	private String action = "addestate";	//���������ɺ�ת��jspҳ��ʱ��ʶ���ж�
	
	//������¥�̵ı��е��ֶεĶ���
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
		//����id���developer����
		
		//�������ѭ�����ڸ��ݷ������ͣ��ַ������ҵ�typedetail������������estate��set����
		for(int i = 0;i < Tdao.findAll().size();i++){
			if(((Typedetail)(Tdao.findAll().get(i))).getType().equals(type)){
				typedetail = (Typedetail)Tdao.findAll().get(i);
			}
		}
		
		//block for uploading files
		File file = new File(filename);
		suffix = filename.substring(filename.indexOf('.'), filename.length());
		//���ڻ���ļ���׺������֧�ֶ���ͼƬ��ʽ���ϴ�
		//�����Ǹ���estate��name����ͼƬ���������
		File dst = new File(ServletActionContext.getServletContext().getRealPath("images")+"\\estate\\"+name+suffix);
		copy(file,dst);
		//end block
		
		//����estate����
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

		return SUCCESS;	//����
	}
	
	//��������������ϴ��ļ�/��Ƭ
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
	
	//getter ��setter�����Ķ��壬���кܶ�ķ������ò��ϵ�
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
