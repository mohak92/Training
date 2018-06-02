package tutorial;

import java.util.Scanner;

public class countdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getCount();
		
	}

	public static void getCount(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		if (num <= 0){
			System.out.println("Enter a +ve integer");
			getCount();
		}
		else{
			showDown(num);
		}
	}
	
	public static void showDown(int n){
		System.out.println("num in func is" + n);
		
		for(int i = n; i >= 0; i--){
			
			System.out.println(i);
		}
	}
}
