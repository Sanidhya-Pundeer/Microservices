package com.ncu.controllers;

//import java.util.Arrays;
//import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncu.entities.Movie;
import com.ncu.repositories.MovieRepositories;

@Controller 

public class MovieController {

	//localhost:8080//find-all-movies
//	@GetMapping("/find-all-movies")
//	@ResponseBody
//	public List<String> getAllMovies(){
//		return Arrays.asList("Superman","Hulk");
//	}
	
	@Autowired
	private MovieRepositories repo;
	
	@GetMapping("/find-all-movies")
	@ResponseBody
	public List<Movie> getAllMovies(){
		Movie m1 = new Movie();
		m1.setTitle("UP");
		m1.setRating(6.9);
		m1.setYear(2021);
		
		Movie m2 = new Movie();
		m2.setTitle("Godfather");
		m2.setRating(9.8);
		m2.setYear(1999);
		
		Movie m3 = new Movie();
		m3.setTitle("Deadpool and Wolverine");
		m3.setRating(9);
		m3.setYear(2024);
		
//		return Arrays.asList(m1,m2,m3);
		return repo.findAll(); // to fetch data from the database
	}
	
	@PostMapping("/saveInDB")
	@ResponseBody
	public Movie saveMovieDatabase(){
		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("Gangs of Wasseypur");
		m1.setRating(8.9);
		m1.setYear(2021);
		
		return repo.save(m1);
		
		
	}	
}
