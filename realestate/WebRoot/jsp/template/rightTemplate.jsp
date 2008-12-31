<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<table align="right" height="620" width="31%" border="0" cellpadding="0"
	cellspacing="0">
	<tr>
		<td valign="top">
			<tiles:insertAttribute name="productClass" />
		</td>
	</tr>
	<tr>
		<td valign="top">
			<tiles:insertAttribute name="guanggao" />
		</td>
	</tr>
</table>