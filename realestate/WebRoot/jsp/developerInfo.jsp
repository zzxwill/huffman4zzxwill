<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:head theme="ajax" />
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: 幼圆; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		房产商注册
	</div>
</div>
<table width="590"  border="0" cellspacing="0" cellpadding="0">
  <tr><td colspan=2>请输入您的信息</td></tr>
  <tr>
  	<td>
  <s:form action="DeveloperInfoAction" theme="ajax" validate="true"> 
    		<s:textfield label="用户名" name="name" onblur="validateName();"></s:textfield>
    		<s:textfield label="公司名称" name="companyName"></s:textfield>
    		<s:password label="密码" name="password"> </s:password>
    		<s:password label="确认密码" name="repassword"> </s:password>
    		<s:textfield label="房产商许可证号" name="license"></s:textfield>
    		<s:textfield label="网址" name="url"></s:textfield>
    		<s:textfield label="电子邮件" name="email"></s:textfield>
    	    <s:textfield label="联系电话" name="telephone"></s:textfield>
    		<s:textfield label="邮编" name="post"></s:textfield>
    		<s:textfield label="地址" name="address"></s:textfield>
    		<s:textfield label="公司简介" name="infomation"></s:textfield>
            <s:submit value="注册" theme="xhtml"></s:submit>
  </s:form>
  <td>
  </tr>
</table>