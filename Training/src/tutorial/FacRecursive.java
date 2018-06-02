package tutorial;

import java.util.*;;

public class FacRecursive {

	/**
	 * @param args
	 */
	public static int Fac(int n)
	{
		if ( n <=0)
		{
			return 1;
		}
		else
		{
			return n * Fac(n-1);
		}
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the num for Factorial");
		 int num = sc.nextInt();
		 int fac = Fac(num);
		 System.out.print("Factorial is "+ fac);
	}

}
