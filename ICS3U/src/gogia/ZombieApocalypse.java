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

public class ZombieApocalypse
{

	public static Console console = new Console(47,157);
	public static int keyChance = (int )(Math. random() * 10 + 1);
	public static int showerCounter = 0;
	public static int randomOne = (int )(Math. random() * 100 + 1);
	public static int randomTwo = (int )(Math. random() * 100 + 1);
	public static String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, name = null, runOrFightPantry,pantryEatOrNot = null,playAgainOrNot, basementOrRoof = null, playOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
	public static String bathroom,basement,backyard,frontDoor,sideDoor,bedroom,leave,attic,rest,tryAgain,redo,continueShowering =null;
	public static boolean playOrNot = false;
	public static Image jpgHauntedHouse, jpgKitchen, jpgLive, jpgBasement, jpgIdiot, jpgDie, jpgRun, jpgSurvive, jpgZombies, jpgGokuWin, jpgWin, jpgUpstairs, jpgBedroom, jpgAttic, jpgBathroom, jpgDoor, jpgBackyard,jpgTitlePage, jpgLoading , jpgLoadingDone;
	public static String[] roll = new String[] { "upstairs", "", "4", "5", "6", "7", "8", "9", "10", "11", "12" };

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

			if(goUpOrKitchen.equalsIgnoreCase("upstairs"))
			{
				choseUpstairs();
			}
			else if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
			{
				choseKitchen();
			}
			else
			{
				console.println("Please enter a valid input");
				playingMethod();
			}


		}
	
		}

	public static void choseUpstairs() throws InterruptedException, LineUnavailableException, IOException, UnsupportedAudioFileException
	{

		do
		{

			
			
			
			
			

		}while (playOrNot = true);	
		
		
playingMethod();
		
		}

		public static void choseKitchen()
		{







		}

		public static void died()
		{

		}





	}
