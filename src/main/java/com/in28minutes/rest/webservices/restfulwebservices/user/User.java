package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date birthdDate;
	
	
	
	public User(Integer id, String name, Date birthdDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdDate = birthdDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthdDate() {
		return birthdDate;
	}
	public void setBirthdDate(Date birthdDate) {
		this.birthdDate = birthdDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdDate=" + birthdDate + "]";
	}
	
	
}