/* Pranav Gogia
 * 20 March 2016
 * Grade Calculator
 * This program takes in how many grades the user is entering and what they are
 * and then it get what grade the student deserves and displays it
 */
package gogia;

import java.util.Scanner;

public class GradeCalculatorWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring all the variables
		int grade = 0;
		int numberOfInputs = 0;
		String userName = "";

		// find out the users name
		System.out.println("What is your name?");
		Scanner userNameInput = new Scanner(System.in);
		userName = userNameInput.nextLine();
		// find out how many inputs are going to be entered
		System.out.println("How many inputs are you going to enter?");
		Scanner numberOfInputsInput = new Scanner(System.in);
		numberOfInputs = Integer.parseInt(numberOfInputsInput.nextLine());
		// for loop only allows a certain amount of inputs to be typed
		for (int i = 0;  i< numberOfInputs; i++)
		{
			// ask the user for their marks
			System.out.println("What are your grades. Put them one at a time?");
			Scanner gradeInput = new Scanner(System.in);
			grade = Integer.parseInt(gradeInput.nextLine());
			// determines what grade the student got and displays it
			if (grade >= 80 && grade <101)
			{
				System.out.println("Congratulations " + userName + ", you got an A. Continue the good work :) "); 
			}
			// determines what grade the student got and displays it
			else if (grade >= 70 && grade <80)
			{
				System.out.println("Good job " + ", you got a B. Now lets aim for an A next time!");
			}	 
			// determines what grade the student got and displays it
			else if (grade >= 60 && grade <70)
			{
				System.out.println("Good try " + ", you got a C. Now lets aim for a B next time!");
			}	 
			// determines what grade the student got and displays it
			else if (grade >= 50 && grade <60)
			{
				System.out.println("Barely made it " + ", you got a D. Come on, you can do better!");
			}	 
			// determines what grade the student got and displays it
			else if (grade >= 0 && grade <50)
			{
				System.out.println("Im sorry " + ", but you got an F. Come on, you gotta buckup!");
			}
			// determines if the number is between 0 and 100 or not
			else 
			{
				System.out.println("Please enter a valid number");
			}	
		}	

	}
}


