<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
 <tr>
 	<s:if test="action.equals('addhouseinfo')">
 	<td>
 		�����ɹ���
 		<a href="estateinfo.action?id=<s:property value='house.getEstate().getId()'/>">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('delhouseinfo')">
 	<td>
 		�����ɹ���
 		<a href="houselist.action?id=<s:property value='estateid'/>">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('modifyhouseinfo')">
 	<td>
 		�����ɹ���
 		<a href="houselist.action?id=<s:property value='id'/>">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('delestate')">
 	<td>
 		�����ɹ���
 		<a href="userpage.action">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('modifyestate')">
 	<td>
 		�����ɹ���
 		<a href="userpage.action">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('addestate')">
 	<td>
 		�����ɹ���
 		<a href="userpage.action">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 	
 	<s:if test="action.equals('validatecontract')">
 	<td>
 		�����ɹ���
 		<a href="contract_details.action?id=<s:property value='contract.getId()'/>">
 		ȷ��
 		</a>
 	</td>
 	</s:if>
 </tr>
</table>