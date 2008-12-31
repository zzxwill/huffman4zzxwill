<%@   page   contentType="text/html;   charset=gb2312"   language="java"%>  
<%@page pageEncoding="GB2312"%>
<% request.setCharacterEncoding("GB2312"); %>
<%@page import="java.sql.*;"  %>
<!-- 删除公告 -->
<html>
	<head>
		<title>删除公告</title>
	</head>
	<body>
	<%
		String id=request.getParameter("id");
 		Connection conn=null;
		      Statement stmt;
		      ResultSet res = null;
		      //加载Connector/J驱动
		      //这一句也可写为：Class.forName("com.mysql.jdbc.Driver");
		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		      //建立到MySQL的连接
		      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate",
		                                         "root", "zzxwill");
		      //执行SQL语句
		      
		      stmt = (Statement) conn.createStatement();
		      String sql="delete from notice where id="+id+"";
//		      res = stmt.executeQuery(sql);
		      int deleteNum=stmt.executeUpdate(sql);
			 if(deleteNum==1){
			 	out.print("成功删除公告,请返回继续操作!");
			 	
			 }else{
			 	out.print("删除公告失败,请返回继续操作!");
			 	
			 }
			 out.print("<a href=\"/realestate/jsp/manageNotice.jsp\">返回</a>");
//		     out.println(deleteNum);
//		      res.close();
%>
	</body>
</html>
	