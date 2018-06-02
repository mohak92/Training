package tutorial;

import java.util.Scanner;

public class GradeTest {

	 public static enum gradetext {p,d,f};
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   gradetext grade;
	   grade = gradetext.f;
	   
	   String final_grade;
	   Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = input.nextInt();
		
		if (marks > 90)
		{
			grade = gradetext.d;
		}
		
		if (marks > 70 && marks < 90)
		{
			grade = gradetext.p;
		}
		
		if (marks < 70)
		{
			grade = gradetext.f;
		}
		
		switch (grade)
		{
		    case p : 
		    	 System.out.println("You pased");
		    	 break;
		    case f:
		    	 System.out.println("Sorry Fail");
		    	 break;
		    case d:
		    	System.out.println("Distinction");
		    	break;
		   default:
			   System.out.println("No grade");
			   break;
		    	 
		}

	   
  }
}

