package com.realestate.pojo;

import java.util.Set;

/**
 * Typedetail entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Typedetail extends AbstractTypedetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Typedetail() {
	}

	/** minimal constructor */
	public Typedetail(String type) {
		super(type);
	}

	/** full constructor */
	public Typedetail(String type, Set estates) {
		super(type, estates);
	}

}
