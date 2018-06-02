package tutorial;

public class Rectangle1 {

	public double width;
	public double height;
	
	public void setWH(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getheight(){
		return this.height;
	}
	public double getPerimeter() {
		// TODO Auto-generated method stub
		
		return 2 * (width + height);
		
	}

	public double getArea() {
		return width * height;
	}

}
