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
 * @author 陈君龙 version 1.0 2008年12月6日
 * 
 */
public class ContractSignedAction extends ActionSupport {
	private static int hid;

	public String execute() throws Exception {	
		  
	      
          Calendar n=Calendar.getInstance();
	      
	      String s=new SimpleDateFormat("yyyy-MM-dd").format(n.getTime());//获得当前日期
	      
	      n.add(Calendar.MONTH,+1);
	      
	      String d=new SimpleDateFormat("yyyy-MM-dd").format(n.getTime());//获得一个月后的日期
			
	      int userid=1;// 用户id先暂时定位1
	      
	      Connection conn=null;
	      Statement stmt;
	      ResultSet res = null;
	      
	      
	      // 加载Connector/J驱动
	      // 这一句也可写为：Class.forName("com.mysql.jdbc.Driver");
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      // 建立到MySQL的连接
	      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate",
	                                         "root", "088215");
	      // 执行SQL语句
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
