package com.ncu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//the data of the class is gonna be stored in the database with the table name same as class
@Table(name="movies")
public class Movie {


@Id 
// making a primary key in table
@GeneratedValue(strategy = GenerationType.IDENTITY)
// same as identity in sql incrementing value by 1
private int id;
private String title;
private double rating;
private int releaseYear;

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public int getreleaseYear() {
	return releaseYear;
}
public void setreleaseYear(int year) {
	this.releaseYear = year;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}	

}
