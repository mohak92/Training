package tutorial;

public class Rectangle2 extends shapeBasic implements RectangleInterface {
	private int height;
	private int width;
	
	public Rectangle2(){
		super();
		height = 0;
		width = 0;
	}
	
	public Rectangle2(int Offset, int height, int width){
		super(Offset);
		this.height = height;
		this.width = width;
	}
	@Override
	public void set(int height, int width) {
		// TODO Auto-generated method stub
		this.height = height;
		this.width = width;
	}
	
	public void drawhere(){
		drawHorizontal();
		drawSides();
		drawHorizontal();
		
	}
	
	public void drawHorizontal(){
		skipSpaces(getOffset());
		for (int i = 0; i < width; i++){
			System.out.print("-");
		}
		
		System.out.println();
	}
	
	public void drawSides(){
		for (int i = 0; i <= height-2; i++){
			drawLineOneSide();
		}
	}

	public void drawLineOneSide(){
		skipSpaces(getOffset());
		System.out.print("|");
		skipSpaces(width-2);
		System.out.println("|");
	}	
	
	public static void skipSpaces(int num){
		for (int i = 0; i < num; i++ ){
			System.out.print(' ');
		}
	}
}
