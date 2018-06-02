package tutorial;
import java.util.*;
public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = new int[10];
		int avg = 0, sum = 0;
		Scanner input = new Scanner(System.in);
		int i = 0;
		
		while (i <= 9)
		{
		  	System.out.println("Enter marks for Student  " + i);
		  	marks[i] = input.nextInt();
		  	i++;
		}
		
		for (i=0 ; i<= marks.length - 1; i++)
		{
			sum = sum + marks[i];
		}
		 
          avg = sum /marks.length;
          
          System.out.println("Average is" + avg);
          input.close();
	}
     
}
