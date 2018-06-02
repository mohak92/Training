package tutorial;

public class shapeDeom {
	
	public static final int indent = 5;
	public static final int width = 4;
	public static final int height = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleInterface rc = new Rectangle2(indent, height, width);
		rc.drawhere();
		
	}

}
