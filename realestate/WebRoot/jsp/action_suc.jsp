<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
 <tr>
 	<s:if test="action.equals('addhouseinfo')">
 	<td>
 		操作成功，
 		<a href="estateinfo.action?id=<s:property value='house.getEstate().getId()'/>">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('delhouseinfo')">
 	<td>
 		操作成功，
 		<a href="houselist.action?id=<s:property value='estateid'/>">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('modifyhouseinfo')">
 	<td>
 		操作成功，
 		<a href="houselist.action?id=<s:property value='id'/>">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('delestate')">
 	<td>
 		操作成功，
 		<a href="userpage.action">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('modifyestate')">
 	<td>
 		操作成功，
 		<a href="userpage.action">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('addestate')">
 	<td>
 		操作成功，
 		<a href="userpage.action">
 		确定
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('validatecontract')">
 	<td>
 		操作成功，
 		<a href="contract_details.action?id=<s:property value='contract.getId()'/>">
 		确定
 		</a>
 	</td>
 	</s:if>
 </tr>
</table>