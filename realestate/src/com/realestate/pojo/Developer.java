package com.realestate.pojo;

import java.util.Set;

/**
 * Developer entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Developer extends AbstractDeveloper implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Developer() {
	}

	/** minimal constructor */
	public Developer(String address, String telephone, String information,
			String post, String email, String license, String companyName,
			String password, Byte status) {
		super(address, telephone, information, post, email, license,
				companyName, password, status);
	}

	/** full constructor */
	public Developer(String address, String url, String telephone,
			String information, String post, String email, Short rank,
			String license, String companyName, String password, String name,
			Byte status, Set contracts, Set messages, Set estates) {
		super(address, url, telephone, information, post, email, rank, license,
				companyName, password, name, status, contracts, messages,
				estates);
	}

}
