package tutorial;
import java.util.*;

public class SumOfSquaresRec {

	/**
	 * @param args
	 */
	
	public static int Sum(int n)
	{
		if (n==1)
		{
			return 1;
		}
		else 
		{
			 return Sum(n-1) + n*n;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for sum of squares");
		int num = sc.nextInt();
		//System.currentTimeMillis()
		int sq = Sum(num);
		System.out.println ("Sum of squares is " +sq);

	}

}
