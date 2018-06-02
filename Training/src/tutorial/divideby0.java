package tutorial;

public class divideby0 extends Exception {
	public divideby0(){
		super("Dividing by 0");
		
	}
	
	public divideby0(String message){
		super(message);
	}
}
