package tutorial;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, power, prod = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num = input.nextInt();
		System.out.println("Enter a power");
		power = input.nextInt();
		
		for(int i = 1; i <= power; i++){
			prod = prod * num;
		}
		System.out.println(prod);
	}

}
