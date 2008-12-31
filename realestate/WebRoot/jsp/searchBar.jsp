<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
	<head>
<script   language="javascript">
<!--  
  function   time()  
  {  
        var   now   =   new   Date();  
        var   h   =   (now.getHours()       >   9)   ?   now.getHours()       :   "0"   +   now.getHours();  
        var   m   =   (now.getMinutes()   >   9)   ?   now.getMinutes()   :   "0"   +   now.getMinutes();  
        var   s   =   (now.getSeconds()   >   9)   ?   now.getSeconds()   :   "0"   +   now.getSeconds();  
        var   noon=   (now.getHours()       >   12)?   "PM"   :"AM";  
        var     myclock="<center><font   color=red>现在是："+h+":"+m+":"+s+":"+"   "+noon+"</font></center>";  
          document.all.meizz.innerHTML   =   myclock;  
          setTimeout("time()",1000)   ;  
      }  
  -->  
  </script>  
	</head>

	<body onload="time()">
		<table width="788" height="129" cellspacing="0" align="center" background="images/searchBar.jpg">
			<tr height="20">
				<s:form action="search" theme="simple">
					<td width="400" id="meizz"></td>
					
					<td width="100" align="right" >
					<s:select  name="type" list="#{'est':'楼盘','dev':'房地产商'}"></s:select>
					</td>
					<td width="100" align="right">
						<s:textfield size="40" name="content"></s:textfield>
					</td>
					<td width="100" align="left">
						<s:submit value="搜索"></s:submit>
					</td>
				</s:form>
			</tr>
			<tr height="109">
			<td>&nbsp;</td>
			</tr>
			
		</table>
	</body>

</html>
