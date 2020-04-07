package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//harish
@Entity
public class Customer {

	@Id
	private int id;
	private String name;
	
	
}
