package com.ncu.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


class User{
	private String name;
	private String address;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

@CrossOrigin(origins= {"https://hoppscotch.io/"})
@RestController
@RequestMapping("api/v1/users")
public class UserController {
	
	@GetMapping(produces = {
			MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE
			})
	public User getUser() {
		User u = new User();
		u.setName("MAX");
		u.setAge(21);
		u.setAddress("Dwarka");
		return u;
	}
	
//	@PostMapping(produces = {
//			MediaType.APPLICATION_XML_VALUE,
//			MediaType.APPLICATION_JSON_VALUE
//			}, consumes = {
//			MediaType.APPLICATION_XML_VALUE,
//			MediaType.APPLICATION_JSON_VALUE
//			})
//	public User saveUser(@RequestMapping User u) {
//		
//	}
	
}
