<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/houselist.jpg" colspan="7">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">所属楼盘</div></td>
		<td><div align="center">楼层</div></td>
		<td><div align="center">类型</div></td>
		<td><div align="center">状态</div></td>
		<td><div align="center">价格(元/m<sup>2</sup>)</div></td>
		<td><div align="center">面积(m<sup>2</sup>)</div></td>
		<td><div align="center">管理</div></td>
	</tr>
	<s:iterator value="houseList" id="house">
	<tr>
		<td><div align="center">
			<s:property value="#house.getEstate().getName()"/></div>
		</td>	
		<td><div align="center">
			<s:property value="#house.getFloor()"/></div>
		</td>
		<td><div align="center">
			<s:if test="#house.getType()/10 == 1">一室</s:if>
			<s:if test="#house.getType()/10 == 2">二室</s:if>
			<s:if test="#house.getType()/10 == 3">三室</s:if>
			<s:if test="#house.getType()/10 == 4">四室</s:if>
			<s:if test="#house.getType()/10 == 5">五室</s:if>
			
			<s:if test="#house.getType()%10 == 1">一厅</s:if>
			<s:if test="#house.getType()%10 == 2">二厅</s:if>
			<s:if test="#house.getType()%10 == 3">三厅</s:if>
			<s:if test="#house.getType()%10 == 4">四厅</s:if>
			<s:if test="#house.getType()%10 == 5">五厅</s:if>
		</td>
		<td><div align="center">
			<s:if test="#house.getStatus() == 0">已售</s:if>
			<s:if test="#house.getStatus() == 1">预约</s:if>
			<s:if test="#house.getStatus() == 2">待售</s:if>
			</div>
		</td>
		<td><div align="center">
			<s:property value="#house.getPrice()"/></div>
		</td>
		<td><div align="center">
			<s:property value="#house.getArea()"/></div>
		</td>
		<td><div align="center">
			<a href="modifyhouseinfotransfer.action?id=<s:property value='#house.getId()'/>">修改</a>
			<a href="delhouseinfo.action?id=<s:property value='#house.getId()'/>">删除</a>
			</div>
		</td>
	</tr>
	</s:iterator>
	<tr>
		<td><div align="center">
			<a href="estateinfo.action?id=<%=request.getParameter("id") %>">返回</a>
		</div></td>
	</tr>
</table>