<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<tiles:importAttribute />
<table width="198" height="210" border="0" cellpadding="0"
	cellspacing="0" background="images/sellSort.jpg" bgcolor="#F0F0F0">
	<tr>
		<td height="40">
			&nbsp;
		</td>
	</tr>
	<tr>
		<td align="center" valign="top" class="tableBorder_lb">
			<table width="88%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
					&nbsp;
					</td>
				</tr>
			</table>
			<table width="88%" border="0" cellspacing="0" cellpadding="0">
				<s:iterator value="#session.sellsortList" status="sort">
					<tr height="20">
						<td>
							<img src="images/sellSortLeftStar.gif" width="11" height="11" />
						</td>
						<td class="tableBorder_T_dashed" align="left">
							<a
								href="<s:url action="estateDetails"><s:param name="id" value="id"/></s:url>">
								<s:property value="name" /> </a>
						</td>
						<td align="left">
						 <s:property value="#sort.index+1"/>
						</td>
					</tr>
				</s:iterator>
			</table>
		</td>
	</tr>
</table>
