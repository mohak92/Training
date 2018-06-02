package tutorial;

public class Enum {

	public static enum colors {Red, Blue, green};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(colors c:colors.values()){
			System.out.println(c);
			
		}
		
	}

}
 