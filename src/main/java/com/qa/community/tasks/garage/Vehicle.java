package com.qa.community.tasks.garage;


public class Vehicle {
	
	// ========================================
	// Attributes
	// ========================================
	protected int id;
	private String color;
	private int speed;
	private int noOfWheels;
	
	
	
	
	// ========================================
	// Constructors
	// ========================================
	
	public Vehicle(int id, String color, int speed, int noOfWheels) {
		super();
		this.id = id;
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




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	
	
}
