<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:head theme="ajax" />
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: ��Բ; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		������ע��
	</div>
</div>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
  <tr><td colspan=2>������������Ϣ</td></tr>
  <tr>
  	<td>
  <s:form action="DeveloperInfoAction" theme="ajax" validate="true"> 
    		<s:textfield label="�û���" name="name" onblur="validateName();"></s:textfield>
    		<s:textfield label="��˾����" name="companyName"></s:textfield>
    		<s:password label="����" name="password"> </s:password>
    		<s:password label="ȷ������" name="repassword"> </s:password>
    		<s:textfield label="���������֤��" name="license"></s:textfield>
    		<s:textfield label="��ַ" name="url"></s:textfield>
    		<s:textfield label="�����ʼ�" name="email"></s:textfield>
    	    <s:textfield label="��ϵ�绰" name="telephone"></s:textfield>
    		<s:textfield label="�ʱ�" name="post"></s:textfield>
    		<s:textfield label="��ַ" name="address"></s:textfield>
    		<s:textfield label="��˾���" name="infomation"></s:textfield>
            <s:submit value="ע��" theme="xhtml"></s:submit>
  </s:form>
  <td>
  </tr>
</table>