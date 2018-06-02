package tutorial;

public class incrementArray {

	public static void incArray(int[] int_array){
		for(int i = 0; i<= int_array.length - 1; i++){
			int_array[i]=int_array[i] + 2;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4};
		
		incrementArray.incArray(arr);
		boolean first = true;
		for(int i = 0; i<= arr.length - 1; i++){
			if (first)
			{
			System.out.print(arr[i]);
			first=false;
			}
			else
			{
			  System.out.print("," + arr[i]);
			  
			}
		}
	}

}
