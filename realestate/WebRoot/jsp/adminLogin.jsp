<%@page contentType="text/html; charset=gb2312" language="java"  errorPage="" %>
<% request.setCharacterEncoding("GB2312"); %>
<%@taglib uri="/struts-tags" prefix="s"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>	
	<s:head/>
		<title>����Ա��¼</title>
	</head>
	<body> 
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	��̨����Ա��¼
	 <s:form action="AdminLogin.action" method="post"> 
  <table align="center" border=0 width="30%"> 
  <tr>  
  <td > <s:textfield name="username" label="�û���" maxLength="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:textfield>
	 </td> 
  </tr> 
  <tr>  
  <td> <s:password name="password" label="����"  maxLength="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:password>  </td>  </tr>
<tr><td align="center"><s:submit value="��¼" /></td></tr> 
  </table> 
  </s:form>  
	
	</body>
</html>
	