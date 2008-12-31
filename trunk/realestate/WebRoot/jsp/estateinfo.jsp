<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/estateinfo.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">照片</div></td>
			<!--
			<td><img src="<s:property value='estate.getImage()'/>"/></td>
			-->
		<td><div align="center">
			<a href="<s:property value='estate.getImage()'/>">照片</a></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">楼盘</div></td>
		<td><div align="center">
			<s:property value="estate.getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">开发商</div></td>
		<td><div align="center">
			<s:property value="estate.getDeveloper().getCompanyName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">地点</div></td>
		<td><div align="center">
			<s:property value="estate.getLocation()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">类型</div></td>
		<td><div align="center">
			<s:property value="estate.getTypedetail().getType()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">绿化率(%)</div></td>
		<td><div align="center">
			<s:property value="estate.getGreenRate()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">交通</div></td>
		<td><div align="center">
			<s:property value="estate.getTraffic()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">环境</div></td>
		<td><div align="center">
			<s:property value="estate.getEnvironment()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">总数(套)</div></td>
		<td><div align="center">
			<s:property value="estate.getTotal()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">预售(套)</div></td>
		<td><div align="center">
			<s:property value="estate.getPresale()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">已售出(套)</div></td>
		<td><div align="center">
			<s:property value="estate.getSold()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">均价(元/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="estate.getAvgPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">开盘价(元/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="estate.getStartPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">套房</div></td>
		<td><div align="center">
			<!-- 判断套房信息是否存在，不存在则显示新增链接 -->
				<a href="houselist.action?id=<s:property value='estate.getId()'/>">套房列表</a>
			<%//out.println("A TEST INFO."); %>
				<a href="addhouseinfotransfer.action?id=<s:property value='estate.getId()'/>">新增详细信息</a>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="userpage.action">返回</a>
		</div></td>
	</tr>
</table>