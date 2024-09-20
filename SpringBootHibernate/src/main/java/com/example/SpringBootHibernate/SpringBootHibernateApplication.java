package com.example.SpringBootHibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringBootHibernate.entity.Address;
import com.example.SpringBootHibernate.entity.Customers;
import com.example.SpringBootHibernate.entity.Flight;
import com.example.SpringBootHibernate.entity.Pilot;
import com.example.SpringBootHibernate.repositories.CustomerRepository;
import com.example.SpringBootHibernate.repositories.FlightRepository;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner{

	@Autowired
	private FlightRepository repo;
	
	@Autowired
	private CustomerRepository cus_repo;
	
	//main method should only be responsible for starting the application nothing else: single responsibility principle
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}
	
	public void run(String...args) throws Exception{
		
//		FlightEmbeddedDemo();
		CustomerEmbeddedDemo();
	}

	private void FlightEmbeddedDemo() { 
		Pilot p = new Pilot();
		p.setName("Ramesh");
		p.setAge(24);
		Flight f = new Flight();
		f.setId(123);
		f.setAvail_seats(150);
		f.setDest("Japan");
		f.setSource("India");
		f.setPilot(p);

		repo.save(f);
	}
	
	private void CustomerEmbeddedDemo() {
		Address a = new Address();
		a.setStreet("bond street");
		a.setState("London");
		a.setCountry("England");
		
		Address a1 = new Address();
		a1.setStreet("baker street");
		a1.setState("Central London");
		a1.setCountry("England");
	
		Customers c = new Customers();
		c.setPhone(345678);
		c.setCurrent_address(a1);
		c.setAge(19);
		c.setCustomer_id(1);
		c.setName("MAX");
		c.setPermanent_address(a);
		
		cus_repo.save(c);
		
	}

}
