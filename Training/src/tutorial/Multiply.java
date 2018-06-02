package tutorial;

import java.util.*;


public class Multiply {

	/**
	 * @param args
	 */
	
	public static int multi(int[] a)
	{
		int x = a[0];
		int y = a[1];
		if (y==0)
		{
			return 0;
		}
		
	    int q = y/2;
	    int z = x * q;
	    if ( (y % 2 ) == 0 )
	    {
	    	return 2*z;
	    }
	    else
	    {
	    	return x + (2 * z);
	    }
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers for multiplication");
        int[] num = new int[2];
        for (int i=0;i<=1;i++)
        {
             num[i] = sc.nextInt();   	
        }
        
           int prod =  multi(num);
           
           System.out.println("Product is"+ prod);
           
            
        /* for (int i : num)
        {
        	
          System.out.println("i is" + i);	
        }
       */
        
	}

}
