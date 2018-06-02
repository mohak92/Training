package tutorial;
import java.util.*;
public class TestGradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Course");
		String msg = input.nextLine();
		
		System.out.println("Enter the marks");
		int Marks = input.nextInt();
		
		GradeBook gb = new GradeBook("cs - 101");
		gb.SetCourseName(msg);
		gb.SetMarks(Marks);
		
		System.out.println(gb.GetCourseName());
		
		//System.out.println("Your result is"+ gb.GetRusult());
		
		gb.GetRusult();
		
		input.close();
	}

}
