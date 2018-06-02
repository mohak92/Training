package tutorial;

import java.util.Scanner;

public class movieRating {
	
	public static enum MovieRating{A,E,B}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieRating mr;
		mr = MovieRating.A;
		int Stars;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Stars");
		 Stars = input.nextInt();
		 
		 if (Stars >= 5){
			 mr = MovieRating.E;
		 }
		 
		 if (Stars >3 && Stars < 5){
			 mr = MovieRating.A;
		 }
		 
		 if (Stars  < 3){
			 mr = MovieRating.B;
		 }
		
		 
		 switch(mr){
		 case E :
			 System.out.println("Excellent");
			 break;
		 case A :
			 System.out.println("Average");
			 break;
		 case B :
			 System.out.println("Bad");
			 break;
			
		 }
		 
		 
	}

}
