package com.qa.community.javabeginner.iteration;

public class Q5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Implement 4 methods that manipulate strings objects.
		
		// length():
		String str = "Hello my name is Emre Cakmak, I like to code";
		System.out.println("The size of the string str is " + str.length()); // The size of the string str is 44
		
		// substring():
		String str2 = "This is the second string. substring(5) starts the sentence from index 5. substring(5,10) starts at index 5 and ends at index 10";
		System.out.println(str2.substring(5));
		
		String str3 = "This is the second string starting from index 5 and ending at but not including, index 10";
		System.out.println(str3.substring(5,10));
		
		//equals():
		String str4 = "This is the third example. equals() returns true if two strings are the same";
		String str5 = "This is the third example. equals() returns true if two strings are the same";
		System.out.println(str4.equals(str5) + " .str4 is equal to str5");
		
		String str6 = "This is the third example. equals() returns true if two strings are the same";
		String str7 = "This is the fourth example. equals() returns true if two strings are the same";
		System.out.println(str6.equals(str7) + " .str6 is not equal to str7");
		
		
		// Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
		String myString = "Print each word on a new line";
		System.out.println(myString.replaceAll("\\s+", "\n"));
		
		// This reverses the string letter by letter
		
		taskthree("This is hopefully reversed");
		
		taskfour("Hello my name is Emre", "emre");
	}
		public static void taskthree(String input) {
			for ( int i = input.length(); i > 0; i--) {
				System.out.println(input.substring(i-1,i));
			}
		}
		
		// Finds one input within another
		public static void taskfour(String input1, String input2) {
			
			boolean isFound = input1.indexOf(input2) !=-1? true: false;
			System.out.println(isFound);
		}

}
