/* Pranav Gogia
 * March 10 2016
 * Math Methods Assignment
 * This program takes in 5 numbers and performs different operands on them
 * in order to get a new answer
 * 
 */

package gogia;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		double num4 = 0;
		double num5 = 0;
		double calc1 = 0;
		double calc2 = 0;
		double calc3 = 0;	
		double calc4 = 0;	
		double calc5 = 0;		
		double calc6 = 0;	
		double calc7 = 0;	
		
		System.out.println("What is the first number?");
		Scanner num1Input = new Scanner(System.in);
		num1 = Double.parseDouble(num1Input.nextLine());
		
		System.out.println("What is the second number?");
		Scanner num2Input = new Scanner(System.in);
		num2 = Double.parseDouble(num2Input.nextLine());
		
		System.out.println("What is the third number?");
		Scanner num3Input = new Scanner(System.in);
		num3 = Double.parseDouble(num3Input.nextLine());
		
		System.out.println("What is the fourth number?");
		Scanner num4Input = new Scanner(System.in);
		num4 = Double.parseDouble(num4Input.nextLine());
		
		System.out.println("What is the fifth number?");
		Scanner num5Input = new Scanner(System.in);
		num5 = Double.parseDouble(num5Input.nextLine());
		
		calc1 = num1 + num2 + num3 + num4 + num5;
		calc2 = num3 - num2;
		calc3 = num1 * num5;
		calc4 = num4 / num2;
		calc5 = num4 % num2;
		calc6 = Math.pow(num1, num3);
		calc7 = Math.sqrt(num5);
		
		System.out.println("The first calculations result is " + calc1);
		System.out.println("The second calculations result is " + calc2);
		System.out.println("The third calculations result is " + calc3);
		System.out.println("The fourth calculations result is " + calc4);
		System.out.println("The fifth calculations result is " + calc5);
		System.out.println("The sixth calculations result is " + calc6);
		System.out.println("The seventh calculations result is " + calc7);
		
	}


}
