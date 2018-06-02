package tutorial;

import java.io.*;
import java.util.*;

public class TestFile {

	public static void main(String[] args)  throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("/Users/mohaktamhane/Documents/Java/Training/bin/tutorial/emp.txt");
		Scanner sc = new Scanner(f);
		
		while (sc.hasNext())
		{
			String name = sc.nextLine();
			System.out.println(name);
		}
		
		sc.close();
		
	}

}
