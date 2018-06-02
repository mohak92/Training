package tutorial;

public class bankAccountTest {

	public static void main(String[] args){
		
		double intRate;
		int numacc;
		
		bankAccount ba = new bankAccount();
		
		
		ba.setInrestRate(0.2);
		intRate = ba.getInterestRate();
		System.out.println("interest rate is" + intRate + " num of accoints is " + ba.getNumAccount());
		bankAccount ba1 = new bankAccount();
		System.out.println("interest rate is" + ba1.getInterestRate() + " num of accoints is " + ba1.getNumAccount());
		
		
	}
	
}
