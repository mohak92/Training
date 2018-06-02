package tutorial;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		String S1 = "";
		String rev_string = "";
		
		System.out.println("Enter a string \n");
		Scanner in = new Scanner(System.in);
		
		S1 = in.nextLine();
		
		length = S1.length();
		
		for(int i = length - 1; i>=0; i--)
		{
			rev_string = rev_string + S1.charAt(i);
		}
		
		if (S1.equals(rev_string))
			System.out.println("String is a palindrome ");
		else
			System.out.println("String not a palindrome");
		
	   in.close();
	}

	 
}
