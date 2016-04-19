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
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();

		// Strings assigned to different actions
		String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, name = null, runOrFightPantry,pantryEatOrNot = null,playAgainOrNot, basementOrRoof = null, playGameOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
		String bathroom,basement,backyard,frontDoor,sideDoor,bedroom,leave,attic,rest,tryAgain,redo,continueShowering =null;
		boolean playGameOrNot = false;
		int randomA2 = (int )(Math. random() * 100 + 1);
		int randomA3 = (int )(Math. random() * 100 + 1);
		double keyChance= Math.random()*10+1;
		int showerCounter = 0;
		int lives = 2;

		//setting images
		Image jpgTitlePage, jpghauntedHouse, jpgkitchen, jpglive, jpgbasement, jpgidiot, jpgdie, jpgrun, jpgsurvive, jpgzombies, jpggokuWin, jpgwin, jpgloading, jpgloadingDone, jpgquestion;
		Image jpgupstairs, jpgbedroom, jpgattic, jpgbathroom, jpgdoor, jpgbackyard;

		//setting colors
		c.setTextBackgroundColor(Color.black);
		c.setTextColor(Color.white);
		c.clear();
		
		//loading startup images
		theme.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/creepy.wav"))); 
		jpgloading = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loading.jpg");
		jpgloadingDone = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loadingDOne.jpg");
		theme.start();
		c.drawImage(jpgloading, 0, 0, 640,420, null);
		Thread.sleep(1000);

		//load other images
		jpgupstairs = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/upstairs.jpg");
		jpgbedroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bedroom.jpg");
		jpgattic = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/attic.jpg");
		jpgbathroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bathroom.jpg");
		jpgdoor = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/door.jpg");
		jpgbackyard = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/backyard.jpg");
		jpgTitlePage = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/titlePage.jpg");
		jpghauntedHouse = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/hauntedHouse.jpg");
		jpgkitchen = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/kitchen.jpg");
		jpglive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/live.jpg");
		jpgbasement = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/basement.jpg");
		jpgidiot = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/idiot.jpg");
		jpgdie = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/die.jpg");
		jpgrun = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/run.jpg");
		jpgsurvive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/survive.jpg");
		jpgzombies = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/zombies.jpg");
		jpggokuWin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/gokuWin.jpg");
		jpgwin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/win.jpg");
		jpgquestion = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/question.jpg");



		// load audio
		themewin.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/backyard.wav")));

		//program start
		c.setTextBackgroundColor(Color.black);
		c.setTextColor(Color.white);
		c.clear();
		c.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		c.println("  ");	
		c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
		Thread.sleep(1000);
		c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
		c.println("Would you like to play a scary game? (yes/no)");
		playGameOrNotInput = c.readLine();
		c.clear();
		if (playGameOrNotInput.equalsIgnoreCase("yes"))
		{
			playGameOrNot = true;
		}
		else 
		{
			c.close();
		}

		//replay loop
		while (playGameOrNot = true)
		{


		

			// display same image again to make it feel like its a gif
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

			c.drawImage(jpgsurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			c.clear();

			c.drawImage(jpgsurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			c.clear();

			
			c.println("Welcome Stranger, Please Enter Your Name");
			c.drawImage(jpgTitlePage, 0, 85, 640,420, null);
			name = c.readLine();
			c.clear();


			//choose between upstairs and kitchen
			c.drawImage(jpghauntedHouse, 0, 85, 640,420, null);
			c.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing here! Would you like to go upstairs first or into the kitchen?(upstairs/kitchen) ");
			goUpOrKitchen = c.readLine();
			Thread.sleep(500);
			c.clear();

			// if upstairs
			if(goUpOrKitchen.equalsIgnoreCase("upstairs"))
			{

				c.clear();
				c.drawImage(jpgupstairs, 0, 85, 640,420, null);
				c.println("You walk up the stairs and reach the top.");
				c.println("You see 2 doors: one to the bedroom and the other to the bathroom. Where do you search? (bedroom/bathroom)");
				bedroom=c.readLine();

				if(bedroom.equalsIgnoreCase("bedroom"))
				{
					c.clear();
					c.drawImage(jpgbedroom, 0, 85, 640,420, null);
					c.println("You enter the bedroom and see something beside the bed do you want to go see what it is or leave? (search/leave)");
					leave=c.readLine();

					if(leave.equalsIgnoreCase("search"))
					{
						c.clear();
						c.drawImage(jpgbedroom, 0, 85, 640,420, null);
						c.println("It was just a blanket lying on the ground.");
						c.println("From your new position you can see a ladder leading up to the attic do you wish to enter the attic or keep searching the bedroom? (attic/search)");
						attic= c.readLine();

						if(attic.equalsIgnoreCase("attic"))
						{
							c.clear();
							c.drawImage(jpgattic, 0, 85, 640,420, null);
							c.println("You find nothing of interest in the attic but start to find yourself becoming tired.");
							c.println("Do you wish to rest first or leave immediately? (rest/leave)");
							rest=c.readLine();

							if(rest.equalsIgnoreCase("leave"))
							{
								c.clear();
								c.drawImage(jpgbedroom, 0, 85, 640,420, null);
								c.println("You leave the attic and get to the bedroom door when you see a zombie behind you. You run down the stairs and into the (basement/backyard).");
								backyard=c.readLine();

								if(backyard.equalsIgnoreCase("basement"))
								{
									c.clear();
									c.drawImage(jpgbasement, 0, 85, 640,420, null);
									if(keyChance<9)
									{
										c.println("While running from the zombie you manage to find a key.");
										c.println("Will you try to use it on the front door or the side door? (front door/side door)");
										frontDoor=c.readLine();

										if(frontDoor.equalsIgnoreCase("front door"))
										{
											c.clear();
											c.drawImage(jpghauntedHouse, 0, 85, 640,420, null);
											c.println("You slip past the zombie and run to the front door.");
											c.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
											c.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
											c.println("You've managed to escape now all that is left is to find out where you are and how you can get home. Would you like to try your luck again with the house of horrors? (yes/no) ");
											redo=c.readLine();

											if(redo.equalsIgnoreCase("yes"))
											{
												playGameOrNot = false;

											}
											else if(redo.equalsIgnoreCase("no"))
											{
												c.close();
											}

										}
										else if (frontDoor.equalsIgnoreCase("side door"))
										{
											c.clear();
											c.drawImage(jpghauntedHouse, 0, 85, 640,420, null);
											c.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
											c.println("In your frenzy the key breaks in the lock and the zombie eats you.");
											Thread.sleep(4000);
											playGameOrNot = false;
										}
									
										else
										{
											c.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
											Thread.sleep(4000);
											playGameOrNot = false;
										}
								}
									else if(backyard.equalsIgnoreCase("backyard"));
									{
										c.clear();
										themeBackyard.start();
										c.drawImage(jpgbackyard, 0, 85, 640,420, null);
										c.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
										c.println("A group of zombies quickly jump on you before you have to chance to react.");
										Thread.sleep(4000);
										playGameOrNot = false;
									}

								}
								else if(rest.equalsIgnoreCase("rest"))
								{
									c.clear();
									c.drawImage(jpgbedroom, 0, 85, 640,420, null);
									c.println("While you were sleeping a zombie found you and enjoyed a nice meal.");
									Thread.sleep(4000);
									playGameOrNot = false;
								}
							}
							else if(attic.equalsIgnoreCase("search"))
							{
								c.clear();
								c.drawImage(jpgbedroom, 0, 85, 640,420, null);
								c.println("You search the blanket to see if you find anything useful. As you do a rotten hand jumps out at you! As it turned out there was a zombie under the blanket who quickly tore you to shreads.");
								Thread.sleep(4000);
								playGameOrNot = false;
							}

						}
						else if(leave.equalsIgnoreCase("leave"))
						{
							c.clear();
							c.drawImage(jpgbedroom, 0, 85, 640,420, null);
							c.println("As you turn to leave a body springs from beside the bed. It catches you off gaurd and takles you before you realise what is happening. You come to the realization that it was a zombie beside the bed as it rips through your throat.");
							Thread.sleep(4000);
							playGameOrNot = false;
						}
					}

					else if(bedroom.equalsIgnoreCase("bathroom"))
					{
						c.clear();
						c.drawImage(jpgbathroom, 0, 85, 640,420, null);
						c.println("You enter the bathroom and look around. there is nothing of note in there other than a fully functional shower. Would you like to leave or shower first? (leave/shower)");
						bathroom=c.readLine();

						if(bathroom.equalsIgnoreCase("shower"))
						{
							c.clear();
							c.drawImage(jpgbathroom, 0, 85, 640,420, null);
							themeShower.start();
							c.println("You enter the shower and turn it on.");
							
							// do while loop. If person picks shower again more than 2 times then they die
							do
							{
								c.println(" You feel refreshed and relaxed.Do you wish to keep showering or leave? (shower/leave)");
								continueShowering=c.readLine();
								c.clear();
								if(continueShowering.equalsIgnoreCase("shower")) showerCounter++;

							}while(showerCounter<3);
							themeShower.start();
							c.println("you leave the shower and walk back down the stairs");

							if(showerCounter<3)
							{
								themedie.start();
								c.println("A zombie snuck up behind you while walking down the stairs. It was not a soft landing.");
								Thread.sleep(4000);
								playGameOrNot = false;
							}

							else
							{
								c.println("When you reach the front door again you see a zombie at the top of the stairs. You run and start looking for somewhere to hide when you see a path to the basement and a back door. Where will you go?");
								basement=c.readLine();

								if(basement.equalsIgnoreCase("basement"))
								{
									c.clear();
									c.drawImage(jpgbasement, 0, 85, 640,420, null);
									if(keyChance<9)
									{
										c.println("While running from the zombie you manage to find a key.");
										c.println("Will you try to use it on the front door or the side door? (front door/side door)");
										sideDoor=c.readLine();

										if(sideDoor.equalsIgnoreCase("front door"))
										{
											c.clear();

											c.println("You slip past the zombie and run to the front door.");
											c.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
											c.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
											c.println("You've managed to escape now all that is left is to find out where you are and how you can get home. Would you like to try your luck again with the house of horrors? (yes/no) ");
											tryAgain=c.readLine();

											if(tryAgain.equalsIgnoreCase("yes"))
											{
												playGameOrNot = false;
											}
											else if(tryAgain.equalsIgnoreCase("no"))
											{
												c.close();
											}

										}
										else if (sideDoor.equalsIgnoreCase("side door"))
										{
											c.clear();
											c.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
											c.println("In your frenzy the key breaks in the lock and the zombie eats you.");
											Thread.sleep(4000);
											playGameOrNot = false;
										}
									}
									else
									{
										c.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
										Thread.sleep(4000);
										playGameOrNot = false;
									}
								}
								else if(basement.equalsIgnoreCase("backyard"));
								{
									c.clear();
									c.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
									c.println("A group of zombies quickly jump on you before you have to chance to react.");
									Thread.sleep(4000);
									playGameOrNot = false;
								}

							}

						}

						else if(bathroom.equalsIgnoreCase("leave"))
						{
							c.clear();
							c.println("As you exit the bathroom a zombie that was walking by spots you and eats you.");
							Thread.sleep(4000);
							playGameOrNot = false;
						}

					}

				}
			}











			// if you go to the kitchen
			else if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
			{ 
				c.drawImage(jpgkitchen, 0, 85, 640,420, null);
				c.println("You are hungry. There is a fridge in one corner and a pantry in another. Which one do you want to check?(fridge/pantry) ");
				lookFridgeOrPantry = c.readLine();
				c.clear();
				if (lookFridgeOrPantry.equalsIgnoreCase("fridge"))
				{
					c.drawImage(jpgkitchen, 0, 85, 640,420, null);
					c.println("The food looks a bit old and might have gone bad, but you're very hungry. Would you like to try it? (yes/no)");
					eat = c.readLine();
					c.clear();
					// if try food
					if (eat.equalsIgnoreCase("yes"))
					{
						lives = lives - 1;
						c.println("Sorry, the food was bad and you died :(." + name +  ", You have " + lives + " lives left ");
						themedie.start();
						c.drawImage(jpgidiot, 0, 85, 640,420, null);
						Thread.sleep(5000);
						c.clear();
						playGameOrNot = false;

					}
					// if don't try food
					else if (eat.equalsIgnoreCase("no"))
					{
						c.drawImage(jpgzombies, 0, 85, 640,420, null);
						c.println("There is a zombie blocking the only entrance. Run away or fight the zombie? (run/fight)");
						runOrFightFridge = c.readLine();
						c.clear();
						// if run
						if (runOrFightFridge.equalsIgnoreCase("Run"))
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You were too slow, the zombie ate you. Run faster next time");
							themedie.start();
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						// if fight
						else if (runOrFightFridge.equalsIgnoreCase("Fight"))
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You're too weak. Join fitness. The zombie even said that you tasted bad because of all the fat ");
							theme.start();
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
				}

				//Kitchen: Pantry: Something Lurking
				if (lookFridgeOrPantry.equalsIgnoreCase("pantry"))
				{ 
					c.drawImage(jpgkitchen, 0, 85, 640,420, null);
					c.println("There is something lurking in the dark corner of the pantry, check it out or leave? (check/leave)");
					pantryEatOrNot = c.readLine();
					c.clear();
					// Kitchen:Pantry:Something Lurking: Check
					if (pantryEatOrNot.equalsIgnoreCase("check"))
					{
						c.println("It was just a mouse!. The food on the shelf in non-perishable food. Do you want to visit the basement next or the roof? (basement/roof)");
						basementOrRoof = c.readLine();

						if (basementOrRoof.equalsIgnoreCase("basement"))
						{
							c.drawImage(jpgbasement, 0, 85, 640,420, null);
							
							// you find keys, where to go now?
							c.println("Congratulations, you found the keys. Proceed to the basement door or to the upstairs door? (basement/upstairs) ");
							basementDoorOrUpstairsDoor = c.readLine();
							//Kitchen:Pantry:Something Lurking: Check: Basement: Find keys
							if (basementDoorOrUpstairsDoor.equalsIgnoreCase("basement"))
							{
								c.println("Congratulations, you got out alive!!!");
								c.drawImage(jpglive, 0, 85, 640,420, null);
								themewin.start();
								Thread.sleep(5000);
								c.println(".........and then you got hit by a truck and died. Fail ");
								c.println("thanx for trying");
								Thread.sleep(1000);
								c.drawImage(jpgdie, 0, 85, 640,420, null);
								themedie.start();
								playGameOrNot = false;
							}
							else if (basementDoorOrUpstairsDoor.equalsIgnoreCase("upstairs"))
							{
								c.println("You live!!!. Just kidding, a zombie ate you ");
								themedie.start();
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
						}

						else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 <= 6)
						{
							c.println("So close. You saw the keys and ran for them but tripped and fell down and broke your neck");
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							themedie.start();
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (basementOrRoof.equalsIgnoreCase("roof")|| randomA3 > 6)
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);

							c.println("I dont like your shoes. SO u slip down and die :)");
							themedie.start();
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

					}
					else if (pantryEatOrNot.equalsIgnoreCase("leave"))
					{
						c.clear();
						c.drawImage(jpgzombies, 0, 85, 640,420, null);
						c.println("There is a zombie blocking the doorway, run past him and hope he doesnt chase you or fight and hope you win? (run/fight)");
						runOrFightPantry = c.readLine();
						Thread.sleep(500);

						if (runOrFightPantry.equalsIgnoreCase("run"))
						{

							c.println("You were too slow, the zombie ate you. Run faster next time");
							theme.start();
							Thread.sleep(500);
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 <=40)
						{
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							c.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of the lack of muscle ");
							theme.start();
							Thread.sleep(5000);
							playGameOrNot = false;
						}
						else if (runOrFightPantry.equalsIgnoreCase("fight") || randomA2 >=41)
						{
							c.println("Deeze muscles!! You killed a zombie, good for you");
							themegokuWin.start();
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							Thread.sleep(5000);
							c.println("... and then another zombie came and ate you");
							themegokuWin.start();
							c.drawImage(jpgdie, 0, 85, 640,420, null);
							Thread.sleep(8000);
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


				}
			}
			else
			{
				c.drawImage(jpgidiot, 0, 85, 640,420, null);
				c.println("Please type in a valid input and play again");
				Thread.sleep(5000);
				playGameOrNot = false;
			}


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
			c.close();
		}

	}
}

