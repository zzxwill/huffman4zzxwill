<%@page contentType="text/html; charset=gb2312" language="java" %>
<% request.setCharacterEncoding("GB2312"); %>
<%@page import="java.sql.*;"%>
<%@taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html>
	<head>	

		<title>管理公告</title>
	</head>
	<body>
	<table width=900; align="center">
	<div align="center">公告管理</div><br /><br />
	1.添加公告
	
	
	<form action="/realestate/jsp/addNotice.jsp">
		<input type="submit" value="添加"/>
	</form>
	
	<br /><br />
	2.管理公告
		<table border="1" width="900" ondblclick="修改成功" align="center">
		
			<th>标题</th>
			<th>内容</th>
			<th>删除</th>
			<th>修改</th>
			<%
		      Class.forName("com.mysql.jdbc.Driver").newInstance(); 
		      Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate",
		                                         "root", "zzxwill");
		      Statement stmt = (Statement) conn.createStatement();
			  ResultSet res = stmt.executeQuery("select * from notice ");
		      while (res.next())
		      {
		       out.print("<tr><td>"+res.getString(2)+"\t\t");//title
		       out.print("</td><td>"+res.getString(3)+"\t\t"); //content
		      int noticeID=Integer.parseInt(res.getString(1));
%>
 				</td><td width="5%"> <a href="DeleteNotice.action?noticeID=<%=noticeID %>">删除  </a></td>
				<td width="5%"> <a href="/realestate/jsp/changeNotice.jsp?id=<%=noticeID %>">修改  </a></td>
<%
				out.print(			"</tr>");
				}

		      res.close();		
				
			 %>	
		</table>  
		</table>
		</body>
</html>
	