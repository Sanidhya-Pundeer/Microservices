package com.example.SpringBootHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHibernate.entity.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
