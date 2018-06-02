package tutorial;
import java.io.*;
import java.util.*;

public class BinaryFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "numbers.txt";
		int num = 50;
		try
		{
		  ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fname));
		  os.writeInt(num);  
		  os.close();
		}
		catch(FileNotFoundException fe)
		{
		
		}
		
		catch(IOException ie)
		{
			
		}
		
	
		
		
	}

}
