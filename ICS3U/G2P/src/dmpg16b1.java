import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmpg16b1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tokens = in.readLine().split(" ");
		int n = Integer.parseInt(tokens[0]);
		int d = Integer.parseInt(tokens[1]);
		int q = Integer.parseInt(tokens[2]);
		int l = Integer.parseInt(tokens[3]);
		int t = Integer.parseInt(tokens[4]);
		
		System.out.println(n*5+d*10+q*25+l*100+t*200);
		
		

	}

}
