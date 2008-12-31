package com.realestate.pojo;

/**
 * Manager entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Manager extends AbstractManager implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** full constructor */
	public Manager(String name, String password) {
		super(name, password);
	}

}
