package gogia;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import hsa_new.Console;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AdventureAssignment {


	public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException {
		// TODO Auto-generated method stub


		Console c = new Console();
		Clip theme = AudioSystem.getClip(); 

		// Strings assigned to different actions
		String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, check = null, search = null, name = null, runOrFightPantry,pantryEatOrNot = null,eatAgainOrNot,playAgainOrNot, basementOrRoof = null, playGameOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
		boolean surviveFightWithZombie = true;
		boolean playGameOrNot = false;
		int randomA2 = (int )(Math. random() * 100 + 1);
		int randomA3 = (int )(Math. random() * 100 + 1);
		int lives = 2;

		Image jpgTitlePage, jpghauntedHouse, jpgTitlePageGandalf, jpgkitchen, jpglive, jpgbasement, jpgidiot, jpgdie, jpgrun, jpgsurvive, jpgzombies;

		jpgTitlePage = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/titlePage.jpg");
		jpgTitlePageGandalf = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/titlePageGandalf.jpg");
		jpghauntedHouse = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/hauntedHouse.jpg");
		jpgkitchen = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/kitchen.jpg");
		jpglive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/live.jpg");
		jpgbasement = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/basement.jpg");
		jpgidiot = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/idiot.jpg");
		jpgdie = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/die.jpg");
		jpgrun = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/run.jpg");
		jpgsurvive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/survive.jpg");
		jpgzombies = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/zombies.jpg");
		
		
		
		theme.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/creepy.wav"))); 

		theme.start();
		c.setTextBackgroundColor(Color.black);
		c.setTextColor(Color.white);
		c.clear();
		c.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		c.println("  ");	
		c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
		Thread.sleep(1000);
		c.drawImage(jpgTitlePageGandalf, 0, 85, 640,420, null);
		Thread.sleep(800);
		c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
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
					
					
					c.drawImage(jpgsurvive, 0, 85, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 3, 88, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 0, 85, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 3, 88, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 0, 85, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 3, 88, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.drawImage(jpgsurvive, 0, 85, 640,420, null);
					Thread.sleep(50);
					c.clear();
					
					c.println("Welcome Stranger, Please Enter Your Name");
					c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
					name = c.readLine();					
					c.drawImage(jpghauntedHouse, 0, 85, 640,420, null);
					c.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing her! Would you like to go upstairs first or into the kitchen?(upstairs/kitchen) ");
					goUpOrKitchen = c.readLine();
					Thread.sleep(500);
					c.clear();



					// Kitchen or Upstairs Choice 1
					else if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
					{ 
						c.drawImage(jpgkitchen, 0, 85, 640,420, null);
						c.println("You are hungry. There is a fridge in one corner and a pantry in another. Which one do you want to check?(fridge?pantry) ");
						lookFridgeOrPantry = c.readLine();
						c.clear();
					}
					else 
					{
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						c.println("Please type in a valid input and play again");
						playGameOrNot = false;
					}


					//Kitchen: Pantry: Something Lurking
					if (lookFridgeOrPantry.equalsIgnoreCase("pantry"))
					{ 
						c.drawImage(jpgkitchen, 0, 85, 640,420, null);
						c.println("There is something lurking in the dark corner of the pantry, 'check' it out or 'leave' and lose a life");
						pantryEatOrNot = c.readLine();
						c.clear();
					}
					else if (lookFridgeOrPantry.equalsIgnoreCase("fridge"))
					{
						c.drawImage(jpgkitchen, 0, 85, 640,420, null);
						c.println("The food looks a bit old and might have gone bad, but you're very hungry. Try it, say 'Yes' or 'No'");
						eat = c.readLine();
						c.clear();
					}
					else
					{
						c.drawImage(jpgzombies, 0, 85, 640,420, null);
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						c.println("Please type in a valid input and play again");
						playGameOrNot = false;
					}


					//Kitchen: Refrigerator: Eat or Not Choice 1
					if (eat.equalsIgnoreCase("Yes"))
					{
						c.println("Sorry, the food was bad and you died :(." + name +  ", You have " + lives + " lives left ");
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						Thread.sleep(5000);
						c.clear();
						eat.equalsIgnoreCase("No");
					}
					else if (eat.equalsIgnoreCase("No"))
					{
						c.drawImage(jpgzombies, 0, 85, 640,420, null);
						c.println("There is a zombie blocking the only entrance. 'Run' away or 'fight' the zombie?");
						runOrFightFridge = c.readLine();
						c.clear();
						if (runOrFightFridge.equalsIgnoreCase("Run"))
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You were too slow, the zombie ate you. Run faster next time");
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (runOrFightFridge.equalsIgnoreCase("Fight"))
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You're too weak. Join fitness. The zombie even said that you tasted delicious because of the lack of muscle ");
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else
						{
							c.drawImage(jpgidiot, 0, 85, 640,420, null);
							c.println("Please type in a valid input and play again");
							playGameOrNot = false;
						}
					}
					else
					{
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						c.println("Please type in a valid input and play again");
						playGameOrNot = false;
					}

					// Kitchen:Pantry:Something Lurking: Check
					if (pantryEatOrNot.equalsIgnoreCase("check"))
					{
						c.println("It was just a mouse!. The food on the shelf in non-perishable food. Do you want to visit the 'basement' next or the 'roof'?");
						c.print(">  ");
						basementOrRoof = c.readLine();
					}
					else if (pantryEatOrNot.equalsIgnoreCase("leave"))
					{
						c.drawImage(jpgzombies, 0, 85, 640,420, null);
						c.println("There is a zombie blocking the doorway, 'run' past him and hope he doesnt chase you or 'fight' and hope you win");
						runOrFightPantry = c.readLine();
						Thread.sleep(500);

						if (runOrFightPantry.equalsIgnoreCase("run"))
						{

							c.println("You were too slow, the zombie ate you. Run faster next time");
							Thread.sleep(1000);
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 <=40)
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of the lack of muscle ");
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 >=41)
						{
							c.println("Deeze muscles!! You killed a zombie, good for you. Just 4.7 billion more and the world will be rid of zombies ");
							surviveFightWithZombie = true;
						}
						else
						{
							c.drawImage(jpgidiot, 0, 85, 640,420, null);
							c.println("Please type in a valid input and play again");
							Thread.sleep(5000);
							playGameOrNot = false;
						}
					}
					else
					{
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						c.println("Please type in a valid input and play again");
						Thread.sleep(5000);
						playGameOrNot = false;
					}
					// Kitchen:Pantry:Something Lurking: Leave




					// Kitchen:Pantry: Something Lurking: Check: Basement
					if (basementOrRoof.equalsIgnoreCase("basement"))
					{
						c.drawImage(jpgbasement, 0, 85, 640,420, null);

						c.println("Congratulations, you found the keys. Proceed to the 'basement' door or to the 'upstairs' door? ");
						basementDoorOrUpstairsDoor = c.readLine();

					}
					else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 <= 6)
					{
						c.println("So close. You saw the keys and ran for them but tripped and fell down and broke your neck");
						c.drawImage(jpgdie, 0, 85, 640,420, null);
						Thread.sleep(5000);
						playGameOrNot = false;
					}
					else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 > 6)
					{
						c.drawImage(jpgdie, 0, 85, 640,420, null);

						c.println("I dont like your shoes. SO u slip down and die :)");
						Thread.sleep(5000);
						playGameOrNot = false;

					}
					else
					{
						c.drawImage(jpgidiot, 0, 85, 640,420, null);

						c.println("Please type in a valid input and play again");
						Thread.sleep(5000);
						playGameOrNot = false;
					}

					// Kitchen:Pantry:Something Lurking: Check: Basement: Find keys
					if (basementDoorOrUpstairsDoor.equalsIgnoreCase("basement"))
					{
						c.println("Congratulations, you got out alive.........and then you got hit by a truck and died. Fail ");
						c.println("thanx for trying");
						Thread.sleep(1000);
						c.drawImage(jpgdie, 0, 85, 640,420, null);
						playGameOrNot = false;
					}
					else if (basementDoorOrUpstairsDoor.equalsIgnoreCase("upstairs"))
					{
						c.println("You live!!!. Just kidding, a zombie ate you ");
						Thread.sleep(5000);
						playGameOrNot = false;
					}
					else
					{
						c.drawImage(jpgidiot, 0, 85, 640,420, null);

						c.println("Please type in a valid input and play again");
						Thread.sleep(5000);
						playGameOrNot = false;
					}


					c.println("Would you like to play again?");
					playAgainOrNot = c.readLine();
					if (playAgainOrNot.equalsIgnoreCase("yes"))
					{
						playGameOrNot = true;	
					}
					else
					{
						playGameOrNot = false;
					}





				}

			}

		}

	}
}


