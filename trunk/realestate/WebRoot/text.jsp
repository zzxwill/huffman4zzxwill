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
    		<s:textfield label="�û���" name="name" onblur="validateName();"></s:textfield>
    		<s:textfield label="��˾����" name="companyName"></s:textfield>
    		<s:password label="����" name="password"> </s:password>
    		<s:password label="ȷ������" name="repassword"> </s:password>
    		<s:textfield label="���������֤��" name="license"></s:textfield>
    		<s:textfield label="��ַ" name="url"></s:textfield>
    		<s:textfield label="�����ʼ�" name="email"></s:textfield>
    	    <s:textfield label="��ϵ�绰" name="telephone"></s:textfield>
    		<s:textfield label="�ʱ�" name="post"></s:textfield>
    		<s:textfield label="��ַ" name="address"></s:textfield>
    		<s:textarea label="��˾���" name="infomation" rows="5" cols="20"></s:textarea>
            <s:submit value="ע��" theme="xhtml"></s:submit>
  </s:form>
  </body>
</html>
