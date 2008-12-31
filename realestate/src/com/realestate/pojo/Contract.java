package com.realestate.pojo;

import java.util.Date;

/**
 * Contract entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Contract extends AbstractContract implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Contract() {
	}

	/** full constructor */
	public Contract(User user, House house, Developer developer,
			Date signedDate, Date deadline, Byte status) {
		super(user, house, developer, signedDate, deadline, status);
	}

}
