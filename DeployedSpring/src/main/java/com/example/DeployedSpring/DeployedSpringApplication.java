package com.example.DeployedSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.DeployedSpring.Entity.AadharCard;
import com.example.DeployedSpring.Entity.Student;
import com.example.DeployedSpring.Entity.Subject;
import com.example.DeployedSpring.Repository.StudentRepository;

@SpringBootApplication
public class DeployedSpringApplication implements CommandLineRunner{

	@Autowired
	StudentRepository stdrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DeployedSpringApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		Student std = new Student();
		std.setName("MAX");
		std.setAge(21);
		
		AadharCard aadhar = new AadharCard();
		aadhar.setAdhar_num(6969);
		aadhar.setS(std);
		
		std.setAadhar(aadhar);
		
		Student std1 = new Student();
		std1.setName("JOHN");
		std1.setAge(22);
		
		AadharCard aadhar1 = new AadharCard();
		aadhar1.setAdhar_num(7000);
		aadhar1.setS(std1);
		
		std1.setAadhar(aadhar1);
		
		Subject sub1 = new Subject();
		sub1.setName("Java");
		Subject sub2 = new Subject();
		sub2.setName("Python");
		Subject sub3 = new Subject();
		sub3.setName("Cpp");
		
		std.setSub(Arrays.asList(sub1,sub2,sub3));
		std1.setSub(Arrays.asList(sub1,sub2,sub3));
		
		sub1.setStudents(Arrays.asList(std1,std));
		sub2.setStudents(Arrays.asList(std1,std));
		sub3.setStudents(Arrays.asList(std1,std));
		
		stdrepo.save(std);
		stdrepo.save(std1);
	}

}
