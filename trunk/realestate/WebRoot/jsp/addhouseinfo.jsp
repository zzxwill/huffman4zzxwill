<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>addhouseinfo.jsp</title>
</head>
<body>
<center>
	<s:form action="addhouseinfo.action">
		<s:hidden name="id" value="%{estate.getId()}"/>
		<s:textfield name="estate" label="¥��" value="%{estate.getName()}"/>
		<s:textfield name="floor"label="¥��"/>
		<s:select name="type1" list="{'1','2','3','4','5'}" label="��"/>
		<s:select name="type2" list="{'1','2','3','4','5'}" label="��"/>
		<%
			//<s:textfield name="status" label="״̬"/>
		%>
		<s:textfield name="status" label="״̬" value="����"/>
		<%
			//<s:select name="status" list="{'����','ԤԼ','����'}" label="״̬"/>
		%>	
		<s:textfield name="price" label="�۸�(Ԫ/m2)"/>
		<s:textfield name="area" label="���(m2)"/>
		
		<s:submit value="�ύ"></s:submit>
	</s:form>
</center>
</body>
</html>