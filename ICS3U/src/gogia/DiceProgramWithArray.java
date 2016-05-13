/* Pranav Gogia
 * May 4 2016
 * DiceProgramWithArrays
 * simple array program
 * This program rolls two dice 10000 times and then displays how many times each number was rolled
 */
package gogia;

public class DiceProgramWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring all the variables used
		int firstDice;
		int secondDice;
		int x;
		String[] roll = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int[] total = new int[11];

		//this for loop rolls the dice 10000 times
		for (int i = 0; i != 10000; i++) {
			firstDice = (int) (Math.random() * 6) + 1;
			secondDice = (int) (Math.random() * 6) + 1;
			x = firstDice + secondDice;

			// if the dice rolls this number then the number of time the number is rolled will go up
			if (x == 2) 
			{
				total[0]++;
			}
			else if (x == 3) 
			{
				total[1]++;
			}
			else if (x == 4) 
			{
				total[2]++;
			}
			else if (x == 5) 
			{
				total[3]++;
			}
			else if (x == 6) 
			{
				total[4]++;
			}
			else if (x == 7)
			{
				total[5]++;
			}
			else if (x == 8)
			{
				total[6]++;
			}
			else if (x == 9) 
			{
				total[7]++;
			}
			else if (x == 10) 
			{
				total[8]++;
			}
			else if (x == 11) 
			{
				total[9]++;
			}
			else if (x == 12) 
			{
				total[10]++;
			}
		}
		//This line outputs the results. It outputs the number and how many times it was rolled
		System.out.println("Number rolled      Number of times it was rolled");
		System.out.println("");
		for (int i = 0; i != 11; i++) {
			System.out.println("      " + roll[i] + "                        " + total[i]);
		}

	}

}