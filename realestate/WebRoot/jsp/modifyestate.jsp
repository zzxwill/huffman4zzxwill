<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
		<div
		style="color:#FFffff; #FF9933; float: left; font-family: 幼圆; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		楼盘信息修改
	</div>
</div>
<center>
	<s:form action="modifyestate.action">
		<s:hidden name="id" value="%{estate.getDeveloper().getId()}"/>
		<s:hidden name="estateid" value="%{estate.getId()}"/>
		<s:file name="filename" label="图片"/>
		<s:textfield name="name" label="楼盘" value="%{estate.getName()}"/>
		<s:textfield name="developer" label="开发商" value="%{estate.getDeveloper().getCompanyName()}"/>
		<s:textfield name="location" label="地点" value="%{estate.getLocation()}"/>
		<s:select name="type" list="{'公寓式住宅','单元式住宅','跃层式商品房','复式商品房','水景住宅','TOWNHOUSE','低层住宅','多层住宅','多小高层住宅','多高层住宅'}" label="类型" headerKey="-1" headerValue="%{estate.getTypedetail().getType()}"/>
		<s:textfield name="greenRate" label="绿化率" value="%{estate.getGreenRate()}"/>
		<s:textfield name="traffic" label="交通" value="%{estate.getTraffic()}"/>
		<s:textfield name="environment" label="环境" value="%{estate.getEnvironment()}"/>
		<s:textfield name="total" label="总数" value="%{estate.getTotal()}"/>
		<s:textfield name="presale" label="预售" value="%{estate.getPresale()}"/>
		<s:textfield name="sold" label="已售出" value="%{estate.getSold()}"/>
		<s:textfield name="avgPrice" label="均价" value="%{estate.getAvgPrice()}"/>
		<s:textfield name="startPrice" label="开盘价" value="%{estate.getStartPrice()}"/>
		<s:submit value="提交"></s:submit>
	</s:form>
</center>

