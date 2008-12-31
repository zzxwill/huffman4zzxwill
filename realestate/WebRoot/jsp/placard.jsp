<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:importAttribute/>
<table width="198" height="210" border="0" cellpadding="0"
	cellspacing="0" background="images/placard.jpg">
	<tr>
		<td height="50">
			&nbsp;
		</td>
	</tr>

	<tr>
		<td align="center" valign="top" class="tableBorder_l">
			<table width="88%" border="0" cellspacing="0" cellpadding="0">
				<s:iterator value="#session.placardlist" status="notice">
					<tr height="20">
						<td>
							<img src="images/placardStar.gif" width="11" height="11" />
						</td>
						<td class="tableBorder_T_dashed" align="left">
							<a
								href="<s:url action="placcardDetails"><s:param name="id" value="id"/></s:url>">
								<s:property value="title" /> </a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</td>
	</tr>
</table>
