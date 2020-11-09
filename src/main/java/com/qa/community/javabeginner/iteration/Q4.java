package com.qa.community.javabeginner.iteration;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a method to print the numbers 1 to 10 as many times as the value of that number.
		// For example; you will print 1 once, and 10 ten times.
		
		looper(3);
		
	}
	
	public static void looper(int input) {
		for(int i = 1; i <= input; i++ ) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j);
			}
			System.out.println("\n");
		}
	}

}
