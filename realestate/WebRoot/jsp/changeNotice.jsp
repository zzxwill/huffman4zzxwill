<%@   page   contentType="text/html;   charset=gb2312"   language="java"%>  
<%@page pageEncoding="GB2312"%>
<% request.setCharacterEncoding("GB2312"); %>
<%@page import="java.sql.*"  %>
<%@page import="java.text.*" %>
<%@taglib uri="/struts-tags" prefix="s"%> 

<html>
	<head>
		<title>更改公告</title>
		<style type="text/css">
.style1 {
	color: #C0C0C0;
}
</style>
	</head>
	<body><br>
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

				res = stmt.executeQuery("select * from notice where id='"+id+"'");

  			
//int developer=0;
String content=null;

String title=null;

//int rank=0;
//String rank=null;
//SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
   		while (res.next()){
   			title=res.getString(2);
   			content=res.getString(3);

			}
						      res.close();

	%>	
		
	<!-- form action="http://localhost:8080/estate/notice/toChangeNotice.jsp" method="get"--> 
	
	<form action="ChangeNotice.action" method="post"> 
	修改公告信息<br /> <br />
	<input name="id" type="hidden" value=<%=id%> ><br/>
	标题<input name="title" type="text"  value=<%=title %> ><br />
	内容<textarea name="content"  ><%=content %></textarea><br />
	<input type="submit" value="确认更改" /><br />
	</form>
	</body>
</html>
	