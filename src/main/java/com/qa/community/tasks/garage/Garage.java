package com.qa.community.tasks.garage;

import java.util.ArrayList;

import com.qa.community.tasks.garage.vehicles.Bicycle;
import com.qa.community.tasks.garage.vehicles.Car;
import com.qa.community.tasks.garage.vehicles.Motorcycle;

public class Garage {
	
	// Attributes
	private ArrayList<Vehicle> myList = new ArrayList<>();
	
	
	
	// Constructors
	
	
	public Garage() {
		
	}
	
	
	
	// Methods

	public void addToList(Vehicle vehicle) {
		myList.add(vehicle);
	}
}
