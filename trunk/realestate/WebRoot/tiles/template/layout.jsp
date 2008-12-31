<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
       <title></title>
    </head>
    <body>
       <table width="768px" height="800px" border="2" align="center">
      
           <tr>
              <td colspan="2" align="center" valign="top" width="768px" height="100px" bgcolor="#80ff80">
                  <tiles:insertAttribute name="header" />
              </td>
           </tr>
           <tr>
              <td align="center" width="150px" height="800px" bgcolor="#00ff00">
                  <tiles:insertAttribute name="menu" />
              </td>
              <td width="618px" height="800px">
                  <tiles:insertAttribute name="body"  flush="true"/>
              </td>
           </tr>
           <tr>
              <td colspan="2" bgcolor="#00ff40" height="100px">
                  <tiles:insertAttribute name="footer" />
              </td>
           </tr>
       </table>
    </body>
</html>