package tutorial;

import java.util.Scanner;

public class testSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arraySales [] arrSales = new arraySales[3] ;
		double avg = 0.0 , sum = 0.0;
		
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <= 2; i++){
			
			arrSales[i] = new arraySales();
			System.out.println("Enter the name for person" +i);
			String name = input.next();
			arrSales[i].setName(name);
			System.out.println("Enter the sales amount for person" +i);
			double amt = input.nextDouble();
			arrSales[i].setAmount(amt);
			
		} 
		
		input.close();
		for(int i = 0; i <= 2; i++){
		   System.out.println("Salesperson " + i + "is" + arrSales[i].getName() + " Sales done by him is " + arrSales[i].getAmount());	
		   
	    	sum = sum + arrSales[i].getAmount() ;
			
			
		} 
		
		avg = sum / 3;
	  System.out.println("Average is" + avg);
		
		

	}

}
