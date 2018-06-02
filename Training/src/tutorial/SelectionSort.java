package tutorial;

import java.util.Arrays;

public class SelectionSort {
	
	public static void swap(int[] arr,int first, int second)
	{
		int temp;
		temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	public static void print_arr(int[] arr)
	{
		for (int i = 0 ; i<= arr.length - 1; i++)
		{
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,25,42,3,67,33,98,2};
	
		System.out.println("Original array " + Arrays.toString(arr));
		for (int i=0 ; i <= arr.length - 1; i++)
		{
			//System.out.println("i in outer loop is" + i);
			int smallest = i;
			for (int index= i+1 ; index < arr.length; index++)
			{
				//System.out.println("index is" + index + " i is " + i + " smallest is " + smallest);
				if (arr[index] < arr[smallest])
				{
					smallest = index;
					swap(arr,i,index);
					
					//print_arr(arr);
				}
			}
		}
		
		 System.out.println("Sorted Array " + Arrays.toString(arr));
		 

	}

}
