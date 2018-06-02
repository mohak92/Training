package tutorial;

import java.util.*;

public class ArrayFind {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	   int[] arr = new int[5];
	   boolean found = false;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the array elements");
	   for (int i=0;i<= arr.length -1;i++)
	   {
		 arr[i] = sc.nextInt();  
	   }
	   
	   System.out.println("Enter the element to find");
	   int num_to_find = sc.nextInt();
	   for (int i = 0; i<= arr.length-1;i++)
	   {
		   if (arr[i] == num_to_find)
		   {
			   found = true;
		   }
	   }
	   if (found)
	   {
		   System.out.println("Found the value");
	   }
	   else
	   {
		   System.out.println("Value not Found");
	   }
	   
	   sc.close();
	}

}
