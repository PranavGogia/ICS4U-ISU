/*Pranav Gogia
 * Zombie Acocalypse Game ISU
 * June 18, 2016
 *  This is an adventure game and the users aim is to say where they want to go and find the keys
 *  in the end to get out of the house 
 */
// importing all the things
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

public class ZombieApocalypse// public class ZombieApocalypse begins
{
	// public console is created
	public static Console console = new Console(25,90);
	// console size if later needed 47,157
	// random's for key chance and random's for chances the way that the player will die or pass through
	public static int keyChance = (int )(Math. random() * 10 + 1);
	public static int showerCounter = 0;
	public static int lives = 2;
	public static int randomOne = (int )(Math. random() * 100 + 1);
	public static int randomTwo = (int )(Math. random() * 100 + 1);
	// string all the variables. All the read next line variables
	public static String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, name = null, runOrFightPantry,pantryEatOrNot = null,playAgainOrNot, basementOrRoof = null, playOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
	public static String bathroom,basement,backyard,frontDoor,sideDoor,bedroom,leave,attic,rest,tryAgain,redo,continueShowering =null, playAgainOrNotTwo, playAgainOrNotThree;
	//
	public static boolean playOrNot = false;
	public static Image jpgHauntedHouse, jpgKitchen, jpgLive, jpgBasement, jpgIdiot, jpgDie, jpgRun, jpgSurvive, jpgZombies, jpgGokuWin, jpgWin, jpgUpstairs, jpgBedroom, jpgAttic, jpgBathroom, jpgDoor, jpgBackyard,jpgTitlePage, jpgLoading , jpgLoadingDone;
	public static String[] arrayUpstairs = new String[] { "upstairs", "bedroom", "search", "attic", "leave", "basement", "front door","side door", "backyard", "rest", "search", "leave",};
	public static String[] arrayUpstairsBathroom = new String[] {"bathroom", "shower", "basement", "front door", "side door", "backyard", "leave"};
	public static String[] arrayKitchen = new String[] { "kitchen", "fridge", "yes", "no", "run", "fight"};
	public static String[] arrayKitchenPantry = new String[] { "pantry", "check", "basement", "basement", "upstairs", "roof","roof", "leave", "run", "fight", "fight"};


