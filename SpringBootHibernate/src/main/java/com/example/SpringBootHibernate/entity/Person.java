package com.example.SpringBootHibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	private int age;
	@OneToOne
	private AadharCard ac;

	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AadharCard getAc() {
		return ac;
	}

	public void setAc(AadharCard ac) {
		this.ac = ac;
	}
	
	
}
