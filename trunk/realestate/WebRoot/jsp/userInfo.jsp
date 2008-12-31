<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:head theme="ajax"/>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: 幼圆; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		用户注册
	</div>
</div>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
  <tr><td><s:property value="ex" /></td></tr>
  <tr><td colspan=2>请输入您的信息</td></tr>
  <s:form action="UserInfoAction" theme="ajax" validate="true" method="post">
          <s:textfield label="用户名" name="name" onblur="exusts();"></s:textfield>
    		<s:textfield label="真实姓名" name="realName"></s:textfield>
    		<s:password label="密码" name="password"> </s:password>
    		<s:password label="确认密码" name="repassword"> </s:password>
    		<s:textfield label="身份证号" name="idNum"></s:textfield>
    		<s:textfield label="电子邮件" name="email"></s:textfield>
    		<s:textfield label="联系电话" name="telephone"></s:textfield>
    		<s:textfield label="地址" name="address"></s:textfield>
    		<s:submit value="提交信息" theme="xhtml"></s:submit>
  </s:form>
<s:if test="a==1">您输入的用户名已经存在</s:if>
</table>

