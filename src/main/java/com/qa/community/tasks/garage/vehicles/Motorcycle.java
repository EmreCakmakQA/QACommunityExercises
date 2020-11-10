package com.qa.community.tasks.garage.vehicles;

import com.qa.community.tasks.garage.Vehicle;

public class Motorcycle extends Vehicle{
	
		// ========================================
		// Attributes
		// ========================================
		
		private boolean wheelie = true;
		private String style = "Harley Davidson";
		private String sound = "BEEP!";
		
		
		
		
		// ========================================
		// Constructors
		// ========================================
		
		
		public Motorcycle(String color, int speed, int noOfWheels, boolean wheelie, String style, String sound) {
			super(color, speed, noOfWheels);
			this.wheelie = wheelie;
			this.style = style;
			this.sound = sound;
		}


		
		// ========================================
		// Methods
		// ========================================

		public void sound() {
			System.out.println(this.sound);
		}
		

		public void popAWheelie() {
			if(wheelie == true) {
				System.out.println("Doing a wheelie!");
			}
		}

		
		
		// ========================================
		// Getters and Setters
		// ========================================
		
		public boolean isWheelie() {
			return wheelie;
		}






		public void setWheelie(boolean wheelie) {
			this.wheelie = wheelie;
		}






		public String getStyle() {
			return style;
		}






		public void setStyle(String style) {
			this.style = style;
		}






		public String getSound() {
			return sound;
		}






		public void setSound(String sound) {
			this.sound = sound;
		}
		
		
		
		


}
