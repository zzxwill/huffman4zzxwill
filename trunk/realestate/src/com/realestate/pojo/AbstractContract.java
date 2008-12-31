package com.realestate.pojo;

import java.util.Date;

/**
 * AbstractContract entity provides the base persistence definition of the
 * Contract entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractContract implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private House house;
	private Developer developer;
	private Date signedDate;
	private Date deadline;
	private Byte status;

	// Constructors

	/** default constructor */
	public AbstractContract() {
	}

	/** full constructor */
	public AbstractContract(User user, House house, Developer developer,
			Date signedDate, Date deadline, Byte status) {
		this.user = user;
		this.house = house;
		this.developer = developer;
		this.signedDate = signedDate;
		this.deadline = deadline;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public House getHouse() {
		return this.house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Developer getDeveloper() {
		return this.developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public Date getSignedDate() {
		return this.signedDate;
	}

	public void setSignedDate(Date signedDate) {
		this.signedDate = signedDate;
	}

	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

}