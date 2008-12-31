<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<h1>User Details</h1>
<s:if test="userDetails != null">
    <table>
      <tr><td>Id:</td><td><s:property value="userDetails.id" /></td></tr>
      <tr><td>Name:</td><td><s:property value="userDetails.name" /></td></tr>
      <tr><td>Email:</td><td><s:property value="userDetails.email" /></td></tr>
      <tr><td>Address:</td><td><s:property value="userDetails.address" /></td></tr>
    </table>
</s:if>