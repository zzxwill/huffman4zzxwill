<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td height="50" background="images/estateinfo.jpg" colspan="2">&nbsp;</td>
  	</tr>
 	<tr>
		<td><div align="center">��Ƭ</div></td>
			<!--
			<td><img src="<s:property value='estate.getImage()'/>"/></td>
			-->
		<td><div align="center">
			<a href="<s:property value='estate.getImage()'/>">��Ƭ</a></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">¥��</div></td>
		<td><div align="center">
			<s:property value="estate.getName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">������</div></td>
		<td><div align="center">
			<s:property value="estate.getDeveloper().getCompanyName()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">�ص�</div></td>
		<td><div align="center">
			<s:property value="estate.getLocation()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����</div></td>
		<td><div align="center">
			<s:property value="estate.getTypedetail().getType()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">�̻���(%)</div></td>
		<td><div align="center">
			<s:property value="estate.getGreenRate()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">��ͨ</div></td>
		<td><div align="center">
			<s:property value="estate.getTraffic()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����</div></td>
		<td><div align="center">
			<s:property value="estate.getEnvironment()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����(��)</div></td>
		<td><div align="center">
			<s:property value="estate.getTotal()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">Ԥ��(��)</div></td>
		<td><div align="center">
			<s:property value="estate.getPresale()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">���۳�(��)</div></td>
		<td><div align="center">
			<s:property value="estate.getSold()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">����(Ԫ/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="estate.getAvgPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">���̼�(Ԫ/m<sup>2</sup>)</div></td>
		<td><div align="center">
			<s:property value="estate.getStartPrice()"/></div>
		</td>
	</tr>
	<tr>
		<td><div align="center">�׷�</div></td>
		<td><div align="center">
			<!-- �ж��׷���Ϣ�Ƿ���ڣ�����������ʾ�������� -->
				<a href="houselist.action?id=<s:property value='estate.getId()'/>">�׷��б�</a>
			<%//out.println("A TEST INFO."); %>
				<a href="addhouseinfotransfer.action?id=<s:property value='estate.getId()'/>">������ϸ��Ϣ</a>
			</div>
		</td>
	</tr>
	<tr>
		<td><div align="center">
			<a href="userpage.action">����</a>
		</div></td>
	</tr>
</table>