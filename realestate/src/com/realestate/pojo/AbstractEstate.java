package com.realestate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractEstate entity provides the base persistence definition of the Estate
 * entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractEstate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Typedetail typedetail;
	private Developer developer;
	private String name;
	private String location;
	private Short greenRate;
	private String traffic;
	private String environment;
	private String image;
	private Integer total;
	private Integer presale;
	private Integer sold;
	private Integer avgPrice;
	private Integer startPrice;
	private Set houses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractEstate() {
	}

	/** minimal constructor */
	public AbstractEstate(Typedetail typedetail, Developer developer,
			String name, String location, String image, Integer total,
			Integer presale, Integer sold, Integer avgPrice, Integer startPrice) {
		this.typedetail = typedetail;
		this.developer = developer;
		this.name = name;
		this.location = location;
		this.image = image;
		this.total = total;
		this.presale = presale;
		this.sold = sold;
		this.avgPrice = avgPrice;
		this.startPrice = startPrice;
	}

	/** full constructor */
	public AbstractEstate(Typedetail typedetail, Developer developer,
			String name, String location, Short greenRate, String traffic,
			String environment, String image, Integer total, Integer presale,
			Integer sold, Integer avgPrice, Integer startPrice, Set houses) {
		this.typedetail = typedetail;
		this.developer = developer;
		this.name = name;
		this.location = location;
		this.greenRate = greenRate;
		this.traffic = traffic;
		this.environment = environment;
		this.image = image;
		this.total = total;
		this.presale = presale;
		this.sold = sold;
		this.avgPrice = avgPrice;
		this.startPrice = startPrice;
		this.houses = houses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Typedetail getTypedetail() {
		return this.typedetail;
	}

	public void setTypedetail(Typedetail typedetail) {
		this.typedetail = typedetail;
	}

	public Developer getDeveloper() {
		return this.developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Short getGreenRate() {
		return this.greenRate;
	}

	public void setGreenRate(Short greenRate) {
		this.greenRate = greenRate;
	}

	public String getTraffic() {
		return this.traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	public String getEnvironment() {
		return this.environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPresale() {
		return this.presale;
	}

	public void setPresale(Integer presale) {
		this.presale = presale;
	}

	public Integer getSold() {
		return this.sold;
	}

	public void setSold(Integer sold) {
		this.sold = sold;
	}

	public Integer getAvgPrice() {
		return this.avgPrice;
	}

	public void setAvgPrice(Integer avgPrice) {
		this.avgPrice = avgPrice;
	}

	public Integer getStartPrice() {
		return this.startPrice;
	}

	public void setStartPrice(Integer startPrice) {
		this.startPrice = startPrice;
	}

	public Set getHouses() {
		return this.houses;
	}

	public void setHouses(Set houses) {
		this.houses = houses;
	}

}