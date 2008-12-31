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
<s:set name="status" value="%{house.getStatus()}"/>

	<s:form action="modifyhouseinfo.action">
		<s:hidden name="id" value="%{house.getEstate().getId()}"/>
		<s:hidden name="houseid" value="%{house.getId()}"/>
		<s:textfield name="estate" label="¥��" value="%{house.getEstate().getName()}"/>
		<s:textfield name="floor"label="¥��" value="%{house.getFloor()}"/>
		<s:select name="type1" list="{'1','2','3','4','5'}" label="��"/>
		<s:select name="type2" list="{'1','2','3','4','5'}" label="��"/>
		<%
			//<s:textfield name="status" label="״̬"/>
		%>
		<s:if test="#status == 0">
		<s:textfield name="status" label="״̬" value="����"/>
		</s:if>
		<s:if test="#status == 1">
		<s:textfield name="status" label="״̬" value="ԤԼ"/>
		</s:if>
		<s:if test="#status == 2">
		<s:textfield name="status" label="״̬" value="����"/>
		</s:if>
		<%
			//<s:select name="status" list="{'����','ԤԼ','����'}" label="״̬"/>
		%>	
		<s:textfield name="price" label="�۸�(Ԫ/m2)" value="%{house.getPrice()}"/>
		<s:textfield name="area" label="���(m2)" value="%{house.getArea()}"/>
		
		<s:submit value="�ύ"></s:submit>
	</s:form>
</center>
</body>
</html>