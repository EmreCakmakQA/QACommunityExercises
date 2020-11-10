package com.qa.community.tasks.garage.vehicles;

import com.qa.community.tasks.garage.Vehicle;

public class Car extends Vehicle {
	
	
			// ========================================
			// Attributes
			// ========================================
			
			private boolean hasSeatbelts = true;
			private int passengers;
			private boolean hasHeadlights = true;
			private String sound = "HONK!";
			

			
			// ========================================
			// Constructors
			// ========================================
			
			
			
			
			public Car(String color, int speed, int noOfWheels, boolean hasSeatbelts, int passengers,
					boolean hasHeadlights, String sound) {
				super(color, speed, noOfWheels);
				this.hasSeatbelts = hasSeatbelts;
				this.passengers = passengers;
				this.hasHeadlights = hasHeadlights;
				this.sound = sound;
			}
			
			
			
			// ========================================
			// Methods
			// ========================================
			
			
			public void sound() {
				System.out.println(this.sound);
			}


			
			// ========================================
			// Getters and Setters
			// ========================================
			
			public boolean isHasSeatbelts() {
				return hasSeatbelts;
			}



			public void setHasSeatbelts(boolean hasSeatbelts) {
				this.hasSeatbelts = hasSeatbelts;
			}



			public int getPassengers() {
				return passengers;
			}



			public void setPassengers(int passengers) {
				this.passengers = passengers;
			}



			public boolean isHasHeadlights() {
				return hasHeadlights;
			}



			public void setHasHeadlights(boolean hasHeadlights) {
				this.hasHeadlights = hasHeadlights;
			}



			public String getSound() {
				return sound;
			}



			public void setSound(String sound) {
				this.sound = sound;
			}
			
			
			
}
