<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color: white; float: left; font-family: ��Բ; font-size: 16px; font-weight: bold; position: relative; left: 80px; top: 21px">
		¥����ϸ��Ϣ
	</div>
</div>

<div
	style="float: left; padding: 2px; border: 1px black solid; margin: 20px">
	<img alt="¥��ͼƬ" border="0" width="200px" height="260px"
		src="<s:property value="estate.image" />">
</div>


<div class="con"
	style="margin: 40px; font-size: 18px; font-weight: bold">
	<div>
		¥������:
		<s:property value="estate.name" />
	</div>
	<div>
		¥�̵�ַ:
		<s:property value="estate.location" />
	</div>
	<div>
		�̻���:
		<s:property value="estate.greenRate" />
	</div>

	<div>
		��ͨ:
		<s:property value="estate.traffic" />
	</div>
	<div>
		����:
		<s:property value="estate.environment" />
	</div>
	<div>
		��������:
		<s:property value="estate.total" />
		��
	</div>
	<div>
		Ԥ�۷�����:
		<s:property value="estate.presale" />
		��
	</div>
	<div>
		���ݾ���:
		<s:property value="estate.avgPrice" />
		Ԫ
	</div>
	<div>
		�������:
		<s:property value="estate.startPrice" />
		Ԫ
	</div>

</div>

<div class="con" style="clear: both; text-align: center">
	<span><a href="<s:url action="SendMessageAction.action" />">��������</a>
	</span>
	<span style="margin: 40px;"> <a
		href="<s:url action="houseDetails"><s:param name="eid" value="estate.id" /> </s:url>">������ϸ��Ϣ</a>
	</span>
</div>
<div>
</div>
