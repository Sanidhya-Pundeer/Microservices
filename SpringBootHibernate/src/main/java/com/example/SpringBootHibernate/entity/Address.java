package com.example.SpringBootHibernate.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable			

public class Address {
	private String street;
	private String state;
	private String country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
