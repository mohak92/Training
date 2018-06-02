package tutorial;
import java.util.*;

/* Euclidian algorithm for GCD */
public class GCD {

	/**
	 * @param args
	 */
	
	public static int gcf(int a, int b)
	{
		if (a==b)
		{
			return a;
		}
		else if(a > b)
		{
			return gcf(a-b,b);
		}
		else
		{
			return gcf(a,b-a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 number to find GCF");
		int num = sc.nextInt();
		System.out.println("Enter 2 number to find GCF");
		int num1 = sc.nextInt();
		int gcd = gcf(num,num1);
		System.out.println("The GCD is "+ gcd);
		
	}

}
