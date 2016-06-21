package gogia;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number;
		int counter = 0;
		boolean primeOrNot;
		
		System.out.println("Please enter the number");
		number = scan.nextInt();
		
		isDivisable(number, counter);
		isPrime(number);
		
		if (primeOrNot = true)
		{
			System.out.println("The number is a prime number");
		}
		else 
		{
			System.out.println("The number is not a prime number");
		}
		
	}
	
	public static boolean isDivisable(int number, int counter)
	{
		for (int i =1; i<= number; i++)
		{
			if (number % i == 0)
			{
				counter++;
				return(true);
			}
		}
		return true;
		
		
	}
	public static boolean isPrime(int number)
	{
		if (number ==0 || number == 1)
		{
			return(false);
		}
		return (false);
	}
	

}
