package com.capgemini.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	int id;
	String name;
	String mobileNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Person(int id, String name, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
