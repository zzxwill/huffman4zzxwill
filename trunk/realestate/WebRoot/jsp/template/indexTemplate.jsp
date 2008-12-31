<%@ page contentType="text/html; charset=gb2312" language="java"
	errorPage="error.jsp"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
	<head>
		<title><tiles:getAsString name="title" />
		</title>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
		<link href="CSS/style.css" rel="stylesheet">
	</head>
	<body>
		<center>
			<table align="center" width="790" border="0" cellspacing="0"
				cellpadding="0">
				<tr>
					<td class="tableBorder">
						<tiles:insertAttribute name="navigation" flush="true" />
					</td>
				</tr>
				<tr height="129">

					<td align="center">
						<tiles:insertAttribute name="search"></tiles:insertAttribute>
					</td>


				</tr>

				<tr>
					<td>
						<table width="100%" height="236" border="0" align="center"
							cellpadding="0" cellspacing="0">
							<tr>
								<td valign="top" width="182">
									<tiles:insertAttribute name="left" />
								</td>
								<td valign="top">
									<table width="100%" cellpadding="0" cellspacing="0">

										<tr>
											<td valign="top">
												<tiles:insertAttribute name="content" />
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
						<table width="790" border="0" align="center" cellpadding="0"
							cellspacing="0">
							<tr>
								<td>
									<tiles:insertAttribute name="footer" />
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</center>
	</body>
</html>
