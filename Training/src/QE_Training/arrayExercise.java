package QE_Training;

import java.util.*;

public class arrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		  
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter elements in array 1");
		   for (int i=0;i<= arr1.length -1;i++)
		   {
			 arr1[i] = sc.nextInt();  
		   }
		   
		   System.out.println("Enter elements in array 2");
		   for (int i=0;i<= arr2.length -1;i++)
		   {
			 arr2[i] = sc.nextInt();  
		   }
		   
		   //String[] both = (String[])ArrayUtils.addAll(arr1, arr2);
		   
		   sc.close();
	}

}

	


