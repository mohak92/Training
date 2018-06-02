package tutorial;
import java.io.*;

public class WriteOut {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String fname = "student.txt";
		PrintWriter os = null;
		
		try{
			os = new PrintWriter(new FileOutputStream(fname, true));
			
		}
		catch(FileNotFoundException e){
			System.out.println("Error creating file");
			System.exit(0);
		}
		
		student st = new student(123, "Rock");
		os.println(st.toString());
		os.close();
	}	

}
