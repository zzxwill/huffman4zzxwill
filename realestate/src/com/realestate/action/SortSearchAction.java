package com.realestate.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.realestate.dao.EstateDAO;
import com.realestate.dao.TypedetailDAO;
import com.realestate.pojo.Estate;
import com.realestate.pojo.Typedetail;

public class SortSearchAction extends ActionSupport {
	EstateDAO dao;
	TypedetailDAO tdao;
	List<Estate> estResult;
	String by;
	String type;



	public List<Estate> getEstResult() {
		return estResult;
	}

	public void setEstResult(List<Estate> estResult) {
		this.estResult = estResult;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String execute() throws Exception {
		dao=new EstateDAO();
		tdao=new TypedetailDAO();
		if (by.equals("typedetail")) {
			if (type.equals("villa")) {
				Typedetail typedetail= (Typedetail) tdao.findByType("别墅").get(0);
				estResult=dao.findByProperty("typedetail", typedetail);
			} else if (type.equals("townhouse")) {
				Typedetail typedetail= (Typedetail) tdao.findByType("TOWNHOUSE").get(0);
				estResult=dao.findByProperty("typedetail", typedetail);
			} else if (type.equals("apartment")) {
				Typedetail typedetail= (Typedetail) tdao.findByType("公寓式住宅").get(0);
				estResult=dao.findByProperty("typedetail",typedetail);
			} else if (type.equals("rowrise")) {
				Typedetail typedetail= (Typedetail) tdao.findByType("低层住宅").get(0);
				estResult=dao.findByProperty("typedetail", typedetail);
			} else if (type.equals("highrise")) {
				Typedetail typedetail= (Typedetail) tdao.findByType("多高层住宅").get(0);
				estResult=dao.findByProperty("typedetail",typedetail);
			}
		} else if (by.equals("zone")) {
			if(type.equals("haidian")){
				estResult=dao.findPropertyLike("location", "海淀");
			}else if(type.equals("dongcheng")){
				estResult=dao.findPropertyLike("location", "东城");
			}else if(type.equals("xicheng")){
				estResult=dao.findPropertyLike("location", "西城");
			}else if(type.equals("shunyi")){
				estResult=dao.findPropertyLike("location", "顺义");
			}else if(type.equals("chaoyang")){
				estResult=dao.findPropertyLike("location", "朝阳");
			}else if(type.equals("chongwen")){
				estResult=dao.findPropertyLike("location", "崇文");
			}else if(type.equals("xuanwu")){
				estResult=dao.findPropertyLike("location", "宣武");
			}else if(type.equals("mentougou")){
				estResult=dao.findPropertyLike("location", "门头沟");
			}else if(type.equals("huairou")){
				estResult=dao.findPropertyLike("location", "怀柔");
			}
			

		} else if (by.equals("avgprice")) {
			if(type.equals("5")){
			  estResult=dao.findValueBetween("avgPrice", null, 5000);
			  
			}else if(type.equals("7")){
				estResult=dao.findValueBetween("avgPrice", 5000, 7000);
			}else if(type.equals("9")){
				estResult=dao.findValueBetween("avgPrice", 7000, 9000);
			}else if(type.equals("1.2")){
				estResult=dao.findValueBetween("avgPrice", 9000, 12000);
			}else if(type.equals("1.8")){
				estResult=dao.findValueBetween("avgPrice", 12000, 18000);
			}else if(type.equals("1.8u")){
				estResult=dao.findValueBetween("avgPrice", 18000, null);
			}

		} 

		return SUCCESS;
	}

}
