import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmpg16b4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int counter=0;
		
		String[] tokens = in.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int [] meh=new int[a];
		
		for (int i=a;i!=0;i--)
		{
			String[] blah = in.readLine().split(" ");
			meh[counter] = Integer.parseInt(tokens[0]);
			counter++;
		}
		

	}

}
