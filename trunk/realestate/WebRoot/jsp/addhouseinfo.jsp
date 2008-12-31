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
		<s:textfield name="estate" label="楼盘" value="%{estate.getName()}"/>
		<s:textfield name="floor"label="楼层"/>
		<s:select name="type1" list="{'1','2','3','4','5'}" label="室"/>
		<s:select name="type2" list="{'1','2','3','4','5'}" label="厅"/>
		<%
			//<s:textfield name="status" label="状态"/>
		%>
		<s:textfield name="status" label="状态" value="待售"/>
		<%
			//<s:select name="status" list="{'已售','预约','待售'}" label="状态"/>
		%>	
		<s:textfield name="price" label="价格(元/m2)"/>
		<s:textfield name="area" label="面积(m2)"/>
		
		<s:submit value="提交"></s:submit>
	</s:form>
</center>
</body>
</html>