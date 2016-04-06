package gogia;

import java.util.Scanner;
import hsa_new.Console;
public class AdventureAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = new Console();
		
		
		 Scanner keyboard = new Scanner(System.in);

		 String Go, Look, Pantry, Eat;

		 c.println( " WELCOME TO MY TINY ADVENTURE");
		 c.println("  ");
		 c.println( " You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'? ");
		 c.print( "> ");
		 Go = c.readLine();


		 if (Go.equalsIgnoreCase("kitchen"))
		 {c.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in the 'pantry'. ");}
		 c.print(">  ");
		 Look = c.readLine();



		     if (Look.equalsIgnoreCase( "refrigerator" ))
		 {c.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");}
		 c.print(">  ");
		 Eat = c.readLine();


		         if (Eat.equalsIgnoreCase("Yes"))
		     {c.println("  ");
		     c.println("You live!");}

		         else if (Eat.equalsIgnoreCase("No"))
		     {c.println("  ");
		     c.println("You die of starvation!");}



		 else if (Look.equalsIgnoreCase( "pantry" ))
		 {c.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");}
		 c.print(">  ");
		 Pantry = c.readLine();


		         if (Pantry.equalsIgnoreCase("fight"))
		     {c.println("  ");
		     c.println("You're weak and die");}

		         else if(Pantry.equalsIgnoreCase("run away"))
		     {c.println("  ");
		     c.println("You died because your too slow & can't run");}

		 }

		     }


