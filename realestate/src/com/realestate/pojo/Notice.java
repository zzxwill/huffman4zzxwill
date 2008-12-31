package com.realestate.pojo;

/**
 * Notice entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Notice extends AbstractNotice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(String title, String content) {
		super(title, content);
	}

}
