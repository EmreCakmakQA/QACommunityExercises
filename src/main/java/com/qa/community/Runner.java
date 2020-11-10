package com.qa.community;

import com.qa.community.tasks.garage.Garage;
import com.qa.community.tasks.garage.Vehicle;
import com.qa.community.tasks.garage.vehicles.Bicycle;
import com.qa.community.tasks.garage.vehicles.Car;
import com.qa.community.tasks.garage.vehicles.Motorcycle;




//Create a method in Garage that iterates through each Vehicle, calculating a bill for each type of Vehicle in a different way, depending on the type of vehicle it is.  You can decide how this bill is calculated based on any attributes you see fit. (You do not get extra marks for making the calculation overly complex)

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage myGarage = new Garage();
		
		myGarage.addToList(new Car("Black", 100, 4, true, 4, true, "HONK!"));
		
		
	}

}
