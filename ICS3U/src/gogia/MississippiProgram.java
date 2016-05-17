/* Pranav Gogia
 * 17 May 2016
 * Mississippi Program
 * This program uses methods to print out huge M's,I's,S's and P's
 * It uses methods to make the letters and then calls them in the main method
 */
package gogia;

public class MississippiProgram {
	/*This is a meathod header. It draws out the word MISSISSIPPI by calling methods
	 */
	public static void main(String[] args) 
	{
		// draw mississippi
		drawM();
		drawI();
		drawS();
		drawS();
		drawI();
		drawS();
		drawS();
		drawI();
		drawP();
		drawP();
		drawI();
	
		
	}
	
	public static void drawM()
	{
		/*
		 * This is a method used for drawing the M so that it can later be printed by the main method
		 */ 
		System.out.println("                 ");
		System.out.println("M			   M ");
		System.out.println("M	M		MM   ");
		System.out.println("M		M		M");
		System.out.println("M				M");
		System.out.println("M				M");
		System.out.println("M				M");
		System.out.println("M				M");
		System.out.println("M				M");
		System.out.println("                 ");
	}
	public static void drawI()
	{
		/*
		 * This is a method used for drawing the I so that it can later be printed by the main method
		 */ 
		System.out.println("            ");
		System.out.println("IIIIIIIIIIII");
		System.out.println("	 II		");
		System.out.println("	 II		");
		System.out.println("	 II		");
		System.out.println("	 II		");
		System.out.println("	 II		");
		System.out.println("	 II		");
		System.out.println("IIIIIIIIIIII");
		System.out.println("            ");
	}
	public static void drawS()
	{
		/*
		 * This is a method used for drawing the S so that it can later be printed by the main method
		 */ 
		System.out.println("            ");
		System.out.println("SSSSSSSSSSSS");
		System.out.println("SS			");
		System.out.println("SS			");
		System.out.println("SS			");
		System.out.println("SSSSSSSSSSSS");
		System.out.println("		  SS");
		System.out.println("		  SS");
		System.out.println("		  SS");
		System.out.println("SSSSSSSSSSSS");
		System.out.println("            ");
	}
	public static void drawP()
	{
		/*
		 * This is a method used for drawing the P so that it can later be printed by the main method
		 */ 
		System.out.println("               ");
		System.out.println("PPPPPPPPPPPPP ");
		System.out.println("P			P ");
		System.out.println("P			P ");
		System.out.println("P			P ");
		System.out.println("PPPPPPPPPPPPP ");
		System.out.println("P			  ");
		System.out.println("P			  ");
		System.out.println("P			  ");
		System.out.println("              ");
	}
	
	
	
	

}
