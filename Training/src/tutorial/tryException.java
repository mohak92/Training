package tutorial;

import java.util.Scanner;

public class tryException {

	public static int doNormalcase(int num, int denom) throws divideby0 {
		if (denom == 0 ) 
			 throw new divideby0();
		int rem = num/denom;
        return rem;   			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, rem;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		num1 = input.nextInt();
		System.out.println("Enter num2");
		num2 = input.nextInt();
	   try
	   {
		doNormalcase(num1,num2);
	   }
	   catch (divideby0 e)
	   {
		   System.out.println("Error in input");
	   }
	   
	 /*	try{
		System.out.println("Enter num1");
		num1 = input.nextInt();
		System.out.println("Enter num2");
		num2 = input.nextInt();
		doNormalcase(num1,num2);
		 if(num2 == 0){
			throw new divideby0();
		}
		
		if(num2 < 0){
			throw new negativeexp();
		}
		
		rem = num1/num2;
		
		System.out.println("Rem is "+rem);
		}
		catch(divideby0 e)
		{
		  System.out.println(e.getMessage());
		  System.out.println("Enter a proper num!!");
		}
		
		catch(negativeexp e)
		{
		  System.out.println(e.getMessage());
		  System.out.println("Enter a proper num!!");
		  System.exit(0);
		}
		*/
		
				
	}
	
}
