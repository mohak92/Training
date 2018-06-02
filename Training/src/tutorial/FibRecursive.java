package tutorial;

import java.util.*;

public class FibRecursive {

	/**
	 * @param args
	 */
	
	public static long Fib(int n)
	{
		
		/*if (n==0) 
		{ 
			return 0 ; 
		}
		
		if (n==1)
		{
			return 1;
		}
		*/
		
		if (n <= 1)
		{
			return n;
		}
		else
		{
		  return Fib(n-1) + Fib(n-2);   		 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num for which you want the fib");
       int num = sc.nextInt();
	   for (int i=1;i<=num;i++)
	   {
		 System.out.println(FibRecursive.Fib(i));  
	   }
	   sc.close();
	}

}
