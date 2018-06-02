package tutorial;
import java.util.*;
public class TestFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,78,8,10,100};
		boolean isFound = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		for(int i = 0 ; i <= arr.length -1; i++)
		{
			if (num == arr[i] )
			{
				isFound = true;
			}

		}
		
		if (isFound)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element Not found");
		}
		input.close();
	}

}
