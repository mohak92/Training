package tutorial;
import java.util.*;

public class toDoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wList = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		String ans = "y";
		
		do {
			
			System.out.println("Enter an item");
			String item = input.nextLine();
			wList.add(item);
			System.out.println("Do you want to continue ?");
			ans = input.nextLine();
			
		} while (ans.equals("y"));
		
		System.out.println("Your list is");
		
		for (String elem : wList)
		{
			System.out.println(elem);
		}
	}

}
