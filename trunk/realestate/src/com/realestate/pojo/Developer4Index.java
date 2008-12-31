package com.realestate.pojo;

public class Developer4Index {
	private Integer id;
	private String address;
	private String companyName;
	private String telephone;
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Developer4Index(){
		
	}
	public Developer4Index(Integer id,String companyName,String address,String telephone){
		this.id=id;
		this.companyName=companyName;
		this.address=address;
		this.telephone=telephone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
