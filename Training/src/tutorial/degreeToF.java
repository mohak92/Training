package tutorial;
import java.util.*;
public class degreeToF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double tempInDegrees, tempInFarenheit;
		
		Scanner tem = new Scanner(System.in);
		System.out.println("enter temperature in farenheit ");
		tempInFarenheit = tem.nextInt();
		
		tempInDegrees = tempInFarenheit - 32 ;
		tempInDegrees = tempInDegrees * 0.56 ;
		
		System.out.println("the temperture in degrees is " + tempInDegrees);

	}

}
