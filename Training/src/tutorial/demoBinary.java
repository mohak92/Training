package tutorial;
import java.util.*;

public class demoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 5, 7, 9, 10, 88, 100};
		
		binarySearch bs = new binarySearch(arr);
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a target");
		int target = input.nextInt();
		
		int result = bs.find(target);
		
		
		if (result <  0 ){
			System.out.println("Element not found" );
		}
		else
		{
			System.out.println("Element found at position" + result);
		}
	}

}
