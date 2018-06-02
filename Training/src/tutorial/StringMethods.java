package tutorial;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ram";
		s.concat("xyz");
		
		
		StringBuilder st = new StringBuilder("xyz");
		st.append("dxdxdx");
		
		System.out.println(" String is " + s + " new string is " + st);
	}

}
