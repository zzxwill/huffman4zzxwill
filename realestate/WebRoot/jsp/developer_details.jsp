<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar" style="background-image: url(images/info.jpg);height: 50px">
	<div style="color:white; float:left; font-family:��Բ;font-size: 16px;font-weight:bold; position: relative;left: 80px;top: 21px">��������ϸ��Ϣ</div>
	<div
		style="font-size:13px; color:black; float: left; position: relative; left: 340px; top: 23px; font-weight: bold;font-style: italic">
		Developer&nbsp;List
	</div>
</div>
		
<table width="590" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<td colspan=2>
			����������:
			<s:property value="developer.companyName" />
		</td>
	</tr>
	<tr>
		<td colspan=2>
			�绰:
			<s:property value="developer.telephone" />
		</td>
		<td colspan=2>
			email:
			<s:property value="developer.email"/>
		</td>
	</tr>
	<tr>
		<td colspan=2>
			ִ�պ�:
			<s:property value="developer.license" />
		</td>
	</tr>
	<tr>
		<td colspan=2>
			�ڱ���վͶƱ����:
			<s:property value="developer.rank" />
		</td>
	</tr>
	<tr>
		<td colspan=2>
			��ַ:
			<s:property value="developer.address" />
		</td>
	</tr>
	<tr>
		<td colspan=2>
			��վ:
			<s:property value="developer.url" />
		</td>
	</tr>
	<tr>
		<td colspan=2>
			���:
			<s:property value="developer.information" />
		</td>
	</tr>
	<tr>
		<td>
			<br>
		</td>
	</tr>
	
	<tr>
		<td>
			<a href="<s:url action="vote4developer">
			<s:param name="id" value="id" />
			</s:url>
			">Ͷ�˿�����һƱ</a>
		</td>
	</tr>
</table>
