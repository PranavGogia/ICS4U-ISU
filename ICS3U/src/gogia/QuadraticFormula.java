/* Pranav Gogia
 * March 10 2016
 * Math Methods Assignment
 * This program takes in 5 numbers and performs different operands on them
 * in order to get a new answer
 * 
 */
package gogia;

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadraticFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double a = 0;
		double b = 0;
		double c = 0;
		double firstStep = 0;
		double secondStep = 0;
		double thirdStep = 0;
		double fourthStep = 0;
		double firstStep2 = 0;
		double secondStep2 = 0;
		double thirdStep2 = 0;
		double fourthStep2 = 0;
		
		DecimalFormat df = new DecimalFormat ("0.00");
		
		
		System.out.println("What is the first number(a). Keep in mind that the first number cannot equal 0?");
		Scanner aInput = new Scanner(System.in);
		a = Double.parseDouble(aInput.nextLine());
		
		System.out.println("What is the second number(b)?");
		Scanner bInput = new Scanner(System.in);
		b = Double.parseDouble(bInput.nextLine());
		
		System.out.println("What is the third number(c)?");
		Scanner cInput = new Scanner(System.in);
		c = Double.parseDouble(cInput.nextLine());
		
		
		
		firstStep = ((Math.pow(b, 2)) - (4*(a*c)));
		secondStep =  Math.sqrt(firstStep);
		thirdStep = (b) + secondStep;
		fourthStep = thirdStep / (2*(a*c));
		
		firstStep2 = (Math.pow(b, 2)) - (4*(a*c));
		secondStep2 =  Math.sqrt(firstStep2);
		thirdStep2 = (b) - secondStep2;
		fourthStep2 = thirdStep2 / (2*(a*c));
		
		double x = fourthStep;
		double y = fourthStep2;
		
		System.out.println(df.format(x));
		System.out.println(df.format(y));
	}

}
