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
		<s:textfield name="estate" label="楼盘" value="%{house.getEstate().getName()}"/>
		<s:textfield name="floor"label="楼层" value="%{house.getFloor()}"/>
		<s:select name="type1" list="{'1','2','3','4','5'}" label="室"/>
		<s:select name="type2" list="{'1','2','3','4','5'}" label="厅"/>
		<%
			//<s:textfield name="status" label="状态"/>
		%>
		<s:if test="#status == 0">
		<s:textfield name="status" label="状态" value="已售"/>
		</s:if>
		<s:if test="#status == 1">
		<s:textfield name="status" label="状态" value="预约"/>
		</s:if>
		<s:if test="#status == 2">
		<s:textfield name="status" label="状态" value="待售"/>
		</s:if>
		<%
			//<s:select name="status" list="{'已售','预约','待售'}" label="状态"/>
		%>	
		<s:textfield name="price" label="价格(元/m2)" value="%{house.getPrice()}"/>
		<s:textfield name="area" label="面积(m2)" value="%{house.getArea()}"/>
		
		<s:submit value="提交"></s:submit>
	</s:form>
</center>
</body>
</html>