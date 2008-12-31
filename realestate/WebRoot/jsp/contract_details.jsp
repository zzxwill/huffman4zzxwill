<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/contract_details.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">套房</div></td>
		<td><div align="center">
			<a href="houseinfo.action?id=<s:property value='contract.getHouse().getId()'/>&estateid=<s:property value='contract.getId()'/>">详细信息</a></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">开发商</div></td>
		<td><div align="center">
			<s:property value="contract.getDeveloper().getName()"/><div align="center"></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">用户</div></td>
		<td><div align="center">
			<s:property value="contract.getUser().getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">签署日期</div></td>
		<td><div align="center">
			<s:property value="contract.getSignedDate().toLocaleString()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">截止日期</div></td>
		<td><div align="center">
			<s:property value="contract.getDeadline().toLocaleString()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">状态</div></td>
		<td><div align="center">
			<s:if test="contract.getStatus() == 1">已确认</s:if>
			<s:else>未确认<a href="validatecontract.action?id=<s:property value='contract.getId()'/>">确认</a></s:else>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="userpage.action">返回</a>
			</div>
		</td>
		<td></td>
	</tr>
</table>