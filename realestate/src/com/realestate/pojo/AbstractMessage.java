package com.realestate.pojo;

import java.util.Date;

/**
 * AbstractMessage entity provides the base persistence definition of the
 * Message entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Developer developer;
	private String content;
	private Byte beRead;
	private Date datetime;
	private Byte direction;
	private String title;

	// Constructors

	/** default constructor */
	public AbstractMessage() {
	}

	/** minimal constructor */
	public AbstractMessage(String content, Byte beRead, Date datetime,
			String title) {
		this.content = content;
		this.beRead = beRead;
		this.datetime = datetime;
		this.title = title;
	}

	/** full constructor */
	public AbstractMessage(User user, Developer developer, String content,
			Byte beRead, Date datetime, Byte direction, String title) {
		this.user = user;
		this.developer = developer;
		this.content = content;
		this.beRead = beRead;
		this.datetime = datetime;
		this.direction = direction;
		this.title = title;
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

	public Developer getDeveloper() {
		return this.developer;
	}

	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Byte getBeRead() {
		return this.beRead;
	}

	public void setBeRead(Byte beRead) {
		this.beRead = beRead;
	}

	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Byte getDirection() {
		return this.direction;
	}

	public void setDirection(Byte direction) {
		this.direction = direction;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}