package com.qa.community.inheritance;

public class Animal {
	
	protected String name;
	protected int numOfLegs;
	protected boolean canFly;
	
	// Constructor 
	public Animal() {
		this.name = "missing name";
		this.numOfLegs = 4;
		this.canFly = false;
	}
	
	public Animal(String name, int numOfLegs, boolean canFly) {
		super();
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.canFly = canFly;
	}
	
	// Methods
	  public void hunt() {
		  System.out.println(this.name + " hunts you.");
	  }
	  
	  public void sleep() {
		  System.out.println(this.name + " sleeps for now.");
	  }

	// ========================================
	// Getters and Setters
	// ========================================
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
