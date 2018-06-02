package tutorial;
import java.io.*;
import java.util.*;

public class ReadFile1  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fname = "/Users/mohaktamhane/Documents/Java/Training/names.txt";
		File myfile = new File(fname);
		
		String fname1 = "name1.txt";
		FileWriter fw = new FileWriter(fname1);
		PrintWriter os = null;
		os = new PrintWriter(fw,true);
		
		Scanner  input = new Scanner(myfile);
		int tot_score = 0;
		int max = 0;
		String finalname = null;
		while (input.hasNext())
		{
	       // int fscore = input.nextInt();
	        //tot_score+=fscore;
			
			String line = input.nextLine();
			String[] parts = line.split(",");
			//System.out.println(line);
			String name = parts[0];
			String lname = parts[1];
			char first = name.charAt(0);
			finalname = first+lname;
			System.out.println(finalname);
			
			os.println(finalname);
			
			
			/*int score = Integer.parseInt(parts[1]);
			if (score > max)
			{
				max = score;
			}*/
			
			
		}   
		
		//System.out.println(max);
		
		
		
		os.close();
	   
		
		
		
		

	}

}
