package com.example.SpringBootHibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AadharCard {

	@Id
	private Long aadharNum;
	//in person table there will be a variable of ac, no person variable exists in aadhar table
	// have to use the exact variable here 
	@OneToOne(mappedBy = "ac")
	private Person p;
	private String address;
	
	
	public Long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(Long aadharNum) {
		this.aadharNum = aadharNum;
	}
	public Person getP() {
		return p;
	}
	public void setP(Person p) {
		this.p = p;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
