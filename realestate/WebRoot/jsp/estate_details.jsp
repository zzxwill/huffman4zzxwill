<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color: white; float: left; font-family: 幼圆; font-size: 16px; font-weight: bold; position: relative; left: 80px; top: 21px">
		楼盘详细信息
	</div>
</div>

<div
	style="float: left; padding: 2px; border: 1px black solid; margin: 20px">
	<img alt="楼盘图片" border="0" width="200px" height="260px"
		src="<s:property value="estate.image" />">
</div>


<div class="con"
	style="margin: 40px; font-size: 18px; font-weight: bold">
	<div>
		楼盘名称:
		<s:property value="estate.name" />
	</div>
	<div>
		楼盘地址:
		<s:property value="estate.location" />
	</div>
	<div>
		绿化率:
		<s:property value="estate.greenRate" />
	</div>

	<div>
		交通:
		<s:property value="estate.traffic" />
	</div>
	<div>
		环境:
		<s:property value="estate.environment" />
	</div>
	<div>
		房屋总数:
		<s:property value="estate.total" />
		套
	</div>
	<div>
		预售房屋数:
		<s:property value="estate.presale" />
		套
	</div>
	<div>
		房屋均价:
		<s:property value="estate.avgPrice" />
		元
	</div>
	<div>
		房屋起价:
		<s:property value="estate.startPrice" />
		元
	</div>

</div>

<div class="con" style="clear: both; text-align: center">
	<span><a href="<s:url action="SendMessageAction.action" />">请您留言</a>
	</span>
	<span style="margin: 40px;"> <a
		href="<s:url action="houseDetails"><s:param name="eid" value="estate.id" /> </s:url>">房屋详细信息</a>
	</span>
</div>
<div>
</div>
