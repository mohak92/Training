package tutorial;

public class arraySales {
	
	private String sname;
	private double saleAmount;
	
	public void setName(String obj_name){
		sname = obj_name;
		
	}

	public void setAmount(double obj_amount){
		saleAmount = obj_amount;
	}
	
	public String getName(){
		return this.sname;
	}
	
	public double getAmount(){
		return this.saleAmount;
	}
	
	
}
