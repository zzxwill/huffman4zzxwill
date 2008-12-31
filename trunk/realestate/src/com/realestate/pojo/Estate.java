package com.realestate.pojo;

import java.util.Set;

/**
 * Estate entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Estate extends AbstractEstate implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Estate() {
	}

	/** minimal constructor */
	public Estate(Typedetail typedetail, Developer developer, String name,
			String location, String image, Integer total, Integer presale,
			Integer sold, Integer avgPrice, Integer startPrice) {
		super(typedetail, developer, name, location, image, total, presale,
				sold, avgPrice, startPrice);
	}

	/** full constructor */
	public Estate(Typedetail typedetail, Developer developer, String name,
			String location, Short greenRate, String traffic,
			String environment, String image, Integer total, Integer presale,
			Integer sold, Integer avgPrice, Integer startPrice, Set houses) {
		super(typedetail, developer, name, location, greenRate, traffic,
				environment, image, total, presale, sold, avgPrice, startPrice,
				houses);
	}

}
