package com.realestate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHouse entity provides the base persistence definition of the House
 * entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractHouse implements java.io.Serializable {

	// Fields

	private Integer id;
	private Estate estate;
	private Short floor;
	private Short type;
	private Short status;
	private Integer price;
	private Integer area;
	private Set contracts = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHouse() {
	}

	/** minimal constructor */
	public AbstractHouse(Estate estate, Short floor, Short type, Short status,
			Integer price, Integer area) {
		this.estate = estate;
		this.floor = floor;
		this.type = type;
		this.status = status;
		this.price = price;
		this.area = area;
	}

	/** full constructor */
	public AbstractHouse(Estate estate, Short floor, Short type, Short status,
			Integer price, Integer area, Set contracts) {
		this.estate = estate;
		this.floor = floor;
		this.type = type;
		this.status = status;
		this.price = price;
		this.area = area;
		this.contracts = contracts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estate getEstate() {
		return this.estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}

	public Short getFloor() {
		return this.floor;
	}

	public void setFloor(Short floor) {
		this.floor = floor;
	}

	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getArea() {
		return this.area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Set getContracts() {
		return this.contracts;
	}

	public void setContracts(Set contracts) {
		this.contracts = contracts;
	}

}