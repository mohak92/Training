package com.training.tax;

public class TaxCalculator {

	private float basicSalary;
	boolean citizenship;
	private float tax;
	
	public void setSalary(float basicSalary, float tax){

		this.basicSalary = basicSalary;
		this.tax = tax;
		
	}

	public float calculateTax() 
	{
		// TODO Auto-generated method stub
		tax = 30*basicSalary/100;
		return tax;
		
		
	}
}
