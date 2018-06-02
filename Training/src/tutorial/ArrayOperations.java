package tutorial;

import java.util.Scanner;


public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of Array");
		length = input.nextInt();
		
		int[] num = new int[length];
		
		for(int count = 0; count < length; count++){
			
			System.out.println("Enter a number " +(count+1));
			num[count] = input.nextInt();
		}
		
		input.close();
		
		System.out.println("Your array is");
for(int count = 0; count < length; count++){
			
			System.out.println(num[count]);
			
		}

		
	}

	

}
