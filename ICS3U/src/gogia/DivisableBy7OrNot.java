/* Pranav Gogia
 * March 22 2016
 * DivisableBy7OrNot
 * Sample if statement program
 * This program takes in a number and determines if the number entered is positive
 * or negative and whether it is divisible by 7 or not 
 */
package gogia;

import java.util.Scanner;

public class DivisableBy7OrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 0;

		// This command is to get the number from the user and assign it to the variable number
		System.out.println("What is the number?");
		Scanner numberInput = new Scanner(System.in);
		number = Integer.parseInt(numberInput.nextLine());

		// This sends a message to the user and tells them what the number was that they entered
		System.out.println("The number you typed in was " + number);

		// The number is now divided by 7 to determine if it is possible for it to be perfectly divisible by 7 or not
		if (number % 7 == 0)
		{
			System.out.println("Your number you entered is divisable by 7");
			System.out.println("Your number divided by 7 equals " + number/7 );
		}
		else
		{
			System.out.println("Your number you entered is not divisable by 7");
		}

		// This command determines if the number that the user entered is positive or negative
		if (number < 0)
		{
			System.out.println("Your number you entered is negative");
		}
		else
		{
			System.out.println("Your number you entered is positive");
		}
	}




}
