<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="height: 50px">
	<img src="images/searchResult.jpg">
</div>
<table  class="content" align="center">
	
		<tr height="40">

			<td  align="left" colspan="2"  style="font-size: 15px;font-weight: bold">
				共搜索到:[
				<s:property value="estResult.size"></s:property>
				]条楼盘信息
			</td>
		</tr>
		<s:if test="estResult.size!=0">
		<tr>
			<th>
				序号
			</th>
			<th>
				名称
			</th>
			<th>
				地址
			</th>
		</tr>
		
		<s:iterator value="estResult" status="est">
			<tr height="20">
				<td class="tableBorder_T_dashed">
					<s:property value="#est.getIndex()+1" />
				</td>

				<td class="tableBorder_T_dashed">
					<a
						href="<s:url action="estateDetails"><s:param name="id" value="id"/></s:url>">
						<s:property value="name" /> </a>
				</td>
				<td class="tableBorder_T_dashed">
					<s:property value="location" />
				</td>
			</tr>

		</s:iterator>

		</s:if>

</table>