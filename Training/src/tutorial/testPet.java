package tutorial;

import java.util.Scanner;

public class testPet {

	public static void main(String[] args){
		
		/*int age = -1;
		pet first = new pet("Dog1");
		pet second = new pet("Dog2");
		
		//pet p = new pet("Golden retriver", -20, 13.5);
		//p.setAge(age);
		pet p1 = new pet(first, second);
		
		first.setName("Dog1");
		
		p1.writeOutput();
		
       //System.out.println("Age is" + p.getAge());*/
		
		pet[] arrp = new pet[3];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<= 2; i++){
			arrp[i] = new pet();
			System.out.println("Enter the name for pet" +i);
			arrp[i].setName(input.next());
			System.out.println("Enter the age for pet" +i);
			arrp[i].setAge(input.nextInt());
		}
		
		for(int i = 0; i<= 2; i++){
			arrp[i].writeOutput();
		}
		
	}
	
}
