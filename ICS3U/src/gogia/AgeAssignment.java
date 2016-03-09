/*Pranav Gogia
 * 8 March 2016
 * Age Assignment	
 * This program gets your parents birthdays and subtracts your from it to determine 
 * how old they were when they were born
 */

package gogia;
import java.util.*;
public class AgeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String dadName = "";
		String momName = "";
		String yourName = "";
		int dadsAge = 0;
		int motherAge = 0;
		int yourAge = 0;
		int ageMomAndYou = 0;
		int ageDadAndYou = 0;

		System.out.println("What year was your mother born?");
		Scanner momAgeInput = new Scanner(System.in);
		motherAge = Integer.parseInt(momAgeInput.nextLine());

		System.out.println("What year was your dad born?");
		Scanner dadsAgeInput = new Scanner(System.in);
		dadsAge = Integer.parseInt(dadsAgeInput.nextLine());

		System.out.println("What year were you born");
		Scanner yourAgeInput = new Scanner(System.in);
		yourAge = Integer.parseInt(yourAgeInput.nextLine());

		System.out.println("What is your moms name?");
		Scanner momNameInput = new Scanner(System.in);
		momName = momNameInput.nextLine();
		
		System.out.println("What is your dads name?");
		Scanner dadNameInput = new Scanner(System.in);
		dadName = momNameInput.nextLine();
		
		System.out.println("What is your name?");
		Scanner yourNameInput = new Scanner(System.in);
		yourName = momNameInput.nextLine();
		
		ageMomAndYou = yourAge - motherAge;
		ageDadAndYou = yourAge - dadsAge;

		System.out.println("You mom " + momName + " was " + 	ageMomAndYou + " years old when you " + yourName + " was born");
		System.out.println("You dad " + dadName + " was " + 	ageDadAndYou + " years old when you " + yourName + " was born");
		
		







	}
}