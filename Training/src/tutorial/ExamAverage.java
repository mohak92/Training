package tutorial;

import java.util.Scanner;

public class ExamAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice = "y";
		
		Scanner input = new Scanner(System.in);
		do{
			int Score = 0;
			int avg = 0;
			int sum = 0;
			int count = 0;	
		System.out.println("Enter Scores");
		System.out.println("enter -ve to calculate average");
		while(Score >= 0)
		{
			Score = input.nextInt();
			sum += Score;
			count++;
		}
         avg = sum/count;	
         System.out.println("Averge is" + avg);
         
         System.out.println("Do you want to continue(Y/N)");
         choice = input.next();
		}while(choice.equals("y"));
		input.close();
	}


}
