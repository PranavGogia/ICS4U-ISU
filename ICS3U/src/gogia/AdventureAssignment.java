package gogia;

import java.util.Scanner;
import hsa_new.Console;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class AdventureAssignment {


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Console c = new Console();

		Scanner keyboard = new Scanner(System.in);
		// Strings assigned to different actions
		String goUpOrKitchen, lookFridgeOrPantry, pantry, eat, check, search, name, run, pantryEatOrNot,eatAgainOrNot,playGameOrNot;

		int randomA2 = (int )(Math. random() * 100 + 1);
		int randomA3 = (int )(Math. random() * 100 + 1);
		boolean playOrNot= false;
		int lives = 2;


		c.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		c.println("  ");	
		
		c.println("Would you like to play a scary game?");
		playGameOrNot = c.readLine();
		
		if (playGameOrNot.equalsIgnoreCase("yes"))
		{
			
			
						
		while (lives > 0)
		{
			// A




			

			c.println("Welcome Stranger, Please Enter Your Name");
			name = c.readLine();
			c.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing her! Would you like to go 'upstairs' first or into the 'kitchen'? ");
			c.print( "> ");
			goUpOrKitchen = c.readLine();
			c.clear();

			// Kitchen or Upstairs Choice 1
			if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
			{c.println("You are hungry. There is a 'fridge' in one corner and a 'pantry' in another. WHich oe do you want to check? ");
			c.print(">  ");
			lookFridgeOrPantry = c.readLine();
			c.clear();}
			else {
				c.println("Please type in a valid input");
				c.println("Would you like to play again?");
				playGameOrNot = c.readLine();
				if (playGameOrNot.equalsIgnoreCase("yes"));
				
			}
			
			
				
				
				
				
			// Kitchen or Upstairs Choice 2
			if (goUpOrKitchen.equalsIgnoreCase("upstairs"))
			{c.println("You see 2 bedrooms and a bathroom. Would you like to check the 'bedrooms' first, or the 'bathroom'");}
			c.print(">  ");
			search = c.readLine();
			c.clear();
			// Kitchen:Refrigerator or Pantry Choice 1
			if (lookFridgeOrPantry.equalsIgnoreCase("fridge"))
			{c.println("The food looks a bit old and might have gone bad, but you're very hungry. Try it, say 'Yes' or 'No'");}
			c.print(">  ");
			eat = c.readLine();
			c.clear();
			//Kitchen:Refrigerator or Pantry Choice 2
			if (lookFridgeOrPantry.equalsIgnoreCase("pantry"))
			{c.println("There is a lot of food, but you see something moving in the corner. You might pass due to hunger if you dont eat, but you are also scared of the thing. 'Approach' the thing and take your chances or 'back off' quietly?");}
			c.print(">  ");
			pantry = c.readLine();
			c.clear();
			//Upstairs: Bedroom or Bathroom Choice 1
			if (search.equalsIgnoreCase("bathroom"))
			{c.println("The bathroom looks empty. You really want to take a bubble bath. Take a 'bubble bath' or 'leave'?");}
			c.print(">  ");
			check = c.readLine();
			c.clear();
			//Upstairs: Bedroom or Bathroom Choice 2
			if (search.equalsIgnoreCase("bedroom"))
			{c.println("You see something lying beside the bed. Its definetly a person. 'Wake up' the person and ask where the hell you are or 'back off' slowly?");}
			c.print(">  ");
			check = c.readLine();
			c.clear();
			//Kitchen: Refrigerator: Eat or Not Choice 1
			if (eat.equalsIgnoreCase("Yes"))
				lives = lives - 1;
			{c.println("Sorry, the food was bad and you died :(." + name +  ", You have " + lives + " lives left ");}
			c.print(">  ");
			eat = c.readLine();
			c.clear();
			//Kitchen: Refrigerator: Eat or Not Choice 2
			if (eat.equalsIgnoreCase("No"))
			{c.println("There is a zombie blocking the only entrance. 'Run' away or 'fight' the zombie?");}
			c.print(">  ");
			run = c.readLine();
			c.clear();
			//Kitchen: Pantry: Something Lurking
			if (lookFridgeOrPantry.equalsIgnoreCase("pantry"))
			{ c.println("There is something lurking in the dark corner of the pantry, 'check' it out or 'leave' and lose a life");}
			c.print(">  ");
			pantryEatOrNot = c.readLine();
			c.clear();
			// Kitchen:Panry:Something Lurking: Check
			if (pantryEatOrNot.equalsIgnoreCase("check"));
			{ c.println("It was just a mouse!. The food on the shelf in non-perishable food. Go ahead and eat");}
			c.print(">  ");
			c.print	("Would you like to eat again?");
			eatAgainOrNot = c.readLine();
			while (eatAgainOrNot.equalsIgnoreCase("yes"));
			{

			}

		}
	}






}












