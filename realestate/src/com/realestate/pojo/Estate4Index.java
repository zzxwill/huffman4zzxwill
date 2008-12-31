package com.realestate.pojo;


public class Estate4Index {
	private Integer id;
	private Typedetail typedetail;
	private String name;
	private String location;
	private String traffic;
	private String image;
	private Integer avgPrice;
	private Integer startPrice;
	public Estate4Index(){
		
	}
	public Estate4Index(Integer id,String name,String image,Typedetail typedetail,String traffic,Integer avgPrice,Integer startPrice){
		this.id=id;
		this.name=name;
		this.image=image;
		this.typedetail=typedetail;
		this.traffic=traffic;
		this.avgPrice=avgPrice;
		this.startPrice=startPrice;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Typedetail getTypedetail() {
		return typedetail;
	}
	public void setTypedetail(Typedetail typedetail) {
		this.typedetail = typedetail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(Integer avgPrice) {
		this.avgPrice = avgPrice;
	}
	public Integer getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}
}
