package com.realestate.pojo;

public class Notice4Index {
	Integer id;
	String title;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Notice4Index(){
		
	}
	public Notice4Index(Integer id,String title){
		this.id=id;
		this.title=title;
	}
}
