package tutorial;
import java.util.*;
public class getNumofZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		System.out.println("Number of zeros is "+getNumZero(num));
	}

	public static int getNumZero(int num){
		int result;
		if (num == 0){
			result = 1;
		}
		else if (num > 0 && num <  10){
			result = 0;
		}
		else if (num % 10 == 0){
			result = getNumZero(num / 10) + 1;
		}
		else{
			result = getNumZero(num/10);
		}
		
		return result;
		
	}
}
