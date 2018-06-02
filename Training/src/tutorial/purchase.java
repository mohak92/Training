package tutorial;

public class purchase {
	
	private String name;
	private int groupCount;
	private double groupPrice;
	private int numberBrought;
	
	/* Mutator methods */
	
	public void setName(String obj_name){

		name = obj_name;
	}
	
	public void setGroupt(int obj_count, double obj_price, int obj_num){
		groupCount = obj_count;
		groupPrice = obj_price;
		numberBrought = obj_num;
	}

	/* Accessor Methods */
	
	public String getName()
	{
		return name;
	}
	
	public void getProductDetails(){
		
		System.out.println("Product name" +name +
				            " Group Count " + groupCount +
				            "Group Price" + groupPrice +
				            "num brought" + numberBrought);
		
	}
	
	public double getPrice()
	{
		double final_price;
		final_price = (groupPrice * numberBrought) / numberBrought;
		return final_price;
	}
	
}
