package com.example.SpringBootHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHibernate.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
