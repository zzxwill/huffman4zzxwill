<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="bar"
	style="background-image: url(images/info.jpg); height: 50px">
	<div
		style="color: #FFffff; # FF9933; float: left; font-family: ��Բ; font-size: 15px; font-weight: bold; position: relative; left: 80px; top: 21px">
		������ҳ
	</div>
</div>

<table width="590" border="0" cellspacing="0" cellpadding="0">

	<s:if test="#session['usertype'] == 'dev'">
		<!-- ʵ�ַ��ز��̵Ĳ��� -->
		<center>------------------------------��������Ϣ--------------------------</center>
		<tr>
			<td colspan="3">
				��Ϣ��
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- ��Ϣ����ʾ -->
		<tr>
			<td>
				<div align="center">
					����
				</div>
			</td>
			<td>
				<div align="center">
					����
				</div>
			</td>
			<td>
				<div align="center">
					״̬
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
									�Ѷ� </a>
							</s:if>
							<s:else>
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									δ�� </a>
							</s:else>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
			<td colspan="3">
				<hr />
				��ͬ��
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- ��ͬ����ʾ -->
		<tr>
			<td>
				<div align="center">
					�û�
				</div>
			</td>
			<td>
				<div align="center">
					�׷�
				</div>
			</td>
			<td>
				<div align="center">
					״̬
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
									δȷ�� </a>
							</div>
						</td>
					</s:if>
					<s:else>
						<td>
							<div align="center">
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									��ȷ�� </a>
							</div>
						</td>
					</s:else>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
		
			<td colspan="4">
				<hr />
				���е�¥�̣�
			</td>
			<td> <hr /></td>
			<td><hr /></td>
		</tr>
		<!-- ¥�̵���ʾ -->
		<tr>
			<td>
				<div align="center">
					����
				</div>
			</td>
			<td>
				<div align="center">
					��ϸ��Ϣ
				</div>
			</td>
			<td>
				<div align="center">
					�޸���Ϣ
				</div>
			</td>
			<td>
				<div align="center">
					ɾ��
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
							<a href="estateinfo.action?id=<s:property value='#est.getId()'/>">��ϸ</a>
						</div>
					</td>
					<td>
						<div align="center">
							<a
								href="<s:url action="modifyestatetransfer"><s:param name="id" value="#est.getId()" /></s:url>">�޸�</a>
						</div>
					</td>
					<td>
						<div align="center">
							<a href="delestate.action?id=<s:property value='#est.getId()'/>">ɾ��</a>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>
		<tr>
			<td>
				<div align="center">
					<a href="addestatetransfer.action">����</a>
				</div>
			</td>
			<td></td>
		</tr>
	</s:if>

	<s:else>
		<center>-------------------------�û���Ϣ-------------------------</center>
		<tr>
			<td colspan="3">
				��Ϣ��
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- ��Ϣ����ʾ -->
		<tr>
			<td>
				<div align="center">
					����
				</div>
			</td>
			<td>
				<div align="center">
					����
				</div>
			</td>
			<td>
				<div align="center">
					״̬
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
									�Ѷ� </a>
							</s:if>
							<s:else>
								<a
									href="message_details.action?id=<s:property value='#msg.getId()'/>">
									δ�� </a>
							</s:else>
						</div>
					</td>
				</tr>
			</s:if>
		</s:iterator>

		<tr>
			<td colspan="3">
				<hr />
				��ͬ��
			</td>
			<td></td>
			<td></td>
		</tr>
		<!-- ��ͬ����ʾ -->
		<tr>
			<td>
				<div align="center">
					���ز���
				</div>
			</td>
			<td>
				<div align="center">
					�׷�
				</div>
			</td>
			<td>
				<div align="center">
					״̬
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
									δȷ�� </a>
							</div>
						</td>
					</s:if>
					<s:else>
						<td>
							<div align="center">
								<a
									href="contract_details.action?id=<s:property value='#con.getId()'/>">
									��ȷ�� </a>
							</div>
						</td>
					</s:else>
				</tr>
			</s:if>
		</s:iterator>
	</s:else>
</table>
