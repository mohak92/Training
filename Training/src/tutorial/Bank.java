package tutorial;

public class Bank {
	
	private double iniBalance;
	private int accountNumber;
	private double currentBalance;
	public static final double interestRate = 0.02;
	public static final double overdrawPenalty = 8.00;
	
	public Bank (double Balance, int AccountNum)
	{
		this.iniBalance=Balance;
		this.accountNumber=AccountNum;
		this.currentBalance=iniBalance;
	}

	public void setValues (double Balance, int AccountNum)
	{
		this.iniBalance=Balance;
		this.accountNumber=AccountNum;
	}
	
	public void setBalance (double currentBalance)
	{
		this.currentBalance = currentBalance;
	}
	
	public double GetBalance()
	{
		return iniBalance;
	}
	
	public int GetAccount()
	{
		return accountNumber;
	}
	
	public double getCurrentBalance()
	{
		if (this.currentBalance >= 0)
		{
			currentBalance = currentBalance + (interestRate * currentBalance)/12;
		}
		
		else{
			currentBalance = currentBalance - overdrawPenalty;
		}
		return currentBalance;
	}
}
