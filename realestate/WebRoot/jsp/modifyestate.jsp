<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: ��Բ; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		¥����Ϣ�޸�
	</div>
</div>
<center>
	<s:form action="modifyestate.action">
		<s:hidden name="id" value="%{estate.getDeveloper().getId()}"/>
		<s:hidden name="estateid" value="%{estate.getId()}"/>
		<s:file name="filename" label="ͼƬ"/>
		<s:textfield name="name" label="¥��" value="%{estate.getName()}"/>
		<s:textfield name="developer" label="������" value="%{estate.getDeveloper().getCompanyName()}"/>
		<s:textfield name="location" label="�ص�" value="%{estate.getLocation()}"/>
		<s:select name="type" list="{'��Ԣʽסլ','��Ԫʽסլ','Ծ��ʽ��Ʒ��','��ʽ��Ʒ��','ˮ��סլ','TOWNHOUSE','�Ͳ�סլ','���סլ','��С�߲�סլ','��߲�סլ'}" label="����" headerKey="-1" headerValue="%{estate.getTypedetail().getType()}"/>
		<s:textfield name="greenRate" label="�̻���" value="%{estate.getGreenRate()}"/>
		<s:textfield name="traffic" label="��ͨ" value="%{estate.getTraffic()}"/>
		<s:textfield name="environment" label="����" value="%{estate.getEnvironment()}"/>
		<s:textfield name="total" label="����" value="%{estate.getTotal()}"/>
		<s:textfield name="presale" label="Ԥ��" value="%{estate.getPresale()}"/>
		<s:textfield name="sold" label="���۳�" value="%{estate.getSold()}"/>
		<s:textfield name="avgPrice" label="����" value="%{estate.getAvgPrice()}"/>
		<s:textfield name="startPrice" label="���̼�" value="%{estate.getStartPrice()}"/>
		<s:submit value="�ύ"></s:submit>
	</s:form>
</center>

