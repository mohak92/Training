package QE_Training;
import java.io.*;
import java.util.*;
import java.text.*;
public class ScannerAPIEx2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		try {
			File input = new File("/Users/mohaktamhane/Desktop/text.txt");
			FileInputStream fis = new FileInputStream(input);
			Scanner scan = new Scanner(fis);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}
	}

}
