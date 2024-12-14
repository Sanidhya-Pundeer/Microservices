package com.example.SpringBootHibernate.entity;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int student_id;
	private String name;
	private int age;
	
	@ManyToOne
	private School scl;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "student_course", // Name of the join table
	        joinColumns = @JoinColumn(name="student_id"), // Foreign key in the join table for Student
	        inverseJoinColumns = @JoinColumn(name="sub_id") // Foreign key in the join table for Course
	  
	)
	private Set<Subject> subjects;
	

	public int getId() {
		return student_id;
	}

	public void setId(int id) {
		this.student_id = id;
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

	public School getScl() {
		return scl;
	}

	public void setScl(School scl) {
		this.scl = scl;
	}
}