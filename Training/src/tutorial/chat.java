package tutorial;

import java.util.Scanner;

public class chat {
	
	public String Question;
	public String answer;
	
	public chat(){
		Question = "";
		answer = "";
	}
	
	public void chatMethod(){
		String userQues;
		String response;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Enter a question");
			userQues = input.nextLine();
			answer();
			System.out.println("Do you want to continue(yes/no)");
			response = input.nextLine();
			
		}while(response.equals("yes"));
		
		
	}

	public void answer(){
		System.out.println("Answer is nothing");
	}
}
