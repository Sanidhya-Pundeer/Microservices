package com.example.SpringBootHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHibernate.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{
	

}
