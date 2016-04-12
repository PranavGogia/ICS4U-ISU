package gogia;

import java.util.Scanner;
import java.awt.Image.*;
import java.awt.Toolkit;
import hsa_new.Console;
import java.util.concurrent.TimeUnit;

public class AdventureAssignment {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		Console c = new Console();

		// Strings assigned to different actions
		String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, check = null, search = null, name = null, runOrFightPantry,pantryEatOrNot = null,eatAgainOrNot,playAgainOrNot, basementOrRoof = null, playGameOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
		boolean surviveFightWithZombie = true;
		boolean playGameOrNot = false;
		int randomA2 = (int )(Math. random() * 100 + 1);
		int randomA3 = (int )(Math. random() * 100 + 1);
		int lives = 2;


		c.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		c.println("  ");	

		c.println("Would you like to play a scary game?");
		playGameOrNotInput = c.readLine();
		c.clear();
		if (playGameOrNotInput.equalsIgnoreCase("yes"))
		{
			playGameOrNot = true;
			while (playGameOrNot = true)
			{	

				while (lives > 0)
				{
					// A

					c.println("Welcome Stranger, Please Enter Your Name");
					name = c.readLine();
					c.clear();
					
					c.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing her! Would you like to go 'upstairs' first or into the 'kitchen'? ");
					goUpOrKitchen = c.readLine();
					Thread.sleep(500);
					c.clear();

					
					// Kitchen or Upstairs Choice 1
					if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
					{c.println("You are hungry. There is a 'fridge' in one corner and a 'pantry' in another. WHich oe do you want to check? ");
					lookFridgeOrPantry = c.readLine();
					c.clear();}
					else {
						c.println("Please type in a valid input and play again");
						playGameOrNot = false;
					}
					
					
					//Kitchen: Pantry: Something Lurking
					if (lookFridgeOrPantry.equalsIgnoreCase("pantry"))
					{ c.println("There is something lurking in the dark corner of the pantry, 'check' it out or 'leave' and lose a life");
					pantryEatOrNot = c.readLine();
					c.clear();
					}
					else
					{
						c.println("Please type in a valid input and play again");
						playGameOrNot = false;
					}
				}

				
				// Kitchen:Refrigerator or Pantry Choice 1
				if (lookFridgeOrPantry.equalsIgnoreCase("fridge"))
				{c.println("The food looks a bit old and might have gone bad, but you're very hungry. Try it, say 'Yes' or 'No'");
				eat = c.readLine();
				c.clear();}
				else
				{
					c.println("Please type in a valid input and play again");
					playGameOrNot = false;
				}
				
							

				//Kitchen: Refrigerator: Eat or Not Choice 1
				if (eat.equalsIgnoreCase("Yes"))
				{
					lives = lives - 1;
				c.println("Sorry, the food was bad and you died :(." + name +  ", You have " + lives + " lives left ");
				eat = c.readLine();
				c.clear();
				}
			
			else
			{
				c.println("Please type in a valid input and play again");
				playGameOrNot = false;
			}
				
				
			//Kitchen: Refrigerator: Eat or Not Choice 2
			if (eat.equalsIgnoreCase("No"))
			{c.println("There is a zombie blocking the only entrance. 'Run' away or 'fight' the zombie?");
			runOrFightFridge = c.readLine();
			c.clear();
			if (runOrFightFridge.equalsIgnoreCase("Run"))
			{
				c.println("You were too slow, the zombie ate you. Run faster next time");
				playGameOrNot = false;
			}
			else if (runOrFightFridge.equalsIgnoreCase("Fight"))
			{
				c.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of the lack of muscle ");
				playGameOrNot = false;
			}
			else 
			{
				c.println("Please enter a valid input");
			}
			}
			
			// Kitchen:Pantry:Something Lurking: Check
			if (pantryEatOrNot.equalsIgnoreCase("check it out"))
			{
			 c.println("It was just a mouse!. The food on the shelf in non-perishable food. Do you want to visit the 'basement' next or the 'roof'?");
			c.print(">  ");
			basementOrRoof = c.readLine();
			}
			else 
			{
				c.println("Please enter a valid input");
			}
			
			// Kitchen:Pantry:Something Lurking: Leave
			if (pantryEatOrNot.equalsIgnoreCase("leave"));
			{ c.println("There is a zombie blocking the doorway, 'run' past him and hope he doesnt chase you or 'fight' and hope you win");
			runOrFightPantry = c.readLine();
			if (runOrFightPantry.equalsIgnoreCase("run"))
			{
				c.println("You were too slow, the zombie ate you. Run faster next time");
				playGameOrNot = false;
			}
			else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 <=40)
			{
				c.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of the lack of muscle ");
				playGameOrNot = false;
			}
			else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 >=41)
			{
				c.println("Deeze muscles!! You killed a zombie, good for you. Just 4.7 billion more and the world will be rid of zombies ");
				surviveFightWithZombie = true;
			}
			else 
			{
				c.println("Please enter a valid input");
			}
			}
			
			
			// Kitchen:Pantry: Something Lurking: Check: Basement
			if (basementOrRoof.equalsIgnoreCase("basement"))
			{
				c.println("I dont like your shoes. SO u slip down and die :)");
				playGameOrNot = false;
			}
			else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 <= 6)
			{
				c.println("So close. You saw the keys and ran for them but tripped and fell down and broke your neck");
				playGameOrNot = false;
			}
			else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 > 6)
			{
				c.println("Congratulations, you found the keys. Proceed to the 'basement' door or to the 'upstairs' door? ");
				basementDoorOrUpstairsDoor = c.readLine();
			}

			// Kitchen:Pantry:Something Lurking: Check: Basement: Find keys
			if (basementDoorOrUpstairsDoor.equalsIgnoreCase("basement"))
			{
				c.println("Congratulations, you got out alive.........and then you got hit by a truck and died. Fail ");
				c.println("thanx for trying");
				playGameOrNot = false;
			}
			else if (basementDoorOrUpstairsDoor.equalsIgnoreCase("upstairs"))
			{
			c.println("You live!!!. Just kidding, a zombie ate you ");
			playGameOrNot = false;
			}
			
			
			
			
			
			// Kitchen or Upstairs Choice 2
			if (goUpOrKitchen.equalsIgnoreCase("upstairs"))
			{c.println("You see 2 bedrooms and a bathroom. Would you like to check the 'bedrooms' first, or the 'bathroom'");
			c.print(">  ");
			search = c.readLine();
			c.clear();
			}
			else
			{
				c.println("Please type in a valid input and play again");
				playGameOrNot = false;
			}

			//Upstairs: Bedroom or Bathroom Choice 1
			if (search.equalsIgnoreCase("bathroom"))
			{c.println("The bathroom looks empty. You really want to take a bubble bath. Take a 'bubble bath' or 'leave'?");
			c.print(">  ");
			check = c.readLine();
			c.clear();}
			else
			{
					c.println("Please type in a valid input and play again");
					playGameOrNot = false;
				}


			//Upstairs: Bedroom or Bathroom Choice 2
			if (search.equalsIgnoreCase("bedroom"))
			{c.println("You see something lying beside the bed. Its definetly a person. 'Wake up' the person and ask where the hell you are or 'back off' slowly?");
			c.print(">  ");
			check = c.readLine();
			c.clear();}
			else
			{
					c.println("Please type in a valid input and play again");
					playGameOrNot = false;
				}


			c.println("Would you like to play again?");
			playAgainOrNot = c.readLine();
			if (playAgainOrNot.equalsIgnoreCase("yes"))
			{
				playGameOrNot = false;	
			}

		}
	}
}



}







