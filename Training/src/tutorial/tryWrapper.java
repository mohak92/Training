package tutorial;
import java.util.*;

public class tryWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		String num1 = input.nextLine();
		System.out.println("Enter a number");
		String num2 = input.nextLine();
		
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		System.out.println("Sum is" + (number1 + number2) );
		
	}

}
