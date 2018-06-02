package tutorial;

public class Testrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle1 r = new Rectangle1();
		
		double width = 9;
		double height = 5;
		
		r.setWH(width, height);
		System.out.println("Area is "+r.getArea() );
		System.out.println("Perimeter is "+r.getPerimeter() );
	}

}