	// start of the main method
	public static void main(String[] args) throws LineUnavailableException, InterruptedException, IOException, UnsupportedAudioFileException
	{
		// TODO Auto-generated method stub
		//two arrays. One for all the answers and comparing while the other is for all the options chosen

		// loads the loading image
		jpgLoading = Toolkit.getDefaultToolkit().getImage("resource/loading.jpg");
		// colours the console background black, makes the text colour white and the clear console applies it
		console.setTextBackgroundColor(Color.black);
		console.setTextColor(Color.white);
		console.clear();
		// displays the loading image and then sleeps the console for 5 seconds
		console.drawImage(jpgLoading, 0, 0, 725,495, null);
		Thread.sleep(5000);
		// initializes all the audio variables
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	
		// loads all the audio files
		themewin.open(AudioSystem.getAudioInputStream(new File("resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("resource/backyard.wav")));
		// loads all the images
		jpgUpstairs = Toolkit.getDefaultToolkit().getImage("resource/upstairs.jpg");
		jpgBedroom = Toolkit.getDefaultToolkit().getImage("resource/bedroom.jpg");
		jpgAttic = Toolkit.getDefaultToolkit().getImage("resource/attic.jpg");
		jpgBathroom = Toolkit.getDefaultToolkit().getImage("resource/bathroom.jpg");
		jpgDoor = Toolkit.getDefaultToolkit().getImage("resource/door.jpg");
		jpgBackyard = Toolkit.getDefaultToolkit().getImage("resource/backyard.jpg");
		jpgHauntedHouse = Toolkit.getDefaultToolkit().getImage("resource/hauntedHouse.jpg");
		jpgKitchen = Toolkit.getDefaultToolkit().getImage("resource/kitchen.jpg");
		jpgLive = Toolkit.getDefaultToolkit().getImage("resource/live.jpg");
		jpgBasement = Toolkit.getDefaultToolkit().getImage("resource/basement.jpg");
		jpgIdiot = Toolkit.getDefaultToolkit().getImage("resource/idiot.jpg");
		jpgDie = Toolkit.getDefaultToolkit().getImage("resource/die.jpg");
		jpgRun = Toolkit.getDefaultToolkit().getImage("resource/run.jpg");
		jpgZombies = Toolkit.getDefaultToolkit().getImage("resource/zombies.jpg");
		jpgGokuWin = Toolkit.getDefaultToolkit().getImage("resource/gokuWin.jpg");
		jpgWin = Toolkit.getDefaultToolkit().getImage("resource/win.jpg");


		// after loading it calls the playing method and begins the game
		playingMethod();
	}


/**
*This method is the main point where the program asks where you want go go with all *the loading in ther too
*
*
*/
	public static void playingMethod() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{
		// initializes the audio and calls it inside the method
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	
		Clip theme = AudioSystem.getClip(); 
		// calls the audio
		theme.open(AudioSystem.getAudioInputStream(new File("resource/creepy.wav"))); 
		themewin.open(AudioSystem.getAudioInputStream(new File("resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("resource/backyard.wav")));
		// starts the main theme snong
		theme.start();
		// calls other images
		jpgLoading = Toolkit.getDefaultToolkit().getImage("resource/loading.jpg");
		jpgLoadingDone = Toolkit.getDefaultToolkit().getImage("resource/loadingDOne.jpg");
		jpgTitlePage = Toolkit.getDefaultToolkit().getImage("resource/titlePage.jpg");
		jpgSurvive = Toolkit.getDefaultToolkit().getImage("resource/survive.jpg");
		// clears the console and displays the loading image
		console.clear();
		console.drawImage(jpgLoading, 0, 0, 725,495, null);
		Thread.sleep(5000);
		// set backgroung colour as black and the text colour as white
		console.setTextBackgroundColor(Color.black);
		console.setTextColor(Color.white);
		console.clear();
		// display the first page with the pictures and ask if the player wants to play the game
		console.println( " WELCOME TO MY ZOMBIE ADVENTURE. Mwah ha ha. Thou shalt not live ;)");
		console.println("  ");	
		console.drawImage(jpgTitlePage, 0, 85, 725,335, null);
		Thread.sleep(500);
		console.drawImage(jpgTitlePage, 0, 85, 725,335, null);
		console.println("Would you like to play a scary game? (yes/no)");
		playOrNotInput = console.readLine();
		console.clear();


		// if the player wants to play the game
		if (playOrNotInput.equalsIgnoreCase("yes"))
		{
			playOrNot = true;
			lives = 2;
		}
		// if the person doesnt want to play then the console closes
		else if (playOrNotInput.equalsIgnoreCase("no"))
		{
			console.println("Sorry to hear that");
			Thread.sleep(1000);
			console.close();
		}
		// else. If its an invalid input then the game starts again
		else
		{
			console.println("Type properly.You must now start the game again ");
			Thread.sleep(1000);
			playingMethod();
		}


		// if player says yes then the game begins and this sick animation starts
		if (playOrNot = true)
		{
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 725,335, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 725,335, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 725,335, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 725,335, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 3, 88, 640,420, null);
			Thread.sleep(50);
			console.clear();
			// display same image again to make it feel like its a gif
			console.drawImage(jpgSurvive, 0, 85, 725,335, null);
			Thread.sleep(50);
			console.clear();

			console.println("Welcome Stranger, Please Enter Your Name");
			console.drawImage(jpgTitlePage, 0, 85, 725,335, null);
			name = console.readLine();
			console.clear();
			// haunted house pic and ask if they want to go upstairs or to the kitchen
			console.drawImage(jpgHauntedHouse, 0, 85, 725,335, null);
			console.println( " You are in a creepy house and have no idea how you got there. You want to find out what you are doing here! Would you like to go upstairs or into the kitchen?(upstairs/kitchen) ");
			goUpOrKitchen = console.readLine();
			Thread.sleep(500);
			console.clear();

			// if picked upstairs than call upstairs method
			if(goUpOrKitchen.equalsIgnoreCase(arrayUpstairs[0]))
			{
				choseUpstairs();
			}
			// if picked kitchen than call kitchen method
			else if (goUpOrKitchen.equalsIgnoreCase(arrayKitchen[0]))
			{
				choseKitchen();
			}
			// if invalid input then start the game again
			else
			{
				console.clear();
				console.drawImage(jpgIdiot, 0, 85, 725,335, null);
				console.println("You entered an invalid input. The game will now restart in order to punish you");
				Thread.sleep(700);
				playingMethod();
			}

		}

	}
/**
/*This method is the main point where the program is called if you want to go upstairs
*
*
*/

	public static void choseUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method upstairs

		// initialize and call audio
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	
		Clip theme = AudioSystem.getClip(); 
		theme.open(AudioSystem.getAudioInputStream(new File("resource/creepy.wav"))); 
		themewin.open(AudioSystem.getAudioInputStream(new File("resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("resource/backyard.wav")));
		// start the audio
		theme.start();
		// if the player chooses to play again after they die then this line resets the amount of lives to 2
		if (lives <0)
		{
			lives = 2;
		}
		// if the player still has lives then the game run
		while (lives >0)
		{//start of while loop at beginning
			// if player chooses upstairs
			console.clear();
			console.drawImage(jpgUpstairs, 0, 85, 725,335, null);
			console.println("You walk up the stairs and reach the top.");
			console.println("You see 2 doors: one to the bedroom and the other to the bathroom. Where do you search? (bedroom/bathroom)");
			bedroom=console.readLine();
			if (bedroom.equalsIgnoreCase(arrayUpstairs[1]))
			{
				// if the player chooses bedroom
				console.clear();
				console.drawImage(jpgBedroom, 0, 85, 725,335, null);
				console.println("You enter the bedroom and see something beside the bed. Do you dare to go check it out? (search/leave)");
				leave=console.readLine();
				if (leave.equalsIgnoreCase(arrayUpstairs[2]))
				{
					// if player chooses to search
					console.clear();
					console.drawImage(jpgBedroom, 0, 85, 725,335, null);
					console.println("It was just a blanket lying on the ground.");
					console.println("You see a ladder leading up to the attic; do you wish to enter the attic or keep searching the bedroom? (attic/search)");
					attic= console.readLine();

					if (attic.equalsIgnoreCase(arrayUpstairs[3]))
					{
						// if player decided to go to the attic
						console.clear();
						console.drawImage(jpgAttic, 0, 85, 725,335, null);
						console.println("You find nothing of interest in the attic but start to find yourself becoming tired.");
						console.println("Do you wish to rest first or leave immediately? (rest/leave)");
						rest=console.readLine();
						if (rest.equalsIgnoreCase(arrayUpstairs[4]))
						{
							// if player decided to leave the attic 
							console.clear();
							console.drawImage(jpgBedroom, 0, 85, 725,335, null);
							console.println("You leave the attic and get to the bedroom door when you see a zombie behind you. You run down the stairs and into the (basement/backyard).");
							backyard=console.readLine();
							if(backyard.equalsIgnoreCase(arrayUpstairs[5]))
							{
								// if players wants to go to the basement
								console.clear();
								console.drawImage(jpgBasement, 0, 85, 725,335, null);
								if(keyChance<=7)
								{   
									// 70% chance that they will live and get to choose between these options
									console.clear();
									console.drawImage(jpgHauntedHouse, 0, 85, 725,335, null);
									console.println("While running from the zombie you manage to find a key.");
									console.println("Will you try to use it on the front door or the side door? (front door/side door)");
									frontDoor=console.readLine();
									if(frontDoor.equalsIgnoreCase(arrayUpstairs[6]))
									{
										// if the player chooses the front door
										console.clear();
										console.drawImage(jpgHauntedHouse, 0, 85, 725,335, null);
										console.println("You slip past the zombie and run to the front door.");
										console.println("You desperately try to unlock the door and barely manage to open the door before the zombie catches you.");
										console.println("But you kick him and slam the door shut behind you; quickly leaving the house of horrors behind.");
										console.clear();
										// win audio start. They won!!!
										themewin.start();
										console.drawImage(jpgWin, 0, 85, 725,335, null);
										console.println("Congratulations, you won");
										console.println("Would you like to play again(yes/no)");
										playAgainOrNotThree= console.readLine();
										// if player wants to play again then the playingMethod is called to start again
										if (playAgainOrNotThree.equalsIgnoreCase("yes"))
										{
											console.clear();
											console.drawImage(jpgLive, 0, 85, 725,335, null);
											console.println("Good to hear that. Maybe try to choose where you want to go a bit differently");
											Thread.sleep(2000);
											playingMethod();
										}
										// if not then the console is closed
										else if(playAgainOrNotThree.equalsIgnoreCase("no"))
										{
											console.clear();
											console.drawImage(jpgLive, 0, 85, 725,335, null);
											console.println("Sorry to hear that. Well, you still won; good job. Maybe next time");
											Thread.sleep(2000);
											console.clear();

										}
										else 
											// if invalid input then close the console
										{
											console.clear();
											console.drawImage(jpgIdiot, 0, 85, 725,335, null);
											console.println("INVALID INPUT!!!!");
											console.println("You dont deserve to play again. You are henceforth banished");
											Thread.sleep(2000);
											console.clear();
										}
									}

									else if(frontDoor.equalsIgnoreCase(arrayUpstairs[7]))
									{
										// if the side door is chosen
										console.clear();
										console.drawImage(jpgHauntedHouse, 0, 85, 725,335, null);
										console.println("You run to the door and franticly try to unlock the door as the zombie slowly approaches.");
										console.println("In your frenzy the key breaks in the lock and the zombie eats you before you can react.");
										Thread.sleep(2000);
										// died Upstairs method is called when you die
										dieUpstairs();
									}
									else 
										// if invalid input upstairs then call the invalid Kitchen method
									{
										invalidKitchen();
									}

								}
								// the 30% chance that you will die
								else 
								{
									console.clear();
									console.drawImage(jpgDie, 0, 85, 725,335, null);
									console.println("You fell down while running down the stirs and dislocated your neck. May your soul R.I.P. (Rest in Pieces)");
									console.drawImage(jpgDie, 0, 85, 725,335, null);
									Thread.sleep(2000);
									// died Upstairs method is called when you die upstairs
									dieUpstairs();
								}

							}
							else if (backyard.equalsIgnoreCase(arrayUpstairs[8]))
							{
								// if you picked the backyard
								console.clear();
								themeBackyard.start();
								console.drawImage(jpgBackyard, 0, 85, 725,335, null);
								console.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie...but a group");
								console.println("They quickly jump on you before you have to chance to run back inside.");
								Thread.sleep(2000);
								// died Upstairs method is called when you die upstairs
								dieUpstairs();

							}
							else
								// if invalid input upstairs then call the invalid Kitchen method
							{
								invalidKitchen();
							}

						}
						else if (rest.equalsIgnoreCase(arrayUpstairs[9]))
							// if you chose to rest
						{
							console.clear();
							console.drawImage(jpgBedroom, 0, 85, 725,335, null);
							console.println("While you were sleeping a zombie found you and enjoyed a nice meal.");
							Thread.sleep(2000);
							// died Upstairs method is called when you die upstairs
							dieUpstairs();
						}
						else
							// if invalid input upstairs then call the invalid Kitchen method
						{
							invalidKitchen();
						}

					}
					else if (attic.equalsIgnoreCase(arrayUpstairs[10]))
					{
						// if you chose to search in the bedroom
						console.clear();
						console.drawImage(jpgBedroom, 0, 85, 725,335, null);
						console.println("You search the blanket to see if you can find anything useful. As you do a rotten hand jumps out at you! As it turned out there was a zombie under the blanket who quickly tore you to shreads.");
						Thread.sleep(2000);
						// died Upstairs method is called when you die upstairs
						dieUpstairs();
					}
					// if invalid input upstairs then call the invalid Kitchen method
					else
					{
						invalidKitchen();
					}

				}
				else if (leave.equalsIgnoreCase(arrayUpstairs[11]))
				{
					// if you chose to leave in the bedroom
					console.clear();
					console.drawImage(jpgBedroom, 0, 85, 725,335, null);
					console.println("As you turn to leave a body springs from beside the bed. It catches you off gaurd and takles you before you realise what is happening. You come to the realization that there was a zombie beside the bed as it rips through your throat.");
					Thread.sleep(2000);
					// died Upstairs method is called when you die upstairs
					dieUpstairs();
				}
				else
					// if invalid input upstairs then call the invalid Kitchen method
				{
					invalidKitchen();
				}



			}
			else if(bedroom.equalsIgnoreCase(arrayUpstairsBathroom[0]))
			{
				// if you chose bathroom
				console.clear();
				console.drawImage(jpgBathroom, 0, 85, 725,335, null);
				console.println("You enter the bathroom and look around. there is nothing of note in there other than a fully functional shower. Would you like to leave or shower first? (leave/shower)");
				bathroom=console.readLine();
				if(bathroom.equalsIgnoreCase(arrayUpstairsBathroom[1]))
				{
					// if you say yes to showering
					console.clear();
					console.drawImage(jpgBathroom, 0, 85, 725,335, null);
					themeShower.start();
					console.println("You enter the shower and turn it on.");
					if (showerCounter>=2)
					{
						// if the person plays agin and picks shower again then this resets shoer counter to 0
						showerCounter = 0;
					}
					// do while loop. If person picks shower again more than 2 times then they die
					do
					{
						console.clear();
						console.drawImage(jpgBathroom, 0, 85, 725,335, null);
						console.println(" You feel refreshed and relaxed.Do you wish to keep showering or leave? (shower/leave)");
						continueShowering=console.readLine();
						console.clear();
						if(continueShowering.equalsIgnoreCase(arrayUpstairsBathroom[1]))
						{
							showerCounter++;
						}
						else if(continueShowering.equalsIgnoreCase(arrayUpstairs[4]))
						{
							// if you chose to leave then you die
							console.clear();
							console.drawImage(jpgDie, 0, 85, 725,335, null);
							console.println("A zombie snuck up behind you while you were leaving. You were still wet, so you slipped and broke your neck. On the bright side, at least you didnt have to witness the zombie eating you.");
							Thread.sleep(1000);
							dieUpstairs();
						}
						else 
							// if invalid input upstairs then call the invalid Kitchen method
						{
							invalidUpstairs();
						}


						// if the player showers more than 2 times then they die
					}while(showerCounter<1);
					themeShower.start();
					console.println("you leave the shower and walk back down the stairs");

					if(showerCounter<3)
					{
						// if the player showers more than once then they die
						themedie.start();
						console.clear();
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						console.println("A zombie snuck up behind you while walking down the stairs. You fell down and it was not a soft landing.");
						Thread.sleep(1000);
						// died Upstairs method is called when you die upstairs
						dieUpstairs();
					}

					else
					{
						// if you chose the front door
						console.clear();
						console.drawImage(jpgDoor, 0, 85, 725,335, null);
						console.println("When you reach the front door again you see a zombie at the top of the stairs. You run and start looking for somewhere to hide ");
						console.println("you see a path to the basement and a back door. Where will you go?(basement/back door)");
						basement=console.readLine();

						if(basement.equalsIgnoreCase(arrayUpstairsBathroom[2]))
						{
							// if you chose the basement
							console.clear();
							console.drawImage(jpgBasement, 0, 85, 725,335, null);
							if(keyChance<9)
							{
								// 90% chance that you will find a key
								console.clear();
								console.drawImage(jpgBasement, 0, 85, 725,335, null);
								console.println("While running from the zombie you manage to find a key.");
								console.println("Will you try to use it on the front door or the side door? (front door/side door)");
								sideDoor=console.readLine();

								if(sideDoor.equalsIgnoreCase(arrayUpstairsBathroom[3]))
								{
									// if you chose the front door
									console.clear();
									console.drawImage(jpgDoor, 0, 85, 725,335, null);
									console.println("You slip past the zombie and run to the front door.");
									console.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
									console.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
									console.println("...just to get hit by a trunk driven by a zombie. Sorry, but you died");
									console.drawImage(jpgDie, 0, 85, 725,335, null);
									themedie.start();
								}

								else if (sideDoor.equalsIgnoreCase(arrayUpstairsBathroom[4]))
								{
									// if you chose the side door then you die
									console.clear();
									console.drawImage(jpgDoor, 0, 85, 725,335, null);
									console.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
									console.println("In your frenzy the key breaks in the lock and the zombie eats you.");
									Thread.sleep(2000);
									// died Upstairs method is called when you die upstairs
									dieUpstairs();

								}

							}
							else
							{
								// 10% chance that you will die instead of finding the keys
								console.clear();
								console.drawImage(jpgBasement, 0, 85, 725,335, null);

								console.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
								Thread.sleep(2000);
								// died Upstairs method is called when you die upstairs
								dieUpstairs();
							}

						}
						else if (basement.equalsIgnoreCase(arrayUpstairsBathroom[5]))
						{
							// if you chose the back door
							console.clear();
							console.drawImage(jpgDoor, 0, 85, 725,335, null);
							console.println("You run to the backdoor swinging it open and running out; only to realise that there was not only one zombie, but a whole group of them.");

							console.println("They quickly jump on you before you have to chance to react.");
							Thread.sleep(2000);
							// died Upstairs method is called when you die
							dieUpstairs();
						}
						else
							// if you died upstairs then the invalid Kitchen is called
						{
							invalidKitchen();
						}

					}

				}
				else if(bathroom.equalsIgnoreCase(arrayUpstairsBathroom[6]))
				{
					// if you chose to exit the bathroom
					console.clear();
					console.drawImage(jpgBathroom, 0, 85, 725,335, null);
					console.println("As you exit the bathroom a zombie that was walking by spots you and eats you.");
					Thread.sleep(2000);
					// died Upstairs method is called when you die upstairs
					dieUpstairs();
				}
				else
				{
					// if an invalid input is entered upstairs
					invalidKitchen();
				}

			}
			else 
			{
				// if an invalid input is entered upstairs
				invalidKitchen();
			}



		}// end of the playOrNot while loop

		// if you lose both lives
		console.println("Sorry, but this death makes it both lives lost. Would you like to play again? (yes/no)");
		playAgainOrNot = console.readLine();
		if (playAgainOrNot.equalsIgnoreCase("yes"))
		{
			// ask is you wanna play again and you say yes then starts game again
			console.clear();
			console.drawImage(jpgLive, 0, 85, 725,335, null);
			console.println("Good to hear that");
			console.println("Try to pick different options this time");
			Thread.sleep(2000);
			playingMethod();
			lives = 2;
		}
		else if (playAgainOrNot.equalsIgnoreCase("no"))
		{
			// ask if you wanna play, if no then closes console
			console.clear();
			console.drawImage(jpgWin, 0, 85, 725,335, null);
			console.println("Sorry to hear that");
			Thread.sleep(900);
			console.close();
		}
		else 
		{
			// if invalid input
			console.println("Please type in a valid input");
			playAgainOrNot = console.readLine();
		}

	}// end of method upstairs

/**
/*This method  is called if you want to go to the *kitchen
*
*
*/

	// this method starts if the player wants 
	public static void choseKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method kitchen
		// initialize and call audio
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	
		Clip theme = AudioSystem.getClip(); 

		theme.open(AudioSystem.getAudioInputStream(new File("resource/creepy.wav"))); 
		themewin.open(AudioSystem.getAudioInputStream(new File("resource/win.wav"))); 
		themedie.open(AudioSystem.getAudioInputStream(new File("resource/die.wav")));
		themegokuWin.open(AudioSystem.getAudioInputStream(new File("resource/gokuWin.wav")));
		themeShower.open(AudioSystem.getAudioInputStream(new File("resource/shower.wav")));
		themeBackyard.open(AudioSystem.getAudioInputStream(new File("resource/backyard.wav")));
		// if player starts the game again then restarts the lves counter
		if (lives <0)
		{
			lives = 2;
		}
		// as long as the player has lives
		while (lives >0)
		{
			// if the player chose kitchen
			console.clear();
			console.drawImage(jpgKitchen, 0, 85, 725,335, null);
			console.println("You are hungry. There is a fridge in one corner and a pantry in another. Which one do you want to check?(fridge/pantry) ");
			lookFridgeOrPantry = console.readLine();
			console.clear();
			if (lookFridgeOrPantry.equalsIgnoreCase(arrayKitchen[1]))
			{
				// if the fridge is chisen
				console.clear();
				console.drawImage(jpgKitchen, 0, 85, 725,335, null);
				console.println("The food looks a bit old and might have gone bad, but you're very hungry. Would you like to try it? (yes/no)");
				eat = console.readLine();
				console.clear();
				if (eat.equalsIgnoreCase(arrayKitchen[2]))
				{
					// if the player chose to eat
					console.clear();
					console.drawImage(jpgDie, 0, 85, 725,335, null);
					console.println("Sorry," + name + ", but the food was bad and you died :(." );
					themedie.start();
					// died Kitchen method is called when you die in the kitchen
					Thread.sleep(2000);
					dieKitchen();
				}
				else if (eat.equalsIgnoreCase(arrayKitchen[3]))
				{
					// if you chose not to eat
					console.drawImage(jpgZombies, 0, 85, 725,335, null);
					console.println("There is a zombie blocking the only entrance. Run away or fight the zombie? (run/fight)");
					runOrFightFridge = console.readLine();
					console.clear();
					if (runOrFightFridge.equalsIgnoreCase(arrayKitchen[4]))
					{
						// if you chose to run
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						console.println("You were too slow, the zombie ate you. Run faster next time");
						themedie.start();
						Thread.sleep(2000);
						// died Kitchen method is called when you die in the kitchen
						dieKitchen();
					}
					else if (runOrFightFridge.equalsIgnoreCase(arrayKitchen[5]))
					{
						// if you chose to fight
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						console.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of al the fat in you. He personally prefers that over lean meat ");
						themedie.start();
						Thread.sleep(2000);
						// died Kitchen method is called when you die in the kitchen
						dieKitchen();
					}
					else 
					{
						// if invalid input in the kitchen
						invalidUpstairs();
					}

				}
				else
				{
					// if invalid input in the kitchen
					invalidUpstairs();
				}
			}
			else if(lookFridgeOrPantry.equalsIgnoreCase(arrayKitchenPantry[0]))
			{
				// if you chose to check the pantry
				console.clear();
				console.drawImage(jpgKitchen, 0, 85, 725,335, null);
				console.println("There is something lurking in the dark corner of the pantry, check it out or leave? (check/leave)");
				pantryEatOrNot = console.readLine();
				console.clear();
				if (pantryEatOrNot.equalsIgnoreCase(arrayKitchenPantry[1]))
				{
					// if you chose check
					console.clear();
					console.drawImage(jpgKitchen, 0, 85, 725,335, null);
					console.println("It was just a mouse!. The food on the shelf in non-perishable food. Do you want to visit the basement next or the roof? (basement/roof)");
					basementOrRoof = console.readLine();
					if (basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[2]))
					{
						// if you chose the basement
						// you find keys, where to go now?
						console.clear();
						console.drawImage(jpgBasement, 0, 85, 725,335, null);
						console.println("Congratulations, you found the keys. Proceed to the basement side door or to the upstairs door? (basement/upstairs) ");
						basementDoorOrUpstairsDoor = console.readLine();
						if (basementDoorOrUpstairsDoor.equalsIgnoreCase(arrayKitchenPantry[3]))
						{
							// if you chose the basement door
							console.clear();
							console.println("Congratulations, you got out alive!!!");
							console.drawImage(jpgLive, 0, 85, 725,335, null);
							themewin.start();
							Thread.sleep(500);
							console.println(".........and then you got hit by a truck and died. Fail ");
							console.println(" Fail ");
							console.println("But, thanx for trying");
							Thread.sleep(2000);
							// died Kitchen method is called when you die in the kitchen
							dieKitchen();
							// theme die begins
							themedie.start();

						}
						else if (basementDoorOrUpstairsDoor.equalsIgnoreCase(arrayKitchenPantry[4]))
						{
						// if you chose the upatirs door	
							console.clear();
							console.drawImage(jpgDie, 0, 85, 725,335, null);
							console.println("You live!!!");
							Thread.sleep(500);
							console.println("Just kidding, a zombie ate you as you exited. ");
							themedie.start();
							Thread.sleep(2000);
							// died Kitchen method is called when you die in the kitchen
							dieKitchen();

						}
						else
						{
							// if the invalid input was in the kitchen
							invalidUpstairs();

						}

					}
					else if(basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[5])|| randomOne <= 6)
					{
						// if you chose the roof and the 40% chance
						console.clear();
						console.println("So close. You saw the keys and ran for them but tripped, fell down, and broke your neck");
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						themedie.start();
						Thread.sleep(2000);
						// died Kitchen method is called when you die in the kitchen
						dieKitchen();
					}
					else if(basementOrRoof.equalsIgnoreCase(arrayKitchenPantry[6])|| randomOne > 6)
					{
						// if you chose the roof and 60% chance
						console.clear();
						console.drawImage(jpgHauntedHouse, 0, 85, 725,335, null);
						console.clear();
						console.println("I dont like your shoes. So u slip down and die :)");
						themedie.start();
						Thread.sleep(500);
						console.println();
						console.println("Perks of being the creator ;)");
						Thread.sleep(2000);
						dieKitchen();
					}
					else 
					{
						// invalid input in the kitchen
						invalidUpstairs();
					}


				}
				else if	(pantryEatOrNot.equalsIgnoreCase(arrayKitchenPantry[7]))
				{
					// if you chose the pantry
					console.clear();
					console.drawImage(jpgZombies, 0, 85, 725,335, null);
					console.println("There is a zombie blocking the doorway, run past him and hope he doesnt chase you or fight and win? (run/fight)");
					runOrFightPantry = console.readLine();

					if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[8]))
					{
						// if you chose to run after pantry
						console.clear();
						console.println("You were too slow, the zombie ate you. Run faster next time");
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						Thread.sleep(2000);
						dieKitchen();

					}
					else if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[9]) || randomTwo <=4)
					{
						// if you chose to fight after pantry and the chance was 40%
						console.clear();
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						console.println("You're too weak. Join fitness, and oh yeah, the zombie ate you. He said you tasted delicious because of al the fat in you. He personally prefers that over lean meat ");
						theme.start();
						Thread.sleep(2000);
						dieKitchen();

					}
					else if (runOrFightPantry.equalsIgnoreCase(arrayKitchenPantry[10]) || randomTwo >=4)
					{
						// if you chose to fight and the chance was 60%
						console.clear();
						console.println("Deeze muscles!! You killed a zombie, good for you");
						themegokuWin.start();
						console.drawImage(jpgGokuWin, 0, 85, 725,335, null);
						Thread.sleep(1000);
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						console.println("... and then another zombie came and killed while you partied. Life lesson: check for zombies before you start partying  ");
						themedie.start();
						console.drawImage(jpgDie, 0, 85, 725,335, null);
						Thread.sleep(2000);
						dieKitchen();
					}
					else
					{
						// if there was an invalid input in the kitchen
						invalidUpstairs();

					}



				}
				else 
				{
					// if there was an invalid input in the kitchen
					invalidUpstairs();
				}








			}
			else
			{
				// if there was an invalid input in the kitchen
				invalidUpstairs();
			}

		}
		// ask if you want to play the game again as you died
		console.println("Sorry, but this death makes it both lives lost. Would you like to play again? (yes/no)");
		playAgainOrNotTwo = console.readLine();
		if (playAgainOrNotTwo.equalsIgnoreCase("yes"))
		{
			// if you chose to play again
			console.clear();
			console.drawImage(jpgLive, 0, 85, 725,335, null);
			console.println("Good to hear that");
			console.println("Try to make different slections this time");
			Thread.sleep(1000);
			playingMethod();
			lives = 2;
		}
		else if (playAgainOrNotTwo.equalsIgnoreCase("no"))
		{
			// of you chose no
			console.println("Sorry to hear that");
			Thread.sleep(3000);
			console.close();
		}
		else 
		{
			// if there was an invalid input
			console.println("Screw it, you dont deserve a second try. At least type correctly; yes or no, how hard is it...Jeez ");
			Thread.sleep(3000);
			console.close();
		}







	}// end of method kitchen
	// this method is called if the player enters invalid input in the kitchen. It takes a live away and take you upstairs
/**
/*This method is called if the user enters an invalid input when they are in the *kitchen
*
*
*/

