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

@SuppressWarnings("unused")
public class ZombieApocalypse {

	public static void main(String[] args) throws LineUnavailableException, InterruptedException, IOException, UnsupportedAudioFileException
	{
		// TODO Auto-generated method stub

		Console console = new Console();
		Clip theme = AudioSystem.getClip(); 
		Clip themewin = AudioSystem.getClip(); 
		Clip themedie = AudioSystem.getClip(); 
		Clip themegokuWin = AudioSystem.getClip();
		Clip themeShower = AudioSystem.getClip();
		Clip themeBackyard = AudioSystem.getClip();	
		Image jpgTitlePage, jpgLoading , jpgLoadingDone;
		
		//two arrays. One for all the answers and comparing while the other is for all the options chosen

		String goUpOrKitchen = null, lookFridgeOrPantry = null, eat = null, name = null, runOrFightPantry,pantryEatOrNot = null,playAgainOrNot, basementOrRoof = null, playGameOrNotInput, runOrFightFridge,basementDoorOrUpstairsDoor = null;
		String bathroom,basement,backyard,frontDoor,sideDoor,bedroom,leave,attic,rest,tryAgain,redo,continueShowering =null;
		boolean playOrNot = false;
		int randomOne = (int )(Math. random() * 100 + 1);
		int randomTwo = (int )(Math. random() * 100 + 1);
		double chanceForKey= Math.random()*10+1;
		int counterForShower = 0;
		
		console.setTextBackgroundColor(Color.black);
		console.setTextColor(Color.white);
		console.clear();

		theme.open(AudioSystem.getAudioInputStream(new File("H:/git/ICS3U/ICS3U/resource/creepy.wav"))); 
		jpgLoading = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loading.jpg");
		jpgLoadingDone = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/loadingDOne.jpg");
		jpgTitlePage = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/titlePage.jpg");

		

		theme.start();
		console.drawImage(jpgLoading, 0, 0, 640,420, null);
		Thread.sleep(10000);
		console.drawImage(jpgLoadingDone, 0, 0, 640,420, null);
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
		playGameOrNotInput = console.readLine();
		console.clear();

		if (playGameOrNotInput.equalsIgnoreCase("yes"))
		{
			playOrNot = true;
		}
		// else close console
		else 
		{
			console.close();
		}


		Image jpgHauntedHouse, jpgKitchen, jpgLive, jpgBasement, jpgIdiot, jpgDie, jpgRun, jpgSurvive, jpgZombies, jpgGokuWin, jpgWin, jpgUpstairs, jpgBedroom, jpgAttic, jpgBathroom, jpgDoor, jpgBackyard;

			

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
		jpgSurvive = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/survive.jpg");
		jpgZombies = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/zombies.jpg");
		jpgGokuWin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/gokuWin.jpg");
		jpgWin = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/win.jpg");


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
				
			}
			else if (goUpOrKitchen.equalsIgnoreCase("kitchen"))
			{
				
			}
			else
			{
				console.println("Please enter a valid input");
				goUpOrKitchen = console.readLine();
			}
			
			
		}
	}


	public static void choseUpstairs()
	{

	}

	public static void choseKitchen()
	{

	}

	public static void died()
	{

	}





}
