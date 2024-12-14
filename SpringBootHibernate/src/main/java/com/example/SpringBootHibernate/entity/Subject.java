package com.example.SpringBootHibernate.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {

	@Id
	private int sub_id;
	private String name;
	
	@ManyToMany(mappedBy = "subjects")
	private List<Student> students;
	
}