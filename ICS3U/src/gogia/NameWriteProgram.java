/* Pranav Gogia
 * May 4 2016
 * NameWriteProgram with arrays
 * This program takes in a number of names and then prints then in the same order and then the opposite order
 */
package gogia;
// importing the package
import java.util.Scanner;

public class NameWriteProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				//declaring all the variables
				Scanner input=new Scanner(System.in);
				System.out.println("How many names do you wish to enter?");
				int x=Integer.parseInt(input.nextLine());
				
				String [] names=new String [x];
				
				// ask the user for all the names
				System.out.println("Please enter the name. Press enter after you finish writing each name");
				//the user enters all the names
				for (int i=0;i<x;i++)
				{
					names[i]=input.nextLine();
				}
				//outputs the names entered in the exact same order
				for (int i=0;i<x;i++)
				{
					System.out.println("");
					System.out.println(names[i]);
				}
				//outputs the names entered in the opposite order
				for (int i=x-1;i>=0;i--)
				{
					System.out.println("");
					System.out.println(names[i]);
				}
				
				
				

			}

		
	}


