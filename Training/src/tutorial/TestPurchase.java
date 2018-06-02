package tutorial;

public class TestPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pName;
		int groupCount;
		double groupPrice;
		int num;
		double fp;
		
		purchase p = new purchase();
	    pName = "Apples";
	    groupCount = 5;
	    groupPrice = 1.25;
	    num = 2;
	    
        p.setName(pName);
        p.setGroupt(groupCount,groupPrice, num);
         p.getProductDetails();
         fp = p.getPrice();
         System.out.println(" Final price is" + fp);
        
	}

}
