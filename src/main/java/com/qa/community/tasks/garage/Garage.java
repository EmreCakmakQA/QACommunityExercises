package com.qa.community.tasks.garage;

import java.util.ArrayList;

//import com.qa.community.tasks.garage.vehicles.Bicycle;
//import com.qa.community.tasks.garage.vehicles.Car;
//import com.qa.community.tasks.garage.vehicles.Motorcycle;

public class Garage {
	
	// Attributes
	public ArrayList<Vehicle> myList = new ArrayList<>();
	
	
	
	
	
	// Constructors
	
	
	public Garage() {
		
	}
	
	
	
	// Methods

	public void addToList(Vehicle vehicle) {
		myList.add(vehicle);
	}
	
	
	
	
	
	
	public void calculateCost(ArrayList<Vehicle> list) {
		int pricePerWeek;
		for(Vehicle handle : list) {
			
			if(handle.id == 1) {
				pricePerWeek = 10;
				System.out.println("The price per week to store your bike is: " + pricePerWeek);
			}
			
			else if(handle.id == 2) {
				pricePerWeek = 30;
				System.out.println("The price per week to store your motorbike is: " + pricePerWeek);
			}

			else if(handle.id == 3) {
				pricePerWeek = 50;
				System.out.println("The price per week to store your car is: " + pricePerWeek);
			}
		}
	}
}
