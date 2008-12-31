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
 <td>户型：<s:property value="type" /></td><td>楼层：<s:property value="floor" />层</td>
 </tr>
 <tr>
 <td>价格：<s:property value="price" />元</td><td>面积：<s:property value="area" />平方米</td>
 </tr>
 <tr>
 <td><s:if test="status==0">已售</s:if>
     <s:elseif test="status==1">预约</s:elseif>
     <s:elseif test="status==2">待售</s:elseif></td> 
     <td><s:if test="status==2"><a href="<s:url action="ContractSignedAction.action">
     <s:param name="hid" value="id" />
     </s:url> ">签定合约意向</a></s:if></td>
 </tr>
 </s:iterator>
 <tr>
 <td><a href="<s:url action="SendMessageAction.action" />">请您留言</a></td>
 </tr>
</table>