/* Pranav Gogia
 * 23 March 2016
 * Dice Roll Assignment
 * This program takes in the users name and rolls two dice to determine if the 
 * users dice rolled a higher number or if the computer rolled a higher number
 */

package gogia;

import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variables
		String userName = "";
		int playOrNot = 0;
		int playerDice = 0;
		int playerDice1 = 0;
		int playerDice2 = 0;
		int secondDice = 0;
		int secondDice1 = 0;
		int secondDice2 = 0;
		
		//  get the users name
		System.out.println("What is your name?");
		Scanner userNameInput = new Scanner(System.in);
		userName = userNameInput.nextLine();
		
		// assign that the random numbers must be between 1 and 6
		playerDice1 = (int) (Math.random() * 6 ) + 1;
		secondDice1 = (int) (Math.random() * 6 ) + 1;
		
		playerDice2 = (int) (Math.random() * 6 ) + 1;
		secondDice2 = (int) (Math.random() * 6 ) + 1;
		
		playerDice = playerDice1 + playerDice2;
		secondDice = secondDice1 + secondDice2;
		
		// asking if the user wants to play
		System.out.println("Are you ready to play? Type in 1 if yes and 0 if no");
		Scanner playOrNotInput = new Scanner(System.in);
		playOrNot = Integer.parseInt(playOrNotInput.nextLine());
		
		// if user wants to play then the program begins
		if (playOrNot == 1)
		{
			System.out.println("Good job, now lets begin");
			// if the user rolled a higher number than the computer 
			if (playerDice > secondDice)
			{
				System.out.println(" Congratulations " + userName +", you won!!!. You rolled " + playerDice + " while the computer rolled " + secondDice);
			}
			// if the user rolled the same number as the computer 
			else if (playerDice == secondDice)
			{
				System.out.println("Its a tie! Both you and the computer rolled " + playerDice);
			}
			// if the user rolled a lower number than the computer 
			else
			{
				System.out.println("Im sorry " + userName + ", You lost :( You rolled " + playerDice + " while the computer rolled " + secondDice);
			}
		}
		// if the user says no then the program stops
		else 
		{
			System.out.println("Im sorry to hear that, maybe next time");
		}
	}
	

}
