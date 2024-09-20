package com.example.SpringBootHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHibernate.entity.AadharCard;

public interface AadharRepository extends  JpaRepository<AadharCard, Long>{

}
