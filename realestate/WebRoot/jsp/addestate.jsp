<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<div class="bar" style="background-image: url(images/info.jpg);height: 50px">
	<div style="color:white; float:left; font-family:��Բ;font-size: 16px;font-weight:bold; position: relative;left: 80px;top: 21px">���¥��</div>
	<div
		style="font-size:13px; color:black; float: left; position: relative; left: 420px; top: 23px; font-weight: bold;font-style: italic">
		Add&nbsp;Estate
	</div>
</div>
<center>
	<s:form action="addestate.action">
		<s:hidden name="id" value="%{developer.getId()}"/>
		<s:file name="filename" label="ͼƬ"/>
		<s:textfield name="name" label="¥��"/>
		<s:textfield name="developer" label="������" value="%{developer.getCompanyName()}"/>
		<s:textfield name="location" label="�ص�"/>
		<s:select name="type" list="{'��Ԣʽסլ','��Ԫʽסլ','Ծ��ʽ��Ʒ��','��ʽ��Ʒ��','ˮ��סլ','TOWNHOUSE','�Ͳ�סլ','���סլ','��С�߲�סլ','��߲�סլ'}" label="����"/>
		<s:textfield name="greenRate" label="�̻���"/>
		<s:textfield name="traffic" label="��ͨ"/>
		<s:textfield name="environment" label="����"/>
		<s:textfield name="total" label="����"/>
		<s:textfield name="presale" label="Ԥ��" value="0"/>
		<s:textfield name="sold" label="���۳�" value="0"/>
		<s:textfield name="avgPrice" label="����"/>
		<s:textfield name="startPrice" label="���̼�"/>
		<s:submit value="�ύ"></s:submit>
	</s:form>
</center>
