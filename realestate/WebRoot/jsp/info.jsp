<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color:#FFffff; #FF9933; float: left; font-family: ��Բ; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		�������
	</div>
	
	<div
		style="float: left; position: relative; left: 420px; top: 23px; font-weight: bold;">
		<a style="font-size: 12px" href="moreEstate.action?i=0">����¥��&gt;&gt;</a>
	</div>
</div>
<div>
	<div style="clear: both">
		<ul class="movie_genre">
			<li class="genre">
				�����ͣ�
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=villa">����</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=highrise">��߲�סլ</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=rowrise">�Ͳ�סլ</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=townhouse">townhouse</a>
			</li>
			<li>
				<a href="sortSearch.action?by=typedetail&type=apartment">��Ԣʽ</a>
			</li>
		</ul>

	</div>
	<div style="clear: both">
		<ul class="movie_genre">
			<li class="genre">
				������
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=haidian">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=dongcheng">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=xicheng">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=chaoyang">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=chongwen">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=xuanwu">������</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=mentougou">��ͷ��</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=shunyi">˳����</a>
			</li>
			<li>
				<a href="sortSearch.action?by=zone&type=huairou">������</a>
			</li>
		</ul>
		<div style="clear: both">
			<ul class="movie_genre">
				<li class="genre">
					������[Ԫ/ƽ����]��
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=5">5ǧ����</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=7">5ǧ~7ǧ</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=9">7ǧ~9ǧ</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.2">9ǧ~1.2��</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.8">1.2��~1.8��</a>
				</li>
				<li>
					<a href="sortSearch.action?by=avgprice&type=1.8u">1.8������</a>
				</li>
			</ul>
		</div>
	</div>
</div>

<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color:#FFffff; float: left; font-family: ��Բ; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		�����Ƽ�
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
		style="color:#FFffff; float: left; font-family: ��Բ; font-size: 18px; font-weight: bold; position: relative; left: 80px; top: 21px">
		������
	</div>
	<div
		style="float: left; position: relative; left: 470px; top: 23px; font-weight: bold;">
		<a style="font-size: 12px" href="moreDeveloper.action?i=0">����&gt;&gt;</a>
	</div>
</div>