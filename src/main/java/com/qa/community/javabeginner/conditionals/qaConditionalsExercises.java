package com.qa.community.javabeginner.conditionals;

public class qaConditionalsExercises {

	public static void init() {
		// TODO Auto-generated method stub
		
		
//		If the boolean is true, the method will return a sum of the two numbers; if false it will return the multiplication of the two numbers.
//		For example:
		
//		Input (1, 2, true) -> 3 adds
//		Input (3, 3, false) -> 9 multiplies
//		Input (1, 1, true) -> 2 adds
		
		
		System.out.println(input(1,1,true));
	}
	
	public static int input(int number1, int number2, boolean trueOrFalse) {
		if(trueOrFalse == true) {
			return number1 + number2;
		} else {
			return number1 * number2;
		}
	}

}
