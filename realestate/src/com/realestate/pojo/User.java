package com.realestate.pojo;

import java.util.Set;

/**
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String password, String idNum, String email,
			String realName, String address, Byte status) {
		super(name, password, idNum, email, realName, address, status);
	}

	/** full constructor */
	public User(String name, String password, String idNum, String email,
			String telephone, String realName, String address, Byte status,
			Set messages, Set contracts) {
		super(name, password, idNum, email, telephone, realName, address,
				status, messages, contracts);
	}

}