	public static void invalidKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		console.clear();
		console.drawImage(jpgIdiot, 0, 85, 725,335, null);
		console.println("Please type in a valid input and play again");
		Thread.sleep(3000);
		choseUpstairs();
		lives = lives - 1;
	}// end of method invalidKitchen
	// this method is called if the player enters invalid input upstairs. It takes a live away and take you to the kitchen
/**
/*This method is called if the user enters an invalid input when they are upstairs
*
*
*/

	public static void invalidUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		console.clear();
		console.drawImage(jpgIdiot, 0, 85, 725,335, null);
		console.println("Please type in a valid input and play again");
		Thread.sleep(3000);
		choseKitchen();
		lives = lives -1;
	}// end of method invalidUpstairs
	// this method is called if the player dies in the kitchen. It takes a live away and take you upstairs
/**
/*This method is called if the user dies while they are in the kitchen
*
*
*/

	public static void dieKitchen() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died
		lives = lives - 1;
		// take 1 life away
		if (lives == 1)
			// if only 1 only life left then print this
		{
			console.clear();
			console.drawImage(jpgDie, 0, 85, 725,335, null);
			console.println("You died. You now only have 1 life left and will now be transported Upstairs by some mysterious power ");
			Thread.sleep(3000);
			console.clear();
			choseUpstairs();
			lives = lives - 1;
		}
		else
		{
			// if 0 lives then go upstairs as it checks lives agin and kicks out of the loop there
			choseUpstairs();
		}
	}// end of method diedUpstairs
	// this method is called if the player died upstairs. It takes a live away and take you to the kitchen
/**
/*This method is called if the user dies while they are upstairs
*
*
*/

	public static void dieUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{// start of method died

		lives = lives - 1;
		// take 1 life away
		if (lives == 1)
			// if only 1 only life left then print this
		{
			console.clear();
			console.drawImage(jpgDie, 0, 85, 725,335, null);
			console.println("You died. You now only have 1 life left and will now be transported to the Kitchen by some mysterious power ");
			Thread.sleep(3000);
			console.clear();
			choseKitchen();
			lives = lives - 1;
		}
		else
		{// if 0 lives then go upstairs as it checks lives agin and kicks out of the loop there
			choseKitchen();
		}
	}// end of method diedUpstairs


}// end of public class


