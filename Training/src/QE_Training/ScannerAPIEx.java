package QE_Training;
import java.io.*;
import java.util.*;
import java.text.*;
public class ScannerAPIEx {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		try {
			FileReader reader = new FileReader(
					new File("/Users/mohaktamhane/Desktop/text.txt"));
			Scanner scan = new Scanner(reader);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}
	}

}
