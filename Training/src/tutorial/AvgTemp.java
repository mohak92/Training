package tutorial;

import java.util.Scanner;

public class AvgTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] temp = new double [7];
		double avg;
		double sum = 0, maxavg=0;
		
		 Scanner input = new Scanner(System.in);
		 
		 for(int i = 0; i <= 6; i++){
			 System.out.println("Enter temp for day" +i);
			 temp[i] = input.nextDouble();
			 sum = sum+temp[i];
		 }

		 avg = sum/temp.length;
		 
		 for(int i = 0; i<=6; i++){
			 if(temp[i]>avg)
				 maxavg = temp[i];
		 }
		 
		 System.out.println("Average temp is" +avg +" Maxavg is" +maxavg);
	}

}
