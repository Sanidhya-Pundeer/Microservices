package com.example.DeployedSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DeployedSpring.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
