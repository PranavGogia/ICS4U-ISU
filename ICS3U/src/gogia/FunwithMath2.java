/* Pranav Gogia
 * 24 May 2016
 * Fun with Math 2 Program
 * This program uses methods to add, subtract, multiply and divide two number(inputted by user) 
 * and displays them by calling them. Different from FunwithMath because this one uses return values
 */
package gogia;
// iporting all the things

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunwithMath2 {
	/*This is a meathod header. It gives the input to the methods and the prints out the answer
	 */
	public static DecimalFormat df=new DecimalFormat("0.0");
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		// initialize scanner
		Scanner scan = new Scanner(System.in);
		// initialize variables
		double num1;
		double num2;
		// ask the user for the first number
		System.out.println("Please enter the first number");
		num1 = scan.nextDouble();
		// ask the user for the second number
		System.out.println("Please enter the second number");
		num2 = scan.nextDouble();
		// transfer the variables to the methods and call them
		System.out.println("a+b="+(df.format(adding(num1,num2))));
		System.out.println("a-b="+(df.format(subtracting(num1,num2))));
		System.out.println("a*b="+(df.format(multiplying(num1,num2))));
		System.out.println("a/b="+(df.format(dividing(num1,num2))));




	}
	/*
	 * This is a method used for taking in the two inputs and adding them
	 */ 
	public static double adding(double num1, double num2)
	{
		/*
		 * add the two numbers and return the value
		 */
		double total = num1 + num2;
		return total;

		
	}
	/*
	 * This is a method used for taking in the two inputs and subtracting  them
	 * */
	public static double subtracting(double num1, double num2)
	{
		/*
		 * subtract the two numbers and return the value
		*/
		double total = num1 - num2;
		return total;

	}
	/*
	 * This is a method used for taking in the two inputs and multiplying  them
	 * */
	public static double multiplying(double num1, double num2)
	{
		/*
		 * multiply the two numbers and return the value
		 */
		double total = num1 * num2;
		return total;
	}
	/*
	 * This is a method used for taking in the two inputs and dividing  them
	 * */
	public static double dividing(double num1, double num2)
	{
		/*
		 * divide the two numbers and return the value
		*/
		double total = num1 / num2;
		return total;
	}


}

