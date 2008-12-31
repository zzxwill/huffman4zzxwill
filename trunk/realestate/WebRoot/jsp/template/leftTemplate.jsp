<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<table width="198" align="right"  cellpadding="0"
 cellspacing="0" bgcolor="#F0F0F0">
	<tr>
		<td  valign="top"><tiles:insertAttribute name="login"/></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="placard" /></td>
	</tr>
	<tr>
		<td><tiles:insertAttribute name="sellSortLeft" /></td>
	</tr>
</table>
