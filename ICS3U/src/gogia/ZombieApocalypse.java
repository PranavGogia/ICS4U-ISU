package gogia;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console;

public class ZombieApocalypse
{

	public static Console console = new Console();
	// conosle size if later needed 47,157
	public static int keyChance = (int )(Math. random() * 10 + 1);
	public static int showerCounter = 0;
	public static int lives = 2;
	public static int randomOne = (int )(Math. random() * 100 + 1);
	public static int randomTwo = (int )(Math. random() * 100 + 1);
	public static String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, name = null, runOrFightPantry,pantryEatOrNot = null,playAgainOrNot, basementOrRoof = null, playOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
	public static String bathroom,basement,backyard,frontDoor,sideDoor,bedroom,leave,attic,rest,tryAgain,redo,continueShowering =null, playAgainOrNotTwo;
	public static boolean playOrNot = false;
	public static Image jpgHauntedHouse, jpgKitchen, jpgLive, jpgBasement, jpgIdiot, jpgDie, jpgRun, jpgSurvive, jpgZombies, jpgGokuWin, jpgWin, jpgUpstairs, jpgBedroom, jpgAttic, jpgBathroom, jpgDoor, jpgBackyard,jpgTitlePage, jpgLoading , jpgLoadingDone;
	public static String[] arrayUpstairs = new String[] { "upstairs", "bedroom", "search", "attic", "leave", "basement", "front door","side door", "backyard", "rest", "search", "leave",};
	public static String[] arrayUpstairsBathroom = new String[] {"bathroom", "shower", "basement", "front door", "side door", "backyard", "leave"};
	public static String[] arrayKitchen = new String[] { "kitchen", "fridge", "yes", "no", "run", "fight"};
	public static String[] arrayKitchenPantry = new String[] { "pantry", "check", "basement", "basement", "upstairs", "roof","roof", "leave", "run", "fight", "fight"};



	public static void main(String[] args) throws LineUnavailableException, InterruptedException, IOException, UnsupportedAudioFileException
	{
		// TODO Auto-generated method stub




		//two arrays. One for all the answers and comparing while the other is for all the options chosen

		jpgLoading = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loading.jpg");

		console.setTextBackgroundColor(Color.black);
		console.setTextColor(Color.white);
		console.clear();

		console.drawImage(jpgLoading, 0, 0, 640,420, null);
		Thread.sleep(10000);

		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	

		themewin.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/backyard.wav")));

		jpgUpstairs = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/upstairs.jpg");
		jpgBedroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bedroom.jpg");
		jpgAttic = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/attic.jpg");
		jpgBathroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bathroom.jpg");
		jpgDoor = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/door.jpg");
		jpgBackyard = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/backyard.jpg");

		jpgHauntedHouse = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/hauntedHouse.jpg");
		jpgKitchen = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/kitchen.jpg");
		jpgLive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/live.jpg");
		jpgBasement = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/basement.jpg");
		jpgIdiot = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/idiot.jpg");
		jpgDie = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/die.jpg");
		jpgRun = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/run.jpg");

		jpgZombies = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/zombies.jpg");
		jpgGokuWin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/gokuWin.jpg");
		jpgWin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/win.jpg");



		playingMethod();
	}



	public static void playingMethod() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{


		//theme.start();
		Clip theme = AudioSystem.getClip(); 
		theme.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/creepy.wav"))); 

		jpgLoading = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loading.jpg");
		jpgLoadingDone = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loadingDOne.jpg");
		jpgTitlePage = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/titlePage.jpg");
		jpgSurvive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/survive.jpg");


		console.drawImage(jpgLoading, 0, 0, 640,420, null);
		Thread.sleep(10000);
		Thread.sleep(1000);

		console.setTextBackgroundColor(Color.black);
		console.setTextColor(Color.white);
		console.clear();
		console.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		console.println("  ");	
		console.drawImage(jpgTitlePage, 0, 85, 640,420, null);
		Thread.sleep(1000);
		console.drawImage(jpgTitlePage, 0, 85, 640,420, null);
		console.println("Would you like to play a scary game? (yes/no)");
		playOrNotInput = console.readLine();
		console.clear();



		if (playOrNotInput.equalsIgnoreCase("yes"))
		{
			playOrNot = true;
		}
		// else close console
		else 
		{
			console.println("Sorry to hear that");
			Thread.sleep(3000);
			console.close();
		}




		if (playOrNot = true)
		{
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.drawImage(jpgSurvive, 0, 85, 640,420, null);
			Thread.sleep(50);
			console.clear();

			console.println("Welcome Stranger, Please Enter Your Name");
			console.drawImage(jpgTitlePage, 0, 85, 640,420, null);
			name = console.readLine();
			console.clear();

			console.drawImage(jpgHauntedHouse, 0, 85, 640,420, null);
			console.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing here! Would you like to go upstairs or into the kitchen?(upstairs/kitchen) ");
			goUpOrKitchen = console.readLine();
			Thread.sleep(500);
			console.clear();

			if(goUpOrKitchen.equalsIgnoreCase(arrayUpstairs[0]))
			{
				choseUpstairs();
			}
			else if (goUpOrKitchen.equalsIgnoreCase(arrayKitchen[0]))
			{
				choseKitchen();
			}
			else
			{
				playingMethod();
			}


		}

	}

