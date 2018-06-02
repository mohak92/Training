package tutorial;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		personAddress pa = new personAddress();
		pa.fname = "Mohak";
		pa.lname = "Tamhane";
		personAddress pa1 = new personAddress();
		
		pa1.fname = "Mohak";
		pa1.lname = "Tamhaney";
		
		if(pa.equals(pa1)){
			System.out.println("Both are equal");
			
		}
		else
		{
			System.out.println("Both are not equal");	
		}
	}

}
