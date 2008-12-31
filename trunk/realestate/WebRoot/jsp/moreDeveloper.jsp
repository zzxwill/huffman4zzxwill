<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: 幼圆; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		房地产商列表
	</div>
</div>

<table class="content" width="590" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<th>
			序号
		</th>
		<th>
			开发商名称
		</th>
		<th>
			投票数
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
  </s:url>">上一页 </a></s:if>
  </td>
  <td></td>
  <td><a
						href="<s:url action="moreDeveloper.action">
  <s:param name="i" value="i+1" />
  </s:url>">下一页 </a>
  </td>
  </tr>
</table>

