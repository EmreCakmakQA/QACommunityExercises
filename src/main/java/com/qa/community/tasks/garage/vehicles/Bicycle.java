package com.qa.community.tasks.garage.vehicles;

import com.qa.community.tasks.garage.Vehicle;

public class Bicycle extends Vehicle{
			
			// ========================================
			// Attributes
			// ========================================
			
			private boolean hasBasket = false;
			private String sound = "RING!";
			private int lights = 2;
			
			
			
			// ========================================
			// Constructors
			// ========================================
			
			public Bicycle(String color, int speed, int noOfWheels, boolean hasBasket, String sound, int lights) {
				super(color, speed, noOfWheels);
				this.hasBasket = hasBasket;
				this.sound = sound;
				this.lights = lights;
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
			
			
			




			public boolean isHasBasket() {
				return hasBasket;
			}



			public void setHasBasket(boolean hasBasket) {
				this.hasBasket = hasBasket;
			}



			public String getSound() {
				return sound;
			}



			public void setSound(String sound) {
				this.sound = sound;
			}



			public int getLights() {
				return lights;
			}



			public void setLights(int lights) {
				this.lights = lights;
			}
			
			
			
}
