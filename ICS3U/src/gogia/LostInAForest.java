package gogia;
import hsa_new.Console; 
import java.awt.*;     

public class LostInAForest {

	static Console c = new Console(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  
		  {
		    // *** variables
		    String direction; // stores the user's answer when a direction is required
		    char ynAnswer;    // stores the user's answer when a yes no question is asked
		    
		    // *** the game
		    c.println("You're lost in a forest. Will you go North or South?");
		    direction = c.readLine();
		    if (direction.equalsIgnoreCase("North")) 
		    {
		      c.println("You come to a lake. Do you drink the water? (y/n)");
		      ynAnswer = c.getChar();
		      
		      if (ynAnswer == 'y')
		        c.println("The water is stagnant. You die of cholera.");
		      else
		      {
		        c.clear();
		        c.println("A horse swims across the water. Do you try to ride it? (y/n)");
		        ynAnswer = c.getChar();
		        if (ynAnswer == 'y')
		          c.println("You tame the horse and ride to safety. Yay!");
		        else
		          c.println("The horse walks past you. You die of loneliness.");
		      }
		    }
		    else
		    {
		      if (direction.equalsIgnoreCase("South"))
		        c.println("You fall in a pit and die.");
		      else
		        c.println("You stay where you are and die of loneliness.");
		    }
		  }
		}
	}


