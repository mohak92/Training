package com.training.shapes;

import java.util.Scanner;

//import tutorial.rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width, height;
		Rectangle rc = new Rectangle();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width");
		width = input.nextInt();
		System.out.println("Enter the height");
		height = input.nextInt();
		
		rc.setDimentions(width, height);
		System.out.println(rc.getArea());
		System.out.println("The Area of the rectangle is calculated usin a formula is length*breath");
	}

}
