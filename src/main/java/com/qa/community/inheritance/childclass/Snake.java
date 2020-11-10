package com.qa.community.inheritance.childclass;

import com.qa.community.inheritance.Animal;

public class Snake extends Animal{
	// Attributes
	
	protected String name;
	protected int numOfLegs;
	protected boolean canFly;
	
	// Constructor 
	public Snake() {
		super();
		
	
	}
	
	public Snake(String name, int numOfLegs, boolean canFly) {
		super();
		this.name = name;
		this.numOfLegs = numOfLegs;
		this.canFly = canFly;
	}
	

}