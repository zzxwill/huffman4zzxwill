<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/message_details.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td width="30%"><div align="center">����</div></td>
		<td width="70%"><div align="center"><s:property value="message.getTitle()"/></div></td>
	</tr>
	<tr>
		<td><div align="center">����ʱ��</div></td>
		<td><div align="center"><s:property value="message.getDatetime().toLocaleString()"/></div></td>
	</tr>	
	<tr>
		<td><div align="center">����</div></td>
		<td>
			<div align="center">
			<s:if test="message.getDirection() == 1">
				<s:property value="message.getUser().getName()"/>
			</s:if>
			<s:else>
				<s:property value="message.getDeveloper().getCompanyName()"/>
			</s:else>
			</div>
		</td>
	</tr>	
	<tr>
		<td><div align="center">����</div></td>
		<td>
			<div align="center">
			<s:if test="message.getDirection() == 0">
				<s:property value="message.getUser().getName()"/>
			</s:if>
			<s:else>
				<s:property value="message.getDeveloper().getCompanyName()"/>
			</s:else>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����</div></td>
		<td><div align="center"><s:property value="message.getContent()"/></div></td>
	</tr>
	<tr>
		<td><div align="center">״̬</div></td>
		<td><div align="center">
			<s:if test="message.getBeRead() == 1">
			�Ѷ�
			</s:if>
			<s:else>
			δ��
			</s:else>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center"><a href="userpage.action">����</a></div></td>
		<td></td>
	</tr>
</table>