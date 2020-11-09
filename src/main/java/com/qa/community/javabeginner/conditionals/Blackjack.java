package com.qa.community.javabeginner.conditionals;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		blackjack (10, 21) -> 21
//		blackjack (20, 18) -> 20
//		blackjack (1, 22) -> 1
//		blackjack (22, 23) -> 0
	 
		System.out.println(blackjack(3, 12));
	}
	
	
	
	public static int blackjack(int value1, int value2) {
		int result = 0;
		
		if (value1 > 21 && value2 > 21) {
			result = 0;
			
		} else if(value1 > 21){
			result = value2;
			
		} else if(value2 > 21) {
			result = value1;
			
		} else {
			int d1 = 21 - value1;
			int d2 = 21 - value2;
			
			if (d1 > d2) {
				result = value2;
			} else if (d1 < d2) {
				result = value1;
			}
		}
		
		return result;
		
		
		
	}

}
