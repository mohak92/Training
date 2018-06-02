/**
 * 
 */
package tutorial;
import java.util.*;

/**
 * @author mohaktamhane
 *
 */
public class max_value {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
	      System.out.println("Enter three integers ");
	      Scanner in = new Scanner(System.in);
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      z = in.nextInt();
	 
	      if ( x > y && x > z )
	         System.out.println("Max number is " +x);
	      else if ( y > x && y > z )
	         System.out.println("Max number is " +y);
	      else if ( z > x && z > y )
	         System.out.println("Max number is " +z);
	      
	}

}
