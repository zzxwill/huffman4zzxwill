<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <s:head theme="ajax"/>
    
  </head>
  <script>
    function show_user_details(id) {
      document.frm_user.userid.value = id;
      dojo.event.topic.publish("show_detail");
    }
  </script>
  <body>
    <s:form id="frm_user" name="frm_user">
      <h1>User Listing</h1>
      <s:if test="userList.size > 0">
        <table border="1">
          <s:iterator value="userList">
            <tr>
              <td>
                <s:a href="#" onclick="javascript:show_user_details('%{id}');return false;"><s:property value="id" /></s:a>
              </td>
              <td>
                <s:property value="name" />
              </td>
            </tr>
          </s:iterator>
        </table>
      </s:if> 
      <s:hidden name="userid"/>
      <s:url id="d_url" action="UserDetailAction" />
      <s:div  id="user_details" href="%{d_url}" theme="ajax" listenTopics="show_detail" formId="frm_user" >
      </s:div>
    </s:form>
  </body>
</html>