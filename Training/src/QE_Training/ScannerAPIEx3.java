package QE_Training;
import java.util.*;
import java.io.*;
public class ScannerAPIEx3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader(
				new File("/Users/mohaktamhane/Desktop/text.txt"));
		Scanner scanner = new Scanner(reader);
		String nextLine = scanner.nextLine();
		String regex = "(\\s)";
		String[] header = nextLine.split(regex);
		System.out.println(header[0]);
		while(scanner.hasNext()) {
			String[] row = scanner.nextLine().split(regex);
			System.out.println(row[0]);
		}
		scanner.close();
	}

}
