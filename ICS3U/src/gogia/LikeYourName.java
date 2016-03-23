/* Pranav Gogia
 * 23 March 2016
 * Like your name assignment
 * This program takes in the users name and then decides if it loves the name or hates it
 * It loves the name 70% of the time and hates it 30% of the time
 */


package gogia;

import java.util.Scanner;

public class LikeYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String userName = "";
		int percentageDecider = 0;
		
		System.out.println("What is your name?");
		Scanner userNameInput = new Scanner(System.in);
		userName = userNameInput.nextLine();
		percentageDecider = (int) (Math.random() * 11);
		
		if (percentageDecider <7)
		{
			System.out.println(userName + ", I love your name :)");
		}
		else
		{
			System.out.println(userName + ", I hate your name :)");
		}
		
		
	}
	

}
