package com.realestate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String password;
	private String idNum;
	private String email;
	private String telephone;
	private String realName;
	private String address;
	private Byte status;
	private Set messages = new HashSet(0);
	private Set contracts = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String name, String password, String idNum,
			String email, String realName, String address, Byte status) {
		this.name = name;
		this.password = password;
		this.idNum = idNum;
		this.email = email;
		this.realName = realName;
		this.address = address;
		this.status = status;
	}

	/** full constructor */
	public AbstractUser(String name, String password, String idNum,
			String email, String telephone, String realName, String address,
			Byte status, Set messages, Set contracts) {
		this.name = name;
		this.password = password;
		this.idNum = idNum;
		this.email = email;
		this.telephone = telephone;
		this.realName = realName;
		this.address = address;
		this.status = status;
		this.messages = messages;
		this.contracts = contracts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdNum() {
		return this.idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getContracts() {
		return this.contracts;
	}

	public void setContracts(Set contracts) {
		this.contracts = contracts;
	}

}