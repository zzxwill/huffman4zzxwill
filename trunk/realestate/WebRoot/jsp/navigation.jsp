<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
 function addfavorite()
 {
 if (document.all)
 {
 window.external.addFavorite("http://www.realestate.com","商品房查询系统");
 }
 else if (window.sidebar)
 {
 window.sidebar.addPanel("商品房查询系统", "http://www.realestate.com","");
 }
 }
 function setHomepage()
{
if (document.all)
    {
        document.body.style.behavior='url(#default#homepage)';
   document.body.setHomePage('http://www.realestate.com');

   }
   else if (window.sidebar)
   {
   if(window.netscape)
   {
        try
    {
            netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
          }
        catch (e)
        {
     alert( "该操作被浏览器拒绝，如果想启用该功能，请在地址栏内输入 about:config,然后将项 signed.applets.codebase_principal_support 值该为true" );
        }
   }
   var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components. interfaces.nsIPrefBranch);
   prefs.setCharPref('browser.startup.homepage','http://www.carzymusic.com');
}
}
 </script>
<div style="background-image: url(images/header.jpg); height: 83px">
	<div class="nav" style="position: relative; left: 460px;">
		<ul>
			<li>
				<a href="mailto:360603se@gmail.com">·联系我们</a>
			</li>
			<li>
				<a href="javascript:addfavorite()">·收藏本站</a>
			</li>
			<li>
				<a href="#" onclick="javascript:setHomepage()">·设为首页</a>
			</li>
			<li>
				<a href="loginM.lzw">·后台管理</a>
			</li>
		</ul>
	</div>
	<div class="nav"
		style="clear: both; position: relative; left: 390px; top: 15px">
		<ul>
			<li>
				<a href="<s:url action="mytiles"></s:url>">首页</a>
			</li>
			<li>
				<a href="<s:url action="userpage"></s:url>">|个人页面</a>
			</li>
			<li>
				<a href="<s:url action="moreEstate"></s:url>">|楼盘展示</a>
			</li>
			<li>
				<a href="<s:url action="moreDeveloper"></s:url>">|房产商信息</a>
			</li>
			<li>
				<a href="<s:url action="jfreechart"></s:url>">|信息搜索</a>
			</li>
			<li>
				<a href="">| 销售排行</a>
			</li>
		</ul>
	</div>
	<div>
	</div>

</div>
