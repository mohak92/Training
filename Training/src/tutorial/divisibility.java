package tutorial;
import java.util.*;

public class divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		x = input.nextInt();
		y = input.nextInt();
		
		if (x%y == 0){
			System.out.println("Number is divisible by " +y);
		} else {
			System.out.println("number is not divisible by " +y);
		}
	}

}
