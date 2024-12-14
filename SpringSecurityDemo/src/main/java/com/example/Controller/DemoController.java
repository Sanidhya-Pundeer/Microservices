package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/greet")
	public String welcome() {
	return "Welcome user";
	}
	@GetMapping("/hello")
	public String sayHello() {
	return "Hello user";
	}
	@GetMapping("/greet/{username}")
	public String welcome(@PathVariable String username) {
	return "Welcome "+username;
	}
}
