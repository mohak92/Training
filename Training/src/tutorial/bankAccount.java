package tutorial;

public class bankAccount {

	public double amount;
	public static double interestRate = 0;
	public static int numAccount = 0;
	
	public bankAccount(){
		numAccount++;
		amount = 0;
	}
	
	public static void setInrestRate(double objRate){
		
		interestRate = objRate;
		
	}
	
	public static double getInterestRate(){
		return interestRate;
	}
	
	public static int getNumAccount(){
		
		return numAccount;
		
	}
	
	
}
