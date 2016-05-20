/* Pranav Gogia
 * 20 May 2016
 * Fun with Math program Program
 * This program uses methods to add, subtract, multiply and divide two number(inputted by user) 
 * and displays them by calling them
 */
package gogia;
// iporting all the things

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMath {
	/*This is a meathod header. It gives the input to the methods and the prints out the answer
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		// initialize variables
		double input1;
		double input2;
		// ask the user for the first number
		System.out.println("Please enter the first number");
		input1 = scan.nextDouble();
		// ask the user for the second number
		System.out.println("Please enter the second number");
		input2 = scan.nextDouble();
		// transfer the variables to the methods and call them
		adding(input1,input2);
		subtracting(input1,input2);
		multiplying(input1,input2);
		dividing(input1,input2);

	}
	/*
	 * This is a method used for taking in the two inputs and adding them
	 */ 
	public static void adding(double num1, double num2)
	{
		/*
		 * make the answer have two decimal points and then do thwe calculation and print the answer
		 */
		DecimalFormat df = new DecimalFormat ("0.00");
		System.out.println(num1 + " + " + num2 + " equals	 " + df.format(num1 + num2));
	}
	/*
	 * This is a method used for taking in the two inputs and subtracting  them
	 * */
	public static void subtracting(double num1, double num2)
	{
		/*
		 * make the answer have two decimal points and then do thwe calculation and print the answer
		*/
		DecimalFormat df = new DecimalFormat ("0.00");
		System.out.println(num1 + " - " + num2 + " equals	 " +df.format(num1 - num2));
	}
	/*
	 * This is a method used for taking in the two inputs and multiplying  them
	 * */
	public static void multiplying(double num1, double num2)
	{
		/*
		 * make the answer have two decimal points and then do thwe calculation and print the answer
		 */
		DecimalFormat df = new DecimalFormat ("0.00");
		System.out.println(num1 + " * " + num2 + " equals	 " +df.format(num1 * num2));
	}
	/*
	 * This is a method used for taking in the two inputs and dividing  them
	 * */
	public static void dividing(double num1, double num2)
	{
		/*
		 * make the answer have two decimal points and then do thwe calculation and print the answer
		*/
		DecimalFormat df = new DecimalFormat ("0.00");
		System.out.println(num1 + " / " + num2 + " equals 	" +df.format(num1 / num2));
	}


}

