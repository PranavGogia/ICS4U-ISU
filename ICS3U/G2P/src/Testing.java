import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {

	public static void main(String[] args) throws IOException {
		Scanner scn=new Scanner (System.in);
		int counter=0;
		
		
		
		
		
		//String[] tokens = in.readLine().split(" ");
		
		int m = scn.nextInt();
		int total=m;
		int ppl = scn.nextInt();
		//System.out.println(ppl);
		int []am=new int[ppl];
		
		
		for (int i=0;i!=ppl;i++)
		{
			//System.out.println(i);
			am[i]= scn.nextInt();			
			total=total+am[i];
			//System.out.println(total);
		}
		int avg =total/ppl;
		Arrays.sort(am);
		for (int i=1;i!=ppl;i++)
		{
			am[i]=am[ppl-i];
		}
		for(int i=0;i!=ppl;i++)
		{
			if(m<avg)
			{
				total=total-am[i];
				counter++;
			}
			for (int j=0;j!=ppl-1-i;j++)
			{
				avg=total/ppl-1-i;
			}
		}
		System.out.println(counter);
	

	}

}
