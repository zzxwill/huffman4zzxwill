<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: ��Բ; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		¥���б�
	</div>
</div>
<table class="content"  align="center" cellspacing="0" cellpadding="0">

	<tr>
		<th>
			���
		</th>
		<th>
			¥������
		</th>
		<th>
			¥�̵�ַ
		</th>
		</tr>
		<s:iterator value="estateList" status="el">
			<tr>
				<td class="tableBorder_T_dashed">
					<s:property value="%{#el.getIndex()+1}" />
				</td>
				<td class="tableBorder_T_dashed">
					<a
						href="<s:url action="estateDetails">
  <s:param name="id" value="id" />
  </s:url>"><s:property
							value="name" /> </a>
				</td>
				<td class="tableBorder_T_dashed">
					<s:property value="location" />
				</td>
		</s:iterator>
	<tr>
		<td class="tableBorder_T_dashed">&nbsp;
			<s:if test="i">
				<a
					href="<s:url action="moreEstate">
  						<s:param name="i" value="i-1" />
  						</s:url>">��һҳ
				</a>
			</s:if>
		</td>
		<td class="tableBorder_T_dashed" >&nbsp;</td>
		<td class="tableBorder_T_dashed_2">
			<a
				href="<s:url action="moreEstate">
  <s:param name="i" value="i+1" />
  </s:url>">��һҳ
			</a>
		</td>
		
	</tr>

</table>