	public static void choseUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method upstairs


		while (lives >0)
		{//start of while loop at beginning

			console.clear();
			console.drawImage(jpgUpstairs, 0, 85, 640,420, null);
			console.println("You walk up the stairs and reach the top.");
			console.println("You see 2 doors: one to the bedroom and the other to the bathroom. Where do you search? (bedroom/bathroom)");
			bedroom=console.readLine();
			if (bedroom.equalsIgnoreCase(arrayUpstairs[1]))
			{
				console.clear();
				console.drawImage(jpgBedroom, 0, 85, 640,420, null);
				console.println("You enter the bedroom and see something beside the bed do you want to go see what it is or leave? (search/leave)");
				leave=console.readLine();
				if (leave.equalsIgnoreCase(arrayUpstairs[2]))
				{
					console.clear();
					console.drawImage(jpgBedroom, 0, 85, 640,420, null);
					console.println("It was just a blanket lying on the ground.");
					console.println("From your new position you can see a ladder leading up to the attic do you wish to enter the attic or keep searching the bedroom? (attic/search)");
					attic= console.readLine();

					if (attic.equalsIgnoreCase(arrayUpstairs[3]))
					{
						console.clear();
						console.drawImage(jpgAttic, 0, 85, 640,420, null);
						console.println("You find nothing of interest in the attic but start to find yourself becoming tired.");
						console.println("Do you wish to rest first or leave immediately? (rest/leave)");
						rest=console.readLine();
						if (rest.equalsIgnoreCase(arrayUpstairs[4]))
						{
							console.clear();
							console.drawImage(jpgBedroom, 0, 85, 640,420, null);
							console.println("You leave the attic and get to the bedroom door when you see a zombie behind you. You run down the stairs and into the (basement/backyard).");
							backyard=console.readLine();
							if(backyard.equalsIgnoreCase(arrayUpstairs[5]))
							{
								console.clear();
								console.drawImage(jpgBasement, 0, 85, 640,420, null);
								if(keyChance<=7)
								{   console.clear();
									console.println("While running from the zombie you manage to find a key.");
									console.println("Will you try to use it on the front door or the side door? (front door/side door)");
									frontDoor=console.readLine();
									if(frontDoor.equalsIgnoreCase(arrayUpstairs[6]))
									{
										console.clear();
										console.drawImage(jpgHauntedHouse, 0, 85, 640,420, null);
										console.println("You slip past the zombie and run to the front door.");
										console.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
										console.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
									}

									else if(frontDoor.equalsIgnoreCase(arrayUpstairs[7]))
									{
										console.clear();
										console.drawImage(jpgHauntedHouse, 0, 85, 640,420, null);
										console.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
										console.println("In your frenzy the key breaks in the lock and the zombie eats you.");
										Thread.sleep(2000);
										dieUpstairs();
									}
									else 
									{
										invalidKitchen();
									}

								}

								else 
								{
									console.println("You fell down while running down the stirs and dislocated your neck. May your soul R.I.P. (Rest in Pieces)");
									Thread.sleep(1000);
									dieUpstairs();
								}

							}
							else if (backyard.equalsIgnoreCase(arrayUpstairs[8]))
							{
								console.clear();
								//themeBackyard.start();
								console.drawImage(jpgBackyard, 0, 85, 640,420, null);
								console.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
								console.println("A group of zombies quickly jump on you before you have to chance to react.");
								Thread.sleep(2000);
								dieUpstairs();

							}
							else 
							{
								invalidKitchen();
							}

						}
						else if (rest.equalsIgnoreCase(arrayUpstairs[9]))
						{
							console.clear();
							console.drawImage(jpgBedroom, 0, 85, 640,420, null);
							console.println("While you were sleeping a zombie found you and enjoyed a nice meal.");
							Thread.sleep(2000);
							dieUpstairs();
						}
						else
						{
							invalidKitchen();
						}

					}
					else if (attic.equalsIgnoreCase(arrayUpstairs[10]))
					{
						console.clear();
						console.drawImage(jpgBedroom, 0, 85, 640,420, null);
						console.println("You search the blanket to see if you find anything useful. As you do a rotten hand jumps out at you! As it turned out there was a zombie under the blanket who quickly tore you to shreads.");
						Thread.sleep(2000);
						dieUpstairs();
					}
					else
					{
						invalidKitchen();
					}

				}
				else if (leave.equalsIgnoreCase(arrayUpstairs[11]))
				{
					console.clear();
					console.drawImage(jpgBedroom, 0, 85, 640,420, null);
					console.println("As you turn to leave a body springs from beside the bed. It catches you off gaurd and takles you before you realise what is happening. You come to the realization that it was a zombie beside the bed as it rips through your throat.");
					Thread.sleep(2000);
					dieUpstairs();
				}
				else
				{
					invalidKitchen();
				}



			}
			else if(bedroom.equalsIgnoreCase(arrayUpstairsBathroom[0]))
			{
				console.clear();
				console.drawImage(jpgBathroom, 0, 85, 640,420, null);
				console.println("You enter the bathroom and look around. there is nothing of note in there other than a fully functional shower. Would you like to leave or shower first? (leave/shower)");
				bathroom=console.readLine();
				if(bathroom.equalsIgnoreCase(arrayUpstairsBathroom[1]))
				{
					console.clear();
					console.drawImage(jpgBathroom, 0, 85, 640,420, null);
					//themeShower.start();
					console.println("You enter the shower and turn it on.");

					// do while loop. If person picks shower again more than 2 times then they die
					do
					{
						console.println(" You feel refreshed and relaxed.Do you wish to keep showering or leave? (shower/leave)");
						continueShowering=console.readLine();
						console.clear();
						console.drawImage(jpgBathroom, 0, 85, 640,420, null);
						if(continueShowering.equalsIgnoreCase("shower")) showerCounter++;

					}while(showerCounter<3);
					//themeShower.start();
					console.println("you leave the shower and walk back down the stairs");

					if(showerCounter<3)
					{
						//themedie.start();
						console.println("A zombie snuck up behind you while walking down the stairs. You fell down and it was not a soft landing.");
						Thread.sleep(2000);
						dieUpstairs();
					}

					else
					{
						console.println("When you reach the front door again you see a zombie at the top of the stairs. You run and start looking for somewhere to hide when you see a path to the basement and a back door. Where will you go?");
						basement=console.readLine();

						if(basement.equalsIgnoreCase(arrayUpstairsBathroom[2]))
						{
							console.clear();
							console.drawImage(jpgBasement, 0, 85, 640,420, null);
							if(keyChance<9)
							{
								console.println("While running from the zombie you manage to find a key.");
								console.println("Will you try to use it on the front door or the side door? (front door/side door)");
								sideDoor=console.readLine();

								if(sideDoor.equalsIgnoreCase(arrayUpstairsBathroom[3]))
								{
									console.clear();

									console.println("You slip past the zombie and run to the front door.");
									console.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
									console.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
								}

								else if (sideDoor.equalsIgnoreCase(arrayUpstairsBathroom[4]))
								{
									console.clear();
									console.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
									console.println("In your frenzy the key breaks in the lock and the zombie eats you.");
									Thread.sleep(2000);
									dieUpstairs();

								}

							}
							else
							{
								console.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
								Thread.sleep(2000);
								dieUpstairs();
							}

						}
						else if (basement.equalsIgnoreCase(arrayUpstairsBathroom[5]))
						{
							console.clear();
							console.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
							console.println("A group of zombies quickly jump on you before you have to chance to react.");
							Thread.sleep(2000);
							dieUpstairs();
						}
						else
						{
							invalidKitchen();
						}

					}

				}
				else if(bathroom.equalsIgnoreCase(arrayUpstairsBathroom[6]))
				{
					console.clear();
					console.println("As you exit the bathroom a zombie that was walking by spots you and eats you.");
					Thread.sleep(2000);
					dieUpstairs();
				}
				else
				{
					invalidKitchen();
				}

			}
			else 
			{
				invalidKitchen();
			}



		}// end of the playOrNot while loop


