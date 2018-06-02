package tutorial;

import java.util.Scanner;

public class ifIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int x, y, z;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		if(x < y && y < z && x < z){
			System.out.println(x + " ," +y + " ," +z);
		} else if (z < x && z < y && y < x){
			System.out.println(z + " ," +y + " ," +x);
		} else if (x < z && z < y && x < y){
			System.out.println(x + " ," +z + " ," +y);
		} else if (y < x && x < z && y < z){
			System.out.println(y + " ," +x + " ," +z);
		}
	}

}
