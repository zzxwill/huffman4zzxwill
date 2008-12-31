<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/message_details.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td width="30%"><div align="center">标题</div></td>
		<td width="70%"><div align="center"><s:property value="message.getTitle()"/></div></td>
	</tr>
	<tr>
		<td><div align="center">日期时间</div></td>
		<td><div align="center"><s:property value="message.getDatetime().toLocaleString()"/></div></td>
	</tr>	
	<tr>
		<td><div align="center">发自</div></td>
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
		<td><div align="center">送至</div></td>
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
		<td><div align="center">内容</div></td>
		<td><div align="center"><s:property value="message.getContent()"/></div></td>
	</tr>
	<tr>
		<td><div align="center">状态</div></td>
		<td><div align="center">
			<s:if test="message.getBeRead() == 1">
			已读
			</s:if>
			<s:else>
			未读
			</s:else>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center"><a href="userpage.action">返回</a></div></td>
		<td></td>
	</tr>
</table>