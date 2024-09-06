package com.ncu.controllers;

//import java.util.Arrays;
//import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public MovieRepositories repo;
	
	@GetMapping("/find-all-movies")
	@ResponseBody
	public List<Movie> getAllMovies(){
		Movie m1 = new Movie();
		m1.setTitle("UP");
		m1.setRating(6.9);
		m1.setreleaseYear(2021);
		
		Movie m2 = new Movie();
		m2.setTitle("Godfather");
		m2.setRating(9.8);
		m2.setreleaseYear(1999);
		
		Movie m3 = new Movie();
		m3.setTitle("Deadpool and Wolverine");
		m3.setRating(9);
		m3.setreleaseYear(2024);
		
//		return Arrays.asList(m1,m2,m3);
		return repo.findAll(); // to fetch data from the database
	}
	
	@PostMapping("/save-movie")
	@ResponseBody
	public Movie saveMovieDatabase(@RequestBody Movie movie){
//		Movie m1 = new Movie();
//		m1.setId(1);
//		m1.setTitle("Gangs of Wasseypur");
//		m1.setRating(8.9);
//		m1.setYear(2021);
		
		return repo.save(movie);
	}	
	
	@GetMapping("/find-movie-by-id/{id}")
	@ResponseBody
	public Movie findMovieById(@PathVariable int id) {
		Optional<Movie> optional = repo.findById(id);
		if(optional.isEmpty()){
			throw new RuntimeException("ID "+id+" not found");
		}
		return optional.get();
	}
}
