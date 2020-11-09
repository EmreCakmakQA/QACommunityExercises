package com.qa.community.javabeginner.conditionals;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myFunction(2000);
	}

	
	public static void myFunction(int A) {
		if(A > 2000) {
			System.out.println("A");
			if(A > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if(A > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			System.out.println(1);
			if(A > 100) {
				System.out.println(3);
				if(A > 600) {
					System.out.println(5);
				} else {
					System.out.println(4);
					if(A > 500) {
						System.out.println(6);
					} else {
						System.out.println(7);
					}
				}
			} else {
				System.out.println(2);
			}
		}
	}
}
