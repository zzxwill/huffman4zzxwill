<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/contract_details.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">�׷�</div></td>
		<td><div align="center">
			<a href="houseinfo.action?id=<s:property value='contract.getHouse().getId()'/>&estateid=<s:property value='contract.getId()'/>">��ϸ��Ϣ</a></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">������</div></td>
		<td><div align="center">
			<s:property value="contract.getDeveloper().getName()"/><div align="center"></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">�û�</div></td>
		<td><div align="center">
			<s:property value="contract.getUser().getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">ǩ������</div></td>
		<td><div align="center">
			<s:property value="contract.getSignedDate().toLocaleString()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">��ֹ����</div></td>
		<td><div align="center">
			<s:property value="contract.getDeadline().toLocaleString()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">״̬</div></td>
		<td><div align="center">
			<s:if test="contract.getStatus() == 1">��ȷ��</s:if>
			<s:else>δȷ��<a href="validatecontract.action?id=<s:property value='contract.getId()'/>">ȷ��</a></s:else>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="userpage.action">����</a>
			</div>
		</td>
		<td></td>
	</tr>
</table>