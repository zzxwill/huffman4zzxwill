<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript">
<!--
	function gettype(){
		var v=document.getElementsByName("type");
		var k;
		for(i=0;i<v.length;i++)if(v[i].checked)
		{
		k=v[i].value;
		break;
		}  
		if(k==null)
			alert("����ѡ��ע������ͣ�");
		else 
		window.location.href="turn.action?type="+k;
	}
//-->
</script>
<table  width="198" height="200" align="right" cellpadding="0"
	cellspacing="2" background="images/login.jpg">

	<tr>
		<td height="40">
			
		</td>
	</tr>
	<tr>
		<td height="20" style="color: red" align="left">
			<s:actionerror/>
		</td>
	</tr>
	<s:if test="#session['username']==null">
		<s:form action="login" theme="simple">
			<tr height="15" align="center">
				<td>
					<s:property value="#session.username" />
					�û�����
					<s:textfield name="username" size="15"></s:textfield>
				</td>
			</tr>
			<tr height="15" align="center">
				<td>
					��&nbsp;&nbsp;�룺
					<s:password name="password" size="15"></s:password>
				</td>
			</tr>
			<tr height="15" align="center"> 
				<td>
					<s:radio  name="type" list="#{'dev':'���ز���','usr':'��Ա'}"></s:radio>
				</td>
			</tr>
			<tr height="15" align="center">
				<td>
					<s:submit value="ȷ��"></s:submit>
					<s:reset value="����"></s:reset>
					<a href="javascript:gettype()" >ע��</a>
				</td>
			</tr>
		</s:form>
		<tr height="15" align="center">
		</tr>
	</s:if>
	<s:else>
		<s:form action="logout" theme="simple">
			<tr align="center">
				<td>
					��ӭʹ�÷��ز�����ϵͳ
				</td>
			</tr>
			<tr align="center">

				<td>
					<s:submit value="�˳�"></s:submit>
				</td>
			</tr>
		</s:form>
	</s:else>

</table>
