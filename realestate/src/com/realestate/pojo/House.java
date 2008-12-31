package com.realestate.pojo;

import java.util.Set;

/**
 * House entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class House extends AbstractHouse implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public House() {
	}

	/** minimal constructor */
	public House(Estate estate, Short floor, Short type, Short status,
			Integer price, Integer area) {
		super(estate, floor, type, status, price, area);
	}

	/** full constructor */
	public House(Estate estate, Short floor, Short type, Short status,
			Integer price, Integer area, Set contracts) {
		super(estate, floor, type, status, price, area, contracts);
	}

}
