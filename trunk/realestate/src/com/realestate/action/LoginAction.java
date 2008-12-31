package com.realestate.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.DeveloperDAO;
import com.realestate.dao.UserDAO;
import com.realestate.pojo.Developer;
import com.realestate.pojo.User;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String type;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void validate() {
		if ("dev".equals(type)) {
			DeveloperDAO dao = new DeveloperDAO();
			List<Developer> dlist = dao.findByName(username);
			if (dlist.size() == 0)
				this.addActionError("用户名不存在，请重试！");
			else {
				for (Developer d : dlist) {
					if (!(d.getPassword().equals(password))) {
						this.addActionError("密码错误，请重试！");
					} else {
						Map session = ActionContext.getContext().getSession();
						session.put("userid", d.getId());
						session.put("username", username);
						session.put("usertype", type);
						session.put("status", d.getStatus());
					}

				}
			}
		} else if ("usr".equals(type)) {
			UserDAO dao = new UserDAO();
			List<User> ulist = dao.findByName(username);
			if (ulist.size() == 0)
				this.addActionError("用户名不存在，请重试！");
			else {
				for (User u : ulist) {
					if (!(u.getPassword().equals(password)))
						this.addActionError("密码错误，请重试！");
					else {
						Map session = ActionContext.getContext().getSession();
						session.put("username", username);
						session.put("usertype", type);
						session.put("status", u.getStatus());
						session.put("userid", u.getId());
					}
				}

			}

		} else {
			this.addActionError("没有选择用户类型，请重试！");
		}

	}




}
