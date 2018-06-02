package tutorial;

import java.util.Scanner;

public class MarkMultiDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] marks = new int [3] [3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Array length is" + marks.length);
		for (int i = 0; i<=marks.length-1; i++)
		{
			for(int j = 0; j <= marks.length - 1; j++)
			{
				System.out.print("inside loop " + i +" " + j);
				System.out.println("Enter the marks for subject j");
				marks[i][j] = input.nextInt();
			}
		}
		
		for (int i = 0; i <= marks.length - 1; i++)
		{
			for(int j = 0; j <= marks.length - 1; j++)
			{
			System.out.println(marks[i][j]);
			
			}
		}
		
		for(int i = 0; i <= marks.length - 1; i++)
		{
			for (int j =0; j <= marks.length - 1; j++)
			{
				System.out.println(marks[j][i]);
			}
		}
		
		
	}

}
