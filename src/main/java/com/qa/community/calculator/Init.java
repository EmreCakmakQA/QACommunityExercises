package com.qa.community.calculator;

import java.util.Scanner;
import com.qa.community.calculator.method.*;

public class Init {

	private static Scanner scan = new Scanner(System.in);
	

	public static void init() {
		String response;
		boolean flag = true;
		while (flag) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println(
					"Calculator \nPlease pick a number: \n 1)Addition \n 2)Subtraction \n 3)Multiplication \n 4)Division");

			int user = scan.nextInt();

			switch (user) {
			case 1:
				
				System.out.println("Enter number 1:");
				int num1 = scan.nextInt();
				System.out.println("Enter number 2:");
				int num2 = scan.nextInt();
				int result = Addition.Add(num1, num2);
				System.out.println("Your result is equal to " + result + "\n");
				break;
			case 2:
				
				System.out.println("Enter number 1:");
				int n1 = scan.nextInt();
				System.out.println("Enter number 2:");
				int n2 = scan.nextInt();
				int result2 = Subtraction.Sub(n1, n2);
				System.out.println("Your result is equal to " + result2);
				break;
			case 3:
				
				System.out.println("Enter number 1:");
				int N1 = scan.nextInt();
				System.out.println("Enter number 2:");
				int N2 = scan.nextInt();
				int result3 = Multiplication.Multiply(N1, N2);
				System.out.println("Your result is equal to " + result3);
				break;
			case 4:
				
				System.out.println("Enter number 1:");
				int Num1 = scan.nextInt();
				System.out.println("Enter number 2:");
				int Num2 = scan.nextInt();
				int result4 = Division.Div(Num1, Num2);
				System.out.println("Your result is equal to " + result4);
				break;

			}

			
			System.out.println("Would you like to go again? Y/N");
			scan.next();
			response = scan.nextLine();
			System.out.println(response);
			
			if (response.contains("y")) {
				System.out.println("Back to the start!");
			} else if (response.contains("n")) {
				System.out.println("Have a nice day!");
				flag = false;
			}
		}
		scan.close();
	}

}
