package tutorial;
import java.util.*;

public class numertoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		displayAsWord(num);
		
		
	}

	public static void displayAsWord(int num){
		if (num < 10)
		{
			System.out.println(getWord(num));
		}
		else {
			displayAsWord(num / 10);
			System.out.println(getWord(num%10));
		}
	}
	
	public static String getWord(int digit){
		String result = null;
		switch(digit) {
		
		case 0: result = "zero";
		break;
		
		case 1: result = "one";
		break;
		
		case 2: result = "two";
		break;
		
		case 3: result = "three";
		break;
		
		case 4: result = "four";
		break;
		
		case 5: result = "five";
		break;
		
		case 6: result = "six";
		break;
		
		case 7: result = "seven";
		break;
		
		case 8: result = "eight";
		break;
		
		case 9: result = "nine";
		break;
			
		}
		
		return result;
	}
	
}
