<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/houseinfo.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">所属楼盘</div></td>
		<td><div align="center">
			<s:property value="house.getEstate().getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">楼层</div></td>
		<td><div align="center">
			<s:property value="house.getFloor()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">类型</div></td>
		<td><div align="center">
			<s:property value="houseType"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">状态</div></td>
		<td><div align="center">
			<s:if test="house.getStatus() == 0">已售</s:if>
			<s:if test="house.getStatus() == 1">预约</s:if>
			<s:if test="house.getStatus() == 2">待售</s:if>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">价格(元/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="house.getPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">面积(m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="house.getArea()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="contract_details.action?id=<s:property value='estateid'/>">返回</a>
			</div>
		</td>
		<td></td>
	</tr>
</table>