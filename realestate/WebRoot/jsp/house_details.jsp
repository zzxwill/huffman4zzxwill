<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="content" width="590"  border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td colspan=2 height="50" background="images/houseDetails.jpg">&nbsp;</td>
  </tr>
  
  <s:iterator value="houseList" status="hl">
 
  <tr>
  <td colspan=2><hr></td>
  </tr>
 <tr>
 <td>���ͣ�<s:property value="type" /></td><td>¥�㣺<s:property value="floor" />��</td>
 </tr>
 <tr>
 <td>�۸�<s:property value="price" />Ԫ</td><td>�����<s:property value="area" />ƽ����</td>
 </tr>
 <tr>
 <td><s:if test="status==0">����</s:if>
     <s:elseif test="status==1">ԤԼ</s:elseif>
     <s:elseif test="status==2">����</s:elseif></td> 
     <td><s:if test="status==2"><a href="<s:url action="ContractSignedAction.action">
     <s:param name="hid" value="id" />
     </s:url> ">ǩ����Լ����</a></s:if></td>
 </tr>
 </s:iterator>
 <tr>
 <td><a href="<s:url action="SendMessageAction.action" />">��������</a></td>
 </tr>
</table>