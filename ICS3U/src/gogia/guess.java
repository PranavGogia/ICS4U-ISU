package gogia;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int randomNumber;
		double input;
		randomNumber = (int) (Math.random() * 2000000000) + 1;
		for (int i =0; i<= 32; i++)
		{
		
		input =  scan.nextDouble();
		if (input == randomNumber)
		{
		System.out.println("OK");	
		}
		else if (input <randomNumber)
		{
		System.out.println("Higher");	
		}
		else 
		{
		System.out.println("Lower");	
		}
		
		
		}
		
		
	}

}
