package com.realestate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractTypedetail entity provides the base persistence definition of the
 * Typedetail entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractTypedetail implements java.io.Serializable {

	// Fields

	private Short id;
	private String type;
	private Set estates = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractTypedetail() {
	}

	/** minimal constructor */
	public AbstractTypedetail(String type) {
		this.type = type;
	}

	/** full constructor */
	public AbstractTypedetail(String type, Set estates) {
		this.type = type;
		this.estates = estates;
	}

	// Property accessors

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getEstates() {
		return this.estates;
	}

	public void setEstates(Set estates) {
		this.estates = estates;
	}

}