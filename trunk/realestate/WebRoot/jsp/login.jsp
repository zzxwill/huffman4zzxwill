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
			alert("请先选择注册的类型！");
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
					用户名：
					<s:textfield name="username" size="15"></s:textfield>
				</td>
			</tr>
			<tr height="15" align="center">
				<td>
					密&nbsp;&nbsp;码：
					<s:password name="password" size="15"></s:password>
				</td>
			</tr>
			<tr height="15" align="center"> 
				<td>
					<s:radio  name="type" list="#{'dev':'房地产商','usr':'会员'}"></s:radio>
				</td>
			</tr>
			<tr height="15" align="center">
				<td>
					<s:submit value="确定"></s:submit>
					<s:reset value="重置"></s:reset>
					<a href="javascript:gettype()" >注册</a>
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
					欢迎使用房地产服务系统
				</td>
			</tr>
			<tr align="center">

				<td>
					<s:submit value="退出"></s:submit>
				</td>
			</tr>
		</s:form>
	</s:else>

</table>
