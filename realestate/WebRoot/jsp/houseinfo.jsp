<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/houseinfo.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">����¥��</div></td>
		<td><div align="center">
			<s:property value="house.getEstate().getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">¥��</div></td>
		<td><div align="center">
			<s:property value="house.getFloor()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����</div></td>
		<td><div align="center">
			<s:property value="houseType"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">״̬</div></td>
		<td><div align="center">
			<s:if test="house.getStatus() == 0">����</s:if>
			<s:if test="house.getStatus() == 1">ԤԼ</s:if>
			<s:if test="house.getStatus() == 2">����</s:if>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">�۸�(Ԫ/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="house.getPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">���(m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="house.getArea()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="contract_details.action?id=<s:property value='estateid'/>">����</a>
			</div>
		</td>
		<td></td>
	</tr>
</table>