		console.println("Sorry, but this death makes it both lives lost. Would you like to play again? (yes/no)");
		playAgainOrNot = console.readLine();
		if (playAgainOrNot.equalsIgnoreCase("yes"))
		{
			console.println("Good to hear that");
			Thread.sleep(1000);
			playingMethod();
			lives = 2;
		}
		else if (playAgainOrNot.equalsIgnoreCase("no"))
		{
			console.println("Sorry to hear that");
			Thread.sleep(3000);
			console.close();
		}
		else 
		{
			console.println("Please type in a valid input");
			playAgainOrNot = console.readLine();
		}

	}// end of method upstairs



	public static void choseKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method kitchen

		while (lives >0)
		{


			console.drawImage(jpgKitchen, 0, 85, 640,420, null);
			console.println("You are hungry. There is a fridge in one corner and a pantry in another. Which one do you want to check?(fridge/pantry) ");
			lookFridgeOrPantry = console.readLine();
			console.clear();
			if (lookFridgeOrPantry.equalsIgnoreCase(arrayKitchen[1]))
			{
				console.drawImage(jpgKitchen, 0, 85, 640,420, null);
				console.println("The food looks a bit old and might have gone bad, but you're very hungry. Would you like to try it? (yes/no)");
				eat = console.readLine();
				console.clear();
				if (eat.equalsIgnoreCase(arrayKitchen[2]))
				{
					console.println("Sorry," + name + ", but the food was bad and you died :(." );
					//themedie.start();
					console.drawImage(jpgIdiot, 0, 85, 640,420, null);
					Thread.sleep(2000);
					dieKitchen();
				}
				else if (eat.equalsIgnoreCase(arrayKitchen[3]))
				{
					console.drawImage(jpgZombies, 0, 85, 640,420, null);
					console.println("There is a zombie blocking the only entrance. Run away or fight the zombie? (run/fight)");
					runOrFightFridge = console.readLine();
					console.clear();
					if (runOrFightFridge.equalsIgnoreCase(arrayKitchen[4]))
					{
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						console.println("You were too slow, the zombie ate you. Run faster next time");
						//themedie.start();
						Thread.sleep(1000);
						dieKitchen();
					}
					else if (runOrFightFridge.equalsIgnoreCase(arrayKitchen[5]))
					{
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						console.println("You're too weak. Join fitness. The zombie even said that you tasted bad because of all the fat ");
						//theme.start();
						Thread.sleep(1000);
						dieKitchen();
					}
					else 
					{
						invalidUpstairs();
					}

				}
				else
				{
					invalidUpstairs();
				}
			}
			else if(lookFridgeOrPantry.equalsIgnoreCase(arrayKitchenPantry[0]))
			{
				console.drawImage(jpgKitchen, 0, 85, 640,420, null);
				console.println("There is something lurking in the dark corner of the pantry, check it out or leave? (check/leave)");
				pantryEatOrNot = console.readLine();
				console.clear();
				if (pantryEatOrNot.equalsIgnoreCase(arrayKitchenPantry[1]))
				{
					console.println("It was just a mouse!. The food on the shelf in non-perishable food. Do you want to visit the basement next or the roof? (basement/roof)");
					basementOrRoof = console.readLine();
					if (basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[2]))
					{
						console.drawImage(jpgBasement, 0, 85, 640,420, null);

						// you find keys, where to go now?
						console.println("Congratulations, you found the keys. Proceed to the basement door or to the upstairs door? (basement/upstairs) ");
						basementDoorOrUpstairsDoor = console.readLine();
						if (basementDoorOrUpstairsDoor.equalsIgnoreCase(arrayKitchenPantry[3]))
						{
							console.println("Congratulations, you got out alive!!!");
							console.drawImage(jpgLive, 0, 85, 640,420, null);
							//themewin.start();
							Thread.sleep(500);
							console.println(".........and then you got hit by a truck and died. Fail ");
							console.println("thanx for trying");
							Thread.sleep(500);
							dieKitchen();
							//themedie.start();

						}
						else if (basementDoorOrUpstairsDoor.equalsIgnoreCase(arrayKitchenPantry[4]))
						{
							console.println("You live!!!");
							Thread.sleep(500);
							console.println("Just kidding, a zombie ate you ");
							//themedie.start();
							Thread.sleep(2000);
							dieKitchen();

						}
						else
						{
							invalidUpstairs();

						}

					}
					else if(basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[5])|| randomOne <= 6)
					{
						console.println("So close. You saw the keys and ran for them but tripped and fell down and broke your neck");
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						//themedie.start();
						Thread.sleep(2000);
						dieKitchen();
					}
					else if(basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[6])|| randomOne > 6)
					{
						console.drawImage(jpgDie, 0, 85, 640,420, null);

						console.println("I dont like your shoes. So u slip down and die :)");
						//themedie.start();
						Thread.sleep(2000);
						dieKitchen();
					}
					else 
					{
						invalidUpstairs();
					}


				}
				else if	(pantryEatOrNot.equalsIgnoreCase(arrayKitchenPantry[7]))
				{
					console.clear();
					console.drawImage(jpgZombies, 0, 85, 640,420, null);
					console.println("There is a zombie blocking the doorway, run past him and hope he doesnt chase you or fight and hope you win? (run/fight)");
					runOrFightPantry = console.readLine();
					Thread.sleep(500);
					if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[8]))
					{

						console.println("You were too slow, the zombie ate you. Run faster next time");
						//theme.start();
						Thread.sleep(500);
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						Thread.sleep(1000);
						dieKitchen();

					}
					else if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[9]) || randomTwo <=4)
					{
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						console.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of the lack of muscle ");
						//theme.start();
						Thread.sleep(2000);
						dieKitchen();

					}
					else if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[10]) || randomTwo >=4)
					{
						console.println("Deeze muscles!! You killed a zombie, good for you");
						//themegokuWin.start();
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						Thread.sleep(2000);
						console.println("... and then another zombie came and ate you");
						//themegokuWin.start();
						console.drawImage(jpgDie, 0, 85, 640,420, null);
						Thread.sleep(2000);
						dieKitchen();
					}
					else
					{
						invalidUpstairs();

					}



				}
				else 
				{
					invalidUpstairs();
				}








			}
			else
			{
				invalidUpstairs();
			}

		}
		console.println("Sorry, but this death makes it both lives lost. Would you like to play again? (yes/no)");
		playAgainOrNotTwo = console.readLine();
		if (playAgainOrNotTwo.equalsIgnoreCase("yes"))
		{
			console.println("Good to hear that");
			Thread.sleep(1000);
			playingMethod();
			lives = 2;
		}
		else if (playAgainOrNotTwo.equalsIgnoreCase("no"))
		{
			console.println("Sorry to hear that");
			Thread.sleep(3000);
			console.close();
		}
		else 
		{
			console.println("Screw it, you dont deserve a second try. At least type correctly; yes or no, how hard is it ");
			Thread.sleep(3000);
			console.close();
		}







	}// end of method kitchen

	public static void invalidKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		console.drawImage(jpgIdiot, 0, 85, 640,420, null);
		console.println("Please type in a valid input and play again");
		Thread.sleep(3000);
		choseUpstairs();
		lives = lives - 1;
	}// end of method invalidKitchen

	public static void invalidUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		console.drawImage(jpgIdiot, 0, 85, 640,420, null);
		console.println("Please type in a valid input and play again");
		Thread.sleep(3000);
		choseKitchen();
		lives = lives -1;
	}// end of method invalidUpstairs

	public static void dieKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		lives = lives - 1;
		if (lives == 1)
		{
		
		console.drawImage(jpgDie, 0, 85, 640,420, null);
		console.println("You died. You now only have 1 life left and will now be transported Upstairs by some mysterious power ");
		Thread.sleep(3000);
		choseKitchen();
		lives = lives - 1;
		}
		else
		{
			choseUpstairs();
		}
	}// end of method died
	public static void dieUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		
		lives = lives - 1;
		if (lives == 1)
		{
		
		console.drawImage(jpgDie, 0, 85, 640,420, null);
		console.println("You died. You now only have 1 life left and will now be transported Upstairs by some mysterious power ");
		Thread.sleep(3000);
		choseKitchen();
		lives = lives - 1;
		}
		else
		{
			choseKitchen();
		}
	}// end of method died


}// end of public class
