<%@   page   contentType="text/html;   charset=gb2312"   language="java"%>  
<%@page pageEncoding="GB2312"%>
<% request.setCharacterEncoding("GB2312"); %>
<%@page import="java.sql.*;"  %>
<!-- ɾ������ -->
<html>
	<head>
		<title>ɾ������</title>
	</head>
	<body>
	<%
		String id=request.getParameter("id");
 		Connection conn=null;
		      Statement stmt;
		      ResultSet res = null;
		      //����Connector/J����
		      //��һ��Ҳ��дΪ��Class.forName("com.mysql.jdbc.Driver");
		      Class.forName("com.mysql.jdbc.Driver").newInstance();
		      //������MySQL������
		      conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/realestate",
		                                         "root", "zzxwill");
		      //ִ��SQL���
		      
		      stmt = (Statement) conn.createStatement();
		      String sql="delete from notice where id="+id+"";
//		      res = stmt.executeQuery(sql);
		      int deleteNum=stmt.executeUpdate(sql);
			 if(deleteNum==1){
			 	out.print("�ɹ�ɾ������,�뷵�ؼ�������!");
			 	
			 }else{
			 	out.print("ɾ������ʧ��,�뷵�ؼ�������!");
			 	
			 }
			 out.print("<a href=\"/realestate/jsp/manageNotice.jsp\">����</a>");
//		     out.println(deleteNum);
//		      res.close();
%>
	</body>
</html>
	