<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color:#FFffff; #FF9933; float: left; font-family: 幼圆; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		分类检索
	</div>
	
	<div
		style="float: left; position: relative; left: 420px; top: 23px; font-weight: bold;">
		<a style="font-size: 12px" href="moreEstate.action?i=0">更多楼盘&gt;&gt;</a>
	</div>
</div>
<div>
	<div style="clear: both">
		<ul class="movie_genre">
			<li class="genre">
				按类型：
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=villa">别墅</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=highrise">多高层住宅</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=rowrise">低层住宅</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=townhouse">townhouse</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=apartment">公寓式</a>
			</li>
		</ul>

	</div>
	<div style="clear: both">
		<ul class="movie_genre">
			<li class="genre">
				按地域：
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=haidian">海淀区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=dongcheng">东城区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=xicheng">西城区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=chaoyang">朝阳区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=chongwen">崇文区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=xuanwu">宣武区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=mentougou">门头沟</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=shunyi">顺义区</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=huairou">怀柔区</a>
			</li>
		</ul>
		<div style="clear: both">
			<ul class="movie_genre">
				<li class="genre">
					按均价[元/平方米]：
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=5">5千以下</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=7">5千~7千</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=9">7千~9千</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.2">9千~1.2万</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.8">1.2万~1.8万</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.8u">1.8万以上</a>
				</li>
			</ul>
		</div>
	</div>
</div>

<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color:#FFffff; float: left; font-family: 幼圆; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		热门推荐
	</div>
</div>
<div style="clear: both">

	<s:iterator value="#request.estList" status="est" id="eid">
		<div class="list">
			<div class="pic">
				<a
					href="<s:url action="estateDetails"><s:param name="id" value="id"/></s:url>"><img
						class="pic" src="<s:property value="image"/>"
						alt="<s:property value="name"/>"> </a>
			</div>
			<div class="title">
				<a
					href="<s:url action="estateDetails"><s:param name="id" value="id"/></s:url>"><s:property
						value="name" /> </a>
			</div>
		</div>

	</s:iterator>
</div>

<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color:#FFffff; float: left; font-family: 幼圆; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		房产商
	</div>
	<div
		style="float: left; position: relative; left: 470px; top: 23px; font-weight: bold;">
		<a style="font-size: 12px" href="moreDeveloper.action?i=0">更多&gt;&gt;</a>
	</div>
</div>