package com.example.DeployedSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DeployedSpring.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
