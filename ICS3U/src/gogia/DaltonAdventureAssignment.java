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

	
public class DaltonAdventureAssignment {
	

	static Console c= new Console();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String go,bathroom,shower,backyard,basement,door,bedroom,leave,attic,rest,tryAgain,continueShowering ="" ;
		
		int lives=2;
		int showerCounter=0;
		
		Image jpgupstairs, jpgbedroom, jpgattic, jpgbathroom, jpgdoor, jpgbackyard;
		
		
	
		 
		jpgupstairs = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/upstairs.jpg");
		jpgbedroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bedroom.jpg");
		jpgattic = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/attic.jpg");
		jpgbathroom = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/bathroom.jpg");
		jpgdoor = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/door.jpg");
		jpgbackyard = Toolkit.getDefaultToolkit().getImage("H:/git/ICS3U/ICS3U/resource/backyard.jpg");
		
		
		double keyChance= Math.random()*10+1;
		
		go=c.readLine();
		
		if(go.equalsIgnoreCase("kitchen"))
		{
		
		}
		
		else if(go.equalsIgnoreCase("upstairs"))
		{
			c.clear();
			c.println("You walk up the stairs and reach the top.");
			c.println("You see 2 doors: one to the bedroom and the other to the bathroom. Where do you search? (bedroom/bathroom)");
			bedroom=c.readLine();
			
			if(bedroom.equalsIgnoreCase("bedroom"))
			{
				c.clear();
				c.println("You enter the bedroom and see something beside the bed do you want to go see what it is or leave? (search/leave)");
				leave=c.readLine();
				
				if(leave.equalsIgnoreCase("search"))
				{
					c.clear();
					c.println("It was just a blanket lying on the ground.");
					c.println("From your new position you can see a ladder leading up to the attic do you wish to enter the attic or keep searching the bedroom? (attic/search)");
					attic= c.readLine();
					
					if(attic.equalsIgnoreCase("attic"))
					{
						c.clear();
						c.println("You find nothing of interest in the attic but start to find yourself becoming tired.");
						c.println("Do you wish to rest first or leave immediately? (rest/leave)");
						rest=c.readLine();
						
						if(rest.equalsIgnoreCase("leave"))
						{
							c.clear();
							c.println("You leave the attic and get to the bedroom door when you see a zombie behind you. You run down the stairs and into the (basement/backyard).");
							backyard=c.readLine();
							
							if(backyard.equalsIgnoreCase("basement"))
							{
								c.clear();
								if(keyChance<9)
								{
									c.println("While running from the zombie you manage to find a key.");
									c.println("Will you try to use it on the front door or the side door? (front door/side door)");
									door=c.readLine();
									
									if(door.equalsIgnoreCase("front door"))
									{
										c.clear();
										c.println("You slip past the zombie and run to the front door.");
										c.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
										c.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
										c.println("You've managed to escape now all that is left is to find out where you are and how you can get home. Would you like to try your luck again with the house of horrors? (yes/no) ");
										tryAgain=c.readLine();
										
										if(tryAgain.equalsIgnoreCase("yes"))
										{
											lives=0;
										
										}
										else if(tryAgain.equalsIgnoreCase("no"))
										{
											c.close();
										}
										
									}
									else if (door.equalsIgnoreCase("side door"))
									{
										c.clear();
										c.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
										c.println("In your frenzy the key breaks in the lock and the zombie eats you.");
										lives=0;
									}
								}
								else
								{
									c.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
									lives=0;
								}
							}
							else if(backyard.equalsIgnoreCase("backyard"));
							{
								c.clear();
								c.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
								c.println("A group of zombies quickly jump on you before you have to chance to react.");
								lives=0;
							}
							
						}
						else if(rest.equalsIgnoreCase("rest"))
						{
							c.clear();
							c.println("While you were sleeping a zombie found you and enjoyed a nice meal.");
							lives=0;
						}
					}
					else if(attic.equalsIgnoreCase("search"))
					{
						c.clear();
						c.println("You search the blanket to see if you find anything useful. As you do a rotten hand jumps out at you! As it turned out there was a zombie under the blanket who quickly tore you to shreads.");
						lives=0;
					}
					
				}
				else if(leave.equalsIgnoreCase("leave"))
				{
					c.clear();
					c.println("As you turn to leave a body springs from beside the bed. It catches you off gaurd and takles you before you realise what is happening. You come to the realization that it was a zombie beside the bed as it rips through your throat.");
					lives=0;
				}
			}
			
			else if(bedroom.equalsIgnoreCase("bathroom"))
			{
				c.clear();
				c.println("You enter the bathroom and look around. there is nothing of note in there other than a fully functional shower. Would you like to leave or shower first? (leave/shower)");
				bathroom=c.readLine();
				
				if(bathroom.equalsIgnoreCase("shower"))
				{
					c.clear();
					c.println("You enter the shower and turn it on.");
					do
					{
						c.println(" You feel refreshed and relaxed.Do you wish to keep showering or leave? (shower/leave)");
						continueShowering=c.readLine();
						c.clear();
						if(continueShowering.equalsIgnoreCase("shower")) showerCounter++;
						
					}while(showerCounter<3);
					c.println("you leave the shower and walk back down the stairs");
					
					if(showerCounter<3)
					{
						c.println("A zombie snuck up behind you while walking down the stairs. It was not a soft landing.");
						lives=0;
					}
					//LOOK HERE
					else
					{
						c.println("When you reach the front door again you see a zombie at the top of the stairs. You run and start looking for somewhere to hide when you see a path to the basement and a back door. Where will you go?");
						backyard=c.readLine();
						
						if(backyard.equalsIgnoreCase("basement"))
						{
							c.clear();
							if(keyChance<9)
							{
								c.println("While running from the zombie you manage to find a key.");
								c.println("Will you try to use it on the front door or the side door? (front door/side door)");
								door=c.readLine();
								
								if(door.equalsIgnoreCase("front door"))
								{
									c.clear();
									c.println("You slip past the zombie and run to the front door.");
									c.println("You desperately try to unlock the door and barely manage to succeed before the zombie catches you.");
									c.println("You leave quickly slamming the door shut behind you and quickly leave the house of horrors behind.");
									c.println("You've managed to escape now all that is left is to find out where you are and how you can get home. Would you like to try your luck again with the house of horrors? (yes/no) ");
									tryAgain=c.readLine();
									
									if(tryAgain.equalsIgnoreCase("yes"))
									{
										lives=0;
									}
									else if(tryAgain.equalsIgnoreCase("no"))
									{
										c.close();
									}
									
								}
								else if (door.equalsIgnoreCase("side door"))
								{
									c.clear();
									c.println("You run to the door and franticly try to unlock the door while the zombie approaches.");
									c.println("In your frenzy the key breaks in the lock and the zombie eats you.");
									lives=0;
								}
							}
							else
							{
								c.println("You enter the basement and find yourself trapped. The zombie finally catches up and makes a quick meal of you.");
								lives=0;
							}
						}
						else if(backyard.equalsIgnoreCase("backyard"));
						{
							c.clear();
							c.println("You run to the backdoor swinging it open and running out only to realise that there was not only one zombie.");
							c.println("A group of zombies quickly jump on you before you have to chance to react.");
							lives=0;
						}
						
					}
					
				}
				else if(bathroom.equalsIgnoreCase("leave"))
				{
					c.clear();
					c.println("As you exit the bathroom a zombie that was walking by spots you and eats you.");
					lives=0;
				}
				
			}
		
		}
	}

}

