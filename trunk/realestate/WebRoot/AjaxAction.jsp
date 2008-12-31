<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title> ajax starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<s:head theme="ajax"/>
  </head>

  <body>
	<s:form method="post"  validate="true"  action="AjaxAtion" theme="ajax">
		<s:textfield label="µÇÂ½Ãû" name="name"></s:textfield>
		<s:password label="ÃÜÂë"></s:password>
		<s:radio list=""></s:radio>
		<s:submit value="×¢²á"></s:submit>
	</s:form>
  </body>
</html>
