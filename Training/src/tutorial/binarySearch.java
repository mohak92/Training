package tutorial;

public class binarySearch {

	private int [] a;
	
	public binarySearch(int [] arr){
		
		a = arr;
	}
	
	public int find(int target) {
		
		return bSearch(target, 0, a.length - 1);
		
	}
	
	public int bSearch(int target, int first, int last){
		
		int mid = (first + last)/2;
		int result = -1;
		
		if  ( first > last)
			result = -1;
		else
		{
		  if (target == a[mid])
		  {
			result = mid; 
		  } 
		else if (target < a[mid]){
			
			result = bSearch(target, first, mid -1);
			
		}
		else {
			
			result =bSearch(target, mid + 1, last);
			
		  }
		}	
		return result;
		
	}
	
}
