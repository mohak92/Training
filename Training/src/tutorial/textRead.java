package tutorial;

import java.io.*;

import java.util.*;

public class textRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "car.rtf";
		Scanner input = null;
		try{
			input = new Scanner(new File(fname));
		}
		catch(FileNotFoundException e){
			System.out.println("Error readikng file");
			System.exit(0);
		}
		
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
	}

}
