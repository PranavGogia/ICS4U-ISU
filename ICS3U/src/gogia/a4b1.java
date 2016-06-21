package gogia;
import java.util.Arrays;
import java.util.Scanner;
public class a4b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner blah=new Scanner (System.in);
		System.out.println("How many number do you intend to enter?");
		
		int c=blah.nextInt();
		int [] array =new int [c];
		System.out.println("Please enter the first number now");
		for (int i=0;i<=c;++i)
		{
			
			array[i]=blah.nextInt();
			System.out.println("Please enter the next number now");
		}
		for (int i=0;i<=c;++i)
		{
			System.out.println(array[i]);
		}
		
	
	}

		
		
		
	}


