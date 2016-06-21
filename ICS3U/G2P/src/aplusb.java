import java.util.Scanner;

public class aplusb {

	public static void main(String[] args) {
		Scanner blah=new Scanner (System.in);
		
		
		int c=blah.nextInt();
		int [] a =new int [c];
		int [] b=new int [c];
		for (int i=0;i!=c;i++)
		{
			a[i]=blah.nextInt();
			b[i]=blah.nextInt();
		}
		for (int i=0;i!=c;i++)
		{
			System.out.println(a[i]+b[i]);
		}
	}

}
