<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/houselist.jpg" colspan="7">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">����¥��</div></td>
		<td><div align="center">¥��</div></td>
		<td><div align="center">����</div></td>
		<td><div align="center">״̬</div></td>
		<td><div align="center">�۸�(Ԫ/m<sup>2</sup>)</div></td>
		<td><div align="center">���(m<sup>2</sup>)</div></td>
		<td><div align="center">����</div></td>
	</tr>
	<s:iterator value="houseList" id="house">
	<tr>
		<td><div align="center">
			<s:property value="#house.getEstate().getName()"/></div>
		</td>	
		<td><div align="center">
			<s:property value="#house.getFloor()"/></div>
		</td>
		<td><div align="center">
			<s:if test="#house.getType()/10 == 1">һ��</s:if>
			<s:if test="#house.getType()/10 == 2">����</s:if>
			<s:if test="#house.getType()/10 == 3">����</s:if>
			<s:if test="#house.getType()/10 == 4">����</s:if>
			<s:if test="#house.getType()/10 == 5">����</s:if>
			
			<s:if test="#house.getType()%10 == 1">һ��</s:if>
			<s:if test="#house.getType()%10 == 2">����</s:if>
			<s:if test="#house.getType()%10 == 3">����</s:if>
			<s:if test="#house.getType()%10 == 4">����</s:if>
			<s:if test="#house.getType()%10 == 5">����</s:if>
		</td>
		<td><div align="center">
			<s:if test="#house.getStatus() == 0">����</s:if>
			<s:if test="#house.getStatus() == 1">ԤԼ</s:if>
			<s:if test="#house.getStatus() == 2">����</s:if>
			</div>
		</td>
		<td><div align="center">
			<s:property value="#house.getPrice()"/></div>
		</td>
		<td><div align="center">
			<s:property value="#house.getArea()"/></div>
		</td>
		<td><div align="center">
			<a href="modifyhouseinfotransfer.action?id=<s:property value='#house.getId()'/>">�޸�</a>
			<a href="delhouseinfo.action?id=<s:property value='#house.getId()'/>">ɾ��</a>
			</div>
		</td>
	</tr>
	</s:iterator>
	<tr>
		<td><div align="center">
			<a href="estateinfo.action?id=<%=request.getParameter("id") %>">����</a>
		</div></td>
	</tr>
</table>