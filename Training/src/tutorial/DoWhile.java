package tutorial;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, sum = 0;
		boolean morerec = true;
		
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Enter a number -ve to quit");
			num = input.nextInt();
			
			sum = sum+num;
			
			
			
		} while(num >= 0);

		
		/*while (morerec)
		{
			System.out.println("Enter a number -ve to quit");
			num = input.nextInt();
			
			if (num <= 0 )
			{
				morerec = false;
			}
			else
			{
				sum = sum + num;
			}
		}*/
		System.out.println("Total is" +sum);
	}

}
