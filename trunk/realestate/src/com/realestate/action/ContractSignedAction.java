/**
 * 
 */
package com.realestate.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import com.opensymphony.xwork2.ActionSupport;

/**
 * @author �¾��� version 1.0 2008��12��6��
 * 
 */
public class ContractSignedAction extends ActionSupport {
	private static int hid;

	public String execute() throws Exception {	
		  
	      
          Calendar n=Calendar.getInstance();
	      
	      String s=new SimpleDateFormat("yyyy-MM-dd").format(n.getTime());//��õ�ǰ����
	      
	      n.add(Calendar.MONTH,+1);
	      
	      String d=new SimpleDateFormat("yyyy-MM-dd").format(n.getTime());//���һ���º������
			
	      int userid=1;// �û�id����ʱ��λ1
	      
	      Connection conn=null;
	      Statement stmt;
	      ResultSet res = null;
	      
	      
	      // ����Connector/J����
	      // ��һ��Ҳ��дΪ��Class.forName("com.mysql.jdbc.Driver");
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      // ������MySQL������
	      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate",
	                                         "root", "088215");
	      // ִ��SQL���
	      int a=0;
	      stmt = (Statement) conn.createStatement();
	      res = stmt.executeQuery("select * from con_hou_dev where id="+hid+"");
	      while(res.next()){
	      a=res.getInt(2);
	      }

	       stmt.executeUpdate("insert into contract(developer,user,signedDate,deadline,status,house) values("+a+","+userid+",'"+s+"','"+d+"','1',"+hid+")");
		   return  SUCCESS;
	}

	/**
	 * @return the hid
	 */
	public static int getHid() {
		return hid;
	}

	/**
	 * @param hid
	 *            the hid to set
	 */
	public static void setHid(int hid) {
		ContractSignedAction.hid = hid;
	}
}
