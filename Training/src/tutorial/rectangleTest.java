package tutorial;

import java.util.Scanner;

public class rectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width, height;
		rectangle rc = new rectangle();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width");
		width = input.nextInt();
		System.out.println("Enter the height");
		height = input.nextInt();
		
		rc.setDimentions(width, height);
		System.out.println(rc.getArea());
		
		
	}

}
