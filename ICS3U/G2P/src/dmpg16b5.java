import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class dmpg16b5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int counter=0;
		
		
		
		
		
		String[] tokens = in.readLine().split(" ");
		
		int m = Integer.parseInt(tokens[0]);
		int total=m;
		int ppl = Integer.parseInt(tokens[1]);
		//System.out.println(ppl);
		int []am=new int[ppl];
		String[] shh = in.readLine().split(" ");
		
		for (int i=0;i!=ppl;i++)
		{
			//System.out.println(i);
			am[i]= Integer.parseInt(shh[i]);			
			total=total+am[i];
			//System.out.println(total);
		}
		int avg =total/ppl;
		Arrays.sort(am);
		for (int i=0;i!=ppl;i++)
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
