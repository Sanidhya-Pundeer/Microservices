package com.ncu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ncu.entities.Movie;

public interface MovieRepositories extends JpaRepository<Movie, Integer>{
// there should be a primary key for JpaRepository <Movie(entity), Integer(primarykey)>
	
	
}
