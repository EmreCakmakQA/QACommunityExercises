package com.qa.community.tasks.garage;


public class Vehicle {
	
	// ========================================
	// Attributes
	// ========================================
	
	private String color;
	private int speed;
	private int noOfWheels;
	
	
	
	
	// ========================================
	// Constructors
	// ========================================
	
	public Vehicle(String color, int speed, int noOfWheels) {
		super();
		this.color = color;
		this.speed = speed;
		this.noOfWheels = noOfWheels;
	}
	
	
	
	
	// ========================================
	// Methods
	// ========================================
	
	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getSpeed() {
		return speed;
	}




	public void setSpeed(int speed) {
		this.speed = speed;
	}




	public int getNoOfWheels() {
		return noOfWheels;
	}




	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	
}
