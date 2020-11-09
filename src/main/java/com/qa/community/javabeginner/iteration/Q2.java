package com.qa.community.javabeginner.iteration;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Loops from 100 to 200 printing "+" for even numbers and "-" for odd numbers
		
		for(int i = 100; i < 201; i++) {
			if(i % 2 == 0) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}

}
