<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
 function addfavorite()
 {
 if (document.all)
 {
 window.external.addFavorite("http://www.realestate.com","��Ʒ����ѯϵͳ");
 }
 else if (window.sidebar)
 {
 window.sidebar.addPanel("��Ʒ����ѯϵͳ", "http://www.realestate.com","");
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
     alert( "�ò�����������ܾ�����������øù��ܣ����ڵ�ַ�������� about:config,Ȼ���� signed.applets.codebase_principal_support ֵ��Ϊtrue" );
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
				<a href="mailto:360603se@gmail.com">����ϵ����</a>
			</li>
			<li>
				<a href="javascript:addfavorite()">���ղر�վ</a>
			</li>
			<li>
				<a href="#" onclick="javascript:setHomepage()">����Ϊ��ҳ</a>
			</li>
			<li>
				<a href="loginM.lzw">����̨����</a>
			</li>
		</ul>
	</div>
	<div class="nav"
		style="clear: both; position: relative; left: 390px; top: 15px">
		<ul>
			<li>
				<a href="<s:url action="mytiles"></s:url>">��ҳ</a>
			</li>
			<li>
				<a href="<s:url action="userpage"></s:url>">|����ҳ��</a>
			</li>
			<li>
				<a href="<s:url action="moreEstate"></s:url>">|¥��չʾ</a>
			</li>
			<li>
				<a href="<s:url action="moreDeveloper"></s:url>">|��������Ϣ</a>
			</li>
			<li>
				<a href="<s:url action="jfreechart"></s:url>">|��Ϣ����</a>
			</li>
			<li>
				<a href="">| ��������</a>
			</li>
		</ul>
	</div>
	<div>
	</div>

</div>
