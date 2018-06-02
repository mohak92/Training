package tutorial;
import java.util.*;
import java.io.*;

public class fileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "";
		System.out.println("Enter your file name");
		Scanner input = new Scanner(System.in);
		fname = input.nextLine();
		Scanner inputFile = null;
		try{
			inputFile = new Scanner(new File(fname));
		}
		catch(FileNotFoundException e){
			System.out.println("Error creating file");
			System.exit(0);
		}
		
		while(inputFile.hasNextLine())
		{
			System.out.println(inputFile.nextLine());
		}
	}


}
