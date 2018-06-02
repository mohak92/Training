package tutorial;
import java.io.*;
public class blackrockTest {
	  public static void main(String[] args) throws IOException {
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String s;
		    while ((s = in.readLine()) != null) {
		    	int x = Integer.parseInt(s);
		    	int r = x*x;
		      System.out.println(r);
		    }
		  }
}
