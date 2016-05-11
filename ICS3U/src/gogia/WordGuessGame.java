/* Pranav Gogia
 * May 11 2016
 * Word Guess Game
 * This program is essentially a game of hang man
 */
package gogia;
import java.util.Scanner;
import java.lang.String;


	public class WordGuessGame {
		

		public static void main(String[] args) {
			// declaring all the variable
			String guessWord;
			String [] wordsList={"china","brazil","russia","mexico", "spain", "iran" ,"india", "pakistan"};
			int x=(int)(Math.random()*wordsList.length);
			Scanner scan=new Scanner (System.in);
		    String blank="";
		    int points = 0;
		   
		   
		    // printing out all the rules
		    System.out.println("The rules of the game:");
		    System.out.println("1) You can guess the whole word or the individual letters");
		    System.out.println("2) You get one point for every word you get right and 0 points for every letter you guess right");
		    System.out.println("2) You lose one point for every word you get wrong and 0 points for every letter you guess wrong");
		    System.out.println("");
		    System.out.println("");
		    // sleep in between so the player can read the rules
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    // program starts
		    System.out.println("Now try gueesing the word");
		    
		    for (int i=0;i<wordsList[x].length();i++)
		    {
		    	blank=blank+"-";
		    }
		    System.out.println(blank);
		    
		    do
		    {
		    	int counter=0;
		    	System.out.println("Try entering a letter. If you want to guess a letter then type in @");
		    	guessWord=scan.nextLine();
		    	
		    	if (guessWord.equalsIgnoreCase("@"))
		    	{
		    		System.out.println("Take a guess as to what the word is?");
		    		guessWord=scan.nextLine();
		    		if (guessWord.equalsIgnoreCase(wordsList[x]))
		    		{
		    			System.out.println("Good job, you got it right");
		    			points ++;
		    			 System.out.println("You got " + points + " points");

		    		}
		    		else
		    		{
		    			System.out.println("Good try, but thats wrong");
		    			System.out.println(blank);
		    			points --;
		    			System.out.println("You got " + points + " points");
		    		}
		    		
		    	}
		    	else
		    	{
		    		int num = wordsList[x].indexOf(guessWord);
		    		
		    		if (num==-1)
		    		{
		    			System.out.println("Sorry, that letter isn't in the word. Please pick another letter");
		    			System.out.println(blank);
		    			System.out.println("You have " + points + " points");
		    		}
		    		else 
		    		{
		    			blank=blank.substring(0, num)+guessWord+blank.substring(num+1,wordsList[x].length());
		    			System.out.println(blank);
		    			for(int i=0;i<blank.length();i++)
			    		{
			    			if (blank.charAt(i)!='-')
			    			{
			    				counter++;
			    			}
			    			if (counter==wordsList[x].length())
			    			{
			    				System.out.println("Congrats, you guessed all the letters");
			    				guessWord=wordsList[x];
			    				System.out.println("You have " + points + " points");

			    			}
			    		}
		    		}
		    		
		    		
		    	}
		    	
		    	
		    }while(!guessWord.equalsIgnoreCase(wordsList[x]));
		   
		    
		}

	}