<%@page contentType="text/html; charset=gb2312" language="java"  errorPage="" %>
<% request.setCharacterEncoding("GB2312"); %>
<%@taglib uri="/struts-tags" prefix="s"%> 
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>	
	<s:head/>
		<title>��ӹ���</title>
	</head>
	<body> 	
	 <s:form action="AddNotice.action" method="post"> 
	 �����빫����Ϣ
  		<table align="center" border=0 width="30%"> 
  			<tr>  
  				<td > <s:textfield name="title" label="����" maxLength="100">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:textfield>
				 </td> 
 			 </tr> 
 			 <tr>  
  					<td> <s:textarea name="content" label="����"  >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </s:textarea>  </td>  </tr>
			<tr><td align="center"><s:submit value="���" /></td></tr> 
  		</table> 
  	</s:form>  
	
	</body>
</html>
	
	
