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
  
  <body>
    <s:form action="DeveloperInfoAction" theme="ajax" validate="true"> 
    		<s:textfield label="用户名" name="name" onblur="validateName();"></s:textfield>
    		<s:textfield label="公司名称" name="companyName"></s:textfield>
    		<s:password label="密码" name="password"> </s:password>
    		<s:password label="确认密码" name="repassword"> </s:password>
    		<s:textfield label="房产商许可证号" name="license"></s:textfield>
    		<s:textfield label="网址" name="url"></s:textfield>
    		<s:textfield label="电子邮件" name="email"></s:textfield>
    	    <s:textfield label="联系电话" name="telephone"></s:textfield>
    		<s:textfield label="邮编" name="post"></s:textfield>
    		<s:textfield label="地址" name="address"></s:textfield>
    		<s:textarea label="公司简介" name="infomation" rows="5" cols="20"></s:textarea>
            <s:submit value="注册" theme="xhtml"></s:submit>
  </s:form>
  </body>
</html>
