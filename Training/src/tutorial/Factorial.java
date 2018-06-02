/**
 * 
 */
package tutorial;
import java.util.*;
/**
 * @author mohaktamhane
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int fac=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		num = sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			fac = fac * i;
		}
		
		System.out.println("Factorial is"+fac);
	}

}
