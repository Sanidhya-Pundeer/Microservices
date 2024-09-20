package com.example.SpringBootHibernate.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customers {
	
	@Id
	private int customer_id;
	private String name;
	private double phone;
	private int age;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name="current_street"), name="street"),
		@AttributeOverride(column = @Column(name="current_state"), name="state"),
		@AttributeOverride(column = @Column(name="current_country"), name="country"),
	})
	private Address current_address;
	
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name="permanent_street"), name="street"),
		@AttributeOverride(column = @Column(name="permanent_state"), name="state"),
		@AttributeOverride(column = @Column(name="permanent_country"), name="country"),
	})
	private Address permanent_address;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(Address current_address) {
		this.current_address = current_address;
	}

	public Address getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(Address permanent_address) {
		this.permanent_address = permanent_address;
	}
}
