package com.dinwiddy.dropwizard.demo.views;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		if(name == null) {
			return "Unknown";
		}
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
