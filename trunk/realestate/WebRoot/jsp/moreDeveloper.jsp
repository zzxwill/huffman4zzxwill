<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: ��Բ; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		���ز����б�
	</div>
</div>

<table class="content" width="590" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<th>
			���
		</th>
		<th>
			����������
		</th>
		<th>
			ͶƱ��
		</th>
		<s:iterator value="developerList" status="dl">
			<tr>
				<td>
					<s:property value="%{#dl.getIndex()+1}" />
				</td>
				<td>
					<a
						href="<s:url action="developerDetails">
  <s:param name="id" value="id" />
  </s:url>"><s:property
							value="companyName" /> </a>
				</td>
				<td>
					<s:property value="rank" />
				</td>
		</s:iterator>
	<tr>
  		<td><s:if test="i"><a
						href="<s:url action="moreDeveloper.action">
  <s:param name="i" value="i-1" />
  </s:url>">��һҳ </a></s:if>
  </td>
  <td></td>
  <td><a
						href="<s:url action="moreDeveloper.action">
  <s:param name="i" value="i+1" />
  </s:url>">��һҳ </a>
  </td>
  </tr>
</table>

