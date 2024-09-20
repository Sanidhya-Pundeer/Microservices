package com.example.SpringBootHibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Flight {

	@Id
	private int id;
	
	@Column(name = "source_country")
	private String source;
	
	@Column(name = "destination_country")
	private String dest;
	private int avail_seats;
	private double price;
	
	@Embedded
	private Pilot pilot;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public int getAvail_seats() {
		return avail_seats;
	}
	public void setAvail_seats(int avail_seats) {
		this.avail_seats = avail_seats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pilot getPilot() {
		return pilot;
	}
	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}
	
}
