package com.realestate;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor {
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@SuppressWarnings("unchecked")
	@Override
	public String intercept(ActionInvocation action) throws Exception {
		System.out.print(action.getStack().findValue("id"));
		action.getInvocationContext().getParameters().containsKey("id");
		if(type==null||"".equals(type)){
			return action.invoke();
		}
		Map session=ActionContext.getContext().getSession();
		System.out.println(type);
		if(!session.containsKey("username")||!session.containsKey("usertype")||!session.containsKey("status"))
			return Action.ERROR;
	
		String userType=(String) session.get("usertype");
		if(!type.equals(userType))
			return Action.ERROR;
		return action.invoke();
	}

}
