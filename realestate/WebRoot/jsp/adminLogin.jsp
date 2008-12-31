<%@page contentType="text/html; charset=gb2312" language="java"  errorPage="" %>
<% request.setCharacterEncoding("GB2312"); %>
<%@taglib uri="/struts-tags" prefix="s"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>	
	<s:head/>
		<title>管理员登录</title>
	</head>
	<body> 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	后台管理员登录
	 <s:form action="AdminLogin.action" method="post"> 
  <table align="center" border=0 width="30%"> 
  <tr>  
  <td > <s:textfield name="username" label="用户名" maxLength="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:textfield>
	 </td> 
  </tr> 
  <tr>  
  <td> <s:password name="password" label="密码"  maxLength="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:password>  </td>  </tr>
<tr><td align="center"><s:submit value="登录" /></td></tr> 
  </table> 
  </s:form>  
	
	</body>
</html>
	