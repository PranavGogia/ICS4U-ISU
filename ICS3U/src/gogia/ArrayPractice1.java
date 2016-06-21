package gogia;

import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int x = 0;
		String [] inputs = new String[x];
		
		System.out.println("How many names do you intend to enter?");
		Scanner inputsInput = new Scanner(System.in);
		
		x = Integer.parseInt(inputsInput.nextLine());
		
		
		
		for ( int i = 0; i < x; i++);
		{
			System.out.println("Please type in the names of the people");
			inputs[i] = inputsInput.nextLine();
		}
		
		System.out.println(inputs);
		
	}

}
