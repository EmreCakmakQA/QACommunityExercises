package com.qa.community.solidPrinciples.soild;

public class Mechanic {
	 
	//Attributes
	private int tyres;
	private boolean hasSpoiler;
	private int rideHeight;
	
	//Constructor
	public Mechanic(int tyres, boolean hasSpoiler, int rideHeight) {
		super();
		this.tyres = tyres;
		this.hasSpoiler = hasSpoiler;
		this.rideHeight = rideHeight;
	}
	
	

	//Getter & Setters
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public boolean isHasSpoiler() {
		return hasSpoiler;
	}
	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}
	public int getRideHeight() {
		return rideHeight;
	}
	public void setRideHeight(int rideHeight) {
		this.rideHeight = rideHeight;
	}
	
	
}
