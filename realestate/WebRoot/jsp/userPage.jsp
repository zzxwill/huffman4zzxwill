<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color: #FFffff; # FF9933; float: left; font-family: 幼圆; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		个人主页
	</div>
</div>

<table width="590" border="0" cellspacing="0" cellpadding="0">

	<s:if test="#session['usertype'] == 'dev'">
		<!-- 实现房地产商的部分 -->
		<center>------------------------------房产商信息--------------------------</center>
		<tr>
			<td colspan="3">
				消息：
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- 消息的显示 -->
		<tr>
			<td>
				<div align="center">
					标题
				</div>
			</td>
			<td>
				<div align="center">
					发自
				</div>
			</td>
			<td>
				<div align="center">
					状态
				</div>
			</td>
		</tr>
		<s:iterator value="message" id="msg">
			<s:if test="#msg.getDeveloper().getId() == #session['userid']">
				<tr>
					<td>
						<div align="center">
							<s:property value="#msg.getTitle()" />
						</div>
					</td>
					<td>
						<div align="center">
							<s:if test="#msg.getDirection() == 1">
								<s:property value="#msg.getUser().getName()" />
							</s:if>
							<s:else>
								<s:property value="#msg.getDeveloper().getCompanyName()" />
							</s:else>
						</div>
					</td>
					<td>
						<div align="center">
							<s:if test="#msg.getBeRead() == 1">
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									已读 </a>
							</s:if>
							<s:else>
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									未读 </a>
							</s:else>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
			<td colspan="3">
				<hr />
				合同：
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- 合同的显示 -->
		<tr>
			<td>
				<div align="center">
					用户
				</div>
			</td>
			<td>
				<div align="center">
					套房
				</div>
			</td>
			<td>
				<div align="center">
					状态
				</div>
			</td>
		</tr>
		<s:iterator value="contract" id="con">
			<s:if test="#con.getDeveloper().getId() == #session['userid']">
				<tr>
					<td>
						<div align="center">
							<s:property value='#con.getUser().getName()' />
						</div>
					</td>
					<td>
						<div align="center">
						
							<s:property value="#con.getHouse().getEstate().getName()" />
						</div>
					</td>
					<s:if test="#con.getStatus() == 0">
						<td>
							<div align="center">
								
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									未确认 </a>
							</div>
						</td>
					</s:if>
					<s:else>
						<td>
							<div align="center">
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									已确认 </a>
							</div>
						</td>
					</s:else>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
		
			<td colspan="4">
				<hr />
				持有的楼盘：
			</td>
			<td> <hr /></td>
			<td><hr /></td>
		</tr>
		<!-- 楼盘的显示 -->
		<tr>
			<td>
				<div align="center">
					名称
				</div>
			</td>
			<td>
				<div align="center">
					详细信息
				</div>
			</td>
			<td>
				<div align="center">
					修改信息
				</div>
			</td>
			<td>
				<div align="center">
					删除
				</div>
			</td>
		</tr>
		<s:iterator value="estate" id="est">
			<s:if test="#est.getDeveloper().getId() == #session['userid']">
				<tr>
					<td>
						<div align="center">
							<s:property value='#est.getName()' />
						</div>
					</td>
					<td>
						<div align="center">
							<a href="estateinfo.action?id=<s:property value='#est.getId()'/>">详细</a>
						</div>
					</td>
					<td>
						<div align="center">
							<a
								href="<s:url action="modifyestatetransfer"><s:param name="id" value="#est.getId()" /></s:url>">修改</a>
						</div>
					</td>
					<td>
						<div align="center">
							<a href="delestate.action?id=<s:property value='#est.getId()'/>">删除</a>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>
		<tr>
			<td>
				<div align="center">
					<a href="addestatetransfer.action">新增</a>
				</div>
			</td>
			<td></td>
		</tr>
	</s:if>

	<s:else>
		<center>-------------------------用户信息-------------------------</center>
		<tr>
			<td colspan="3">
				消息：
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- 消息的显示 -->
		<tr>
			<td>
				<div align="center">
					标题
				</div>
			</td>
			<td>
				<div align="center">
					发自
				</div>
			</td>
			<td>
				<div align="center">
					状态
				</div>
			</td>
		</tr>
		<s:iterator value="message" id="msg">
			<s:if test="#msg.getUser().getId() == #session['userid']">
				<tr>
					<td>
						<div align="center">
							<s:property value="#msg.getTitle()" />
						</div>
					</td>
					<td>
						<div align="center">
							<s:if test="#msg.getDirection() == 0">
								<s:property value="#msg.getDeveloper().getCompanyName()" />
							</s:if>
							<s:else>
								<s:property value="#msg.getUser().getName()" />
							</s:else>
						</div>
					</td>
					<td>
						<div align="center">
							<s:if test="#msg.getBeRead() == 1">
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									已读 </a>
							</s:if>
							<s:else>
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									未读 </a>
							</s:else>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
			<td colspan="3">
				<hr />
				合同：
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- 合同的显示 -->
		<tr>
			<td>
				<div align="center">
					房地产商
				</div>
			</td>
			<td>
				<div align="center">
					套房
				</div>
			</td>
			<td>
				<div align="center">
					状态
				</div>
			</td>
		</tr>
		<s:iterator value="contract" id="con">
			<s:if test="#con.getUser().getId() == #session['userid']">
				<tr>
					<td>
						<div align="center">
							<s:property value="#con.getDeveloper().getCompanyName()" />
						</div>
					</td>
					<td>
						<div align="center">
							<s:property value="#con.getHouse().getEstate().getName()" />
						</div>
					</td>
					<s:if test="#con.getStatus() == 0">
						<td>
							<div align="center">
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									未确认 </a>
							</div>
						</td>
					</s:if>
					<s:else>
						<td>
							<div align="center">
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									已确认 </a>
							</div>
						</td>
					</s:else>
				</tr>
			</s:if>
		</s:iterator>
	</s:else>
</table>
