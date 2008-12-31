package com.realestate.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDeveloper entity provides the base persistence definition of the
 * Developer entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public abstract class AbstractDeveloper implements java.io.Serializable {

	// Fields

	private Integer id;
	private String address;
	private String url;
	private String telephone;
	private String information;
	private String post;
	private String email;
	private Short rank;
	private String license;
	private String companyName;
	private String password;
	private String name;
	private Byte status;
	private Set contracts = new HashSet(0);
	private Set messages = new HashSet(0);
	private Set estates = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDeveloper() {
	}

	/** minimal constructor */
	public AbstractDeveloper(String address, String telephone,
			String information, String post, String email, String license,
			String companyName, String password, Byte status) {
		this.address = address;
		this.telephone = telephone;
		this.information = information;
		this.post = post;
		this.email = email;
		this.license = license;
		this.companyName = companyName;
		this.password = password;
		this.status = status;
	}

	/** full constructor */
	public AbstractDeveloper(String address, String url, String telephone,
			String information, String post, String email, Short rank,
			String license, String companyName, String password, String name,
			Byte status, Set contracts, Set messages, Set estates) {
		this.address = address;
		this.url = url;
		this.telephone = telephone;
		this.information = information;
		this.post = post;
		this.email = email;
		this.rank = rank;
		this.license = license;
		this.companyName = companyName;
		this.password = password;
		this.name = name;
		this.status = status;
		this.contracts = contracts;
		this.messages = messages;
		this.estates = estates;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Short getRank() {
		return this.rank;
	}

	public void setRank(Short rank) {
		this.rank = rank;
	}

	public String getLicense() {
		return this.license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Set getContracts() {
		return this.contracts;
	}

	public void setContracts(Set contracts) {
		this.contracts = contracts;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Set getEstates() {
		return this.estates;
	}

	public void setEstates(Set estates) {
		this.estates = estates;
	}

}