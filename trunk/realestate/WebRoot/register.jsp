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
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
  
  <body><br>
    	<s:form action="register" theme="ajax" >
    		<s:textfield label="用户名" name="name"></s:textfield>
    		<s:textfield label="真实姓名" name="realName"></s:textfield>
    		<s:password label="密码" name="password"> </s:password>
    		<s:password label="确认密码" name="repassword"> </s:password>
    		<s:textfield label="身份证号" name="idNum"></s:textfield>
    		<s:textfield label="电子邮件" name="email"></s:textfield>
    		<s:textfield label="联系电话" name="telphone"></s:textfield>
    		<s:textfield label="地址" name="address"></s:textfield>
    		<s:datetimepicker label="生日" displayFormat="yyyy-mm-dd" name="birthday"></s:datetimepicker>
    		<s:submit></s:submit><s:reset></s:reset>
    		
    	</s:form>
  </body>
</html>
