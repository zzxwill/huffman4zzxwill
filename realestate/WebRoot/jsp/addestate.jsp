<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<div class="bar" style="background-image: url(images/info.jpg);height: 50px">
	<div style="color:white; float:left; font-family:幼圆;font-size: 16px;font-weight:bold; position: relative;left: 80px;top: 21px">添加楼盘</div>
	<div
		style="font-size:13px; color:black; float: left; position: relative; left: 420px; top: 23px; font-weight: bold;font-style: italic">
		Add&nbsp;Estate
	</div>
</div>
<center>
	<s:form action="addestate.action">
		<s:hidden name="id" value="%{developer.getId()}"/>
		<s:file name="filename" label="图片"/>
		<s:textfield name="name" label="楼盘"/>
		<s:textfield name="developer" label="开发商" value="%{developer.getCompanyName()}"/>
		<s:textfield name="location" label="地点"/>
		<s:select name="type" list="{'公寓式住宅','单元式住宅','跃层式商品房','复式商品房','水景住宅','TOWNHOUSE','低层住宅','多层住宅','多小高层住宅','多高层住宅'}" label="类型"/>
		<s:textfield name="greenRate" label="绿化率"/>
		<s:textfield name="traffic" label="交通"/>
		<s:textfield name="environment" label="环境"/>
		<s:textfield name="total" label="总数"/>
		<s:textfield name="presale" label="预售" value="0"/>
		<s:textfield name="sold" label="已售出" value="0"/>
		<s:textfield name="avgPrice" label="均价"/>
		<s:textfield name="startPrice" label="开盘价"/>
		<s:submit value="提交"></s:submit>
	</s:form>
</center>
