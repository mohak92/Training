package tutorial;

import java.io.*;

public class textOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "out.txt";
		PrintWriter out = null;
		
		try{
			
			out = new PrintWriter(fname);
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening file");
			System.exit(0);
		}
		
		out.println("ferrari");
		out.close();
	} 

}
