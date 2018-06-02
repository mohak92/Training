package com.training.tax;
import java.util.*;
public class taxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float base;
		TaxCalculator tc = new TaxCalculator();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter basicSalary");
		base=input.nextFloat();
		tc.calculateTax();
		System.out.println(tc.calculateTax());
	}

}
