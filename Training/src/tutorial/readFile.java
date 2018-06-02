package tutorial;
import java.io.*;
import java.util.*;
public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname;
		System.out.println("Enter File name");
		Scanner input = new Scanner(System.in);
		fname = input.nextLine();
		
		Scanner infile = null;
		
		try{
			infile = new Scanner(new File(fname));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening file");
			System.exit(0);
		}
		
		while(infile.hasNextLine()){
			String line = infile.nextLine();
			System.out.println(line);
		}
	}	

}


